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
        for (int i =0; i<35;i++) {
                TuilePioche[i] = new Tuile(i); //initialisation des 35 tuiles ds la pioche
        }
    }
}
