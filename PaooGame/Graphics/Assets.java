package PaooGame.Graphics;

import java.awt.image.BufferedImage;

/*! \class public class Assets
    \brief Clasa incarca fiecare element grafic necesar jocului.

    Game assets include tot ce este folosit intr-un joc: imagini, sunete, harti etc.
 */
public class Assets
{
        /// Referinte catre elementele grafice (dale) utilizate in joc.

    public static BufferedImage grass;
    public static BufferedImage tree1;
    public static BufferedImage tree2;
    public static BufferedImage tree3;
    public static BufferedImage tree4;
    public static BufferedImage tree5;
    public static BufferedImage bush;
    public static BufferedImage grass1;
    public static BufferedImage treev;
    public static BufferedImage treeh;
    public static BufferedImage stump;
    public static BufferedImage flower;
    public static BufferedImage mushroom;
    public static BufferedImage rock1;
    public static BufferedImage rock2;
    public static BufferedImage gate1;
    public static BufferedImage gate2;
    public static BufferedImage chestClose;
    public static BufferedImage chestOpen;
    public static BufferedImage chestEmpty;
    public static BufferedImage alleyUpCorner;
    public static BufferedImage alleyDownCorner;
    public static BufferedImage alley;
    public static BufferedImage waterSmallLeftUpCorner;
    public static BufferedImage waterSmallRightDownCorner1;
    public static BufferedImage waterSmallRightDownCorner2;
    public static BufferedImage waterSmallRightUpCorner1;
    public static BufferedImage waterSmallRightUpCorner2;
    public static BufferedImage waterRightDownCorner1;
    public static BufferedImage waterRightDownCorner2;
    public static BufferedImage water;
    public static BufferedImage waterRightUpCorner1;
    public static BufferedImage waterRightUpCorner2;
    public static BufferedImage waterLeftDownCorner;



    public static BufferedImage heroRight;
    public static BufferedImage heroRight1;
    public static BufferedImage heroRight2;
    public static BufferedImage heroRight3;
    public static BufferedImage heroRight4;
    public static BufferedImage heroDown;
    public static BufferedImage heroDown1;
    public static BufferedImage heroDown2;
    public static BufferedImage heroDown3;
    public static BufferedImage heroDown4;
    public static BufferedImage heroUp;
    public static BufferedImage heroUp1;
    public static BufferedImage heroUp2;
    public static BufferedImage heroUp3;
    public static BufferedImage heroUp4;
    public static BufferedImage heroLeft;
    public static BufferedImage heroLeft1;
    public static BufferedImage heroLeft2;
    public static BufferedImage heroLeft3;
    public static BufferedImage heroLeft4;
    public static BufferedImage heroAttackUp;
    public static BufferedImage heroAttackUp1;
    public static BufferedImage heroAttackUp2;
    public static BufferedImage heroAttackUp3;
    public static BufferedImage heroAttackDown;
    public static BufferedImage heroAttackDown1;
    public static BufferedImage heroAttackDown2;
    public static BufferedImage heroAttackDown3;
    public static BufferedImage heroAttackRight;
    public static BufferedImage heroAttackRight1;
    public static BufferedImage heroAttackRight2;
    public static BufferedImage heroAttackRight3;
    public static BufferedImage heroAttackLeft;
    public static BufferedImage heroAttackLeft1;
    public static BufferedImage heroAttackLeft2;
    public static BufferedImage heroAttackLeft3;
    public static BufferedImage heroDeadUp;
    public static BufferedImage heroDeadUp1;
    public static BufferedImage heroDeadUp2;
    public static BufferedImage heroDeadUp3;
    public static BufferedImage heroDeadDown;
    public static BufferedImage heroDeadDown1;
    public static BufferedImage heroDeadDown2;
    public static BufferedImage heroDeadDown3;
    public static BufferedImage heroDeadLeft;
    public static BufferedImage heroDeadLeft1;
    public static BufferedImage heroDeadLeft2;
    public static BufferedImage heroDeadLeft3;
    public static BufferedImage heroDeadRight;
    public static BufferedImage heroDeadRight1;
    public static BufferedImage heroDeadRight2;
    public static BufferedImage heroDeadRight3;
    public static BufferedImage herojumpLeft;
    public static BufferedImage herojumpLeft1;
    public static BufferedImage herojumpLeft2;
    public static BufferedImage herojumpLeft3;
    public static BufferedImage herojumpRight;
    public static BufferedImage herojumpRight1;
    public static BufferedImage herojumpRight2;
    public static BufferedImage herojumpRight3;



