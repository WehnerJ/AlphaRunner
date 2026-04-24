public class AlphaRunner extends SPIEL
{
    FIGUR Welt;
    FIGUR Alpha;
    int DTaste;

    public AlphaRunner(){
        super();

        //Hintergrund
        setzeHintergrundgrafik("wueste20000.png");

        //Welt 
        Welt = new FIGUR("boden10000.png");
        Welt.verschiebenUm(0, -8.5);
        Welt.macheStatisch();

        //Runner
        Alpha = new FIGUR("runner","gurke_2.gif");
        Alpha.setzeMittelpunkt(-50, -6.6);
        Alpha.fuegeZustandVonGifHinzu("tot", "gurke_2.gif");
        Alpha.macheDynamisch();

        //Gegner

        //Setup
        verschiebeKamera(-50, 0);
    }

    //Laufen
    @Override
    public void bildAktualisierungReagieren(double sekunden){
        if (Alpha != null){
            if (Alpha.nenneAktivenZustand() != "tot"){
                if (DTaste == 68){
                    if (Alpha.nenneMx() <= 999){
                        verschiebeKamera(8*sekunden, 0);
                        Alpha.verschiebenUm(8*sekunden, 0);
                    }
                }
                else if (DTaste == 65){
                    if (Alpha.nenneMx() <= 999){
                        verschiebeKamera(-8*sekunden,0);
                        Alpha.verschiebenUm(-8*sekunden, 0);
                    }
                }
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
        else if (taste == TASTE.LEER){
            Alpha.springe(10);
        }
    }
    
    @Override
    public void tasteLosgelassenReagieren(int taste){
        DTaste = 0;
    }
}