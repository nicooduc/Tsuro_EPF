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
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m"; // liste couleurs d'affichages (peux être a bouger)
    
    Tuile[][] grilleTuile = new Tuile[6][6]; //place plateau de 6x6 tuiles
    
    public Plateau() {
        for (int i =0; i<6;i++) {
            for (int j = 0; j<6; j++) {
                    grilleTuile[i][j] = new Tuile(-1); //constructeur pr initialiser les cases en cases vides
            }
        }
    }
}
