import java.util.ArrayList;

public class AlphaRunner extends SPIEL
{
    FIGUR Welt, Alpha;
    


public AlphaRunner {
//Hintergrund
    setzeHintergrundgrafik(wueste20000.png);

//Welt 
    Welt = new FIGUR(boden20000.png);
    Welt.verschiebenUm(0, 0);
    Welt.macheStatisch();

//Runner
    Alpha = new FIGUR(gurke.png);
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