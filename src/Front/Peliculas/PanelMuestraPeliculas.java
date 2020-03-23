package Front.Peliculas;

import Back.Conexion;
import Back.IPeliculasDAO;
import Back.Imagenes;
import Back.PeliculaDAO;
import Back.Peliculas;
import Front.CambiarPanel;
import Front.InicioSesion.SeleccionPerfil;
import static Front.Netflix.panelPrincipal1;
import static Front.Peliculas.MostrarPeliculasTodas.id;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.ScrollPaneConstants;

public class PanelMuestraPeliculas extends javax.swing.JPanel {

    public PanelMuestraPeliculas(Peliculas peliCarga) {
        peli = peliCarga;
        initComponents();
    }

    IPeliculasDAO pDao = new PeliculaDAO();
    static int id = SeleccionPerfil.idUsuario();
    MostrarPeliculasTodas mostrar = new MostrarPeliculasTodas();
    int selPer = SeleccionPerfil.selPer;
    Peliculas peli;
    Peliculas peliNueva;
    int hora = 0;
    int min = 0;
    int tiempo = 0;
    int i = 1;
    int contadorMiLista;
    int contadorDescargas;
    boolean boolMiLista = false;
    boolean boolDescarga = false;
    boolean kids = mostrar.kids;
    String nombre1;
    String nombre2;
    String nombre3;
    String nombre4;
    String nombre5;
    String nombre6;


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblSalida = new javax.swing.JLabel();
        lblFotoGrande = new javax.swing.JLabel();
        lblClasificacion = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblActores = new javax.swing.JLabel();
        lblDirector = new javax.swing.JLabel();
        pnlDescarga = new javax.swing.JPanel();
        lblDescargar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlCalif = new javax.swing.JPanel();
        lblCalPos = new javax.swing.JLabel();
        lblCalNeg = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnlMiLista = new javax.swing.JPanel();
        lblAgregarLista = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFoto1 = new javax.swing.JLabel();
        lblFoto2 = new javax.swing.JLabel();
        lblFoto3 = new javax.swing.JLabel();
        lblFoto4 = new javax.swing.JLabel();
        lblFoto5 = new javax.swing.JLabel();
        lblFoto6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(20, 20, 20));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setText(peli.getNombre());
        lblNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        lblSalida.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSalida.setForeground(new java.awt.Color(255, 255, 255));
        lblSalida.setText("X");
        lblSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalidaMouseClicked(evt);
            }
        });
        jPanel1.add(lblSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, 20));

        lblFotoGrande.setIcon(new ImageIcon(Imagenes.peliculasGrandes + "//"+ peli.getNombre() + ".jpg"));
        jPanel1.add(lblFotoGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 253));

        lblClasificacion.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblClasificacion.setText(peli.getClasificacion());
        lblClasificacion.setForeground(new java.awt.Color(255, 255, 255));
        lblClasificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClasificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tiempo = Integer.valueOf(peli.getDuracion());
        while(tiempo != 0){
            hora = hora + 1;
            tiempo = tiempo - 60;
            if(tiempo < 60){
                min = tiempo;
                tiempo = 0;
            }
        }

        lblTiempo.setText(hora + "h " + min + "min");
        lblTiempo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(255, 255, 255));

        lblDescripcion.setText(peli.getDescripcion());
        lblDescripcion.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 255));

        lblActores.setText("Elenco: " + peli.getActores());
        lblActores.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblActores.setForeground(new java.awt.Color(255, 255, 255));

        lblDirector.setText("Director: " + peli.getDirector());
        lblDirector.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblDirector.setForeground(new java.awt.Color(255, 255, 255));

        pnlDescarga.setBackground(new java.awt.Color(20, 20, 20));

        lblDescargar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contadorDescargas = pDao.contarPeliculasDescarga(id, selPer);
        if(contadorDescargas == 0){
            lblDescargar.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\descargas.png"));
        }
        i = 1;
        while(boolDescarga != true && contadorDescargas >= i){
            if(peli.getIdPelicula() != pDao.buscarPeliculaDescarga(i, id, selPer).getIdPelicula()){
                lblDescargar.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\descargas.png"));
                boolDescarga = false;
            } else {
                lblDescargar.setIcon(new ImageIcon(Imagenes.general + "//tildeBlanco.png"));
                boolDescarga = true;
            }
            i = i + 1;
        }
        lblDescargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDescargarMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Descargar");

        javax.swing.GroupLayout pnlDescargaLayout = new javax.swing.GroupLayout(pnlDescarga);
        pnlDescarga.setLayout(pnlDescargaLayout);
        pnlDescargaLayout.setHorizontalGroup(
            pnlDescargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescargaLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDescargaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );
        pnlDescargaLayout.setVerticalGroup(
            pnlDescargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescargaLayout.createSequentialGroup()
                .addComponent(lblDescargar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(0, 0, 0))
        );

        pnlCalif.setBackground(new java.awt.Color(20, 20, 20));

        lblCalPos.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\pulgarArriba.png")); // NOI18N
        lblCalPos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCalPosMouseClicked(evt);
            }
        });

        lblCalNeg.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\pulgarAbajo.png")); // NOI18N
        lblCalNeg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCalNegMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Calificar");

        javax.swing.GroupLayout pnlCalifLayout = new javax.swing.GroupLayout(pnlCalif);
        pnlCalif.setLayout(pnlCalifLayout);
        pnlCalifLayout.setHorizontalGroup(
            pnlCalifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalifLayout.createSequentialGroup()
                .addGroup(pnlCalifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCalifLayout.createSequentialGroup()
                        .addComponent(lblCalPos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCalNeg)))
                .addGap(0, 0, 0))
        );
        pnlCalifLayout.setVerticalGroup(
            pnlCalifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalifLayout.createSequentialGroup()
                .addGroup(pnlCalifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCalPos)
                    .addComponent(lblCalNeg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(0, 0, 0))
        );

        pnlMiLista.setBackground(new java.awt.Color(20, 20, 20));

        contadorMiLista = pDao.contarPeliculasMiLista(id, selPer);
        i = 1;
        while(boolMiLista == false && contadorMiLista >= i){
            if(peli.getIdPelicula() != pDao.buscarPeliculaMiLista(i, id, selPer).getIdPelicula()){
                lblAgregarLista.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\pngocean.com.png"));
                boolMiLista = false;
            } else {
                lblAgregarLista.setIcon(new ImageIcon(Imagenes.general + "//tildeBlanco.png"));
                boolMiLista = true;
            }
            i = i + 1;
        }
        if(contadorMiLista == 0){
            lblAgregarLista.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\pngocean.com.png"));
        }
        lblAgregarLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarListaMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mi lista");

        javax.swing.GroupLayout pnlMiListaLayout = new javax.swing.GroupLayout(pnlMiLista);
        pnlMiLista.setLayout(pnlMiListaLayout);
        pnlMiListaLayout.setHorizontalGroup(
            pnlMiListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMiListaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlMiListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lblAgregarLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlMiListaLayout.setVerticalGroup(
            pnlMiListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMiListaLayout.createSequentialGroup()
                .addComponent(lblAgregarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 0, 0))
        );

        do{
            nombre1 = mostrar.seleccionCategoria().getNombre();
            lblFoto1.setIcon(new ImageIcon(Imagenes.peliculasVariasSeleccion + "\\" + nombre1 + ".jpg" ));
            }while(peli.getNombre().equals(nombre1));
            lblFoto1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    lblFoto1MouseClicked(evt);
                }
            });

            do{
                do{
                    nombre2 = mostrar.seleccionCategoria().getNombre();
                    lblFoto2.setIcon(new ImageIcon(Imagenes.peliculasVariasSeleccion + "\\" + nombre2 + ".jpg" ));
                    }while(peli.getNombre().equals(nombre2));
                }while(nombre2.equals(nombre1));
                lblFoto2.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        lblFoto2MouseClicked(evt);
                    }
                });

                do{
                    do{
                        nombre3 = mostrar.seleccionCategoria().getNombre();
                        lblFoto3.setIcon(new ImageIcon(Imagenes.peliculasVariasSeleccion + "\\" + nombre3 + ".jpg" ));
                        }while(peli.getNombre().equals(nombre3));
                    }while(nombre3.equals(nombre1) || nombre3.equals(nombre2));
                    lblFoto3.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lblFoto3MouseClicked(evt);
                        }
                    });

                    do{
                        do{
                            nombre4 = mostrar.seleccionCategoria().getNombre();
                            lblFoto4.setIcon(new ImageIcon(Imagenes.peliculasVariasSeleccion + "\\" + nombre4 + ".jpg" ));
                            }while(peli.getNombre().equals(nombre4));
                        }while(nombre4.equals(nombre1) || nombre4.equals(nombre2) || nombre4.equals(nombre3));
                        lblFoto4.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                lblFoto4MouseClicked(evt);
                            }
                        });

                        do{
                            do{
                                nombre5 = mostrar.seleccionCategoria().getNombre();
                                lblFoto5.setIcon(new ImageIcon(Imagenes.peliculasVariasSeleccion + "\\" + nombre5 + ".jpg" ));
                                }while(peli.getNombre().equals(nombre5));
                            }while(nombre5.equals(nombre1) || nombre5.equals(nombre2) ||
                                nombre5.equals(nombre3) || nombre5.equals(nombre4));
                            lblFoto5.addMouseListener(new java.awt.event.MouseAdapter() {
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    lblFoto5MouseClicked(evt);
                                }
                            });

                            do{
                                do{
                                    nombre6 = mostrar.seleccionCategoria().getNombre();
                                    lblFoto6.setIcon(new ImageIcon(Imagenes.peliculasVariasSeleccion + "\\" + nombre6 + ".jpg" ));
                                    }while(peli.getNombre().equals(nombre6));
                                }while(nombre6.equals(nombre1) || nombre6.equals(nombre2) ||
                                    nombre6.equals(nombre3) || nombre6.equals(nombre4) || nombre6.equals(nombre5));
                                lblFoto6.addMouseListener(new java.awt.event.MouseAdapter() {
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        lblFoto6MouseClicked(evt);
                                    }
                                });

                                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                                this.setLayout(layout);
                                layout.setHorizontalGroup(
                                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblFoto5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(lblFoto6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lblClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(lblActores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblDirector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(8, 8, 8)
                                                    .addComponent(pnlMiLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(pnlCalif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(pnlDescarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lblFoto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(lblFoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lblFoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(10, 10, 10)
                                                        .addComponent(lblFoto4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );
                                layout.setVerticalGroup(
                                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblClasificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                            .addComponent(lblTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblActores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(pnlCalif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pnlMiLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pnlDescarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblFoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblFoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblFoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblFoto4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblFoto5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblFoto6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10))
                                );
                            }// </editor-fold>//GEN-END:initComponents

    private void lblSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalidaMouseClicked
        PanelMiLista mList = new PanelMiLista();
        mList.setSize(910, 200);
        mList.setLocation(0, 0);
        MostrarPeliculasTodas.pnlMiLista.removeAll();
        MostrarPeliculasTodas.pnlMiLista.add(mList, BorderLayout.CENTER);
        MostrarPeliculasTodas.pnlMiLista.revalidate();
        MostrarPeliculasTodas.pnlMiLista.repaint();
        Peliculas1.z = 1;
        Peliculas1.jScrollPaneChico.setEnabled(true);
        Peliculas1.pnlMuestraPeli.setVisible(false);
        Peliculas1.jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        Conexion.cerrarConexion(Conexion.contarConexiones());
    }//GEN-LAST:event_lblSalidaMouseClicked

    private void lblAgregarListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarListaMouseClicked
        boolMiLista = pDao.verificarEstadoMiLista(id, selPer, peli.getIdPelicula());
        if (boolMiLista == false) {
            lblAgregarLista.setIcon(new ImageIcon(Imagenes.general + "//tildeBlanco.png"));
            pDao.agregarPeliculaMiLista(id, selPer, peli.getIdPelicula());
        } else {
            lblAgregarLista.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\pngocean.com.png"));
            pDao.eliminarPeliculaMilista(id, selPer, peli.getIdPelicula());
        }
    }//GEN-LAST:event_lblAgregarListaMouseClicked

    private void lblCalPosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCalPosMouseClicked
        pDao.calificarPelicula(1, peli.getIdPelicula());
    }//GEN-LAST:event_lblCalPosMouseClicked

    private void lblCalNegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCalNegMouseClicked
        pDao.calificarPelicula(0, peli.getIdPelicula());
    }//GEN-LAST:event_lblCalNegMouseClicked

    private void lblDescargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDescargarMouseClicked
        boolDescarga = pDao.verificarEstadoDescarga(id, selPer, peli.getIdPelicula());
        if (boolDescarga == false) {
            lblDescargar.setIcon(new ImageIcon(Imagenes.general + "//tildeBlanco.png"));
            pDao.descargarPelicula(id, selPer, peli.getIdPelicula());
        } else {
            lblDescargar.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\descargas.png"));
            pDao.eliminarPeliculaDescarga(id, selPer, peli.getIdPelicula());
        }
    }//GEN-LAST:event_lblDescargarMouseClicked

    private void lblFoto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFoto1MouseClicked
        cambioDePelicula(nombre1);
    }//GEN-LAST:event_lblFoto1MouseClicked

    private void lblFoto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFoto2MouseClicked
        cambioDePelicula(nombre2);
    }//GEN-LAST:event_lblFoto2MouseClicked

    private void lblFoto3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFoto3MouseClicked
        cambioDePelicula(nombre3);
    }//GEN-LAST:event_lblFoto3MouseClicked

    private void lblFoto4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFoto4MouseClicked
        cambioDePelicula(nombre4);
    }//GEN-LAST:event_lblFoto4MouseClicked

    private void lblFoto5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFoto5MouseClicked
        cambioDePelicula(nombre5);
    }//GEN-LAST:event_lblFoto5MouseClicked

    private void lblFoto6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFoto6MouseClicked
        cambioDePelicula(nombre6);
    }//GEN-LAST:event_lblFoto6MouseClicked

    private void cambioDePelicula(String nombre) {
        peliNueva = pDao.buscarPeliculaPorNombre(nombre, 1);
        PanelMuestraPeliculas muestraPel = new PanelMuestraPeliculas(peliNueva);
        Peliculas1.jScrollPaneChico.setViewportView(muestraPel);
        Conexion.cerrarConexion(Conexion.contarConexiones());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblActores;
    private javax.swing.JLabel lblAgregarLista;
    private javax.swing.JLabel lblCalNeg;
    private javax.swing.JLabel lblCalPos;
    private javax.swing.JLabel lblClasificacion;
    private javax.swing.JLabel lblDescargar;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDirector;
    private javax.swing.JLabel lblFoto1;
    private javax.swing.JLabel lblFoto2;
    private javax.swing.JLabel lblFoto3;
    private javax.swing.JLabel lblFoto4;
    private javax.swing.JLabel lblFoto5;
    private javax.swing.JLabel lblFoto6;
    private javax.swing.JLabel lblFotoGrande;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSalida;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JPanel pnlCalif;
    private javax.swing.JPanel pnlDescarga;
    private javax.swing.JPanel pnlMiLista;
    // End of variables declaration//GEN-END:variables
}
