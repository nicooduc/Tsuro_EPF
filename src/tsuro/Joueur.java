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
    Pion PionJ = new Pion(Couleur); //pion joueur
    Tuile[] TuileJ = new Tuile[3]; //place main de tuiles du joueur
}
