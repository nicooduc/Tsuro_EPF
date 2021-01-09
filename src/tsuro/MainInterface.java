/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsuro;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nykol
 */
public class MainInterface extends javax.swing.JFrame {

    int nbr_joueurs; // nombre de joueurs
    Plateau plateau = new Plateau(); // plateau de jeu
    Joueur joueurCourant;
    Joueur ListeJoueurs[] = new Joueur[8]; // tableau comprenant tout les joueurs
    Pioche pioche = new Pioche(); // pioche de cartes
    Tuile carteselect;
    Joueur OrdreJoueurs[] = new Joueur[8];

    /**
     * Creates new form MainInterface
     */
    public MainInterface() {
        initComponents();
        CartesJoueur.setVisible(false);
        Panneau_joueurs.setVisible(false);
        Panneau_infos.setVisible(false);

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                TuileGraphique tuileGraph = new TuileGraphique(plateau.grilleTuile[i][j]);
                tuileGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Tuile t = tuileGraph.TuileAssociee;

                        if (t.IndexTuile != -1) { // Si tuile déjà présente sur la case, ne rien faire
                            return;
                        } else if (carteselect == null) {
                            return;
                        } else {
                            t.IndexTuile = carteselect.IndexTuile;
                            t.rotation = carteselect.rotation;
                            joueurCourant.JouerCarte(carteselect);
                            for (int k = 0; k < 6; k++) {
                                for (int l = 0; l < 6; l++) {
                                    if (carteselect.IndexTuile == plateau.grilleTuile[k][l].IndexTuile) {
                                        plateau.grilleTuile[k][l].PositionnerTuile(k, l);
                                        carteselect.PositionnerTuile(k, l);
                                    }
                                }
                            }
                            DeplacementPions(carteselect.pos_i, carteselect.pos_j);
                            carteselect = null;
                            joueurCourant.PiocheCarte(pioche.PrendreCarte());
                            JoueurSuivant();
                            AffTuilesJ();
                        }

                        PlateauJeu.repaint(); // mettre a jour le plateau de jeu
                    }
                });
                PlateauJeu.add(tuileGraph);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton10 = new javax.swing.JButton();
        PlateauJeu = new javax.swing.JPanel();
        CartesJoueur = new javax.swing.JPanel();
        RotationCarte1 = new javax.swing.JButton();
        Carte1_Joueur = new javax.swing.JButton();
        RotationCarte2 = new javax.swing.JButton();
        Carte2_Joueur = new javax.swing.JButton();
        RotationCarte3 = new javax.swing.JButton();
        Carte3_Joueur = new javax.swing.JButton();
        Panneau_start = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nbr_Joueurs = new javax.swing.JTextField();
        Btn_init1 = new javax.swing.JButton();
        Panneau_joueurs = new javax.swing.JPanel();
        LabelJNoir = new javax.swing.JLabel();
        Nom_Joueur_Noir = new javax.swing.JTextField();
        LabelJRouge = new javax.swing.JLabel();
        Nom_Joueur_Rouge = new javax.swing.JTextField();
        LabelJVert = new javax.swing.JLabel();
        Nom_Joueur_Vert = new javax.swing.JTextField();
        LabelJJaune = new javax.swing.JLabel();
        Nom_Joueur_Jaune = new javax.swing.JTextField();
        LabelJBleu = new javax.swing.JLabel();
        Nom_Joueur_Bleu = new javax.swing.JTextField();
        LabelJViolet = new javax.swing.JLabel();
        Nom_Joueur_Violet = new javax.swing.JTextField();
        LabelJCyan = new javax.swing.JLabel();
        Nom_Joueur_Cyan = new javax.swing.JTextField();
        LabelJBlanc = new javax.swing.JLabel();
        Nom_Joueur_Blanc = new javax.swing.JTextField();
        Btn_init2 = new javax.swing.JButton();
        Panneau_infos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jButton10.setText("jButton10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 800));

        PlateauJeu.setBackground(new java.awt.Color(204, 204, 255));
        PlateauJeu.setPreferredSize(new java.awt.Dimension(780, 780));
        PlateauJeu.setRequestFocusEnabled(false);
        PlateauJeu.setLayout(new java.awt.GridLayout(6, 6));

        CartesJoueur.setBackground(new java.awt.Color(204, 255, 255));
        CartesJoueur.setPreferredSize(new java.awt.Dimension(390, 150));
        CartesJoueur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RotationCarte1.setText("Rotation");
        RotationCarte1.setPreferredSize(new java.awt.Dimension(130, 20));
        RotationCarte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotationCarte1ActionPerformed(evt);
            }
        });
        CartesJoueur.add(RotationCarte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 20));

        Carte1_Joueur.setPreferredSize(new java.awt.Dimension(130, 130));
        Carte1_Joueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carte1_JoueurActionPerformed(evt);
            }
        });
        CartesJoueur.add(Carte1_Joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 130, 130));

        RotationCarte2.setText("Rotation");
        RotationCarte2.setPreferredSize(new java.awt.Dimension(130, 20));
        RotationCarte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotationCarte2ActionPerformed(evt);
            }
        });
        CartesJoueur.add(RotationCarte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, 20));

        Carte2_Joueur.setPreferredSize(new java.awt.Dimension(130, 130));
        Carte2_Joueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carte2_JoueurActionPerformed(evt);
            }
        });
        CartesJoueur.add(Carte2_Joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, 130));

        RotationCarte3.setText("Rotation");
        RotationCarte3.setPreferredSize(new java.awt.Dimension(130, 20));
        RotationCarte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotationCarte3ActionPerformed(evt);
            }
        });
        CartesJoueur.add(RotationCarte3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 130, 20));

        Carte3_Joueur.setPreferredSize(new java.awt.Dimension(130, 130));
        Carte3_Joueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carte3_JoueurActionPerformed(evt);
            }
        });
        CartesJoueur.add(Carte3_Joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 130, 130));

        Panneau_start.setBackground(new java.awt.Color(255, 255, 204));
        Panneau_start.setPreferredSize(new java.awt.Dimension(462, 130));
        Panneau_start.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre de joueurs (2 à 8):");
        Panneau_start.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        Nbr_Joueurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nbr_JoueursActionPerformed(evt);
            }
        });
        Panneau_start.add(Nbr_Joueurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 30, -1));

        Btn_init1.setText("GO !");
        Btn_init1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_init1ActionPerformed(evt);
            }
        });
        Panneau_start.add(Btn_init1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 110, 40));

        Panneau_joueurs.setBackground(new java.awt.Color(255, 255, 204));
        Panneau_joueurs.setPreferredSize(new java.awt.Dimension(462, 190));
        Panneau_joueurs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelJNoir.setText("Joueur Noir");
        Panneau_joueurs.add(LabelJNoir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        Nom_Joueur_Noir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nom_Joueur_NoirActionPerformed(evt);
            }
        });
        Panneau_joueurs.add(Nom_Joueur_Noir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 80, -1));

        LabelJRouge.setText("Joueur Rouge");
        Panneau_joueurs.add(LabelJRouge, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        Panneau_joueurs.add(Nom_Joueur_Rouge, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 80, -1));

        LabelJVert.setText("Joueur Vert");
        Panneau_joueurs.add(LabelJVert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        Nom_Joueur_Vert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nom_Joueur_VertActionPerformed(evt);
            }
        });
        Panneau_joueurs.add(Nom_Joueur_Vert, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 80, -1));

        LabelJJaune.setText("Joueur Jaune");
        Panneau_joueurs.add(LabelJJaune, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        Panneau_joueurs.add(Nom_Joueur_Jaune, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 80, -1));

        LabelJBleu.setText("Joueur Bleu");
        Panneau_joueurs.add(LabelJBleu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));
        Panneau_joueurs.add(Nom_Joueur_Bleu, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 80, -1));

        LabelJViolet.setText("Joueur Violet");
        Panneau_joueurs.add(LabelJViolet, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));
        Panneau_joueurs.add(Nom_Joueur_Violet, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 80, -1));

        LabelJCyan.setText("Joueur Cyan");
        Panneau_joueurs.add(LabelJCyan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));
        Panneau_joueurs.add(Nom_Joueur_Cyan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 80, -1));

        LabelJBlanc.setText("Joueur Blanc");
        Panneau_joueurs.add(LabelJBlanc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        Nom_Joueur_Blanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nom_Joueur_BlancActionPerformed(evt);
            }
        });
        Panneau_joueurs.add(Nom_Joueur_Blanc, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 80, -1));

        Btn_init2.setText("GO !");
        Btn_init2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_init2ActionPerformed(evt);
            }
        });
        Panneau_joueurs.add(Btn_init2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 110, 40));

        Panneau_infos.setBackground(new java.awt.Color(255, 255, 204));
        Panneau_infos.setPreferredSize(new java.awt.Dimension(462, 130));
        Panneau_infos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Tour Du Joueur");
        Panneau_infos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PlateauJeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Panneau_start, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panneau_joueurs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CartesJoueur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Panneau_infos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Panneau_start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Panneau_joueurs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Panneau_infos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CartesJoueur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PlateauJeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PlateauJeu.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Nbr_JoueursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nbr_JoueursActionPerformed
        // Inutile
    }//GEN-LAST:event_Nbr_JoueursActionPerformed

    private void Btn_init1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_init1ActionPerformed
        // TODO add your handling code here:
        switch (Nbr_Joueurs.getText()) { // récupération nombre de joueur et affichage du nombre de couleurs correspondant
            case "2":
                Nom_Joueur_Vert.setVisible(false);
                LabelJVert.setVisible(false);
            case "3":
                Nom_Joueur_Jaune.setVisible(false);
                LabelJJaune.setVisible(false);
            case "4":
                Nom_Joueur_Bleu.setVisible(false);
                LabelJBleu.setVisible(false);
            case "5":
                Nom_Joueur_Violet.setVisible(false);
                LabelJViolet.setVisible(false);
            case "6":
                Nom_Joueur_Cyan.setVisible(false);
                LabelJCyan.setVisible(false);
            case "7":
                Nom_Joueur_Blanc.setVisible(false);
                LabelJBlanc.setVisible(false);
            case "8":
                Panneau_joueurs.setVisible(true);
                Btn_init1.setEnabled(false);
                Nbr_Joueurs.setEnabled(false);
                nbr_joueurs = Integer.valueOf(Nbr_Joueurs.getText());
                break;
            default:
                break;
        }
    }//GEN-LAST:event_Btn_init1ActionPerformed

    private void Btn_init2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_init2ActionPerformed
        // TODO add your handling code here:
        CartesJoueur.setVisible(true);
        Panneau_infos.setVisible(true);

        switch (nbr_joueurs) { // récupération des noms des joueurs et création (pas de break pour dérouler la suite et éviter les répétitions)
            case 8:
                String nomJBlanc = Nom_Joueur_Blanc.getText();
                Joueur JBlanc = new Joueur(nomJBlanc, "Blanc");
                Nom_Joueur_Blanc.setEnabled(false);
                ListeJoueurs[7] = JBlanc;
            case 7:
                String nomJCyan = Nom_Joueur_Cyan.getText();
                Joueur JCyan = new Joueur(nomJCyan, "Cyan");
                Nom_Joueur_Cyan.setEnabled(false);
                ListeJoueurs[6] = JCyan;
            case 6:
                String nomJViolet = Nom_Joueur_Violet.getText();
                Joueur JViolet = new Joueur(nomJViolet, "Violet");
                Nom_Joueur_Violet.setEnabled(false);
                ListeJoueurs[5] = JViolet;
            case 5:
                String nomJBleu = Nom_Joueur_Bleu.getText();
                Joueur JBleu = new Joueur(nomJBleu, "Bleu");
                Nom_Joueur_Bleu.setEnabled(false);
                ListeJoueurs[4] = JBleu;
            case 4:
                String nomJJaune = Nom_Joueur_Jaune.getText();
                Joueur JJaune = new Joueur(nomJJaune, "Jaune");
                Nom_Joueur_Jaune.setEnabled(false);
                ListeJoueurs[3] = JJaune;
            case 3:
                String nomJVert = Nom_Joueur_Vert.getText();
                Joueur JVert = new Joueur(nomJVert, "Vert");
                Nom_Joueur_Vert.setEnabled(false);
                ListeJoueurs[2] = JVert;
            case 2:
                String nomJRouge = Nom_Joueur_Rouge.getText();
                Joueur JRouge = new Joueur(nomJRouge, "Rouge");
                Nom_Joueur_Rouge.setEnabled(false);
                ListeJoueurs[1] = JRouge;
                String nomJNoir = Nom_Joueur_Noir.getText();
                Joueur JNoir = new Joueur(nomJNoir, "Noir");
                Nom_Joueur_Noir.setEnabled(false);
                ListeJoueurs[0] = JNoir;
                Btn_init2.setEnabled(false);
                break;
        }
        InitialiserPartie();
        AffTuilesJ();
    }//GEN-LAST:event_Btn_init2ActionPerformed

    private void Nom_Joueur_NoirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nom_Joueur_NoirActionPerformed
        // Inutile
    }//GEN-LAST:event_Nom_Joueur_NoirActionPerformed

    private void Nom_Joueur_BlancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nom_Joueur_BlancActionPerformed
        // Inutile
    }//GEN-LAST:event_Nom_Joueur_BlancActionPerformed

    private void Nom_Joueur_VertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nom_Joueur_VertActionPerformed
        // Inutile
    }//GEN-LAST:event_Nom_Joueur_VertActionPerformed

    private void Carte1_JoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carte1_JoueurActionPerformed
        carteselect = joueurCourant.TuileJ[0];
    }//GEN-LAST:event_Carte1_JoueurActionPerformed

    private void Carte2_JoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carte2_JoueurActionPerformed
        carteselect = joueurCourant.TuileJ[1];
    }//GEN-LAST:event_Carte2_JoueurActionPerformed

    private void Carte3_JoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carte3_JoueurActionPerformed
        carteselect = joueurCourant.TuileJ[2];
    }//GEN-LAST:event_Carte3_JoueurActionPerformed

    private void RotationCarte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotationCarte1ActionPerformed
        joueurCourant.TuileJ[0].RotationTuile();
        String carte1 = "/Tiles/TsuroTiles" + joueurCourant.TuileJ[0].IndexTuile + "-" + joueurCourant.TuileJ[0].rotation + ".png";
        Carte1_Joueur.setIcon(new javax.swing.ImageIcon(getClass().getResource(carte1)));
    }//GEN-LAST:event_RotationCarte1ActionPerformed

    private void RotationCarte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotationCarte2ActionPerformed
        joueurCourant.TuileJ[1].RotationTuile();
        String carte2 = "/Tiles/TsuroTiles" + joueurCourant.TuileJ[1].IndexTuile + "-" + joueurCourant.TuileJ[1].rotation + ".png";
        Carte2_Joueur.setIcon(new javax.swing.ImageIcon(getClass().getResource(carte2)));
    }//GEN-LAST:event_RotationCarte2ActionPerformed

    private void RotationCarte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotationCarte3ActionPerformed
        joueurCourant.TuileJ[2].RotationTuile();
        String carte3 = "/Tiles/TsuroTiles" + joueurCourant.TuileJ[2].IndexTuile + "-" + joueurCourant.TuileJ[2].rotation + ".png";
        Carte3_Joueur.setIcon(new javax.swing.ImageIcon(getClass().getResource(carte3)));
    }//GEN-LAST:event_RotationCarte3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    public void DeplacementPions(int placeTuile_i, int placeTuile_j) {
        int retour = 0;
        for (int i = 0; i < 8; i++) {
            if (ListeJoueurs[i] != null) {
                if (ListeJoueurs[i].PionJ.positionCase_i == placeTuile_i && ListeJoueurs[i].PionJ.positionCase_j == placeTuile_j) {
                    do {
                        retour = BougerPion(i, placeTuile_i, placeTuile_j);
                    } while (retour == 1);
                    System.out.println(ListeJoueurs[i].PionJ.Couleur);
                    System.out.println("pos i " + ListeJoueurs[i].PionJ.positionCase_i); // connaitre emplacement pions en attendant de trouver une solution graphique
                    System.out.println("pos j " + ListeJoueurs[i].PionJ.positionCase_j);
                    System.out.println("pos t " + ListeJoueurs[i].PionJ.positionTuile);
                    if (retour == -1) {
                        int k = 0;
                        while (OrdreJoueurs[k] != null) {
                            k++;
                        }
                        OrdreJoueurs[k] = ListeJoueurs[i];
                        ListeJoueurs[i] = null;
                    }
                }
            }
        }
    }

    public int BougerPion(int i, int placeTuile_i, int placeTuile_j) {
        int retour = 0;
        ListeJoueurs[i].PionJ.positionTuile = plateau.grilleTuile[placeTuile_i][placeTuile_j].DeplacementPion(ListeJoueurs[i].PionJ.positionTuile);
        switch (ListeJoueurs[i].PionJ.positionTuile) {
            case 0 :
                retour = plateau.TuileAdjacente(placeTuile_i - 1, placeTuile_j);
                if (retour != -1) {
                    ListeJoueurs[i].PionJ.positionCase_i--;
                    ListeJoueurs[i].PionJ.positionTuile = 5;
                }
                break;
            case 1 :
                retour = plateau.TuileAdjacente(placeTuile_i - 1, placeTuile_j);
                if (retour != -1) {
                    ListeJoueurs[i].PionJ.positionCase_i--;
                    ListeJoueurs[i].PionJ.positionTuile = 4;
                }
                break;
            case 2 :
                retour = plateau.TuileAdjacente(placeTuile_i, placeTuile_j + 1);
                if (retour != -1) {
                    ListeJoueurs[i].PionJ.positionCase_j++;
                    ListeJoueurs[i].PionJ.positionTuile = 7;
                }
                break;
            case 3 :
                retour = plateau.TuileAdjacente(placeTuile_i, placeTuile_j + 1);
                if (retour != -1) {
                    ListeJoueurs[i].PionJ.positionCase_j++;
                    ListeJoueurs[i].PionJ.positionTuile = 6;
                }
                break;
            case 4 :
                retour = plateau.TuileAdjacente(placeTuile_i + 1, placeTuile_j);
                if (retour != -1) {
                    ListeJoueurs[i].PionJ.positionCase_i++;
                    ListeJoueurs[i].PionJ.positionTuile = 1;
                }
                break;
            case 5 :
                retour = plateau.TuileAdjacente(placeTuile_i + 1, placeTuile_j);
                if (retour != -1) {
                    ListeJoueurs[i].PionJ.positionCase_i++;
                    ListeJoueurs[i].PionJ.positionTuile = 0;
                }
                break;
            case 6 :
                retour = plateau.TuileAdjacente(placeTuile_i, placeTuile_j - 1);
                if (retour != -1) {
                    ListeJoueurs[i].PionJ.positionCase_j--;
                    ListeJoueurs[i].PionJ.positionTuile = 3;
                }
                break;
            case 7 :
                retour = plateau.TuileAdjacente(placeTuile_i, placeTuile_j - 1);
                if (retour != -1) {
                    ListeJoueurs[i].PionJ.positionCase_j--;
                    ListeJoueurs[i].PionJ.positionTuile = 2;
                }
                break;
        }
        return retour;
    }

    public void AffTuilesJ() {
        if (joueurCourant.TuileJ[0] != null) {
            String carte1 = "/Tiles/TsuroTiles" + joueurCourant.TuileJ[0].IndexTuile + "-" + joueurCourant.TuileJ[0].rotation + ".png";
            Carte1_Joueur.setIcon(new javax.swing.ImageIcon(getClass().getResource(carte1)));
        } else {
            Carte1_Joueur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tiles/TileVide.png")));
        }
        if (joueurCourant.TuileJ[1] != null) {
            String carte2 = "/Tiles/TsuroTiles" + joueurCourant.TuileJ[1].IndexTuile + "-" + joueurCourant.TuileJ[1].rotation + ".png";
            Carte2_Joueur.setIcon(new javax.swing.ImageIcon(getClass().getResource(carte2)));
        } else {
            Carte2_Joueur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tiles/TileVide.png")));
        }
        if (joueurCourant.TuileJ[2] != null) {
            String carte3 = "/Tiles/TsuroTiles" + joueurCourant.TuileJ[2].IndexTuile + "-" + joueurCourant.TuileJ[2].rotation + ".png";
            Carte3_Joueur.setIcon(new javax.swing.ImageIcon(getClass().getResource(carte3)));
        } else {
            Carte3_Joueur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tiles/TileVide.png")));
        }
    }

    public void InitialiserPartie() {
        Carte1_Joueur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tiles/TileVide.png")));
        Carte2_Joueur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tiles/TileVide.png")));
        Carte3_Joueur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tiles/TileVide.png")));

        for (int pos = ListeJoueurs.length - 1; pos >= 1; pos--) { // mélange l'ordre des joueurs
            //hasard reçoit un nombre entier aléatoire entre 0 et pos
            int hasard = (int) Math.floor(Math.random() * (pos + 1));
            //Echange
            Joueur sauve = ListeJoueurs[pos];
            ListeJoueurs[pos] = ListeJoueurs[hasard];
            ListeJoueurs[hasard] = sauve;
        }
        for (int i = 0; i < 8; i++) {
            if (ListeJoueurs[i] != null) {
                DistribuerCarte(i);
                PositionnerPion(i);
            }
        }

        Random random = new Random();
        int Jdebut = random.nextInt(8);
        while (ListeJoueurs[Jdebut] == null) {
            Jdebut = (Jdebut + 1) % 8;
        }
        joueurCourant = ListeJoueurs[Jdebut];
    }

    public void DistribuerCarte(int numJ) {
        for (int j = 0; j < 3; j++) {
            ListeJoueurs[numJ].PiocheCarte(pioche.PrendreCarte());
        }
    }

    public void PositionnerPion(int numJ) { // TROUEVR SOLUTION ATTRIBUER CASE INITIALE (bouton tout le tour ?)
        System.out.println("Quel case voulez vous posez votre jeton ? (entrer ligne puis colonne)");
        Scanner sc = new Scanner(System.in);
        Integer poscasei = Integer.valueOf(sc.nextLine());
        Integer poscasej = Integer.valueOf(sc.nextLine());
        System.out.println("Quel position sur la case voulez vous le poser ?");
        Integer postuile = Integer.valueOf(sc.nextLine());
        ListeJoueurs[numJ].PionJ.placerPion(poscasei, poscasej, postuile);
    }

    public void JoueurSuivant() {
        int numJoueur = 0;
        for (int i = 0; i < 8; i++) {
            if (ListeJoueurs[i] == joueurCourant) {
                numJoueur = i;
            }
        }
        while (ListeJoueurs[(numJoueur + 1) % 8] == null) {
            numJoueur = (numJoueur + 1) % 8;
        }
        if (joueurCourant == ListeJoueurs[numJoueur]) {
            AfficherVictoire();
        }
        joueurCourant = ListeJoueurs[(numJoueur + 1) % 8];
    }
    
    public void AfficherVictoire() {
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_init1;
    private javax.swing.JButton Btn_init2;
    private javax.swing.JButton Carte1_Joueur;
    private javax.swing.JButton Carte2_Joueur;
    private javax.swing.JButton Carte3_Joueur;
    private javax.swing.JPanel CartesJoueur;
    private javax.swing.JLabel LabelJBlanc;
    private javax.swing.JLabel LabelJBleu;
    private javax.swing.JLabel LabelJCyan;
    private javax.swing.JLabel LabelJJaune;
    private javax.swing.JLabel LabelJNoir;
    private javax.swing.JLabel LabelJRouge;
    private javax.swing.JLabel LabelJVert;
    private javax.swing.JLabel LabelJViolet;
    private javax.swing.JTextField Nbr_Joueurs;
    private javax.swing.JTextField Nom_Joueur_Blanc;
    private javax.swing.JTextField Nom_Joueur_Bleu;
    private javax.swing.JTextField Nom_Joueur_Cyan;
    private javax.swing.JTextField Nom_Joueur_Jaune;
    private javax.swing.JTextField Nom_Joueur_Noir;
    private javax.swing.JTextField Nom_Joueur_Rouge;
    private javax.swing.JTextField Nom_Joueur_Vert;
    private javax.swing.JTextField Nom_Joueur_Violet;
    private javax.swing.JPanel Panneau_infos;
    private javax.swing.JPanel Panneau_joueurs;
    private javax.swing.JPanel Panneau_start;
    private javax.swing.JPanel PlateauJeu;
    private javax.swing.JButton RotationCarte1;
    private javax.swing.JButton RotationCarte2;
    private javax.swing.JButton RotationCarte3;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
