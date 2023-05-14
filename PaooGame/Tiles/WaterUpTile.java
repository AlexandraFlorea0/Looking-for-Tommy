package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class WaterTile extends Tile
    \brief Abstractizeaza notiunea de dala de tip apa.
 */public class WaterUpTile extends Tile
{
    /*! \fn public WaterTile(int id)
       \brief Constructorul de initializare al clasei

       \param id Id-ul dalei util in desenarea hartii.
    */
    public WaterUpTile(int id)
    {
        super(Assets.waterUp, id);

    }
}
