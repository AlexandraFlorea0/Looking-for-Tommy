package PaooGame.Tiles;


import PaooGame.Items.Hero;
import java.awt.*;
import java.awt.image.BufferedImage;

/*! \class public class Tile
    \brief Retine toate dalele intr-un vector si ofera posibilitatea regasirii dupa un id.
 */
public class Tile
{
    public boolean collisionOn = false;
    private static final int NO_TILES   = 1000;
    public static Tile[] tiles          = new Tile[NO_TILES];       /*!< Vector de referinte de tipuri de dale.*/

        /// De remarcat ca urmatoarele dale sunt statice si publice. Acest lucru imi permite sa le am incarcate
        /// o singura data in memorie
    public static Tile grassTile     = new GrassTile(0);     /*!< Dala de tip iarba*/
    public static Tile Tree1Tile     = new Tree1Tile(1);  /*!< Dala de tip copac1*/
    public static Tile Tree2Tile     = new Tree2Tile(2);  /*!< Dala de tip copac2*/
    public static Tile Tree3Tile     = new Tree3Tile(3);  /*!< Dala de tip copac3*/
    public static Tile Tree4Tile     = new Tree4Tile(4);  /*!< Dala de tip copac4*/
    public static Tile Tree5Tile     = new Tree5Tile(5);  /*!< Dala de tip copac5*/
    public static Tile bushTile      = new BushTile(6);  /*!< Dala de tip tufis*/
    public static Tile grass1Tile    = new Grass1Tile(7);  /*!< Dala de tip iarba*/
    public static Tile TreevTile     = new TreevTile(8);  /*!< Dala de tip bustean vertical*/
    public static Tile TreehTile     = new TreehTile(9);  /*!< Dala de tip bustean orizontal*/
    public static Tile StumpTile     = new StumpTile(10);  /*!< Dala de tip radacina*/
    public static Tile FlowerTile    = new FlowerTile(11);  /*!< Dala de tip floare*/
    public static Tile MushroomTile  = new MushroomTile(12);  /*!< Dala de tip ciuperca*/
    public static Tile Rock1Tile     = new Rock1Tile(13);  /*!< Dala de tip piatra1*/
    public static Tile Rock2Tile     = new Rock2Tile(14);  /*!< Dala de tip piatra2*/
    public static Tile Gate1Tile     = new Gate1Tile(15);  /*!< Dala de tip poarta1*/
    public static Tile Gate2Tile     = new Gate2Tile(16);  /*!< Dala de tip poarta2*/
    public static Tile ChestClose    = new ChestCloseTile(17);  /*!< Dala de tip cufar inchis*/
    public static Tile ChestOpen     = new ChestOpenTile(18);  /*!< Dala de tip cufar deschis*/
    public static Tile ChestEmpty    = new ChestEmptyTile(19);  /*!< Dala de tip cufar gol*/
    public static Tile AlleyUpCorner = new AlleyUpCornerTile(20);  /*!< Dala de tip alee colt sus*/
    public static Tile AlleyDownCorner  = new AlleyDownCornerTile(21);  /*!< Dala de tip alee colt jos*/
    public static Tile Alley         = new AlleyTile(22);  /*!< Dala de tip alee*/
    public static Tile waterSmallLeftUpCorner  = new waterSmallLeftUpCornerTile(23);  /*!< Dala mica de tip apa in coltul din stanga sus*/
    public static Tile waterSmallRightDownCorner1  = new waterSmallRightDownCorner1Tile(24);  /*!< Dala mica de tip apa in coltul1 din dreapta jos*/
    public static Tile waterSmallRightDownCorner2  = new waterSmallRightDownCorner2Tile(25);  /*!< Dala mica de tip apa in coltul2 din dreapta jos*/
    public static Tile waterSmallRightUpCorner1  = new waterSmallRightUpCorner1Tile(26);  /*!< Dala mica de tip apa in coltul1 din dreapta sus*/
    public static Tile waterSmallRightUpCorner2  = new waterSmallRightUpCorner2Tile(27);  /*!< Dala mica de tip apa in coltul2 din dreapta sus*/
    public static Tile waterRightDownCorner1  = new waterRightDownCorner1Tile(28);  /*!< Dala de tip apa in coltul1 din dreapta jos*/
    public static Tile waterRightDownCorner2  = new waterRightDownCorner2Tile(29);  /*!< Dala de tip apa in coltul2 din dreapta jos*/
    public static Tile waterTile        = new WaterTile(30);     /*!< Dala de tip apa*/
    public static Tile waterRightUpCorner1  = new waterRightUpCorner1Tile(31);  /*!< Dala de tip apa in coltul1 din dreapta sus*/
    public static Tile waterRightUpCorner2  = new waterRightUpCorner2Tile(32);  /*!< Dala de tip apa in coltul1 din dreapta sus*/
    public static Tile waterLeftDownCorner  = new waterLeftDownCornerTile(33);  /*!< Dala de tip apa in coltul1 din stanga jos*/
    public static Tile black  = new BlackTile(38);  /*!< Dala neagra pentru pereti*/
    public static Tile soil  = new SoilTile(50);  /*!< Dala de tip pamant*/
    public static Tile stone  = new StoneTile(40);  /*!< Dala de tip piatra*/


    public static Tile waterLeft  = new WaterLeftTile(70);
    public static Tile waterRight  = new WaterRightTile(71);
    public static Tile waterUp  = new WaterUpTile(72);
    public static Tile bridgeh1  = new Bridgeh1Tile(73);
    public static Tile bridgeh2  = new Bridgeh2Tile(74);
    public static Tile bridgeh3  = new Bridgeh3Tile(75);
    public static Tile bridgev1  = new Bridgev1Tile(76);
    public static Tile bridgev2  = new Bridgev2Tile(77);
    public static Tile bridgev3  = new Bridgev3Tile(78);

    public static final int TILE_WIDTH  = 48;                       /*!< Latimea unei dale.*/
    public static final int TILE_HEIGHT = 48;                       /*!< Inaltimea unei dale.*/

    public BufferedImage img;                                    /*!< Imaginea aferenta tipului de dala.*/
    protected final int id;                                         /*!< Id-ul unic aferent tipului de dala.*/

    /*! \fn public Tile(BufferedImage texture, int id)
        \brief Constructorul aferent clasei.

        \param image Imaginea corespunzatoare dalei.
        \param id Id-ul dalei.
     */
    public Tile(BufferedImage image, int idd)
    {
        img = image;
        id = idd;

        tiles[id] = this;
    }

    /*! \fn public void Update()
        \brief Actualizeaza proprietatile dalei.
     */
    public void Update()
    {

    }

    /*! \fn public void Draw(Graphics g, int x, int y)
        \brief Deseneaza in fereastra dala.

        \param g Contextul grafic in care sa se realizeze desenarea
        \param x Coordonata x in cadrul ferestrei unde sa fie desenata dala
        \param y Coordonata y in cadrul ferestrei unde sa fie desenata dala
     */
    public void Draw(Graphics g, int x, int y)
    {
            /// Desenare dala
            g.drawImage(img, x, y, TILE_WIDTH, TILE_HEIGHT, null);

    }

    /*! \fn public boolean IsSolid()
        \brief Returneaza proprietatea de dala solida (supusa coliziunilor) sau nu.
     */
    public boolean IsSolid()
    {
        return false;
    }

    /*! \fn public int GetId()
        \brief Returneaza id-ul dalei.
     */
    public boolean IsGate1()
    {
        return false;
    }
    public boolean IsGate2()
    {
        return false;
    }
    public int GetId()
    {
        return id;
    }
}
