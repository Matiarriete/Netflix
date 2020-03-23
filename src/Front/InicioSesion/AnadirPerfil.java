package Front.InicioSesion;

import Back.Imagenes;
import Back.PerfilDAO;
import Back.Perfiles;
import Back.Usuario;
import Back.UsuarioDAO;
import Front.CambiarPanel;
import static Front.InicioSesion.InicioSesion1.id;
import Front.Registro.Registro4Pag;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import static Front.Netflix.panelPrincipal1;

public class AnadirPerfil extends javax.swing.JPanel {

    public AnadirPerfil() {
        initComponents();
    }

    Perfiles p1 = new Perfiles();
    UsuarioDAO uDao = new UsuarioDAO();
    PerfilDAO pDao = new PerfilDAO();
    Usuario user = new Usuario();
    String nombre;
    int i = 0;
    int j = 0;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        lblVolver = new javax.swing.JLabel();
        lblAgregarPerfil = new javax.swing.JLabel();
        lblModFoto = new javax.swing.JLabel();
        lblGuardar = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        switch2 = new Externas.Switch();
        lblKids = new javax.swing.JLabel();
        pnlFotos = new javax.swing.JPanel();
        lblfoto1 = new javax.swing.JLabel();
        lblfoto3 = new javax.swing.JLabel();
        lblfoto2 = new javax.swing.JLabel();
        lblfoto4 = new javax.swing.JLabel();
        lblfoto5 = new javax.swing.JLabel();
        lblfoto6 = new javax.swing.JLabel();
        lblfoto7 = new javax.swing.JLabel();
        lblfoto8 = new javax.swing.JLabel();
        lblfoto9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(null);

