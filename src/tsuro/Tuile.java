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
public class Tuile {
    int IndexTuile;
    int rotation;
    int pos_i;
    int pos_j;
    
    public Tuile (int index, int Pos_i, int Pos_j) {
        IndexTuile = index;
        rotation = 0;
        pos_j = Pos_j;
        pos_i = Pos_i;
    }
    
    public void RotationTuile() {
        rotation = (rotation + 90)%360 ;
    }
    
    public void PositionnerTuile(int Pos_i, int Pos_j) {
        pos_j = Pos_j;
        pos_i = Pos_i;
    }
    
    public int DeplacementPion (int PosInitiale) {
        int NewPos = 0;
        switch (IndexTuile) {
            case 0 -> NewPos = NewPosPion(PosInitiale, tile0());
            case 1 -> NewPos = NewPosPion(PosInitiale, tile1());
            case 2 -> NewPos = NewPosPion(PosInitiale, tile2());
            case 3 -> NewPos = NewPosPion(PosInitiale, tile3());
            case 4 -> NewPos = NewPosPion(PosInitiale, tile4());
            case 5 -> NewPos = NewPosPion(PosInitiale, tile5());
            case 6 -> NewPos = NewPosPion(PosInitiale, tile6());
            case 7 -> NewPos = NewPosPion(PosInitiale, tile7());
            case 8 -> NewPos = NewPosPion(PosInitiale, tile8());
            case 9 -> NewPos = NewPosPion(PosInitiale, tile9());
            case 10 -> NewPos = NewPosPion(PosInitiale, tile10());
            case 11 -> NewPos = NewPosPion(PosInitiale, tile11());
            case 12 -> NewPos = NewPosPion(PosInitiale, tile12());
            case 13 -> NewPos = NewPosPion(PosInitiale, tile13());
            case 14 -> NewPos = NewPosPion(PosInitiale, tile14());
            case 15 -> NewPos = NewPosPion(PosInitiale, tile15());
            case 16 -> NewPos = NewPosPion(PosInitiale, tile16());
            case 17 -> NewPos = NewPosPion(PosInitiale, tile17());
            case 18 -> NewPos = NewPosPion(PosInitiale, tile18());
            case 19 -> NewPos = NewPosPion(PosInitiale, tile19());
            case 20 -> NewPos = NewPosPion(PosInitiale, tile20());
            case 21 -> NewPos = NewPosPion(PosInitiale, tile21());
            case 22 -> NewPos = NewPosPion(PosInitiale, tile22());
            case 23 -> NewPos = NewPosPion(PosInitiale, tile23());
            case 24 -> NewPos = NewPosPion(PosInitiale, tile24());
            case 25 -> NewPos = NewPosPion(PosInitiale, tile25());
            case 26 -> NewPos = NewPosPion(PosInitiale, tile26());
            case 27 -> NewPos = NewPosPion(PosInitiale, tile27());
            case 28 -> NewPos = NewPosPion(PosInitiale, tile28());
            case 29 -> NewPos = NewPosPion(PosInitiale, tile29());
            case 30 -> NewPos = NewPosPion(PosInitiale, tile30());
            case 31 -> NewPos = NewPosPion(PosInitiale, tile31());
            case 32 -> NewPos = NewPosPion(PosInitiale, tile32());
            case 33 -> NewPos = NewPosPion(PosInitiale, tile33());
            case 34 -> NewPos = NewPosPion(PosInitiale, tile34());
        }
        return NewPos;
    }
    
    public int NewPosPion (int PosInit, int[] TabTile) {
        int NewPosPion = 0;
        switch (rotation) {
            case 270 -> PosInit = (PosInit + 2) % 8;
            case 180 -> PosInit = (PosInit + 4) % 8;
            case 90 -> PosInit = (PosInit + 6) % 8;
            case 0 -> {}
        }
        PosInit = TabTile[PosInit] - 1;
        switch (rotation) {
            case 270 -> NewPosPion = (PosInit + 6) % 8;
            case 180 -> NewPosPion = (PosInit + 4) % 8;
            case 90 -> NewPosPion = (PosInit + 2) % 8;
            case 0 -> {}
        }
        return NewPosPion;
    }
    
    
    
    
    
