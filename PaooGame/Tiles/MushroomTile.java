package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class SoilTile extends Tile
    \brief Abstractizeaza notiunea de dala de tip sol/pamant.
 */
public class MushroomTile extends Tile
{

    /*! \fn public SoilTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public MushroomTile(int id)
    {
        super(Assets.mushroom, id);
        collisionOn = true;
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }

}
