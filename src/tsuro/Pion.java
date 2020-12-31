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
public class Pion {
    String Couleur; //couleur pion
    int positionCase;
    int positionTuile;
    
    
    public Pion(String couleur) {
        Couleur = couleur; //constructeur couleur jeton
    }
    
    public void placerPion(int posCase, int posTuile) {
        positionCase = posCase;
        positionTuile = posTuile;
    }
}
