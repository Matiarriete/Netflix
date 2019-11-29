/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front.Registro;

import java.awt.BorderLayout;
import static Front.Netflix.panelPrincipal1;

/**
 *
 * @author matia
 */
public class Registro8Pag extends javax.swing.JPanel {

    int a, b, c, d, e, f, g;

    public Registro8Pag() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSmart = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblDeco = new javax.swing.JLabel();
        lblMulti = new javax.swing.JLabel();
        lblPlay = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblRoku = new javax.swing.JLabel();
        lblXbox = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Logo_Netflix_opt.png")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(748, 748, 748))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("¿Que dispositivos usaras para ver ");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("el contenido?");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setText("Puedes ver Netflix en cualquiera de estos dispositivos.");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setText("Selecciona todas las opciones que correspondan.");

        lblSmart.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblSmart.setForeground(new java.awt.Color(153, 153, 153));
        lblSmart.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSmart.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\TVGris.png")); // NOI18N
        lblSmart.setText("Smart TV o Reproductor de Blu-Ray");
        lblSmart.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        lblSmart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSmartMouseClicked(evt);
            }
        });

        lblTel.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblTel.setForeground(new java.awt.Color(153, 153, 153));
        lblTel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTel.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\TelTablGris.png")); // NOI18N
        lblTel.setText("Telefono o Tablet");
        lblTel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        lblTel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTelMouseClicked(evt);
            }
        });

        lblDeco.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblDeco.setForeground(new java.awt.Color(153, 153, 153));
        lblDeco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDeco.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\DecoGris.png")); // NOI18N
        lblDeco.setText("Decodificador");
        lblDeco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        lblDeco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDecoMouseClicked(evt);
            }
        });

        lblMulti.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblMulti.setForeground(new java.awt.Color(153, 153, 153));
        lblMulti.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMulti.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\ReproductorMultiGris.png")); // NOI18N
        lblMulti.setText("Reproductor Multimedia");
        lblMulti.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        lblMulti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMultiMouseClicked(evt);
            }
        });

        lblPlay.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblPlay.setForeground(new java.awt.Color(153, 153, 153));
        lblPlay.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPlay.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\PsnGris.png")); // NOI18N
        lblPlay.setText("PlayStation");
        lblPlay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        lblPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlayMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\Compu.png")); // NOI18N
        jLabel11.setText("Computadora");
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));

        lblRoku.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblRoku.setForeground(new java.awt.Color(153, 153, 153));
        lblRoku.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRoku.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\RokuGris.png")); // NOI18N
        lblRoku.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        lblRoku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRokuMouseClicked(evt);
            }
        });

        lblXbox.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblXbox.setForeground(new java.awt.Color(153, 153, 153));
        lblXbox.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblXbox.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\XboxGris.png")); // NOI18N
        lblXbox.setText("Xbox");
        lblXbox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        lblXbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblXboxMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CONTINUAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSmart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMulti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPlay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblXbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRoku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSmart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblXbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRoku, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblSmartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSmartMouseClicked
        if (a == 0) {
            lblSmart.setForeground(new java.awt.Color(255, 0, 0));
            lblSmart.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\TVRojo.png"));
            lblSmart.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
            a = 1;
        } else {
            lblSmart.setForeground(new java.awt.Color(153, 153, 153));
            lblSmart.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\TVGris.png"));
            lblSmart.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
            a = 0;
        }

    }//GEN-LAST:event_lblSmartMouseClicked

    private void lblTelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTelMouseClicked
        if (b == 0) {
            lblTel.setForeground(new java.awt.Color(255, 0, 0));
            lblTel.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\TelTablRojo.png"));
            lblTel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
            b = 1;
        } else {
            lblTel.setForeground(new java.awt.Color(153, 153, 153));
            lblTel.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\TelTablGris.png"));
            lblTel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
            b = 0;
        }

    }//GEN-LAST:event_lblTelMouseClicked

    private void lblRokuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRokuMouseClicked
        if (e == 0) {
            lblRoku.setForeground(new java.awt.Color(255, 0, 0));
            lblRoku.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\RokuRojo.png"));
            lblRoku.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
            e = 1;
        } else {
            lblRoku.setForeground(new java.awt.Color(153, 153, 153));
            lblRoku.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\RokuGris.png"));
            lblRoku.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
            e = 0;
        }
    }//GEN-LAST:event_lblRokuMouseClicked

    private void lblDecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDecoMouseClicked
        if (c == 0) {
            lblDeco.setForeground(new java.awt.Color(255, 0, 0));
            lblDeco.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\DecoRojo.png"));
            lblDeco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
            c = 1;
        } else {
            lblDeco.setForeground(new java.awt.Color(153, 153, 153));
            lblDeco.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\DecoGris.png"));
            lblDeco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
            c = 0;
        }
    }//GEN-LAST:event_lblDecoMouseClicked

    private void lblMultiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMultiMouseClicked
        if (d == 0) {
            lblMulti.setForeground(new java.awt.Color(255, 0, 0));
            lblMulti.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\MultiRojo.png"));
            lblMulti.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
            d = 1;
        } else {
            lblMulti.setForeground(new java.awt.Color(153, 153, 153));
            lblMulti.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\ReproductorMultiGris.png"));
            lblMulti.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
            d = 0;
        }

    }//GEN-LAST:event_lblMultiMouseClicked

    private void lblPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlayMouseClicked
        if (f == 0) {
            lblPlay.setForeground(new java.awt.Color(255, 0, 0));
            lblPlay.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\PsnRojo.png"));
            lblPlay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
            f = 1;
        } else {
            lblPlay.setForeground(new java.awt.Color(153, 153, 153));
            lblPlay.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            lblPlay.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\PsnGris.png")); // NOI18N
            lblPlay.setText("PlayStation");
            lblPlay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
            f = 0;
        }

    }//GEN-LAST:event_lblPlayMouseClicked

    private void lblXboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXboxMouseClicked
        if (g == 0) {
            lblXbox.setForeground(new java.awt.Color(255, 0, 0));
            lblXbox.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\XboxRoja.png"));
            lblXbox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
            g = 1;
        } else {
            lblXbox.setForeground(new java.awt.Color(153, 153, 153));
            lblXbox.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Device Selection\\XboxGris.png"));
            lblXbox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
            g = 0;
        }
    }//GEN-LAST:event_lblXboxMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        Registro9Pag pag9 = new Registro9Pag();
        pag9.setLocation(0, 0);
        pag9.setSize(900,700);
        panelPrincipal1.removeAll();
        panelPrincipal1.add(pag9, BorderLayout.CENTER);
        panelPrincipal1.revalidate();
        panelPrincipal1.repaint();
    }//GEN-LAST:event_jPanel2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDeco;
    private javax.swing.JLabel lblMulti;
    private javax.swing.JLabel lblPlay;
    private javax.swing.JLabel lblRoku;
    private javax.swing.JLabel lblSmart;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblXbox;
    // End of variables declaration//GEN-END:variables
}
