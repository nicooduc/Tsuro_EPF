package tsuro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nykol
 */
public class Joueur {
    String Nom; //nom joueur
    String Couleur; //couleur joueur
    Tuile[] TuileJ = new Tuile[3]; //place main de tuiles du joueur
    int nbrTour;
    Pion PionJ;
    
    public Joueur(String nom, String couleur) {
        Nom = nom;
        Couleur = couleur;
        PionJ = new Pion(Couleur); //pion joueur
        nbrTour = 0;
    }
    
    public void TourPasse() {
        nbrTour++;
    }
    
    public boolean PiocheCarte(Tuile tuilepioche) {
        int i = 0;
        while (TuileJ[i] != null) {
            i++;
            if (i == 3) {
                return false;
            }
        }
        TuileJ[i] = tuilepioche;
        return true;
    }
    
    public void JouerCarte(Tuile tuilejouee) {
        int i = 0;
        while (tuilejouee != TuileJ[i]) {
            i++;
        }
        TuileJ[i] = null;
    }
}
