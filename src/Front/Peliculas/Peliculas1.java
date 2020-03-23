package Front.Peliculas;

import Back.Conexion;
import Back.IPeliculasDAO;
import Back.ITarjetaDAO;
import Back.ITipoPlanDAO;
import Back.IUsuarioDAO;
import Back.Imagenes;
import Back.PeliculaDAO;
import Back.Peliculas;
import Back.PerfilDAO;
import Back.Perfiles;
import Back.Tarjeta;
import Back.TarjetaDAO;
import Back.TipoPlanDAO;
import Back.Usuario;
import Back.UsuarioDAO;
import Front.CambiarPanel;
import Front.Configuracion.Configuracio;
import Front.InicioSesion.ModificarPerfil;
import Front.InicioSesion.SeleccionPerfil;
import Front.Registro.CerrarSesion;
import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;

public class Peliculas1 extends javax.swing.JPanel {

    public Peliculas1() {
        initComponents();
    }

    ModificarPerfil mod;
//Daos
    IUsuarioDAO uDao = new UsuarioDAO();
    ITarjetaDAO tDao = new TarjetaDAO();
    ITipoPlanDAO tPlan = new TipoPlanDAO();
    PerfilDAO pDao = new PerfilDAO();
    IPeliculasDAO peliDao = new PeliculaDAO();
//Variables    
    int j = 0;
    public static int z = 1;
    int cerr = 0;
    int menPeli = 0;
    public static String buscar = "";
    static int id = SeleccionPerfil.idUsuario();
    int selPer = SeleccionPerfil.selPer;
    
//Clases  
    Perfiles perfil = pDao.obtenerPerfil(id, selPer);
    Peliculas peli = PanelModificable.peli;
    CambiarPanel cambiarPanel;
    PeliculasCategoria peliCat;
    MostrarPeliculasTodas mostrar = new MostrarPeliculasTodas();
    Usuario user = new Usuario();
    Tarjeta tar = new Tarjeta();


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMuestraPeli = new javax.swing.JPanel();
        jScrollPaneChico = new javax.swing.JScrollPane();
        pnlSuperior = new javax.swing.JPanel();
        lblBusqueda = new javax.swing.JLabel();
        lblBusqueda2 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
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
        setMinimumSize(new java.awt.Dimension(900, 700));
        setPreferredSize(new java.awt.Dimension(900, 2100));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMuestraPeli.setVisible(false);
        pnlMuestraPeli.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout pnlMuestraPeliLayout = new javax.swing.GroupLayout(pnlMuestraPeli);
        pnlMuestraPeli.setLayout(pnlMuestraPeliLayout);
        pnlMuestraPeliLayout.setHorizontalGroup(
            pnlMuestraPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneChico, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        pnlMuestraPeliLayout.setVerticalGroup(
            pnlMuestraPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneChico, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        add(pnlMuestraPeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 470, 650));

        pnlSuperior.setBackground(new java.awt.Color(0, 0, 0));
        pnlSuperior.setLayout(null);

        lblBusqueda.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\mini_lupa.png")); // NOI18N
        lblBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBusquedaMouseClicked(evt);
            }
        });
        pnlSuperior.add(lblBusqueda);
        lblBusqueda.setBounds(789, 11, 30, 30);

        lblBusqueda2.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\mini_lupa.png")); // NOI18N
        lblBusqueda2.setVisible(false);
        pnlSuperior.add(lblBusqueda2);
        lblBusqueda2.setBounds(234, 11, 30, 30);

        txtBusqueda.setBackground(new java.awt.Color(0, 0, 0));
        txtBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        txtBusqueda.setText("Buscar");
        txtBusqueda.setVisible(false);
        txtBusqueda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBusquedaFocusGained(evt);
            }
        });
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });
        pnlSuperior.add(txtBusqueda);
        txtBusqueda.setBounds(274, 11, 300, 30);

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
        lblConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConfigMouseClicked(evt);
            }
        });

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
        lblDescargas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDescargasMouseClicked(evt);
            }
        });

        lblAccion.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblAccion.setForeground(new java.awt.Color(255, 255, 255));
        lblAccion.setText("Accion");
        lblAccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAccionMouseClicked(evt);
            }
        });

        lblAventura.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblAventura.setForeground(new java.awt.Color(255, 255, 255));
        lblAventura.setText("Aventura");
        lblAventura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAventuraMouseClicked(evt);
            }
        });

        lblTerror.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblTerror.setForeground(new java.awt.Color(255, 255, 255));
        lblTerror.setText("Terror");
        lblTerror.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTerrorMouseClicked(evt);
            }
        });

        lblInfantil.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblInfantil.setForeground(new java.awt.Color(255, 255, 255));
        lblInfantil.setText("Infantiles");
        lblInfantil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInfantilMouseClicked(evt);
            }
        });

        lblSuspenso.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblSuspenso.setForeground(new java.awt.Color(255, 255, 255));
        lblSuspenso.setText("Suspenso");
        lblSuspenso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSuspensoMouseClicked(evt);
            }
        });

        lblCienFicc.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblCienFicc.setForeground(new java.awt.Color(255, 255, 255));
        lblCienFicc.setText("Ciencia Ficcion");
        lblCienFicc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCienFiccMouseClicked(evt);
            }
        });

        lblDrama.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblDrama.setForeground(new java.awt.Color(255, 255, 255));
        lblDrama.setText("Drama");
        lblDrama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDramaMouseClicked(evt);
            }
        });

        lblDeport.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblDeport.setForeground(new java.awt.Color(255, 255, 255));
        lblDeport.setText("Deportes");
        lblDeport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeportMouseClicked(evt);
            }
        });

        lblLatin.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblLatin.setForeground(new java.awt.Color(255, 255, 255));
        lblLatin.setText("Latinoamericanas");
        lblLatin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLatinMouseClicked(evt);
            }
        });

        lblDocum.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblDocum.setForeground(new java.awt.Color(255, 255, 255));
        lblDocum.setText("Documentales");
        lblDocum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDocumMouseClicked(evt);
            }
        });

        lblMusic.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblMusic.setForeground(new java.awt.Color(255, 255, 255));
        lblMusic.setText("Musicales");
        lblMusic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMusicMouseClicked(evt);
            }
        });

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
                    .addComponent(lblInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
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
        jScrollPane1.setViewportView(mostrar);
        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 910, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void lblBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBusquedaMouseClicked
        if (z == 1) {
            if (j == 0 && menPeli == 0) {
                lblBusqueda2.setVisible(true);
                txtBusqueda.setVisible(true);
                lblBusqueda.setVisible(false);
                lblMenuCerr.setVisible(false);
                PeliculaBuscar peliculaBuscar = new PeliculaBuscar();
                jScrollPane1.setViewportView(peliculaBuscar);
                Conexion.cerrarConexion(Conexion.contarConexiones());

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
        }//Para que no se oprima el boton una vez que esta abiera la vista de la pelicula
    }//GEN-LAST:event_lblBusquedaMouseClicked

    private void lblMenuPelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuPelMouseClicked
        if (z == 1) {
            if (j == 1) {
                lblBusqueda2.setVisible(false);
                txtBusqueda.setVisible(false);
                lblMenuPel.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\miniMenuIni.png"));
                lblBusqueda.setVisible(true);
                lblMenuCerr.setVisible(true);
                jScrollPane1.setViewportView(mostrar);
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
        }//Para que no se oprima el boton una vez que esta abiera la vista de la pelicula

    }//GEN-LAST:event_lblMenuPelMouseClicked

    private void lblMenuCerrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuCerrMouseClicked
        if (z == 1) {
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
        }//Para que no se oprima el boton una vez que esta abiera la vista de la pelicula

    }//GEN-LAST:event_lblMenuCerrMouseClicked

    private void txtBusquedaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBusquedaFocusGained
        txtBusqueda.setText(buscar);
    }//GEN-LAST:event_txtBusquedaFocusGained

    private void lblCambioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCambioMouseClicked
        SeleccionPerfil selec = new SeleccionPerfil(id);
        cambiarPanel = new CambiarPanel(selec);
    }//GEN-LAST:event_lblCambioMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        CerrarSesion cerr = new CerrarSesion();
        cambiarPanel = new CambiarPanel(cerr);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseClicked
        mostrar = new MostrarPeliculasTodas();
        jScrollPane1.setViewportView(mostrar);
        Animacion.Animacion.mover_izquierda(0, -230, 2, 2, pnlPeli);
        menPeli = 0;
        Conexion.cerrarConexion(Conexion.contarConexiones());
    }//GEN-LAST:event_lblInicioMouseClicked

    private void lblAccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccionMouseClicked
        seleccionCat("Accion");
    }//GEN-LAST:event_lblAccionMouseClicked

    private void lblMusicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMusicMouseClicked
        seleccionCat("Musical");
    }//GEN-LAST:event_lblMusicMouseClicked

    private void lblDocumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDocumMouseClicked
        seleccionCat("Documental");
    }//GEN-LAST:event_lblDocumMouseClicked

    private void lblAventuraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAventuraMouseClicked
        seleccionCat("Aventura");
    }//GEN-LAST:event_lblAventuraMouseClicked

    private void lblTerrorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTerrorMouseClicked
        seleccionCat("Terror");
    }//GEN-LAST:event_lblTerrorMouseClicked

    private void lblInfantilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfantilMouseClicked
        seleccionCat("Infantil");
    }//GEN-LAST:event_lblInfantilMouseClicked

    private void lblSuspensoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuspensoMouseClicked
        seleccionCat("Suspenso");
    }//GEN-LAST:event_lblSuspensoMouseClicked

    private void lblCienFiccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCienFiccMouseClicked
        seleccionCat("Ciencia Ficcion");
    }//GEN-LAST:event_lblCienFiccMouseClicked

    private void lblDramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDramaMouseClicked
        seleccionCat("Drama");
    }//GEN-LAST:event_lblDramaMouseClicked

    private void lblDeportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeportMouseClicked
        seleccionCat("Deporte");
    }//GEN-LAST:event_lblDeportMouseClicked

    private void lblLatinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLatinMouseClicked
        seleccionCat("Latin");
    }//GEN-LAST:event_lblLatinMouseClicked

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        buscar = txtBusqueda.getText();
        PeliculaBuscar peliBuscar = new PeliculaBuscar();
        jScrollPane1.setViewportView(peliBuscar);
        Conexion.cerrarConexion(Conexion.contarConexiones());

    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void lblDescargasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDescargasMouseClicked
        seleccionCat("Descargas");
    }//GEN-LAST:event_lblDescargasMouseClicked

    private void lblConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfigMouseClicked
        lblMenuCerr.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\mini_menu3Puntos(1).png"));
        Animacion.Animacion.subir(50, -82, 2, 2, pnlCerrar);
        cerr = 0;
        Configuracio conf = new Configuracio();
        jScrollPaneChico.setViewportView(conf);
        pnlMuestraPeli.setVisible(true);
        jScrollPane1.setEnabled(false);
        jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        Peliculas1.z = 0;
    }//GEN-LAST:event_lblConfigMouseClicked

    private void seleccionCat(String cat) {
        peliCat = new PeliculasCategoria(cat);
        jScrollPane1.setViewportView(peliCat);
        Animacion.Animacion.mover_izquierda(0, -230, 2, 2, pnlPeli);
        menPeli = 0;
        Conexion.cerrarConexion(Conexion.contarConexiones());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jScrollPaneChico;
    private javax.swing.JLabel lblAccion;
    private javax.swing.JLabel lblAventura;
    public static javax.swing.JLabel lblBusqueda;
    private javax.swing.JLabel lblBusqueda2;
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
    public static javax.swing.JLabel lblMenuCerr;
    public static javax.swing.JLabel lblMenuPel;
    private javax.swing.JLabel lblMusic;
    private javax.swing.JLabel lblNomPerfil;
    private javax.swing.JLabel lblSuspenso;
    private javax.swing.JLabel lblTerror;
    private javax.swing.JPanel pnlCerrar;
    public static javax.swing.JPanel pnlMuestraPeli;
    private javax.swing.JPanel pnlPeli;
    public static javax.swing.JPanel pnlSuperior;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
