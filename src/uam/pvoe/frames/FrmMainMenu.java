/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.frames;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class is used to create a container for the windows. 
 * @author pedro
 */
public class FrmMainMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenuPrincipal.
     * Also cleans and maximizes the container for the other windows.
     */
    public FrmMainMenu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        MainMenu princ = new MainMenu();
        dskPrinc.removeAll();
        dskPrinc.add(princ);
        try {
            princ.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrmMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        princ.setVisible(true);
        princ.repaint();
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dskPrinc = new javax.swing.JDesktopPane();
        menuS = new javax.swing.JMenuBar();
        mainMenu = new javax.swing.JMenu();
        opcMainMenu = new javax.swing.JMenuItem();
        actionsMenu = new javax.swing.JMenu();
        opcRegisterMenu = new javax.swing.JMenuItem();
        opcConsultationMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dskPrincLayout = new javax.swing.GroupLayout(dskPrinc);
        dskPrinc.setLayout(dskPrincLayout);
        dskPrincLayout.setHorizontalGroup(
            dskPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 869, Short.MAX_VALUE)
        );
        dskPrincLayout.setVerticalGroup(
            dskPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        mainMenu.setText("Main Menu");

        opcMainMenu.setText("Main Menu");
        opcMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcMainMenuActionPerformed(evt);
            }
        });
        mainMenu.add(opcMainMenu);

        menuS.add(mainMenu);

        actionsMenu.setText("Actions");

        opcRegisterMenu.setText("Register material");
        opcRegisterMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcRegisterMenuActionPerformed(evt);
            }
        });
        actionsMenu.add(opcRegisterMenu);

        opcConsultationMenu.setText("Consult material");
        opcConsultationMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcConsultationMenuActionPerformed(evt);
            }
        });
        actionsMenu.add(opcConsultationMenu);

        menuS.add(actionsMenu);

        setJMenuBar(menuS);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPrinc)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPrinc)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method displays the MainMenu window.
     * @param evt 
     */
    private void opcMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcMainMenuActionPerformed
        MainMenu princ = new MainMenu();
        dskPrinc.add(princ);
        
        try {
            princ.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrmMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        princ.setVisible(true);
        princ.repaint();
        repaint();
    }//GEN-LAST:event_opcMainMenuActionPerformed

    /**
     * This method displays the NewData window.
     * @param evt 
     */
    private void opcRegisterMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcRegisterMenuActionPerformed
        NewData alt = new NewData();
        dskPrinc.add(alt);
        
        try {
            alt.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrmMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        alt.setVisible(true);
        alt.repaint();
        repaint();
    }//GEN-LAST:event_opcRegisterMenuActionPerformed

    /**
     * This method displays the Consultation window.
     * @param evt 
     */
    private void opcConsultationMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcConsultationMenuActionPerformed
        Consultation c = new Consultation();
        dskPrinc.add(c);
        
        try {
            c.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrmMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.setVisible(true);
        c.repaint();
        repaint();
    }//GEN-LAST:event_opcConsultationMenuActionPerformed

    
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
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu actionsMenu;
    private javax.swing.JDesktopPane dskPrinc;
    private javax.swing.JMenu mainMenu;
    private javax.swing.JMenuBar menuS;
    private javax.swing.JMenuItem opcConsultationMenu;
    private javax.swing.JMenuItem opcMainMenu;
    private javax.swing.JMenuItem opcRegisterMenu;
    // End of variables declaration//GEN-END:variables
}
