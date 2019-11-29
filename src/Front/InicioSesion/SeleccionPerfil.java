package Front.InicioSesion;

import Back.IPerfilDAO;
import Back.IUsuarioDAO;
import Back.Imagenes;
import Back.PerfilDAO;
import Back.Perfiles;
import Back.Usuario;
import Back.UsuarioDAO;
import Front.Registro.Registro4Pag;
import Front.Peliculas.Peliculas1;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import static Front.Netflix.panelPrincipal1;

public class SeleccionPerfil extends javax.swing.JPanel {

    public SeleccionPerfil(int id) {
        initComponents();
        pintarPanel(id);
    }

    IUsuarioDAO uDao = new UsuarioDAO();
    IPerfilDAO pDao = new PerfilDAO();
    int x = 0;
    int admin = 0;
    int id = idUsuario();
    int s = 0;
    public static int selPer;
    Perfiles perfiles;
    AnadirPerfil anadir = new AnadirPerfil();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        administrar = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        perfil1 = new javax.swing.JPanel();
        foto1 = new javax.swing.JLabel();
        perfil2 = new javax.swing.JPanel();
        foto2 = new javax.swing.JLabel();
        perfil3 = new javax.swing.JPanel();
        foto3 = new javax.swing.JLabel();
        perfil4 = new javax.swing.JPanel();
        foto4 = new javax.swing.JLabel();
        perfil5 = new javax.swing.JPanel();
        foto5 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        lblNombre4 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        lblNombre5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        administrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Administrar.png")); // NOI18N
        administrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                administrarMouseClicked(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Logo netflix negro.png")); // NOI18N

        perfil1.setBackground(new java.awt.Color(0, 0, 0));

        foto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout perfil1Layout = new javax.swing.GroupLayout(perfil1);
        perfil1.setLayout(perfil1Layout);
        perfil1Layout.setHorizontalGroup(
            perfil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        perfil1Layout.setVerticalGroup(
            perfil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        perfil2.setBackground(new java.awt.Color(0, 0, 0));

        foto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout perfil2Layout = new javax.swing.GroupLayout(perfil2);
        perfil2.setLayout(perfil2Layout);
        perfil2Layout.setHorizontalGroup(
            perfil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        perfil2Layout.setVerticalGroup(
            perfil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        perfil3.setBackground(new java.awt.Color(0, 0, 0));

        foto3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout perfil3Layout = new javax.swing.GroupLayout(perfil3);
        perfil3.setLayout(perfil3Layout);
        perfil3Layout.setHorizontalGroup(
            perfil3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        perfil3Layout.setVerticalGroup(
            perfil3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        perfil4.setBackground(new java.awt.Color(0, 0, 0));

        foto4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout perfil4Layout = new javax.swing.GroupLayout(perfil4);
        perfil4.setLayout(perfil4Layout);
        perfil4Layout.setHorizontalGroup(
            perfil4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        perfil4Layout.setVerticalGroup(
            perfil4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        perfil5.setBackground(new java.awt.Color(0, 0, 0));

        foto5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foto5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout perfil5Layout = new javax.swing.GroupLayout(perfil5);
        perfil5.setLayout(perfil5Layout);
        perfil5Layout.setHorizontalGroup(
            perfil5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        perfil5Layout.setVerticalGroup(
            perfil5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        lblNombre1.setBackground(new java.awt.Color(0, 0, 0));
        lblNombre1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblNombre4.setBackground(new java.awt.Color(0, 0, 0));
        lblNombre4.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblNombre2.setBackground(new java.awt.Color(0, 0, 0));
        lblNombre2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblNombre3.setBackground(new java.awt.Color(0, 0, 0));
        lblNombre3.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblNombre5.setBackground(new java.awt.Color(0, 0, 0));
        lblNombre5.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(perfil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(perfil2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(perfil3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombre3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(perfil4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNombre5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(perfil5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(140, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(administrar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(perfil4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(administrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(perfil3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(perfil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(perfil2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(perfil5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(310, 310, 310))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void foto3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto3MouseClicked

        if (x == 0) {
            anadir.setSize(900, 700);
            anadir.setLocation(0, 0);
            panelPrincipal1.removeAll();
            panelPrincipal1.add(anadir, BorderLayout.CENTER);
            panelPrincipal1.revalidate();
            panelPrincipal1.repaint();
        }
        if (s == 1 && x != 0) {
            switch (x) {
                case 1:
                    selPer = 1;
                    break;
                case 2:
                    selPer = 2;
                    break;
                case 3:
                    selPer = 2;
                    break;
                case 4:
                    selPer = 3;
                    break;
                case 5:
                    selPer = 3;
                    break;
            }
            ModificarPerfil mod = new ModificarPerfil();
            mod.setSize(900, 700);
            mod.setLocation(0, 0);
            panelPrincipal1.removeAll();
            panelPrincipal1.add(mod, BorderLayout.CENTER);
            panelPrincipal1.revalidate();
            panelPrincipal1.repaint();
        } else {
            switch (x) {
                case 1:
                    selPer = 1;
                    break;
                case 2:
                    selPer = 2;
                    break;
                case 3:
                    selPer = 2;
                    break;
                case 4:
                    selPer = 3;
                    break;
                case 5:
                    selPer = 3;
                    break;
            }
            Peliculas1 pel1 = new Peliculas1();
            pel1.setLocation(0, 0);
            pel1.setSize(900, 700);
            panelPrincipal1.removeAll();
            panelPrincipal1.add(pel1, BorderLayout.CENTER);
            panelPrincipal1.revalidate();
            panelPrincipal1.repaint();
        }
    }//GEN-LAST:event_foto3MouseClicked

    private void foto4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto4MouseClicked
        if (x == 1 || x == 2) {
            anadir.setSize(900, 700);
            anadir.setLocation(0, 0);
            panelPrincipal1.removeAll();
            panelPrincipal1.add(anadir, BorderLayout.CENTER);
            panelPrincipal1.revalidate();
            panelPrincipal1.repaint();
        }
        if (s == 1 && (x != 1 && x != 2)) {
            switch (x) {
                case 3:
                    selPer = 3;
                    break;
                case 4:
                    selPer = 4;
                    break;
                case 5:
                    selPer = 4;
                    break;
            }
            ModificarPerfil mod = new ModificarPerfil();
            mod.setLocation(0, 0);
            mod.setSize(900, 700);
            panelPrincipal1.removeAll();
            panelPrincipal1.add(mod, BorderLayout.CENTER);
            panelPrincipal1.revalidate();
            panelPrincipal1.repaint();
        } else {
            switch (x) {
                case 3:
                    selPer = 3;
                    break;
                case 4:
                    selPer = 4;
                    break;
                case 5:
                    selPer = 4;
                    break;
            }
            Peliculas1 pel1 = new Peliculas1();
            pel1.setLocation(0, 0);
            pel1.setSize(900, 700);
            panelPrincipal1.removeAll();
            panelPrincipal1.add(pel1, BorderLayout.CENTER);
            panelPrincipal1.revalidate();
            panelPrincipal1.repaint();
        }
    }//GEN-LAST:event_foto4MouseClicked

    private void foto5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto5MouseClicked
        if (x == 3 || x == 4) {
            anadir.setSize(900, 700);
            anadir.setLocation(0, 0);
            panelPrincipal1.removeAll();
            panelPrincipal1.add(anadir, BorderLayout.CENTER);
            panelPrincipal1.revalidate();
            panelPrincipal1.repaint();
        }
        if (s == 1 && (x != 3 && x != 4)) {
            if (x == 5) {
                selPer = 5;
            }
            ModificarPerfil mod = new ModificarPerfil();
            mod.setLocation(0, 0);
            mod.setSize(900, 700);

            panelPrincipal1.removeAll();
            panelPrincipal1.add(mod, BorderLayout.CENTER);
            panelPrincipal1.revalidate();
            panelPrincipal1.repaint();
        } else {
            if (x == 5) {
                selPer = 5;
            }
            Peliculas1 pel1 = new Peliculas1();
            pel1.setLocation(0, 0);
            pel1.setSize(900, 700);
            panelPrincipal1.removeAll();
            panelPrincipal1.add(pel1, BorderLayout.CENTER);
            panelPrincipal1.revalidate();
            panelPrincipal1.repaint();
        }
    }//GEN-LAST:event_foto5MouseClicked

    private void administrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_administrarMouseClicked

        if (s == 0) {
            if (x == 1) {
                foto3.setIcon(new ImageIcon(Imagenes.admin + "//" + pDao.obtenerPerfil(id, 1).getFoto().toString() + ".png"));
            }
            if (x == 2) {
                foto2.setIcon(new ImageIcon(Imagenes.admin + "//" + pDao.obtenerPerfil(id, 1).getFoto().toString() + ".png"));
                foto3.setIcon(new ImageIcon(Imagenes.admin + "//" + pDao.obtenerPerfil(id, 2).getFoto().toString() + ".png"));
            }
            if (x == 3) {
                foto2.setIcon(new ImageIcon(Imagenes.admin + "//" + pDao.obtenerPerfil(id, 1).getFoto().toString() + ".png"));
                foto3.setIcon(new ImageIcon(Imagenes.admin + "//" + pDao.obtenerPerfil(id, 2).getFoto().toString() + ".png"));
                foto4.setIcon(new ImageIcon(Imagenes.admin + "//" + pDao.obtenerPerfil(id, 3).getFoto().toString() + ".png"));
            }
            if (x == 4) {
                foto1.setIcon(new ImageIcon(Imagenes.admin + "//" + pDao.obtenerPerfil(id, 1).getFoto().toString() + ".png"));
                foto2.setIcon(new ImageIcon(Imagenes.admin + "//" + pDao.obtenerPerfil(id, 2).getFoto().toString() + ".png"));
                foto3.setIcon(new ImageIcon(Imagenes.admin + "//" + pDao.obtenerPerfil(id, 3).getFoto().toString() + ".png"));
                foto4.setIcon(new ImageIcon(Imagenes.admin + "//" + pDao.obtenerPerfil(id, 4).getFoto().toString() + ".png"));
            }
            if (x == 5) {
                foto1.setIcon(new ImageIcon(Imagenes.admin + "//" + pDao.obtenerPerfil(id, 1).getFoto().toString() + ".png"));
                foto2.setIcon(new ImageIcon(Imagenes.admin + "//" + pDao.obtenerPerfil(id, 2).getFoto().toString() + ".png"));
                foto3.setIcon(new ImageIcon(Imagenes.admin + "//" + pDao.obtenerPerfil(id, 3).getFoto().toString() + ".png"));
                foto4.setIcon(new ImageIcon(Imagenes.admin + "//" + pDao.obtenerPerfil(id, 4).getFoto().toString() + ".png"));
                foto5.setIcon(new ImageIcon(Imagenes.admin + "//" + pDao.obtenerPerfil(id, 5).getFoto().toString() + ".png"));
            }
            s = 1;
            administrar.setIcon(new ImageIcon(Imagenes.general + "//ListoAdmin.png"));
        } else {
            pintarPanel(id);
            s = 0;
            administrar.setIcon(new ImageIcon(Imagenes.general + "//Administrar.png"));
        }
    }//GEN-LAST:event_administrarMouseClicked

    private void foto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto1MouseClicked
        if (s == 1) {
            switch (x) {
                case 4:
                    selPer = 1;
                    break;
                case 5:
                    selPer = 1;
                    break;
            }
            ModificarPerfil mod = new ModificarPerfil();
            mod.setLocation(0, 0);
            mod.setSize(900, 700);
            panelPrincipal1.removeAll();
            panelPrincipal1.add(mod, BorderLayout.CENTER);
            panelPrincipal1.revalidate();
            panelPrincipal1.repaint();
        } else {
            switch (x) {
                case 4:
                    selPer = 1;
                    break;
                case 5:
                    selPer = 1;
                    break;
            }
            Peliculas1 pel1 = new Peliculas1();
            pel1.setLocation(0, 0);
            pel1.setSize(900, 700);
            panelPrincipal1.removeAll();
            panelPrincipal1.add(pel1, BorderLayout.CENTER);
            panelPrincipal1.revalidate();
            panelPrincipal1.repaint();
        }
    }//GEN-LAST:event_foto1MouseClicked

    private void foto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto2MouseClicked
        if (s == 1) {
            switch (x) {
                case 2:
                    selPer = 1;
                    break;
                case 3:
                    selPer = 1;
                    break;
                case 4:
                    selPer = 2;
                    break;
                case 5:
                    selPer = 2;
                    break;
            }
            ModificarPerfil mod = new ModificarPerfil();
            mod.setLocation(0, 0);
            mod.setSize(900, 700);
            panelPrincipal1.removeAll();
            panelPrincipal1.add(mod, BorderLayout.CENTER);
            panelPrincipal1.revalidate();
            panelPrincipal1.repaint();
        } else {
            switch (x) {
                case 2:
                    selPer = 1;
                    break;
                case 3:
                    selPer = 1;
                    break;
                case 4:
                    selPer = 2;
                    break;
                case 5:
                    selPer = 2;
                    break;
            }

            Peliculas1 pel1 = new Peliculas1();
            pel1.setLocation(0, 0);
            pel1.setSize(900, 700);
            panelPrincipal1.removeAll();
            panelPrincipal1.add(pel1, BorderLayout.CENTER);
            panelPrincipal1.revalidate();
            panelPrincipal1.repaint();

        }
    }//GEN-LAST:event_foto2MouseClicked

    public void pintarPanel(int id) {

        uDao = new UsuarioDAO();
        pDao = new PerfilDAO();
        if (pDao.contarPerfiles(id) == 0) {
            foto3.setIcon(new ImageIcon(Imagenes.general + "//Agregar.png"));
            x = 0;
        }

        if (pDao.contarPerfiles(id) == 1) {
            foto3.setIcon(new ImageIcon(Imagenes.perfiles + "//" + pDao.obtenerPerfil(id, 1).getFoto().toString() + ".png"));
            lblNombre3.setText(pDao.obtenerPerfil(id, 1).getNombre());
            foto4.setIcon(new ImageIcon(Imagenes.general + "//Agregar.png"));
            x = 1;
        }

        if (pDao.contarPerfiles(id) == 2) {
            foto2.setIcon(new ImageIcon(Imagenes.perfiles + "//" + pDao.obtenerPerfil(id, 1).getFoto().toString() + ".png"));
            lblNombre2.setText(pDao.obtenerPerfil(id, 1).getNombre());
            foto3.setIcon(new ImageIcon(Imagenes.perfiles + "//" + pDao.obtenerPerfil(id, 2).getFoto().toString() + ".png"));
            lblNombre3.setText(pDao.obtenerPerfil(id, 2).getNombre());
            foto4.setIcon(new ImageIcon(Imagenes.general + "//Agregar.png"));
            x = 2;
        }

        if (pDao.contarPerfiles(id) == 3) {
            foto2.setIcon(new ImageIcon(Imagenes.perfiles + "//" + pDao.obtenerPerfil(id, 1).getFoto().toString() + ".png"));
            lblNombre2.setText(pDao.obtenerPerfil(id, 1).getNombre());
            foto3.setIcon(new ImageIcon(Imagenes.perfiles + "//" + pDao.obtenerPerfil(id, 2).getFoto().toString() + ".png"));
            lblNombre3.setText(pDao.obtenerPerfil(id, 2).getNombre());
            foto4.setIcon(new ImageIcon(Imagenes.perfiles + "//" + pDao.obtenerPerfil(id, 3).getFoto().toString() + ".png"));
            lblNombre4.setText(pDao.obtenerPerfil(id, 3).getNombre());
            foto5.setIcon(new ImageIcon(Imagenes.general + "//Agregar.png"));
            x = 3;
        }

        if (pDao.contarPerfiles(id) == 4) {
            foto1.setIcon(new ImageIcon(Imagenes.perfiles + "//" + pDao.obtenerPerfil(id, 1).getFoto().toString() + ".png"));
            lblNombre1.setText(pDao.obtenerPerfil(id, 1).getNombre());
            foto2.setIcon(new ImageIcon(Imagenes.perfiles + "//" + pDao.obtenerPerfil(id, 2).getFoto().toString() + ".png"));
            lblNombre2.setText(pDao.obtenerPerfil(id, 2).getNombre());
            foto3.setIcon(new ImageIcon(Imagenes.perfiles + "//" + pDao.obtenerPerfil(id, 3).getFoto().toString() + ".png"));
            lblNombre3.setText(pDao.obtenerPerfil(id, 3).getNombre());
            foto4.setIcon(new ImageIcon(Imagenes.perfiles + "//" + pDao.obtenerPerfil(id, 4).getFoto().toString() + ".png"));
            lblNombre4.setText(pDao.obtenerPerfil(id, 4).getNombre());
            foto5.setIcon(new ImageIcon(Imagenes.general + "//Agregar.png"));
            x = 4;
        }

        if (pDao.contarPerfiles(id) == 5) {
            foto1.setIcon(new ImageIcon(Imagenes.perfiles + "//" + pDao.obtenerPerfil(id, 1).getFoto().toString() + ".png"));
            lblNombre1.setText(pDao.obtenerPerfil(id, 1).getNombre());
            foto2.setIcon(new ImageIcon(Imagenes.perfiles + "//" + pDao.obtenerPerfil(id, 2).getFoto().toString() + ".png"));
            lblNombre2.setText(pDao.obtenerPerfil(id, 2).getNombre());
            foto3.setIcon(new ImageIcon(Imagenes.perfiles + "//" + pDao.obtenerPerfil(id, 3).getFoto().toString() + ".png"));
            lblNombre3.setText(pDao.obtenerPerfil(id, 3).getNombre());
            foto4.setIcon(new ImageIcon(Imagenes.perfiles + "//" + pDao.obtenerPerfil(id, 4).getFoto().toString() + ".png"));
            lblNombre4.setText(pDao.obtenerPerfil(id, 4).getNombre());
            foto5.setIcon(new ImageIcon(Imagenes.perfiles + "//" + pDao.obtenerPerfil(id, 5).getFoto().toString() + ".png"));
            lblNombre5.setText(pDao.obtenerPerfil(id, 5).getNombre());
            x = 5;
        }
    }

    public int idUsuario() {
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
    private javax.swing.JLabel administrar;
    private javax.swing.JLabel foto1;
    private javax.swing.JLabel foto2;
    private javax.swing.JLabel foto3;
    private javax.swing.JLabel foto4;
    private javax.swing.JLabel foto5;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JLabel lblNombre5;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel perfil1;
    private javax.swing.JPanel perfil2;
    private javax.swing.JPanel perfil3;
    private javax.swing.JPanel perfil4;
    private javax.swing.JPanel perfil5;
    // End of variables declaration//GEN-END:variables
}
