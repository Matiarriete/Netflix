/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front.Registro;

import Front.CambiarPanel;
import Front.InicioSesion.InicioSesion1;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import static Front.Netflix.panelPrincipal1;

/**
 *
 * @author matia
 */
public class CerrarSesion extends javax.swing.JPanel {

    MouseEvent evt;

    public CerrarSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(null);

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4);
        jLabel4.setBounds(280, 430, 340, 40);

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));
        add(jPanel1);
        jPanel1.setBounds(270, 350, 330, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\SesionCerrada.png")); // NOI18N
        jLabel5.setToolTipText("");
        add(jLabel5);
        jLabel5.setBounds(230, 170, 440, 340);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\FondoCerrarSesion_opt.png")); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 0, 900, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        InicioSesion1 ini = new InicioSesion1();
        CambiarPanel cambio = new CambiarPanel(ini);
    }//GEN-LAST:event_jLabel4MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
