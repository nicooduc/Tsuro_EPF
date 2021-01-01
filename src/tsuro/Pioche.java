/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsuro;

/**
 *
 * @author nykol
 */
public class Pioche {

    Tuile[] TuilePioche = new Tuile[35]; //place 35 tuiles ds la pioche

    public Pioche() {
        for (int i = 0; i < 35; i++) {
            TuilePioche[i] = new Tuile(i,-1,-1); //initialisation des 35 tuiles ds la pioche
        }
        
        for (int pos = TuilePioche.length - 1; pos >= 1; pos--) { // mélange la pioche
            //hasard reçoit un nombre entier aléatoire entre 0 et pos
            int hasard = (int) Math.floor(Math.random() * (pos + 1));
            //Echange
            Tuile sauve = TuilePioche[pos];
            TuilePioche[pos] = TuilePioche[hasard];
            TuilePioche[hasard] = sauve;
        }
    }
    
    public Tuile PrendreCarte() {
        int i = 0;
        while (TuilePioche[i] == null && i < 34) {
            i++;
        }
        Tuile TuilePrise = TuilePioche[i];
        TuilePioche[i] = null;
        return TuilePrise;
    }
}
