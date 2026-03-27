import java.util.ArrayList;

public class AlphaRunner extends SPIEL
{
    FIGUR Welt, Alpha;
    TEXT text; 

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
}