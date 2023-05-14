package PaooGame.Maps;

import PaooGame.RefLinks;
import PaooGame.Tiles.Tile;
import PaooGame.Items.Hero;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


/*! \class public class Map
    \brief Implementeaza notiunea de harta a jocului.
 */
public class Map
{
    private RefLinks refLink;   /*!< O referinte catre un obiect "shortcut", obiect ce contine o serie de referinte utile in program.*/
    private int width;          /*!< Latimea hartii in numar de dale.*/
    private int height;         /*!< Inaltimea hartii in numar de dale.*/
    int [][] tiles;     /*!< Referinta catre o matrice cu codurile dalelor ce vor construi harta.*/
    Tile[] tile;
    /*! \fn public Map(RefLinks refLink)
        \brief Constructorul de initializare al clasei.

        \param refLink O referinte catre un obiect "shortcut", obiect ce contine o serie de referinte utile in program.
     */
    public Map(RefLinks refLink)
    {
            /// Retine referinta "shortcut".
        this.refLink = refLink;
        tile = new Tile[100];
            // avem implicit nivelul 1
        Hero.level = 1;
            ///incarca harta de start. Functia poate primi ca argument id-ul hartii ce poate fi incarcat.
        LoadWorld();

    }

    /*! \fn public  void Update()
        \brief Actualizarea hartii in functie de evenimente (un copac a fost taiat)
     */
    public  void Update()
    {

    }

    /*! \fn public void Draw(Graphics g)
        \brief Functia de desenare a hartii.

        \param g Contextl grafi in care se realizeaza desenarea.
     */
    public void Draw(Graphics g, Hero entity)
    {
        int offsetX = 960 / 2 - (int)entity.GetX();
        int offsetY = 480 / 2 - (int)entity.GetY();
        g.translate(offsetX, offsetY);
            for (int y = 0; y < 40; y++) {
                for (int x = 0; x < 60; x++) {
                    GetTile(x, y).Draw(g, x * Tile.TILE_WIDTH, y * Tile.TILE_HEIGHT);
                }
            }

        }


    /*! \fn public Tile GetTile(int x, int y)
        \brief Intoarce o referinta catre dala aferenta codului din matrice de dale.

        In situatia in care dala nu este gasita datorita unei erori ce tine de cod dala, coordonate gresite etc se
        intoarce o dala predefinita (ex. grassTile, mountainTile)
     */
    public Tile GetTile(int x, int y)
    {
        if(x < 0 || y < 0 || x >= width || y >= height)
        {
            return Tile.grassTile;
        }
        Tile t = Tile.tiles[tiles[x][y]];
        if(t == null)
        {
            return Tile.Tree1Tile;
        }
        return t;
    }

