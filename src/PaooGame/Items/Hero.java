package PaooGame.Items;

import java.awt.*;
import java.awt.image.BufferedImage;

import PaooGame.RefLinks;
import PaooGame.Graphics.Assets;

/*! \class public class Hero extends Character
    \brief Implementeaza notiunea de erou/player (caracterul controlat de jucator).

    Elementele suplimentare pe care le aduce fata de clasa de baza sunt:
        imaginea (acest atribut poate fi ridicat si in clasa de baza)
        deplasarea
        atacul (nu este implementat momentan)
        dreptunghiul de coliziune
 */
public class Hero extends Character
{
    private BufferedImage image;    /*!< Referinta catre imaginea curenta a eroului.*/
    private int animationState = 0; /*! seteaza starea animatiei pe 0 in momentul in care apas un buton */
    private boolean leftButtonPressed = false;
    private boolean rightButtonPressed = false;
    private boolean upButtonPressed = false;
    private boolean downButtonPressed = false;
    private boolean attackUpButtonPressed = false;
    private boolean attackDownButtonPressed = false;
    private boolean attackLeftButtonPressed = false;
    private boolean attackRightButtonPressed = false;
    private boolean jumpRightButtonPressed = false;
    private boolean jumpLeftButtonPressed = false;


    /*! \fn public Hero(RefLinks refLink, float x, float y)
        \brief Constructorul de initializare al clasei Hero.

        \param refLink Referinta catre obiectul shortcut (obiect ce retine o serie de referinte din program).
        \param x Pozitia initiala pe axa X a eroului.
        \param y Pozitia initiala pe axa Y a eroului.
     */
    public Hero(RefLinks refLink, float x, float y)
    {
            ///Apel al constructorului clasei de baza
        super(refLink, x,y, Character.DEFAULT_CREATURE_WIDTH, Character.DEFAULT_CREATURE_HEIGHT);
            ///Seteaza imaginea de start a eroului
        image = Assets.heroDown;
            ///Stabilieste pozitia relativa si dimensiunea dreptunghiului de coliziune, starea implicita(normala)
        normalBounds.x = 15;
        normalBounds.y = 27;
        normalBounds.width = 20;
        normalBounds.height = 20;



            ///Stabilieste pozitia relativa si dimensiunea dreptunghiului de coliziune, starea de atac
        attackBounds.x = 10;
        attackBounds.y = 10;
        attackBounds.width = 20;
        attackBounds.height = 20;
    }

