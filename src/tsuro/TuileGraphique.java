/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsuro;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author nykol
 */
public class TuileGraphique extends JButton {
    Tuile TuileAssociee;
    
    ImageIcon Tile_Vide = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TileVide.png"));
    ImageIcon Tile_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles0.png"));
    ImageIcon Tile_1 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles1.png"));
    ImageIcon Tile_2 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles2.png"));
    ImageIcon Tile_3 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles3.png"));
    ImageIcon Tile_4 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles4.png"));
    ImageIcon Tile_5 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles5.png"));
    ImageIcon Tile_6 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles6.png"));
    ImageIcon Tile_7 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles7.png"));
    ImageIcon Tile_8 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles8.png"));
    ImageIcon Tile_9 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles9.png"));
    ImageIcon Tile_10 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles10.png"));
    ImageIcon Tile_11 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles11.png"));
    ImageIcon Tile_12 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles12.png"));
    ImageIcon Tile_13 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles13.png"));
    ImageIcon Tile_14 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles14.png"));
    ImageIcon Tile_15 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles15.png"));
    ImageIcon Tile_16 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles16.png"));
    ImageIcon Tile_17 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles17.png"));
    ImageIcon Tile_18 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles18.png"));
    ImageIcon Tile_19 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles19.png"));
    ImageIcon Tile_20 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles20.png"));
    ImageIcon Tile_21 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles21.png"));
    ImageIcon Tile_22 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles22.png"));
    ImageIcon Tile_23 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles23.png"));
    ImageIcon Tile_24 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles24.png"));
    ImageIcon Tile_25 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles25.png"));
    ImageIcon Tile_26 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles26.png"));
    ImageIcon Tile_27 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles27.png"));
    ImageIcon Tile_28 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles28.png"));
    ImageIcon Tile_29 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles29.png"));
    ImageIcon Tile_30 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles30.png"));
    ImageIcon Tile_31 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles31.png"));
    ImageIcon Tile_32 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles32.png"));
    ImageIcon Tile_33 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles33.png"));
    ImageIcon Tile_34 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles34.png"));
    ImageIcon Tile_Dragon = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTilesDragon.png"));
    
    
    public TuileGraphique(Tuile tuile) {
        TuileAssociee = tuile;
    }
    
    public void paintComponent (Graphics G){
        super.paintComponent(G);
        if (TuileAssociee.IndexTuile == -1) {
            setIcon(Tile_Vide);
        } else {
            int num_tile = TuileAssociee.IndexTuile;
            switch (num_tile) {
                case 0 -> setIcon(Tile_0);
                case 1 -> setIcon(Tile_1);
                case 2 -> setIcon(Tile_2);
                case 3 -> setIcon(Tile_3);
                case 4 -> setIcon(Tile_4);
                case 5 -> setIcon(Tile_5);
                case 6 -> setIcon(Tile_6);
                case 7 -> setIcon(Tile_7);
                case 8 -> setIcon(Tile_8);
                case 9 -> setIcon(Tile_9);
                case 10 -> setIcon(Tile_10);
                case 11 -> setIcon(Tile_11);
                case 12 -> setIcon(Tile_12);
                case 13 -> setIcon(Tile_13);
                case 14 -> setIcon(Tile_14);
                case 15 -> setIcon(Tile_15);
                case 16 -> setIcon(Tile_16);
                case 17 -> setIcon(Tile_17);
                case 18 -> setIcon(Tile_18);
                case 19 -> setIcon(Tile_19);
                case 20 -> setIcon(Tile_20);
                case 21 -> setIcon(Tile_21);
                case 22 -> setIcon(Tile_22);
                case 23 -> setIcon(Tile_23);
                case 24 -> setIcon(Tile_24);
                case 25 -> setIcon(Tile_25);
                case 26 -> setIcon(Tile_26);
                case 27 -> setIcon(Tile_27);
                case 28 -> setIcon(Tile_28);
                case 29 -> setIcon(Tile_29);
                case 30 -> setIcon(Tile_30);
                case 31 -> setIcon(Tile_31);
                case 32 -> setIcon(Tile_32);
                case 33 -> setIcon(Tile_33);
                case 34 -> setIcon(Tile_34);                
            }
        }
    }
}
