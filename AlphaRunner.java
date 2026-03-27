import java.util.ArrayList;

public class AlphaRunner extends SPIEL
{
    FIGUR Welt, Alpha;
    
    public Dinospiel(){

        verschiebeKamera(-40,0);
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