    /*! \fn public void Update()
        \brief Actualizeaza pozitia si imaginea eroului.
     */
    @Override
    public void Update() {
        ///Verifica daca a fost apasata o tasta
        GetInput();
        ///Actualizeaza pozitia
        Move();
        ///Actualizeaza imaginea
        if (leftButtonPressed) {
            animationState++;
            if(animationState > 10){
                animationState = 0;
            }
            switch (animationState) {
                case 1:
                    image = Assets.heroLeft;
                    break;
                case 2:
                    image = Assets.heroLeft1;
                    break;
                case 3:
                    image = Assets.heroLeft2;
                    break;
                case 4:
                    image = Assets.heroLeft3;
                    break;
                case 5:
                    image = Assets.heroLeft4;
                    break;
                default:
                    image = Assets.heroLeft;
                    leftButtonPressed = false;
                    break;
            }
        }
        if (rightButtonPressed) {
            animationState++;
            if(animationState > 10){
                animationState = 0;
            }
            switch (animationState) {
                case 1:
                    image = Assets.heroRight;
                    break;
                case 2:
                    image = Assets.heroRight1;
                    break;
                case 3:
                    image = Assets.heroRight2;
                    break;
                case 4:
                    image = Assets.heroRight3;
                    break;
                case 5:
                    image = Assets.heroRight4;
                    break;
                default:
                    image = Assets.heroRight;
                    rightButtonPressed = false;
                    break;
            }
        }

        if (downButtonPressed) {
            animationState++;
            if(animationState > 10){
                animationState = 0;
            }
            switch (animationState) {
                case 1:
                    image = Assets.heroDown;
                    break;
                case 2:
                    image = Assets.heroDown1;
                    break;
                case 3:
                    image = Assets.heroDown2;
                    break;
                case 4:
                    image = Assets.heroDown3;
                    break;
                case 5:
                    image = Assets.heroDown4;
                    break;
                default:
                    image = Assets.heroDown;
                    downButtonPressed = false;
                    break;
            }
        }
        if (upButtonPressed) {
            animationState++;
            if(animationState > 10){
                animationState = 0;
            }
            switch (animationState) {

                case 1:
                    image = Assets.heroUp;
                    break;
                case 2:
                    image = Assets.heroUp1;
                    break;
                case 3:
                    image = Assets.heroUp2;
                    break;
                case 4:
                    image = Assets.heroUp3;
                    break;
                case 5:
                    image = Assets.heroUp4;
                    break;
                default:
                    image = Assets.heroUp;
                    upButtonPressed = false;
                    break;
            }
        }
        if (attackUpButtonPressed) {
            animationState++;
            if(animationState > 10){
                animationState = 0;
            }
            switch (animationState) {

                case 1:
                    image = Assets.heroAttackUp;
                    break;
                case 2:
                    image = Assets.heroAttackUp1;
                    break;
                case 3:
                    image = Assets.heroAttackUp2;
                    break;
                case 4:
                    image = Assets.heroAttackUp3;
                    break;
                default:
                    image = Assets.heroUp;
                    attackUpButtonPressed = false;
                    break;
            }
        }
        if (attackDownButtonPressed) {
            animationState++;
            if(animationState > 10){
                animationState = 0;
            }
            switch (animationState) {

                case 1:
                    image = Assets.heroAttackDown;
                    break;
                case 2:
                    image = Assets.heroAttackDown1;
                    break;
                case 3:
                    image = Assets.heroAttackDown2;
                    break;
                case 4:
                    image = Assets.heroAttackDown3;
                    break;
                default:
                    image = Assets.heroDown;
                    attackDownButtonPressed = false;
                    break;
            }
        }
        if (attackRightButtonPressed) {
            animationState++;
            if(animationState > 10){
                animationState = 0;
            }
            switch (animationState) {

                case 1:
                    image = Assets.heroAttackRight;
                    break;
                case 2:
                    image = Assets.heroAttackRight1;
                    break;
                case 3:
                    image = Assets.heroAttackRight2;
                    break;
                case 4:
                    image = Assets.heroAttackRight3;
                    break;
                default:
                    image = Assets.heroRight;
                    attackRightButtonPressed = false;
                    break;
            }
        }
        if (attackLeftButtonPressed) {
            animationState++;
            if(animationState > 10){
                animationState = 0;
            }
            switch (animationState) {

                case 1:
                    image = Assets.heroAttackLeft;
                    break;
                case 2:
                    image = Assets.heroAttackLeft1;
                    break;
                case 3:
                    image = Assets.heroAttackLeft2;
                    break;
                case 4:
                    image = Assets.heroAttackLeft3;
                    break;
                default:
                    image = Assets.heroLeft;
                    attackLeftButtonPressed = false;
                    break;
            }
        }
        if (jumpLeftButtonPressed) {
            animationState++;
            if(animationState > 10){
                animationState = 0;
            }
            switch (animationState) {

                case 1:
                    image = Assets.herojumpLeft;
                    break;
                case 2:
                    image = Assets.herojumpLeft1;
                    break;
                case 3:
                    image = Assets.herojumpLeft2;
                    break;
                case 4:
                    image = Assets.herojumpLeft3;
                    break;
                default:
                    image = Assets.heroLeft;
                    jumpLeftButtonPressed = false;
                    break;
            }
        }
        if (jumpRightButtonPressed) {
            animationState++;
            if(animationState > 10){
                animationState = 0;
            }
            switch (animationState) {

                case 1:
                    image = Assets.herojumpRight;
                    break;
                case 2:
                    image = Assets.herojumpRight1;
                    break;
                case 3:
                    image = Assets.herojumpRight2;
                    break;
                case 4:
                    image = Assets.herojumpRight3;
                    break;
                default:
                    image = Assets.heroRight;
                    jumpRightButtonPressed = false;
                    break;
            }
        }
    }

