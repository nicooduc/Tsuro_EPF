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
    ImageIcon Tile_0_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles0-0.png"));
    ImageIcon Tile_0_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles0-90.png"));
    ImageIcon Tile_0_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles0-180.png"));
    ImageIcon Tile_0_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles0-270.png"));
    ImageIcon Tile_1_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles1-0.png"));
    ImageIcon Tile_1_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles1-90.png"));
    ImageIcon Tile_1_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles1-180.png"));
    ImageIcon Tile_1_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles1-270.png"));
    ImageIcon Tile_2_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles2-0.png"));
    ImageIcon Tile_2_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles2-90.png"));
    ImageIcon Tile_2_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles2-180.png"));
    ImageIcon Tile_2_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles2-270.png"));
    ImageIcon Tile_3_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles3-0.png"));
    ImageIcon Tile_3_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles3-90.png"));
    ImageIcon Tile_3_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles3-180.png"));
    ImageIcon Tile_3_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles3-270.png"));
    ImageIcon Tile_4_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles4-0.png"));
    ImageIcon Tile_4_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles4-90.png"));
    ImageIcon Tile_4_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles4-180.png"));
    ImageIcon Tile_4_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles4-270.png"));
    ImageIcon Tile_5_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles5-0.png"));
    ImageIcon Tile_5_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles5-90.png"));
    ImageIcon Tile_5_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles5-180.png"));
    ImageIcon Tile_5_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles5-270.png"));
    ImageIcon Tile_6_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles6-0.png"));
    ImageIcon Tile_6_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles6-90.png"));
    ImageIcon Tile_6_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles6-180.png"));
    ImageIcon Tile_6_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles6-270.png"));
    ImageIcon Tile_7_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles7-0.png"));
    ImageIcon Tile_7_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles7-90.png"));
    ImageIcon Tile_7_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles7-180.png"));
    ImageIcon Tile_7_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles7-270.png"));
    ImageIcon Tile_8_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles8-0.png"));
    ImageIcon Tile_8_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles8-90.png"));
    ImageIcon Tile_8_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles8-180.png"));
    ImageIcon Tile_8_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles8-270.png"));
    ImageIcon Tile_9_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles9-0.png"));
    ImageIcon Tile_9_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles9-90.png"));
    ImageIcon Tile_9_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles9-180.png"));
    ImageIcon Tile_9_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles9-270.png"));
    ImageIcon Tile_10_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles10-0.png"));
    ImageIcon Tile_10_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles10-90.png"));
    ImageIcon Tile_10_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles10-180.png"));
    ImageIcon Tile_10_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles10-270.png"));
    ImageIcon Tile_11_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles11-0.png"));
    ImageIcon Tile_11_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles11-90.png"));
    ImageIcon Tile_11_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles11-180.png"));
    ImageIcon Tile_11_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles11-270.png"));
    ImageIcon Tile_12_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles12-0.png"));
    ImageIcon Tile_12_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles12-90.png"));
    ImageIcon Tile_12_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles12-180.png"));
    ImageIcon Tile_12_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles12-270.png"));
    ImageIcon Tile_13_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles13-0.png"));
    ImageIcon Tile_13_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles13-90.png"));
    ImageIcon Tile_13_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles13-180.png"));
    ImageIcon Tile_13_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles13-270.png"));
    ImageIcon Tile_14_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles14-0.png"));
    ImageIcon Tile_14_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles14-90.png"));
    ImageIcon Tile_14_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles14-180.png"));
    ImageIcon Tile_14_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles14-270.png"));
    ImageIcon Tile_15_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles15-0.png"));
    ImageIcon Tile_15_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles15-90.png"));
    ImageIcon Tile_15_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles15-180.png"));
    ImageIcon Tile_15_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles15-270.png"));
    ImageIcon Tile_16_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles16-0.png"));
    ImageIcon Tile_16_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles16-90.png"));
    ImageIcon Tile_16_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles16-180.png"));
    ImageIcon Tile_16_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles16-270.png"));
    ImageIcon Tile_17_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles17-0.png"));
    ImageIcon Tile_17_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles17-90.png"));
    ImageIcon Tile_17_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles17-180.png"));
    ImageIcon Tile_17_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles17-270.png"));
    ImageIcon Tile_18_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles18-0.png"));
    ImageIcon Tile_18_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles18-90.png"));
    ImageIcon Tile_18_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles18-180.png"));
    ImageIcon Tile_18_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles18-270.png"));
    ImageIcon Tile_19_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles19-0.png"));
    ImageIcon Tile_19_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles19-90.png"));
    ImageIcon Tile_19_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles19-180.png"));
    ImageIcon Tile_19_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles19-270.png"));
    ImageIcon Tile_20_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles20-0.png"));
    ImageIcon Tile_20_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles20-90.png"));
    ImageIcon Tile_20_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles20-180.png"));
    ImageIcon Tile_20_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles20-270.png"));
    ImageIcon Tile_21_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles21-0.png"));
    ImageIcon Tile_21_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles21-90.png"));
    ImageIcon Tile_21_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles21-180.png"));
    ImageIcon Tile_21_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles21-270.png"));
    ImageIcon Tile_22_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles22-0.png"));
    ImageIcon Tile_22_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles22-90.png"));
    ImageIcon Tile_22_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles22-180.png"));
    ImageIcon Tile_22_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles22-270.png"));
    ImageIcon Tile_23_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles23-0.png"));
    ImageIcon Tile_23_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles23-90.png"));
    ImageIcon Tile_23_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles23-180.png"));
    ImageIcon Tile_23_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles23-270.png"));
    ImageIcon Tile_24_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles24-0.png"));
    ImageIcon Tile_24_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles24-90.png"));
    ImageIcon Tile_24_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles24-180.png"));
    ImageIcon Tile_24_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles24-270.png"));
    ImageIcon Tile_25_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles25-0.png"));
    ImageIcon Tile_25_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles25-90.png"));
    ImageIcon Tile_25_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles25-180.png"));
    ImageIcon Tile_25_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles25-270.png"));
    ImageIcon Tile_26_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles26-0.png"));
    ImageIcon Tile_26_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles26-90.png"));
    ImageIcon Tile_26_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles26-180.png"));
    ImageIcon Tile_26_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles26-270.png"));
    ImageIcon Tile_27_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles27-0.png"));
    ImageIcon Tile_27_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles27-90.png"));
    ImageIcon Tile_27_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles27-180.png"));
    ImageIcon Tile_27_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles27-270.png"));
    ImageIcon Tile_28_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles28-0.png"));
    ImageIcon Tile_28_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles28-90.png"));
    ImageIcon Tile_28_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles28-180.png"));
    ImageIcon Tile_28_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles28-270.png"));
    ImageIcon Tile_29_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles29-0.png"));
    ImageIcon Tile_29_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles29-90.png"));
    ImageIcon Tile_29_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles29-180.png"));
    ImageIcon Tile_29_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles29-270.png"));
    ImageIcon Tile_30_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles30-0.png"));
    ImageIcon Tile_30_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles30-90.png"));
    ImageIcon Tile_30_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles30-180.png"));
    ImageIcon Tile_30_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles30-270.png"));
    ImageIcon Tile_31_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles31-0.png"));
    ImageIcon Tile_31_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles31-90.png"));
    ImageIcon Tile_31_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles31-180.png"));
    ImageIcon Tile_31_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles31-270.png"));
    ImageIcon Tile_32_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles32-0.png"));
    ImageIcon Tile_32_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles32-90.png"));
    ImageIcon Tile_32_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles32-180.png"));
    ImageIcon Tile_32_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles32-270.png"));
    ImageIcon Tile_33_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles33-0.png"));
    ImageIcon Tile_33_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles33-90.png"));
    ImageIcon Tile_33_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles33-180.png"));
    ImageIcon Tile_33_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles33-270.png"));
    ImageIcon Tile_34_0 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles34-0.png"));
    ImageIcon Tile_34_90 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles34-90.png"));
    ImageIcon Tile_34_180 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles34-180.png"));
    ImageIcon Tile_34_270 = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTiles34-270.png"));
    ImageIcon Tile_Dragon = new javax.swing.ImageIcon (getClass().getResource("/Tiles/TsuroTilesDragon.png"));
    
    
    public TuileGraphique(Tuile tuile) {
        TuileAssociee = tuile;
    }
    
    @Override
    public void paintComponent (Graphics G){
        super.paintComponent(G);
        if (TuileAssociee.IndexTuile == -1) {
            setIcon(Tile_Vide);
        } else {
            int num_tile = TuileAssociee.IndexTuile;
            switch (num_tile) {
                case 0 -> setIcon(Tile_0_0);
                case 1 -> setIcon(Tile_1_0);
                case 2 -> setIcon(Tile_2_0);
                case 3 -> setIcon(Tile_3_0);
                case 4 -> setIcon(Tile_4_0);
                case 5 -> setIcon(Tile_5_0);
                case 6 -> setIcon(Tile_6_0);
                case 7 -> setIcon(Tile_7_0);
                case 8 -> setIcon(Tile_8_0);
                case 9 -> setIcon(Tile_9_0);
                case 10 -> setIcon(Tile_10_0);
                case 11 -> setIcon(Tile_11_0);
                case 12 -> setIcon(Tile_12_0);
                case 13 -> setIcon(Tile_13_0);
                case 14 -> setIcon(Tile_14_0);
                case 15 -> setIcon(Tile_15_0);
                case 16 -> setIcon(Tile_16_0);
                case 17 -> setIcon(Tile_17_0);
                case 18 -> setIcon(Tile_18_0);
                case 19 -> setIcon(Tile_19_0);
                case 20 -> setIcon(Tile_20_0);
                case 21 -> setIcon(Tile_21_0);
                case 22 -> setIcon(Tile_22_0);
                case 23 -> setIcon(Tile_23_0);
                case 24 -> setIcon(Tile_24_0);
                case 25 -> setIcon(Tile_25_0);
                case 26 -> setIcon(Tile_26_0);
                case 27 -> setIcon(Tile_27_0);
                case 28 -> setIcon(Tile_28_0);
                case 29 -> setIcon(Tile_29_0);
                case 30 -> setIcon(Tile_30_0);
                case 31 -> setIcon(Tile_31_0);
                case 32 -> setIcon(Tile_32_0);
                case 33 -> setIcon(Tile_33_0);
                case 34 -> setIcon(Tile_34_0);                
            }
        }
    }
}
