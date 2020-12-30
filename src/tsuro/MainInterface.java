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
public class MainInterface extends javax.swing.JFrame {
    
    int nbr_joueurs; // a demander en début de partie
    Plateau plateau = new Plateau(); // plateau de jeu
    Joueur ListeJoueurs[] = new Joueur[nbr_joueurs]; // tableau comprenant tout les joueurs
    Joueur joueurCourant;
    
    /**
     * Creates new form MainInterface
     */
    public MainInterface() {
        initComponents();
        CartesJoueur.setVisible(false);
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                TuileGraphique tuileGraph = new TuileGraphique(plateau.grilleTuile[i][j]);
                tuileGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Tuile t = tuileGraph.TuileAssociee;
                        
                        // actions à réaliser lorsque une case de la grille est activées à placer ici
                        
                        PlateauJeu.repaint(); // mettre a jour le plateau de jeu
                    }
                });
                PlateauJeu.add(tuileGraph);
            }
        }
        
        for (int i = 0; i < 3; i++) {
            TuileGraphique tuileGraph = new TuileGraphique(joueurCourant.TuileJ[i]);
            CartesJoueur.add(tuileGraph);
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

        PlateauJeu = new javax.swing.JPanel();
        Pioche = new javax.swing.JPanel();
        CartesJoueur = new javax.swing.JPanel();
        Panneau_start = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nbr_Joueurs = new javax.swing.JTextField();
        Btn_init1 = new javax.swing.JButton();
        Panneau_joueurs = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Nom_Joueur_Noir = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Nom_Joueur_Rouge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Nom_Joueur_Vert = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Nom_Joueur_Jaune = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Nom_Joueur_Bleu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Nom_Joueur_Violet = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Nom_Joueur_Cyan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Nom_Joueur_Blanc = new javax.swing.JTextField();
        Btn_init2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 800));

        PlateauJeu.setBackground(new java.awt.Color(204, 204, 255));
        PlateauJeu.setPreferredSize(new java.awt.Dimension(780, 780));
        PlateauJeu.setRequestFocusEnabled(false);
        PlateauJeu.setLayout(new java.awt.GridLayout(6, 6));

        Pioche.setBackground(new java.awt.Color(204, 255, 255));
        Pioche.setPreferredSize(new java.awt.Dimension(130, 130));
        Pioche.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CartesJoueur.setBackground(new java.awt.Color(204, 255, 255));
        CartesJoueur.setPreferredSize(new java.awt.Dimension(390, 130));
        CartesJoueur.setLayout(new java.awt.GridLayout(1, 3));

        Panneau_start.setBackground(new java.awt.Color(255, 255, 204));
        Panneau_start.setPreferredSize(new java.awt.Dimension(314, 130));
        Panneau_start.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre de joueurs :");
        Panneau_start.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        Nbr_Joueurs.setText("jTextField1");
        Panneau_start.add(Nbr_Joueurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        Btn_init1.setText("GO !");
        Panneau_start.add(Btn_init1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 73, 110, 40));

        Panneau_joueurs.setBackground(new java.awt.Color(255, 255, 204));
        Panneau_joueurs.setPreferredSize(new java.awt.Dimension(462, 190));
        Panneau_joueurs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Joueur Noir");
        Panneau_joueurs.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        Nom_Joueur_Noir.setText("jTextField1");
        Panneau_joueurs.add(Nom_Joueur_Noir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 80, -1));

        jLabel3.setText("Joueur Rouge");
        Panneau_joueurs.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        Nom_Joueur_Rouge.setText("jTextField1");
        Panneau_joueurs.add(Nom_Joueur_Rouge, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 80, -1));

        jLabel4.setText("Joueur Vert");
        Panneau_joueurs.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        Nom_Joueur_Vert.setText("jTextField1");
        Panneau_joueurs.add(Nom_Joueur_Vert, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 80, -1));

        jLabel5.setText("Joueur Jaune");
        Panneau_joueurs.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        Nom_Joueur_Jaune.setText("jTextField1");
        Panneau_joueurs.add(Nom_Joueur_Jaune, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 80, -1));

        jLabel6.setText("Joueur Bleu");
        Panneau_joueurs.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        Nom_Joueur_Bleu.setText("jTextField1");
        Panneau_joueurs.add(Nom_Joueur_Bleu, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 80, -1));

        jLabel7.setText("Joueur Violet");
        Panneau_joueurs.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        Nom_Joueur_Violet.setText("jTextField1");
        Panneau_joueurs.add(Nom_Joueur_Violet, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 80, -1));

        jLabel8.setText("Joueur Cyan");
        Panneau_joueurs.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        Nom_Joueur_Cyan.setText("jTextField1");
        Panneau_joueurs.add(Nom_Joueur_Cyan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 80, -1));

        jLabel9.setText("Joueur Blanc");
        Panneau_joueurs.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        Nom_Joueur_Blanc.setText("jTextField1");
        Panneau_joueurs.add(Nom_Joueur_Blanc, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 80, -1));

        Btn_init2.setText("GO !");
        Panneau_joueurs.add(Btn_init2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PlateauJeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CartesJoueur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Panneau_joueurs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Pioche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Panneau_start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Pioche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Panneau_start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(Panneau_joueurs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CartesJoueur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PlateauJeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PlateauJeu.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    
    // Fonctions à placer ici

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_init1;
    private javax.swing.JButton Btn_init2;
    private javax.swing.JPanel CartesJoueur;
    private javax.swing.JTextField Nbr_Joueurs;
    private javax.swing.JTextField Nom_Joueur_Blanc;
    private javax.swing.JTextField Nom_Joueur_Bleu;
    private javax.swing.JTextField Nom_Joueur_Cyan;
    private javax.swing.JTextField Nom_Joueur_Jaune;
    private javax.swing.JTextField Nom_Joueur_Noir;
    private javax.swing.JTextField Nom_Joueur_Rouge;
    private javax.swing.JTextField Nom_Joueur_Vert;
    private javax.swing.JTextField Nom_Joueur_Violet;
    private javax.swing.JPanel Panneau_joueurs;
    private javax.swing.JPanel Panneau_start;
    private javax.swing.JPanel Pioche;
    private javax.swing.JPanel PlateauJeu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
