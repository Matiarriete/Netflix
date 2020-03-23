package Front.Peliculas;

import Back.Conexion;
import Back.IPeliculasDAO;
import Back.PeliculaDAO;
import Back.Peliculas;
import static Front.Peliculas.PeliculasCategoria.peli;
import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;

public class PeliculaBuscar extends javax.swing.JPanel {

    public PeliculaBuscar() {
        initComponents();
    }

    IPeliculasDAO pDao = new PeliculaDAO();
    int cant;
    String nombre = Peliculas1.buscar;
    Peliculas peli;
    int x = 0;
    int k = 0;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        foto1 = new javax.swing.JLabel();
        foto10 = new javax.swing.JLabel();
        foto7 = new javax.swing.JLabel();
        foto18 = new javax.swing.JLabel();
        lblLoSent = new javax.swing.JLabel();
        lblLoSentFoto = new javax.swing.JLabel();
        foto14 = new javax.swing.JLabel();
        foto13 = new javax.swing.JLabel();
        foto15 = new javax.swing.JLabel();
        foto20 = new javax.swing.JLabel();
        foto16 = new javax.swing.JLabel();
        foto11 = new javax.swing.JLabel();
        foto8 = new javax.swing.JLabel();
        foto2 = new javax.swing.JLabel();
        foto21 = new javax.swing.JLabel();
        foto17 = new javax.swing.JLabel();
        foto19 = new javax.swing.JLabel();
        foto3 = new javax.swing.JLabel();
        foto6 = new javax.swing.JLabel();
        foto5 = new javax.swing.JLabel();
        foto12 = new javax.swing.JLabel();
        foto4 = new javax.swing.JLabel();
        foto9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(20, 20, 20));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostrarPeliculas();
        foto1.setForeground(new java.awt.Color(20, 20, 20));
        foto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto1MouseClicked(evt);
            }
        });
        add(foto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 42, 110, 158));

        foto10.setForeground(new java.awt.Color(20, 20, 20));
        foto10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto10MouseClicked(evt);
            }
        });
        add(foto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 220, 110, 158));

        foto7.setForeground(new java.awt.Color(20, 20, 20));
        foto7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto7MouseClicked(evt);
            }
        });
        add(foto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 43, 110, 158));

        foto18.setForeground(new java.awt.Color(20, 20, 20));
        foto18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto18MouseClicked(evt);
            }
        });
        add(foto18, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 397, 110, 158));

        lblLoSent.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        lblLoSent.setForeground(new java.awt.Color(255, 255, 255));
        lblLoSent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoSent.setVisible(false);
        lblLoSent.setText("Lo sentimos, la pelicula buscada no se encuentra disponible");
        add(lblLoSent, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 450, -1));

        lblLoSentFoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Untitled.png")); // NOI18N
        lblLoSentFoto.setVisible(false);
        add(lblLoSentFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 100, 92));

        foto14.setForeground(new java.awt.Color(20, 20, 20));
        foto14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto14MouseClicked(evt);
            }
        });
        add(foto14, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 220, 110, 158));

        foto13.setForeground(new java.awt.Color(20, 20, 20));
        foto13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto13MouseClicked(evt);
            }
        });
        add(foto13, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 220, 110, 158));

        foto15.setForeground(new java.awt.Color(20, 20, 20));
        foto15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto15MouseClicked(evt);
            }
        });
        add(foto15, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 396, 110, 158));

        foto20.setForeground(new java.awt.Color(20, 20, 20));
        foto20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto20MouseClicked(evt);
            }
        });
        add(foto20, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 397, 110, 158));

        foto16.setForeground(new java.awt.Color(20, 20, 20));
        foto16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto16MouseClicked(evt);
            }
        });
        add(foto16, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 397, 110, 158));

        foto11.setForeground(new java.awt.Color(20, 20, 20));
        foto11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto11MouseClicked(evt);
            }
        });
        add(foto11, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 220, 110, 158));

        foto8.setForeground(new java.awt.Color(20, 20, 20));
        foto8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto8MouseClicked(evt);
            }
        });
        add(foto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 219, 110, 158));

        foto2.setForeground(new java.awt.Color(20, 20, 20));
        foto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto2MouseClicked(evt);
            }
        });
        add(foto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 43, 110, 158));

        foto21.setForeground(new java.awt.Color(20, 20, 20));
        foto21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto21MouseClicked(evt);
            }
        });
        add(foto21, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 397, 110, 158));

        foto17.setForeground(new java.awt.Color(20, 20, 20));
        foto17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto17MouseClicked(evt);
            }
        });
        add(foto17, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 397, 110, 158));

        foto19.setForeground(new java.awt.Color(20, 20, 20));
        foto19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto19MouseClicked(evt);
            }
        });
        add(foto19, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 397, 110, 158));

        foto3.setForeground(new java.awt.Color(20, 20, 20));
        foto3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto3MouseClicked(evt);
            }
        });
        add(foto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 43, 110, 158));

        foto6.setForeground(new java.awt.Color(20, 20, 20));
        foto6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto6MouseClicked(evt);
            }
        });
        add(foto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 43, 110, 158));

        foto5.setForeground(new java.awt.Color(20, 20, 20));
        foto5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto5MouseClicked(evt);
            }
        });
        add(foto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 43, 110, 158));

        foto12.setForeground(new java.awt.Color(20, 20, 20));
        foto12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto12MouseClicked(evt);
            }
        });
        add(foto12, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 220, 110, 158));

        foto4.setForeground(new java.awt.Color(20, 20, 20));
        foto4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto4MouseClicked(evt);
            }
        });
        add(foto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 43, 110, 158));

        foto9.setForeground(new java.awt.Color(20, 20, 20));
        foto9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto9MouseClicked(evt);
            }
        });
        add(foto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 220, 110, 158));
    }// </editor-fold>//GEN-END:initComponents

    private void foto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto1MouseClicked
        x = 1;
        verificarYAcceder();
    }//GEN-LAST:event_foto1MouseClicked

    private void foto10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto10MouseClicked
        x = 10;
        verificarYAcceder();
    }//GEN-LAST:event_foto10MouseClicked

    private void foto7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto7MouseClicked
        x = 7;
        verificarYAcceder();
    }//GEN-LAST:event_foto7MouseClicked

    private void foto18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto18MouseClicked
        x = 18;
        verificarYAcceder();
    }//GEN-LAST:event_foto18MouseClicked

    private void foto14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto14MouseClicked
        x = 14;
        verificarYAcceder();
    }//GEN-LAST:event_foto14MouseClicked

    private void foto13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto13MouseClicked
        x = 13;
        verificarYAcceder();
    }//GEN-LAST:event_foto13MouseClicked

    private void foto15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto15MouseClicked
        x = 15;
        verificarYAcceder();
    }//GEN-LAST:event_foto15MouseClicked

    private void foto20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto20MouseClicked
        x = 20;
        verificarYAcceder();
    }//GEN-LAST:event_foto20MouseClicked

    private void foto16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto16MouseClicked
        x = 16;
        verificarYAcceder();
    }//GEN-LAST:event_foto16MouseClicked

    private void foto11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto11MouseClicked
        x = 11;
        verificarYAcceder();
    }//GEN-LAST:event_foto11MouseClicked

    private void foto8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto8MouseClicked
        x = 8;
        verificarYAcceder();
    }//GEN-LAST:event_foto8MouseClicked

    private void foto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto2MouseClicked
        x = 2;
        verificarYAcceder();
    }//GEN-LAST:event_foto2MouseClicked

    private void foto21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto21MouseClicked
        x = 21;
        verificarYAcceder();
    }//GEN-LAST:event_foto21MouseClicked

    private void foto17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto17MouseClicked
        x = 17;
        verificarYAcceder();
    }//GEN-LAST:event_foto17MouseClicked

    private void foto19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto19MouseClicked
        x = 19;
        verificarYAcceder();
    }//GEN-LAST:event_foto19MouseClicked

    private void foto3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto3MouseClicked
        x = 3;
        verificarYAcceder();
    }//GEN-LAST:event_foto3MouseClicked

    private void foto6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto6MouseClicked
        x = 6;
        verificarYAcceder();
    }//GEN-LAST:event_foto6MouseClicked

    private void foto5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto5MouseClicked
        x = 5;
        verificarYAcceder();
    }//GEN-LAST:event_foto5MouseClicked

    private void foto12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto12MouseClicked
        x = 12;
        verificarYAcceder();
    }//GEN-LAST:event_foto12MouseClicked

    private void foto4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto4MouseClicked
        x = 4;
        verificarYAcceder();
    }//GEN-LAST:event_foto4MouseClicked

    private void foto9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto9MouseClicked
        x = 9;
        verificarYAcceder();
    }//GEN-LAST:event_foto9MouseClicked

    private void mostrarPeliculas() {

        cant = pDao.contarPeliculasNombre(nombre);
        if (nombre.length() != 0) {
            if (cant == 0) {
                lblLoSent.setVisible(true);
                lblLoSentFoto.setVisible(true);
            }

            if (cant >= 1) {
                foto1.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaPorNombre(nombre, 1).getNombre() + ".jpg"));
            }

            if (cant >= 2) {
                foto2.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaPorNombre(nombre, 2).getNombre() + ".jpg"));
            }

            if (cant >= 3) {
                foto3.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaPorNombre(nombre, 3).getNombre() + ".jpg"));
            }

            if (cant >= 4) {
                foto4.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaPorNombre(nombre, 4).getNombre() + ".jpg"));
            }

            if (cant >= 5) {
                foto5.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaPorNombre(nombre, 5).getNombre() + ".jpg"));
            }

            if (cant >= 6) {
                foto6.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaPorNombre(nombre, 6).getNombre() + ".jpg"));
            }

            if (cant >= 7) {
                foto7.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaPorNombre(nombre, 7).getNombre() + ".jpg"));
            }

            if (cant >= 8) {
                foto8.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaPorNombre(nombre, 8).getNombre() + ".jpg"));
            }

            if (cant >= 9) {
                foto9.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaPorNombre(nombre, 9).getNombre() + ".jpg"));
            }

            if (cant >= 10) {
                foto10.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaPorNombre(nombre, 10).getNombre() + ".jpg"));
            }

            if (cant >= 11) {
                foto11.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaPorNombre(nombre, 11).getNombre() + ".jpg"));
            }

            if (cant >= 12) {
                foto12.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaPorNombre(nombre, 12).getNombre() + ".jpg"));
            }

            if (cant >= 13) {
                foto13.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaPorNombre(nombre, 13).getNombre() + ".jpg"));
            }

            if (cant >= 14) {
                foto14.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaPorNombre(nombre, 14).getNombre() + ".jpg"));
            }

            if (cant >= 15) {
                foto15.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaPorNombre(nombre, 15).getNombre() + ".jpg"));
            }

            if (cant >= 16) {
                foto16.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaPorNombre(nombre, 16).getNombre() + ".jpg"));
            }

            if (cant >= 17) {
                foto17.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaPorNombre(nombre, 17).getNombre() + ".jpg"));
            }

            if (cant >= 18) {
                foto18.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaPorNombre(nombre, 18).getNombre() + ".jpg"));
            }

            if (cant >= 19) {
                foto19.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaPorNombre(nombre, 19).getNombre() + ".jpg"));
            }

            if (cant >= 20) {
                foto20.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaPorNombre(nombre, 20).getNombre() + ".jpg"));
            }

            if (cant >= 21) {
                foto21.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaPorNombre(nombre, 21).getNombre() + ".jpg"));
            }
        }
    }

    private void verificarYAcceder() {
        if (Peliculas1.z == 1) {
            PanelMuestraPeliculas mostrar = new PanelMuestraPeliculas(pDao.buscarPeliculaPorNombre(nombre, x));

            Peliculas1.jScrollPaneChico.setViewportView(mostrar);
            Peliculas1.pnlMuestraPeli.setVisible(true);
            Peliculas1.jScrollPane1.setEnabled(false);
            Peliculas1.jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
            Peliculas1.z = 0;
            Conexion.cerrarConexion(Conexion.contarConexiones());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel foto1;
    private javax.swing.JLabel foto10;
    private javax.swing.JLabel foto11;
    private javax.swing.JLabel foto12;
    private javax.swing.JLabel foto13;
    private javax.swing.JLabel foto14;
    private javax.swing.JLabel foto15;
    private javax.swing.JLabel foto16;
    private javax.swing.JLabel foto17;
    private javax.swing.JLabel foto18;
    private javax.swing.JLabel foto19;
    private javax.swing.JLabel foto2;
    private javax.swing.JLabel foto20;
    private javax.swing.JLabel foto21;
    private javax.swing.JLabel foto3;
    private javax.swing.JLabel foto4;
    private javax.swing.JLabel foto5;
    private javax.swing.JLabel foto6;
    private javax.swing.JLabel foto7;
    private javax.swing.JLabel foto8;
    private javax.swing.JLabel foto9;
    private javax.swing.JLabel lblLoSent;
    private javax.swing.JLabel lblLoSentFoto;
    // End of variables declaration//GEN-END:variables
}
