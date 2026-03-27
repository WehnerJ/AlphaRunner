import java.util.ArrayList;

public class AlphaRunner extends SPIEL
{
    FIGUR Welt, Alpha;
    
    public AlphaRunner {
//Welt 
    Welt = new FIGUR();
    Welt.verschiebenUm(0, 0);
    Welt.macheStatisch();

//Runner
    Alpha = new FIGUR();
    Alpha.setzeMittelpunkt();
    Alpha.fuegeZustandVonEinzelbildernHinzu();
    Alpha.macheDynamisch();

//Powerup

//Gegner
}

    @Override
    public void bildAktualisierungReagieren(double sekunden){
        if (Alpha.nenneAktivenZustand() != "tot"){
            Alpha.verschiebenUm (4*sekunden,0);
            if (Alpha.nenneMx() >= 30){
                Alpha.verschiebeKamera(4*sekunden,0);
            }
        }
    }

}