    /*! \fn private void LoadWorld()
        \brief Functie de incarcare a hartii jocului.
        Aici se poate genera sau incarca din fisier harta. Momentan este incarcata static.
     */
    public void LoadWorld()
    {
        //atentie latimea si inaltimea trebuiesc corelate cu dimensiunile ferestrei sau
        //se poate implementa notiunea de camera/cadru de vizualizare al hartii
        ///Se stabileste latimea hartii in numar de dale.
        width = 60;
        ///Se stabileste inaltimea hartii in numar de dale
        height = 40;
        ///Se construieste matricea de coduri de dale
        tiles = new int[width][height];
        if( Hero.level == 1) {
            try {
                InputStream is = getClass().getResourceAsStream("mapL1.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(is));

                //Se incarca matricea cu coduri
                int col = 0;
                int row = 0;
                while (col < width && row < height) {
                    String line = br.readLine();

                    while (col < width) {
                        String numbers[] = line.split(" ");

                        int num = Integer.parseInt(numbers[col]);

                        tiles[col][row] = num;
                        col++;
                    }
                    if (col == width) {
                        col = 0;
                        row++;
                    }
                }
                br.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
            if( Hero.level == 2){
                try{
                    InputStream is = getClass().getResourceAsStream("mapL2.txt");
                    BufferedReader br = new BufferedReader(new InputStreamReader(is));

                    //Se incarca matricea cu coduri
                    int col = 0;
                    int row = 0;
                    while(col < width && row < height)
                    {
                        String line = br.readLine();

                        while(col < width){
                            String numbers[] = line.split(" ");

                            int num =Integer.parseInt(numbers[col]);

                            tiles[col][row] = num;
                            col++;
                        }
                        if(col == width){
                            col = 0;
                            row++;
                        }
                    }
                    br.close();

                }catch(Exception e){
                    e.printStackTrace();
                }
        }
        if( Hero.level == 3) {
            try {
                InputStream is = getClass().getResourceAsStream("mapL3.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(is));

                //Se incarca matricea cu coduri
                int col = 0;
                int row = 0;
                while (col < width && row < height) {
                    String line = br.readLine();

                    while (col < width) {
                        String numbers[] = line.split(" ");

                        int num = Integer.parseInt(numbers[col]);

                        tiles[col][row] = num;
                        col++;
                    }
                    if (col == width) {
                        col = 0;
                        row++;
                    }
                }
                br.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /*! \fn private int MiddleEastMap(int x ,int y)
        \brief O harta incarcata static.

        \param x linia pe care se afla codul dalei de interes.
        \param y coloana pe care se afla codul dalei de interes.

    private int MiddleEastMap(int x ,int y)
    public int MiddleEastMap(int x ,int y)
    {
            ///Definire statica a matricei de coduri de dale.
        //final int map[][] = {
        int map[][] = {
        { 1,  1, 71, 30, 70,  5,  1, 71, 30, 30, 30, 30, 30, 30, 30, 30, 30, 70, 11, 71, 30, 70, 1,  1,  3,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 5,  0, 73, 74, 75,  0,  0, 26, 72, 72, 72, 72, 72, 72, 72, 32, 30, 70,  0, 73, 74, 75, 0,  0,  0,  0,  2,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 1,  0, 71, 30, 70,  0,  0,  0,  0,  0,  0,  0,  9,  0,  0, 73, 74, 75,  0, 71, 30, 70, 0,  0,  0, 10,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 4,  0, 71, 30, 70,  0,  0,  0,  7,  0,  0,  0,  0,  0,  0, 71, 30, 33, 76, 29, 30, 70, 7,  0,  0,  0,  5,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 1,  0, 71, 30, 70,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 71, 30, 30, 77, 30, 30, 70, 0,  0,  7,  0,  4,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 4,  0, 71, 30, 70,  7,  0,  0,  0,  0,  0,  7,  0, 11,  0, 71, 30, 30, 77, 30, 30, 70, 0,  0,  0,  0,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 5,  0, 71, 30, 70,  0,  0,  7,  0,  0,  0,  0,  0,  0,  0, 71, 30, 30, 77, 30, 30, 70, 0,  0,  0,  0,  3,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 2, 14, 71, 30, 70,  0,  0,  0,  0,  0,  0,  0,  0,  0,  7, 26, 72, 72, 78, 31, 30, 70, 0,  0,  0,  0,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 3,  0, 71, 30, 70,  7,  0,  0,  0,  7,  0,  0,  7,  0,  0,  0,  0,  0,  0, 71, 30, 70, 0,  0,  6,  6,  5,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 5,  0, 71, 30, 70,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  7,  0, 12, 71, 30, 70, 0,  0,  6, 15,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 5,  0, 71, 30, 70,  0,  0,  0,  0,  0,  0,  0,  0,  7,  0,  0,  0,  0,  0, 71, 30, 70, 0,  0,  6,  0,  4,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 5,  0, 73, 74, 75,  0,  0,  0,  7,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 73, 74, 75, 0,  0,  0,  0,  5,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 5,  7, 71, 30, 70, 12,  0,  0,  0,  0,  0,  7,  0,  0,  0,  7,  0,  0, 14, 71, 30, 70, 0,  0,  0,  0,  2,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 1,  5, 71, 30, 70,  1,  5,  1,  4,  2,  5,  3,  2,  1,  5,  1,  3,  1,  1, 71, 30, 70, 1,  1,  5,  1,  3,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
        { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0}};
        return map[x][y];
    }*/
}
