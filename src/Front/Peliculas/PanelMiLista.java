package Front.Peliculas;

import Back.Conexion;
import Back.PeliculaDAO;
import Front.InicioSesion.SeleccionPerfil;
import static Front.Peliculas.PanelModificable.peli;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;

public class PanelMiLista extends javax.swing.JPanel {

    PeliculaDAO pDao = new PeliculaDAO();
    int cant;
    public static int contar = 0;
    static int id = SeleccionPerfil.idUsuario();
    int selPer = SeleccionPerfil.selPer;
    public static int i = 0;
    int x;

    public PanelMiLista() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        foto1 = new javax.swing.JLabel();
        lblVolver = new javax.swing.JLabel();
        foto2 = new javax.swing.JLabel();
        foto3 = new javax.swing.JLabel();
        foto4 = new javax.swing.JLabel();
        foto5 = new javax.swing.JLabel();
        foto6 = new javax.swing.JLabel();
        foto7 = new javax.swing.JLabel();
        lblAdelante = new javax.swing.JLabel();
        nomCategoria = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        mostrarPeliculas();
        foto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto1MouseClicked(evt);
            }
        });

        lblVolver.setBackground(new java.awt.Color(0, 0, 0));
        lblVolver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblVolver.setForeground(new java.awt.Color(255, 255, 255));
        lblVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVolver.setText(" ");
        lblVolver.setOpaque(true);
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVolverMouseExited(evt);
            }
        });

        foto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto2MouseClicked(evt);
            }
        });

        foto3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto3MouseClicked(evt);
            }
        });

        foto4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto4MouseClicked(evt);
            }
        });

        foto5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto5MouseClicked(evt);
            }
        });

        foto6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto6MouseClicked(evt);
            }
        });

        foto7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto7MouseClicked(evt);
            }
        });

        lblAdelante.setBackground(new java.awt.Color(0, 0, 0));
        lblAdelante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAdelante.setForeground(new java.awt.Color(255, 255, 255));
        lblAdelante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdelante.setText(" ");
        if(cant <= 7)
        lblAdelante.setVisible(false);
        lblAdelante.setOpaque(true);
        lblAdelante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdelanteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAdelanteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAdelanteMouseExited(evt);
            }
        });

        nomCategoria.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        nomCategoria.setForeground(new java.awt.Color(255, 255, 255));
        nomCategoria.setText("Mi lista");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(nomCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(foto3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(foto4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(foto5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(foto6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(foto7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(lblAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foto3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foto4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foto5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foto6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foto7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        if (contar > 0) {
            contar = contar - 1;
            mostrarPeliculas();
        }
        if (contar == 0) {
            lblVolver.setBackground(Color.black);
            lblVolver.setText(" ");
        }
    }//GEN-LAST:event_lblVolverMouseClicked

    private void lblVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseEntered
        if (contar > 0) {
            lblVolver.setBackground(Color.gray);
            lblVolver.setText("<");
        }
    }//GEN-LAST:event_lblVolverMouseEntered

    private void lblVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseExited
        lblVolver.setBackground(Color.black);
        lblVolver.setText(" ");
    }//GEN-LAST:event_lblVolverMouseExited

    private void lblAdelanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdelanteMouseClicked
        if (contar + 7 < cant) {
            contar = contar + 1;
            mostrarPeliculas();
        }
        if (contar + 7 == cant) {
            lblAdelante.setText(" ");
            lblAdelante.setBackground(Color.black);
        }
        Conexion.cerrarConexion(Conexion.contarConexiones());
    }//GEN-LAST:event_lblAdelanteMouseClicked

    private void lblAdelanteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdelanteMouseEntered
        if (contar + 7 < cant) {
            lblAdelante.setBackground(Color.gray);
            lblAdelante.setText(">");
        }
    }//GEN-LAST:event_lblAdelanteMouseEntered

    private void lblAdelanteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdelanteMouseExited
        lblAdelante.setBackground(Color.black);
        lblAdelante.setText(" ");
    }//GEN-LAST:event_lblAdelanteMouseExited

    private void foto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto1MouseClicked
        x = 1;
        verificarYAcceder();
    }//GEN-LAST:event_foto1MouseClicked

    private void foto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto2MouseClicked
        x = 2;
        verificarYAcceder();
    }//GEN-LAST:event_foto2MouseClicked

    private void foto3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto3MouseClicked
        x = 3;
        verificarYAcceder();
    }//GEN-LAST:event_foto3MouseClicked

    private void foto4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto4MouseClicked
        x = 4;
        verificarYAcceder();
    }//GEN-LAST:event_foto4MouseClicked

    private void foto5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto5MouseClicked
        x = 5;
        verificarYAcceder();
    }//GEN-LAST:event_foto5MouseClicked

    private void foto6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto6MouseClicked
        x = 6;
        verificarYAcceder();
    }//GEN-LAST:event_foto6MouseClicked

    private void foto7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto7MouseClicked
        x = 7;
        verificarYAcceder();
    }//GEN-LAST:event_foto7MouseClicked

    public void mostrarPeliculas() {

        cant = pDao.contarPeliculasMiLista(id, selPer);

        System.out.println(cant);
        if (cant >= 1) {
            foto1.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaMiLista(contar + 1, id, selPer).getNombre() + ".jpg"));
            i = contar + 1;
        }

        if (cant >= 2) {
            foto2.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaMiLista(contar + 2, id, selPer).getNombre() + ".jpg"));
            i = contar + 2;
        }

        if (cant >= 3) {
            foto3.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaMiLista(contar + 3, id, selPer).getNombre() + ".jpg"));
            i = contar + 3;
        }

        if (cant >= 4) {
            foto4.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaMiLista(contar + 4, id, selPer).getNombre() + ".jpg"));
            i = contar + 4;
        }

        if (cant >= 5) {
            foto5.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaMiLista(contar + 5, id, selPer).getNombre() + ".jpg"));
            i = contar + 5;
        }

        if (cant >= 6) {
            foto6.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaMiLista(contar + 6, id, selPer).getNombre() + ".jpg"));
            i = contar + 6;
        }

        if (cant >= 7) {
            foto7.setIcon(new ImageIcon(Back.Imagenes.peliculas + "//" + pDao.buscarPeliculaMiLista(contar + 7, id, selPer).getNombre() + ".jpg"));
            i = contar + 7;
        }

    }

    public void verificarYAcceder(){
        if (Peliculas1.z == 1 && pDao.contarPeliculasMiLista(id, selPer) >= x) {
            peli = pDao.buscarPeliculaMiLista(contar + x, id, selPer);
            PanelMuestraPeliculas mostrar = new PanelMuestraPeliculas(peli);
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
    private javax.swing.JLabel foto2;
    private javax.swing.JLabel foto3;
    private javax.swing.JLabel foto4;
    private javax.swing.JLabel foto5;
    private javax.swing.JLabel foto6;
    private javax.swing.JLabel foto7;
    private javax.swing.JLabel lblAdelante;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JLabel nomCategoria;
    // End of variables declaration//GEN-END:variables
}
