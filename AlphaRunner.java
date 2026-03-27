import java.util.ArrayList;

public class AlphaRunner extends SPIEL
{
    FIGUR Welt, Alpha;
<<<<<<< HEAD
    


public AlphaRunner {
//Hintergrund
    setzeHintergrundgrafik(wueste20000.png);

//Welt 
    Welt = new FIGUR(boden20000.png);
=======
    String p.taste;

    public AlphaRunner {
//Welt 
    Welt = new FIGUR();
>>>>>>> 51373cb214561302ef32bfe9ebdc60c7c2ff4f8d
    Welt.verschiebenUm(0, 0);
    Welt.macheStatisch();

//Runner
<<<<<<< HEAD
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
=======
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
>>>>>>> 51373cb214561302ef32bfe9ebdc60c7c2ff4f8d
            Alpha.verschiebenUm (4*sekunden,0);
            if (Alpha.nenneMx() >= 30){
                Alpha.verschiebeKamera(4*sekunden,0);
            }
        }
<<<<<<< HEAD
    }
=======
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
            d.taste = taste
        }
        else if (taste == TASTE.A){
            d.taste = taste
        }
    }

>>>>>>> 51373cb214561302ef32bfe9ebdc60c7c2ff4f8d
}