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
public class Plateau {

    Tuile[][] grilleTuile = new Tuile[6][6]; //place plateau de 6x6 tuiles

    public Plateau() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                grilleTuile[i][j] = new Tuile(-1, -1, -1); //constructeur pr initialiser les cases en cases vides
            }
        }
    }

    public int TuileAdjacente(int pos_i, int pos_j) {
        if (pos_i < 0 || pos_i > 5 || pos_j < 0 || pos_j > 5) {
            return -1;
        } else if (grilleTuile[pos_i][pos_j].IndexTuile == -1) {
            return 0;
        }
        return 1;
    }
}
