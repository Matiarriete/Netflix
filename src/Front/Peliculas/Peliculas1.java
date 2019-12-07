/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front.Peliculas;

import Back.IUsuarioDAO;
import Back.Imagenes;
import Back.PerfilDAO;
import Back.Perfiles;
import Back.Usuario;
import Back.UsuarioDAO;
import static Back.UsuarioDAO.id;
import Front.InicioSesion.InicioSesion1;
import Front.InicioSesion.ModificarPerfil;
import Front.InicioSesion.SeleccionPerfil;
import static Front.Netflix.panelPrincipal1;
import Front.Registro.CerrarSesion;
import Front.Registro.Registro4Pag;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;

/**
 *
 * @author matia
 */
public class Peliculas1 extends javax.swing.JPanel {

    public Peliculas1() {
        initComponents();

    }

    ModificarPerfil mod;

    int j = 0;
    int cerr = 0;
    int menPeli = 0;
    int id = idUsuario();
    int selPer = SeleccionPerfil.selPer;
    PerfilDAO pDao = new PerfilDAO();
    Perfiles perfil = pDao.obtenerPerfil(id, selPer);


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSuperior = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblMenuPel = new javax.swing.JLabel();
        lblMenuCerr = new javax.swing.JLabel();
        pnlCerrar = new javax.swing.JPanel();
        lblConfig = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        pnlPeli = new javax.swing.JPanel();
        lblNomPerfil = new javax.swing.JLabel();
        lblDescargas = new javax.swing.JLabel();
        lblAccion = new javax.swing.JLabel();
        lblAventura = new javax.swing.JLabel();
        lblTerror = new javax.swing.JLabel();
        lblInfantil = new javax.swing.JLabel();
        lblSuspenso = new javax.swing.JLabel();
        lblCienFicc = new javax.swing.JLabel();
        lblDrama = new javax.swing.JLabel();
        lblDeport = new javax.swing.JLabel();
        lblLatin = new javax.swing.JLabel();
        lblDocum = new javax.swing.JLabel();
        lblMusic = new javax.swing.JLabel();
        lblCambio = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(900, 2100));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSuperior.setBackground(new java.awt.Color(0, 0, 0));
        pnlSuperior.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\mini_lupa.png")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        pnlSuperior.add(jLabel2);
        jLabel2.setBounds(789, 11, 30, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\mini_lupa.png")); // NOI18N
        jLabel1.setVisible(false);
        pnlSuperior.add(jLabel1);
        jLabel1.setBounds(234, 11, 30, 30);

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Buscar");
        jTextField1.setVisible(false);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        pnlSuperior.add(jTextField1);
        jTextField1.setBounds(274, 11, 300, 30);

        lblMenuPel.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\miniMenuIni.png")); // NOI18N
        lblMenuPel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuPelMouseClicked(evt);
            }
        });
        pnlSuperior.add(lblMenuPel);
        lblMenuPel.setBounds(10, 10, 30, 30);

        lblMenuCerr.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\mini_mini_menu3Puntos(1).png")); // NOI18N
        lblMenuCerr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuCerrMouseClicked(evt);
            }
        });
        pnlSuperior.add(lblMenuCerr);
        lblMenuCerr.setBounds(840, 0, 50, 50);

        add(pnlSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 50));

        pnlCerrar.setBackground(new java.awt.Color(50, 50, 50));

        lblConfig.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblConfig.setForeground(new java.awt.Color(255, 255, 255));
        lblConfig.setText("Configuracion");

        lblCerrar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCerrar.setText("Cerrar Sesion");
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCerrarLayout = new javax.swing.GroupLayout(pnlCerrar);
        pnlCerrar.setLayout(pnlCerrarLayout);
        pnlCerrarLayout.setHorizontalGroup(
            pnlCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(lblCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCerrarLayout.setVerticalGroup(
            pnlCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(pnlCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, -82, -1, -1));

        pnlPeli.setBackground(new java.awt.Color(25, 25, 25));
        pnlPeli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblNomPerfil.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblNomPerfil.setForeground(new java.awt.Color(255, 255, 255));
        lblNomPerfil.setIcon(new ImageIcon(Imagenes.reducido50 + "//" + perfil.getFoto() + ".png"));
        lblNomPerfil.setText("  "+perfil.getNombre());

        lblDescargas.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblDescargas.setForeground(new java.awt.Color(255, 255, 255));
        lblDescargas.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\mini_descargas.png")); // NOI18N
        lblDescargas.setText("Mis descargas");
        lblDescargas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 71, 71), 3));

        lblAccion.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblAccion.setForeground(new java.awt.Color(255, 255, 255));
        lblAccion.setText("Accion");

        lblAventura.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblAventura.setForeground(new java.awt.Color(255, 255, 255));
        lblAventura.setText("Aventura");

        lblTerror.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblTerror.setForeground(new java.awt.Color(255, 255, 255));
        lblTerror.setText("Terror");

        lblInfantil.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblInfantil.setForeground(new java.awt.Color(255, 255, 255));
        lblInfantil.setText("Infantiles");

        lblSuspenso.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblSuspenso.setForeground(new java.awt.Color(255, 255, 255));
        lblSuspenso.setText("Suspenso");

        lblCienFicc.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblCienFicc.setForeground(new java.awt.Color(255, 255, 255));
        lblCienFicc.setText("Ciencia Ficcion");

        lblDrama.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblDrama.setForeground(new java.awt.Color(255, 255, 255));
        lblDrama.setText("Drama");

        lblDeport.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblDeport.setForeground(new java.awt.Color(255, 255, 255));
        lblDeport.setText("Deportes");

        lblLatin.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblLatin.setForeground(new java.awt.Color(255, 255, 255));
        lblLatin.setText("Latinoamericanas");

        lblDocum.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblDocum.setForeground(new java.awt.Color(255, 255, 255));
        lblDocum.setText("Documentales");

        lblMusic.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblMusic.setForeground(new java.awt.Color(255, 255, 255));
        lblMusic.setText("Musicales");

        lblCambio.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\flechaCambioUser.png")); // NOI18N
        lblCambio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCambioMouseClicked(evt);
            }
        });

        lblInicio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblInicio.setText("Inicio");
        lblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlPeliLayout = new javax.swing.GroupLayout(pnlPeli);
        pnlPeli.setLayout(pnlPeliLayout);
        pnlPeliLayout.setHorizontalGroup(
            pnlPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPeliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAventura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTerror, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCienFicc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDrama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInfantil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSuspenso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDocum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMusic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLatin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPeliLayout.createSequentialGroup()
                        .addComponent(lblNomPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCambio)
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(lblDescargas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlPeliLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnlPeliLayout.setVerticalGroup(
            pnlPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPeliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPeliLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(lblDescargas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(lblAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAventura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTerror, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCienFicc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDrama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfantil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSuspenso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDocum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLatin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(pnlPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlPeliLayout.createSequentialGroup()
                    .addGap(144, 144, 144)
                    .addComponent(lblInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(476, Short.MAX_VALUE)))
        );

        add(pnlPeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, 50, 230, -1));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        MostrarPeliculasTodas mostrar = new MostrarPeliculasTodas();
        jScrollPane1.setViewportView(mostrar);
        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 900, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (j == 0 && menPeli == 0) {
            jLabel1.setVisible(true);
            jTextField1.setVisible(true);
            jLabel2.setVisible(false);
            lblMenuCerr.setVisible(false);

            if (cerr == 1) {
                lblMenuCerr.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\mini_menu3Puntos(1).png"));
                Animacion.Animacion.subir(50, -82, 2, 2, pnlCerrar);
                cerr = 0;
            }
            lblMenuPel.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\FlechaVolver.png"));
            j = 1;
        }
        if (menPeli == 1) {
        }//Solo para que no el boton de la lupa no haga nada mientras el menu esta abierto
    }//GEN-LAST:event_jLabel2MouseClicked

    private void lblMenuPelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuPelMouseClicked
        if (j == 1) {
            jLabel1.setVisible(false);
            jTextField1.setVisible(false);
            lblMenuPel.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\miniMenuIni.png"));
            jLabel2.setVisible(true);
            lblMenuCerr.setVisible(true);
            j = 0;
        } else {
            int posicion = pnlPeli.getX();
            if (posicion >= 0) {
                Animacion.Animacion.mover_izquierda(0, -230, 2, 2, pnlPeli);
                menPeli = 0;
            } else {
                Animacion.Animacion.mover_derecha(-230, 0, 2, 2, pnlPeli);
                menPeli = 1;
            }

        }
    }//GEN-LAST:event_lblMenuPelMouseClicked

    private void lblMenuCerrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuCerrMouseClicked
        int a = 0;
        if (cerr == 0 && menPeli == 0) {
            lblMenuCerr.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\mini_mini_mini_menu3Puntos.png"));
            Animacion.Animacion.bajar(-32, 50, 2, 2, pnlCerrar);
            a = 1;
        }
        if (cerr == 1 && menPeli == 0) {
            lblMenuCerr.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\mini_menu3Puntos(1).png"));
            Animacion.Animacion.subir(50, -82, 2, 2, pnlCerrar);
            a = 0;
        }
        cerr = a;//Se hace para que el valor de cerr se guarde una vez pasado los dos if.
        if (menPeli == 1) {
        }//Solo para que no el boton de la lupa no haga nada mientras el menu esta abierto.
    }//GEN-LAST:event_lblMenuCerrMouseClicked

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1FocusGained

    private void lblCambioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCambioMouseClicked
        SeleccionPerfil selec = new SeleccionPerfil(id);
        selec.setSize(900, 700);
        selec.setLocation(0, 0);
        panelPrincipal1.removeAll();
        panelPrincipal1.add(selec, BorderLayout.CENTER);
        panelPrincipal1.revalidate();
        panelPrincipal1.repaint();
    }//GEN-LAST:event_lblCambioMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        CerrarSesion cerr = new CerrarSesion();
        cerr.setLocation(0, 0);
        cerr.setSize(900, 700);
        panelPrincipal1.removeAll();
        panelPrincipal1.add(cerr, BorderLayout.CENTER);
        panelPrincipal1.revalidate();
        panelPrincipal1.repaint();
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseClicked
        MostrarPeliculasTodas mostrar = new MostrarPeliculasTodas();
        jScrollPane1.setViewportView(mostrar);
        Animacion.Animacion.mover_izquierda(0, -230, 2, 2, pnlPeli);
        menPeli = 0;
    }//GEN-LAST:event_lblInicioMouseClicked

    public int idUsuario() {
        IUsuarioDAO uDao = new UsuarioDAO();
        if (InicioSesion1.id == 0) {
            Usuario user = new Usuario();
            user.setMail(Registro4Pag.mail);
            user.setContrasena(Registro4Pag.contrasena);
            id = uDao.obtenerId(user);
        } else {
            id = InicioSesion1.id;
        }
        return id;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAccion;
    private javax.swing.JLabel lblAventura;
    private javax.swing.JLabel lblCambio;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblCienFicc;
    private javax.swing.JLabel lblConfig;
    private javax.swing.JLabel lblDeport;
    private javax.swing.JLabel lblDescargas;
    private javax.swing.JLabel lblDocum;
    private javax.swing.JLabel lblDrama;
    private javax.swing.JLabel lblInfantil;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblLatin;
    private javax.swing.JLabel lblMenuCerr;
    private javax.swing.JLabel lblMenuPel;
    private javax.swing.JLabel lblMusic;
    private javax.swing.JLabel lblNomPerfil;
    private javax.swing.JLabel lblSuspenso;
    private javax.swing.JLabel lblTerror;
    private javax.swing.JPanel pnlCerrar;
    private javax.swing.JPanel pnlPeli;
    private javax.swing.JPanel pnlSuperior;
    // End of variables declaration//GEN-END:variables
}