        lblVolver.setIcon(new javax.swing.ImageIcon(Imagenes.general + "\\FlechaVolver.png"));
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });
        add(lblVolver);
        lblVolver.setBounds(10, 11, 35, 35);

        lblAgregarPerfil.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        lblAgregarPerfil.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregarPerfil.setText("Agregar Perfil");
        add(lblAgregarPerfil);
        lblAgregarPerfil.setBounds(85, 11, 127, 35);

        lblModFoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\lapizEdic.png")); // NOI18N
        lblModFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModFotoMouseClicked(evt);
            }
        });
        add(lblModFoto);
        lblModFoto.setBounds(280, 334, 30, 30);

        lblGuardar.setIcon(new ImageIcon(Imagenes.general + "//btnGuardarPerfil.png"));
        lblGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarMouseClicked(evt);
            }
        });
        add(lblGuardar);
        lblGuardar.setBounds(740, 11, 150, 35);

        lblFoto.setIcon(new ImageIcon(Imagenes.perfiles + "//1.png"));
        add(lblFoto);
        lblFoto.setBounds(273, 267, 100, 100);

        txtNombre.setBackground(new java.awt.Color(0, 0, 0));
        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setText("Nombre");
        txtNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        add(txtNombre);
        txtNombre.setBounds(391, 308, 216, 29);

        switch2.setBackgroundColor(new java.awt.Color(153, 153, 153));
        switch2.setButtonColor(new java.awt.Color(0, 0, 0));
        add(switch2);
        switch2.setBounds(391, 343, 33, 24);

        lblKids.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblKids.setForeground(new java.awt.Color(255, 255, 255));
        lblKids.setText("¿Kids?");
        add(lblKids);
        lblKids.setBounds(428, 343, 53, 24);

        pnlFotos.setBackground(new java.awt.Color(0, 0, 0));
        pnlFotos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pnlFotos.setVisible(false);

        lblfoto1.setIcon(new ImageIcon(Imagenes.reducido + "//1.png"));
        lblfoto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblfoto1MouseClicked(evt);
            }
        });

        lblfoto3.setIcon(new ImageIcon(Imagenes.reducido + "//3.png"));
        lblfoto3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblfoto3MouseClicked(evt);
            }
        });

        lblfoto2.setIcon(new ImageIcon(Imagenes.reducido + "//2.png"));
        lblfoto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblfoto2MouseClicked(evt);
            }
        });

        lblfoto4.setIcon(new ImageIcon(Imagenes.reducido + "//4.png"));
        lblfoto4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblfoto4MouseClicked(evt);
            }
        });

        lblfoto5.setIcon(new ImageIcon(Imagenes.reducido + "//5.png"));
        lblfoto5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblfoto5MouseClicked(evt);
            }
        });

        lblfoto6.setIcon(new ImageIcon(Imagenes.reducido + "//6.png"));
        lblfoto6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblfoto6MouseClicked(evt);
            }
        });

        lblfoto7.setIcon(new ImageIcon(Imagenes.reducido + "//7.png"));
        lblfoto7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblfoto7MouseClicked(evt);
            }
        });

        lblfoto8.setIcon(new ImageIcon(Imagenes.reducido + "//8.png"));
        lblfoto8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblfoto8MouseClicked(evt);
            }
        });

        lblfoto9.setIcon(new ImageIcon(Imagenes.reducido + "//9.png"));
        lblfoto9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblfoto9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlFotosLayout = new javax.swing.GroupLayout(pnlFotos);
        pnlFotos.setLayout(pnlFotosLayout);
        pnlFotosLayout.setHorizontalGroup(
            pnlFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFotosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFotosLayout.createSequentialGroup()
                        .addComponent(lblfoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(lblfoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(lblfoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFotosLayout.createSequentialGroup()
                        .addGroup(pnlFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblfoto4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblfoto7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(pnlFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblfoto8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblfoto5, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(pnlFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblfoto6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblfoto9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlFotosLayout.setVerticalGroup(
            pnlFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFotosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfoto4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfoto6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfoto5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfoto7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfoto9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfoto8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(pnlFotos);
        pnlFotos.setBounds(280, 370, 290, 270);
    }// </editor-fold>//GEN-END:initComponents

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        SeleccionPerfil perfil = new SeleccionPerfil(InicioSesion1.id);
        CambiarPanel cambio = new CambiarPanel(perfil);
    }//GEN-LAST:event_lblVolverMouseClicked

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        p1.setNombre(nombre);
        if (j == 0) {
            p1.setFoto(1);
        } else {
            p1.setFoto(j);
        }
        if (switch2.isOnOff()) {
            p1.setKids(1);
        } else {
            p1.setKids(0);
        }
        user.setMail(Registro4Pag.mail);
        user.setContrasena(Registro4Pag.contrasena);
        p1.setIdUsuario(id);
        if (pDao.registrarPerfil(p1)) {
            SeleccionPerfil perfil = new SeleccionPerfil(id);
            CambiarPanel cambio = new CambiarPanel(perfil);
        }
    }//GEN-LAST:event_lblGuardarMouseClicked

    private void lblModFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModFotoMouseClicked
        if (i == 0) {
            pnlFotos.setVisible(true);
            i = 1;
        } else {
            pnlFotos.setVisible(false);
            i = 0;
        }

    }//GEN-LAST:event_lblModFotoMouseClicked

    private void lblfoto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfoto1MouseClicked
        lblFoto.setIcon(new ImageIcon(Imagenes.perfiles + "\\1.png"));
        j = 1;
        i = 0;
        pnlFotos.setVisible(false);
    }//GEN-LAST:event_lblfoto1MouseClicked

    private void lblfoto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfoto2MouseClicked
        lblFoto.setIcon(new ImageIcon(Imagenes.perfiles + "\\2.png"));
        j = 2;
        i = 0;
        pnlFotos.setVisible(false);
    }//GEN-LAST:event_lblfoto2MouseClicked

    private void lblfoto3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfoto3MouseClicked
        lblFoto.setIcon(new ImageIcon(Imagenes.perfiles + "\\3.png"));
        j = 3;
        i = 0;
        pnlFotos.setVisible(false);
    }//GEN-LAST:event_lblfoto3MouseClicked

    private void lblfoto4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfoto4MouseClicked
        lblFoto.setIcon(new ImageIcon(Imagenes.perfiles + "\\4.png"));
        j = 4;
        i = 0;
        pnlFotos.setVisible(false);
    }//GEN-LAST:event_lblfoto4MouseClicked

    private void lblfoto5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfoto5MouseClicked
        lblFoto.setIcon(new ImageIcon(Imagenes.perfiles + "\\5.png"));
        j = 5;
        i = 0;
        pnlFotos.setVisible(false);
    }//GEN-LAST:event_lblfoto5MouseClicked

    private void lblfoto6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfoto6MouseClicked
        lblFoto.setIcon(new ImageIcon(Imagenes.perfiles + "\\6.png"));
        j = 6;
        i = 0;
        pnlFotos.setVisible(false);
    }//GEN-LAST:event_lblfoto6MouseClicked

    private void lblfoto7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfoto7MouseClicked
        lblFoto.setIcon(new ImageIcon(Imagenes.perfiles + "\\7.png"));
        j = 7;
        i = 0;
        pnlFotos.setVisible(false);
    }//GEN-LAST:event_lblfoto7MouseClicked

    private void lblfoto8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfoto8MouseClicked
        lblFoto.setIcon(new ImageIcon(Imagenes.perfiles + "\\8.png"));
        j = 8;
        i = 0;
        pnlFotos.setVisible(false);
    }//GEN-LAST:event_lblfoto8MouseClicked

    private void lblfoto9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfoto9MouseClicked
        lblFoto.setIcon(new ImageIcon(Imagenes.perfiles + "\\9.png"));
        j = 9;
        i = 0;
        pnlFotos.setVisible(false);
    }//GEN-LAST:event_lblfoto9MouseClicked

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        txtNombre.setText(nombre);
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        nombre = txtNombre.getText();
    }//GEN-LAST:event_txtNombreKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblAgregarPerfil;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblKids;
    private javax.swing.JLabel lblModFoto;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JLabel lblfoto1;
    private javax.swing.JLabel lblfoto2;
    private javax.swing.JLabel lblfoto3;
    private javax.swing.JLabel lblfoto4;
    private javax.swing.JLabel lblfoto5;
    private javax.swing.JLabel lblfoto6;
    private javax.swing.JLabel lblfoto7;
    private javax.swing.JLabel lblfoto8;
    private javax.swing.JLabel lblfoto9;
    private javax.swing.JPanel pnlFotos;
    private Externas.Switch switch2;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