    public int[] tile0() {
        int[] tab0 = {7,4,6,2,8,3,1,5};
        return tab0;
    }
    public int[] tile1() {
        int[] tab1 = {6,3,2,5,4,1,8,7};
        return tab1;
    }
    public int[] tile2() {
        int[] tab2 = {7,6,5,8,3,2,1,4};
        return tab2;
    }
    public int[] tile3() {
        int[] tab3 = {5,4,7,2,1,8,3,6};
        return tab3;
    }
    public int[] tile4() {
        int[] tab4 = {3,5,1,7,2,8,4,6};
        return tab4;
    }
    public int[] tile5() {
        int[] tab5 = {5,4,6,2,1,3,8,7};
        return tab5;
    }
    public int[] tile6() {
        int[] tab6 = {5,6,4,3,1,2,8,7};
        return tab6;
    }
    public int[] tile7() {
        int[] tab7 = {3,6,1,5,4,2,8,7};
        return tab7;
    }
    public int[] tile8() {
        int[] tab8 = {2,1,4,3,8,7,6,5};
        return tab8;
    }
    public int[] tile9() {
        int[] tab9 = {6,3,2,7,8,1,4,5};
        return tab9;
    }
    public int[] tile10() {
        int[] tab10 = {2,1,6,8,7,3,5,4};
        return tab10;
    }
    public int[] tile11() {
        int[] tab11 = {4,6,7,1,8,2,3,5};
        return tab11;
    }
    public int[] tile12() {
        int[] tab12 = {2,1,4,3,6,5,8,7};
        return tab12;
    }
    public int[] tile13() {
        int[] tab13 = {5,8,4,3,1,7,6,2};
        return tab13;
    }
    public int[] tile14() {
        int[] tab14 = {7,3,2,5,4,8,1,6};
        return tab14;
    }
    public int[] tile15() {
        int[] tab15 = {4,5,6,1,2,3,8,7};
        return tab15;
    }
    public int[] tile16() {
        int[] tab16 = {8,3,2,5,4,7,6,1};
        return tab16;
    }
    public int[] tile17() {
        int[] tab17 = {7,5,6,8,2,3,1,4};
        return tab17;
    }
    public int[] tile18() {
        int[] tab18 = {3,8,1,7,6,5,4,2};
        return tab18;
    }
    public int[] tile19() {
        int[] tab19 = {4,7,6,1,8,3,2,5};
        return tab19;
    }
    public int[] tile20() {
        int[] tab20 = {6,5,8,7,2,1,4,3};
        return tab20;
    }
    public int[] tile21() {
        int[] tab21 = {7,8,5,6,3,4,1,2};
        return tab21;
    }
    public int[] tile22() {
        int[] tab22 = {5,6,7,8,1,2,3,4};
        return tab22;
    }
    public int[] tile23() {
        int[] tab23 = {5,7,8,6,1,4,2,3};
        return tab23;
    }
    public int[] tile24() {
        int[] tab24 = {6,5,7,8,2,1,3,4};
        return tab24;
    }
    public int[] tile25() {
        int[] tab25 = {7,3,2,6,8,4,1,5};
        return tab25;
    }
    public int[] tile26() {
        int[] tab26 = {7,8,6,5,4,3,1,2};
        return tab26;
    }
    public int[] tile27() {
        int[] tab27 = {2,1,5,6,3,4,8,7};
        return tab27;
    }
    public int[] tile28() {
        int[] tab28 = {4,3,2,1,8,7,6,5};
        return tab28;
    }
    public int[] tile29() {
        int[] tab29 = {2,1,8,7,6,5,4,3};
        return tab29;
    }
    public int[] tile30() {
        int[] tab30 = {8,5,7,6,2,4,3,1};
        return tab30;
    }
    public int[] tile31() {
        int[] tab31 = {8,6,7,5,4,2,3,1};
        return tab31;
    }
    public int[] tile32() {
        int[] tab32 = {3,8,1,6,7,4,5,2};
        return tab32;
    }
    public int[] tile33() {
        int[] tab33 = {7,6,8,5,4,2,1,3};
        return tab33;
    }
    public int[] tile34() {
        int[] tab34 = {2,1,5,7,3,8,4,6};
        return tab34;
    }
}
