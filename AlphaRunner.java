import java.util.ArrayList;

public class AlphaRunner extends SPIEL
{
    FIGUR Welt, Alpha;
    String d.taste;

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
        if (d.taste == "d"){
            Alpha.verschiebenUm (4*sekunden,0);
            if (Alpha.nenneMx() >= 30){
                Alpha.verschiebeKamera(4*sekunden,0);
            }
        }
        else if (d.taste == "a"){
            Alpha.verschiebenUm (-4*sekunden,0);
            if (Alpha.nenneMx() >= 30){
                Alpha.verschiebeKamera(-4*sekunden,0);
            }
        }
    }

    @Override
    public void tasteReagieren(int taste){
        if (taste == TASTE.D){
            d.taste = taste;
        }
        else if (taste == TASTE.A){
            d.taste = taste;
        }
        if (taste == TASTE.LEER){
            d.taste = taste;
            Alpha.springe(0, 10);
        }
    }
}