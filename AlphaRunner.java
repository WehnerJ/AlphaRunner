import java.util.ArrayList;

public class AlphaRunner extends SPIEL
{
    FIGUR Welt, Alpha;
    int DTaste;

    public AlphaRunner(){
        //Hintergrund
        setzeHintergrundgrafik(wueste20000.png);

        //Welt 
        Welt = new FIGUR(boden20000.png);

        Welt.verschiebenUm(0, 0);
        Welt.macheStatisch();

        //Runner
        Alpha = new FIGUR(gurke.png);
        Alpha.setzeMittelpunkt();
        Alpha.fuegeZustandVonEinzelbildernHinzu(Powerup, powerup1.png);
        Alpha.macheDynamisch();

        //Powerup
  
        //Gegner
    }

    //Laufen
    @Override
    public void bildAktualisierungReagieren(double sekunden){
        if (Alpha.nenneAktivenZustand() != "tot"){
            Alpha = new FIGUR();
            Alpha.setzeMittelpunkt();
            Alpha.fuegeZustandVonEinzelbildernHinzu();
            Alpha.macheDynamisch();

            //Powerup

            //Gegner
        }

        @Override
        public void bildAktualisierungReagieren(double sekunden){
        if (DTaste == 68){
            Alpha.verschiebenUm (4*sekunden,0);
            if (Alpha.nenneMx() >= 30){
                Alpha.verschiebeKamera(4*sekunden,0);
            }
        }
        else if (DTaste == 65){
            Alpha.verschiebenUm (-4*sekunden,0);
            if (Alpha.nenneMx() >= 30){
                Alpha.verschiebeKamera(-4*sekunden,0);
            }
        }
    }

    @Override
    public void tasteReagieren(int taste){
        if (taste == TASTE.D){
            DTaste = taste;
        }
        else if (taste == TASTE.A){
            DTaste = taste;
        }
        if (taste == TASTE.LEER){
            DTaste = taste;
            Alpha.springe(0, 10);
        }
    }
}