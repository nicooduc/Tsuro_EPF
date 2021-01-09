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
    int positionCase_i;
    int positionCase_j;
    int positionTuile;

    public Pion(String couleur) {
        Couleur = couleur; //constructeur couleur jeton
        positionTuile = -1;
    }

    public void placerPion(int posCase_i, int posCase_j, int posTuile) {
        positionCase_i = posCase_i;
        positionCase_j = posCase_j;
        positionTuile = posTuile;
    }
}
