package PaooGame.Items;

import PaooGame.RefLinks;

public class CheckCollision {


    RefLinks ref;

    public CheckCollision(RefLinks refLink) {
        ref = refLink; //are toate informatiile necesare, mapa etc.
    }

    public void checkTile(Character pers) {
        int pers_Left = (int) (pers.GetX() + pers.normalBounds.x);
        int pers_Right = (int) (pers.GetX() + pers.normalBounds.x + pers.normalBounds.width);
        int pers_Up = (int) (pers.GetY() + pers.normalBounds.y);
        int pers_Down = (int) (pers.GetY() + pers.normalBounds.y + pers.normalBounds.height);

        // "Inlocuieste"
        int persLeftCol = (int) ((pers_Left - pers.speed) / 48);
        int persRightCol = (int) ((pers_Right - pers.speed) / 48);
        int persUpCol = (int) ((pers_Up - pers.speed) / 48);
        int persDownCol = (int) ((pers_Down - pers.speed) / 48);

        if (ref.GetKeyManager().up) {
            if (ref.GetMap().GetTile(persLeftCol, persUpCol).IsSolid() || ref.GetMap().GetTile(persRightCol, persUpCol).IsSolid()) {
                pers.collisionOn = true;
            }
        }
        if (ref.GetKeyManager().down) {
            if (ref.GetMap().GetTile(persLeftCol, persDownCol).IsSolid() || ref.GetMap().GetTile(persRightCol, persDownCol).IsSolid()) {
                pers.collisionOn = true;
            }
        }
        if (ref.GetKeyManager().right) {
            if (ref.GetMap().GetTile(persRightCol, persUpCol).IsSolid() || ref.GetMap().GetTile(persRightCol, persDownCol).IsSolid()) {
                pers.collisionOn = true;
            }
        }
        if (ref.GetKeyManager().left) {
            if (ref.GetMap().GetTile(persLeftCol, persUpCol).IsSolid() || ref.GetMap().GetTile(persLeftCol, persDownCol).IsSolid()) {
                pers.collisionOn = true;
            }
        }
    }
}