    public static BufferedImage soil;
    public static BufferedImage mountain;
    public static BufferedImage townGrass;
    public static BufferedImage townGrassDestroyed;
    public static BufferedImage townSoil;

    public static BufferedImage rockUp;
    public static BufferedImage rockDown;
    public static BufferedImage rockLeft;
    public static BufferedImage rockRight;
    public static BufferedImage tree;

    public static BufferedImage black;


    public static BufferedImage waterLeft;
    public static BufferedImage waterRight;
    public static BufferedImage waterUp;
    public static BufferedImage bridgeh1;
    public static BufferedImage bridgeh2;
    public static BufferedImage bridgeh3;
    public static BufferedImage bridgev1;
    public static BufferedImage bridgev2;
    public static BufferedImage bridgev3;
    public static BufferedImage stone;

    /*! \fn public static void Init()
        \brief Functia initializaza referintele catre elementele grafice utilizate.

        Aceasta functie poate fi rescrisa astfel incat elementele grafice incarcate/utilizate
        sa fie parametrizate. Din acest motiv referintele nu sunt finale.
     */
    public static void Init()
    {
            /// Se creaza temporar un obiect SpriteSheet initializat prin intermediul clasei ImageLoader
        SpriteSheet tile_sheet = new SpriteSheet(ImageLoader.LoadImage("/textures/TileSprite.png"));
        SpriteSheet enemy_sheet = new SpriteSheet(ImageLoader.LoadImage("/textures/EnemySprite.png"));
        SpriteSheet hero_sheet = new SpriteSheet(ImageLoader.LoadImage("/textures/HeroSprite.png"));


            /// Se obtin subimaginile corespunzatoare elementelor necesare.
        grass = tile_sheet.crop(0, 0);
        tree1 = tile_sheet.crop(1, 0);
        tree2 = tile_sheet.crop(2, 0);
        tree3 = tile_sheet.crop(3, 0);
        tree4 = tile_sheet.crop(4, 0);
        tree5 = tile_sheet.crop(5, 0);
        bush = tile_sheet.crop(6, 0);
        grass1 = tile_sheet.crop(7,0);
        treev = tile_sheet.crop(8,0);
        treeh = tile_sheet.crop(9,0);
        stump = tile_sheet.crop(0,1);
        flower = tile_sheet.crop(1,1);
        mushroom = tile_sheet.crop(2,1);
        rock1 = tile_sheet.crop(3,1);
        rock2 = tile_sheet.crop(4,1);
        gate1 = tile_sheet.crop(5,1);
        gate2 = tile_sheet.crop(0,6);
        chestClose = tile_sheet.crop(7,1);
        chestOpen = tile_sheet.crop(8,1);
        chestEmpty = tile_sheet.crop(9,1);
        alleyUpCorner = tile_sheet.crop(0,2);
        alleyDownCorner = tile_sheet.crop(1,2);
        alley = tile_sheet.crop(2,2);
        waterSmallLeftUpCorner = tile_sheet.crop(3,2);
        waterSmallRightDownCorner1 = tile_sheet.crop(4,2);
        waterSmallRightDownCorner2 = tile_sheet.crop(5,2);
        waterSmallRightUpCorner1 = tile_sheet.crop(6,2);
        waterSmallRightUpCorner2 = tile_sheet.crop(7,2);
        waterRightDownCorner1 = tile_sheet.crop(8,2);
        waterRightDownCorner2 = tile_sheet.crop(9,2);
        water = tile_sheet.crop(0, 3);
        waterRightUpCorner1 = tile_sheet.crop(1,3);
        waterRightUpCorner2 = tile_sheet.crop(3,3);
        waterLeftDownCorner = tile_sheet.crop(2,3);
        soil  = tile_sheet.crop(8,3);
        black = tile_sheet.crop(9,3);
        stone = tile_sheet.crop(0,5);

        waterLeft = tile_sheet.crop(1,6);
        waterRight = tile_sheet.crop(2,6);
        waterUp = tile_sheet.crop(3,6);
        bridgeh1 = tile_sheet.crop(4,6);
        bridgeh2 = tile_sheet.crop(5,6);
        bridgeh3 = tile_sheet.crop(6,6);
        bridgev1 = tile_sheet.crop(7,6);
        bridgev2 = tile_sheet.crop(8,6);
        bridgev3 = tile_sheet.crop(9,6);






        mountain = tile_sheet.crop(1, 1);
        townGrass = tile_sheet.crop(0, 1);
        townGrassDestroyed = tile_sheet.crop(1, 1);
        townSoil = tile_sheet.crop(2, 1);
        tree = tile_sheet.crop(4, 0);

        heroUp = hero_sheet.crop(0, 0);
        heroUp1 = hero_sheet.crop(1, 0);
        heroUp2 = hero_sheet.crop(2, 0);
        heroUp3 = hero_sheet.crop(3, 0);
        heroUp4 = hero_sheet.crop(4, 0);
        heroDown = hero_sheet.crop(5, 0);
        heroDown1 = hero_sheet.crop(6, 0);
        heroDown2 = hero_sheet.crop(7, 0);
        heroDown3 = hero_sheet.crop(8, 0);
        heroDown4 = hero_sheet.crop(9, 0);
        heroRight = hero_sheet.crop(0, 1);
        heroRight1 = hero_sheet.crop(1, 1);
        heroRight2 = hero_sheet.crop(2, 1);
        heroRight3 = hero_sheet.crop(3, 1);
        heroRight4 = hero_sheet.crop(4, 1);
        heroLeft = hero_sheet.crop(5, 1);
        heroLeft1 = hero_sheet.crop(6, 1);
        heroLeft2 = hero_sheet.crop(7, 1);
        heroLeft3 = hero_sheet.crop(8, 1);
        heroLeft4 = hero_sheet.crop(9, 1);
        heroAttackUp = hero_sheet.crop(0, 2);
        heroAttackUp1 = hero_sheet.crop(1, 2);
        heroAttackUp2 = hero_sheet.crop(2, 2);
        heroAttackUp3 = hero_sheet.crop(3, 2);
        heroAttackDown = hero_sheet.crop(4, 2);
        heroAttackDown1 = hero_sheet.crop(5, 2);
        heroAttackDown2 = hero_sheet.crop(6, 2);
        heroAttackDown3 = hero_sheet.crop(7, 2);
        heroAttackRight = hero_sheet.crop(8, 2);
        heroAttackRight1 = hero_sheet.crop(9, 2);
        heroAttackRight2 = hero_sheet.crop(0, 3);
        heroAttackRight3 = hero_sheet.crop(1, 3);
        heroAttackLeft = hero_sheet.crop(2, 3);
        heroAttackLeft1 = hero_sheet.crop(3, 3);
        heroAttackLeft2 = hero_sheet.crop(4, 3);
        heroAttackLeft3 = hero_sheet.crop(5, 3);
        herojumpRight = hero_sheet.crop(6, 3);
        herojumpRight1 = hero_sheet.crop(7, 3);
        herojumpRight2 = hero_sheet.crop(8, 3);
        herojumpRight3 = hero_sheet.crop(9, 3);
        herojumpLeft = hero_sheet.crop(0, 4);
        herojumpLeft = hero_sheet.crop(1, 4);
        herojumpLeft = hero_sheet.crop(2, 4);
        herojumpLeft = hero_sheet.crop(3, 4);
        heroDeadUp = hero_sheet.crop(4, 4);
        heroDeadUp1 = hero_sheet.crop(5, 4);
        heroDeadUp2 = hero_sheet.crop(6, 4);
        heroDeadUp3 = hero_sheet.crop(7, 4);
        heroDeadDown = hero_sheet.crop(8, 4);
        heroDeadDown1 = hero_sheet.crop(9, 4);
        heroDeadDown2 = hero_sheet.crop(0, 5);
        heroDeadDown3 = hero_sheet.crop(1, 5);
        heroDeadRight = hero_sheet.crop(2, 5);
        heroDeadRight1 = hero_sheet.crop(3, 5);
        heroDeadRight2 = hero_sheet.crop(4, 5);
        heroDeadRight3 = hero_sheet.crop(5, 5);
        heroDeadLeft = hero_sheet.crop(6, 5);
        heroDeadLeft1 = hero_sheet.crop(7, 5);
        heroDeadLeft2 = hero_sheet.crop(8, 5);
        heroDeadLeft3 = hero_sheet.crop(9, 5);





        rockUp = tile_sheet.crop(2, 1);
        rockDown = tile_sheet.crop(2, 1);
        rockLeft = tile_sheet.crop(0, 1);
        rockRight = tile_sheet.crop(1, 1);
    }
}