    /*! \fn private void GetInput()
        \brief Verifica daca a fost apasata o tasta din cele stabilite pentru controlul eroului.
     */
    private void GetInput()
    {
            ///Implicit eroul nu trebuie sa se deplaseze daca nu este apasata o tasta
        xMove = 0;
        yMove = 0;
        collisionOn = false;
        refLink.collisionc.checkTile(this);
        if(!collisionOn) {
            ///Verificare apasare tasta "sus"
            if (refLink.GetKeyManager().up) {
                leftButtonPressed = false;
                rightButtonPressed = false;
                upButtonPressed = true;
                downButtonPressed = false;
                attackUpButtonPressed = false;
                attackDownButtonPressed = false;
                attackLeftButtonPressed = false;
                attackRightButtonPressed = false;
                jumpRightButtonPressed = false;
                jumpLeftButtonPressed = false;
                yMove = -speed;

            }
            ///Verificare apasare tasta "jos"
            if (refLink.GetKeyManager().down) {
                leftButtonPressed = false;
                rightButtonPressed = false;
                upButtonPressed = false;
                downButtonPressed = true;
                attackUpButtonPressed = false;
                attackDownButtonPressed = false;
                attackLeftButtonPressed = false;
                attackRightButtonPressed = false;
                jumpRightButtonPressed = false;
                jumpLeftButtonPressed = false;
                yMove = speed;
            }
            ///Verificare apasare tasta "left"
            if (refLink.GetKeyManager().left) {
                leftButtonPressed = true;
                rightButtonPressed = false;
                upButtonPressed = false;
                downButtonPressed = false;
                attackUpButtonPressed = false;
                attackDownButtonPressed = false;
                attackLeftButtonPressed = false;
                attackRightButtonPressed = false;
                jumpRightButtonPressed = false;
                jumpLeftButtonPressed = false;
                xMove = -speed;
            }
            ///Verificare apasare tasta "dreapta"
            if (refLink.GetKeyManager().right) {
                leftButtonPressed = false;
                rightButtonPressed = true;
                upButtonPressed = false;
                downButtonPressed = false;
                attackUpButtonPressed = false;
                attackDownButtonPressed = false;
                attackLeftButtonPressed = false;
                attackRightButtonPressed = false;
                jumpRightButtonPressed = false;
                jumpLeftButtonPressed = false;
                xMove = speed;
            }
            if (refLink.GetKeyManager().attack) {
                ///Verificare apasare tasta "CTRL sus"
                if (image == Assets.heroUp) {
                    attackUpButtonPressed = true;
                }
                if (image == Assets.heroDown) {
                    attackDownButtonPressed = true;
                }
                if (image == Assets.heroRight) {
                    attackRightButtonPressed = true;
                }
                if (image == Assets.heroLeft) {
                    attackLeftButtonPressed = true;
                }
            }
            if (refLink.GetKeyManager().jump) {
                ///Verificare apasare tasta "CTRL sus"
                if (image == Assets.heroUp) {
                    upButtonPressed = true;
                }
                if (image == Assets.heroDown) {
                    downButtonPressed = true;
                }
                if (image == Assets.heroRight) {
                    jumpRightButtonPressed = true;
                }
                if (image == Assets.heroLeft) {
                    jumpLeftButtonPressed = true;
                }
            }
        }
        else{
            if (refLink.GetKeyManager().up) {
                image = Assets.heroUp;
            }
            ///Verificare apasare tasta "jos"
            if (refLink.GetKeyManager().down) {
                image =Assets.heroDown;
            }
            ///Verificare apasare tasta "left"
            if (refLink.GetKeyManager().left) {
                image = Assets.heroLeft;
            }
            ///Verificare apasare tasta "dreapta"
            if (refLink.GetKeyManager().right) {
                image = Assets.heroRight;
            }
        }

    }

    /*! \fn public void Draw(Graphics g)
        \brief Randeaza/deseneaza eroul in noua pozitie.

        \brief g Contextul grafic in care trebuie efectuata desenarea eroului.
     */
    @Override
    public void Draw(Graphics g)
    {
        g.drawImage(image, (int)x, (int)y, width, height, null);

            ///doar pentru debug daca se doreste vizualizarea dreptunghiului de coliziune altfel se vor comenta urmatoarele doua linii
       // g.setColor(Color.blue);
       // g.fillRect((int)(x + bounds.x), (int)(y + bounds.y), bounds.width, bounds.height);
    }

}
