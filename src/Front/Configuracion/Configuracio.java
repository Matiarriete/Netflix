package Front.Configuracion;

import Back.Conexion;
import Back.IPerfilDAO;
import Back.ITarjetaDAO;
import Back.ITipoPlanDAO;
import Back.IUsuarioDAO;
import Back.Imagenes;
import Back.PerfilDAO;
import Back.Perfiles;
import Back.Tarjeta;
import Back.TarjetaDAO;
import Back.TipoPlanDAO;
import Back.Usuario;
import Back.UsuarioDAO;
import Front.CambiarPanel;
import Front.InicioSesion.SeleccionPerfil;
import Front.Peliculas.MostrarPeliculasTodas;
import Front.Peliculas.PanelMiLista;
import Front.Peliculas.Peliculas1;
import Front.Registro.Registro6Pag;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;

public class Configuracio extends javax.swing.JPanel {

    public Configuracio() {
        initComponents();
    }

    IUsuarioDAO uDao = new UsuarioDAO();
    Usuario user = new Usuario();
    IPerfilDAO pDao = new PerfilDAO();
    Tarjeta tar = new Tarjeta();
    ITarjetaDAO tDao = new TarjetaDAO();
    static int id = SeleccionPerfil.idUsuario();
    ITipoPlanDAO tPlan = new TipoPlanDAO();
    int selPer = SeleccionPerfil.selPer;
    Perfiles perfil = pDao.obtenerPerfil(id, selPer);
    public static int sel = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblCambiarMail = new javax.swing.JLabel();
        lblCambiarContra = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        lblNumTarjeta = new javax.swing.JLabel();
        lblCambiarPago1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        lblCambiarPago = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblCambiarMail1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(470, 794));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cuenta");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("FACTURACION");

        lblContra.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        lblContra.setForeground(new java.awt.Color(255, 255, 255));
        user = uDao.buscarUsuario(id);

        int x = user.getContrasena().length();
        String busqueda = "";
        for(int i = 0; i < x; i++){
            busqueda = busqueda + "*";
        }

        lblContra.setText(busqueda);

        lblMail.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        lblMail.setForeground(new java.awt.Color(255, 255, 255));
        user = uDao.buscarUsuario(id);

        lblMail.setText(user.getMail());

        lblCambiarMail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCambiarMail.setForeground(new java.awt.Color(0, 128, 255));
        lblCambiarMail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCambiarMail.setText("Cambiar email de cuenta");
        lblCambiarMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCambiarMailMouseClicked(evt);
            }
        });

        lblCambiarContra.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCambiarContra.setForeground(new java.awt.Color(0, 128, 255));
        lblCambiarContra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCambiarContra.setText("Cambiar contraseña");
        lblCambiarContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCambiarContraMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("MEMBRESÍA");

        lblNumTarjeta.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        lblNumTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        tar = tDao.buscarTarjeta(user.getIdTarjeta());

        lblNumTarjeta.setText("**** **** **** " + tar.getNumTarjeta().toString().substring(12));

        lblCambiarPago1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCambiarPago1.setForeground(new java.awt.Color(0, 128, 255));
        lblCambiarPago1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCambiarPago1.setText("Actualizar informacion de pago");
        lblCambiarPago1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCambiarPago1MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("INFORMACION DEL PLAN");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        lblCambiarPago.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblCambiarPago.setForeground(new java.awt.Color(0, 128, 255));
        lblCambiarPago.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCambiarPago.setText("Cambiar Plan");
        lblCambiarPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCambiarPagoMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("MI PERFIL");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        lblCambiarMail1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblCambiarMail1.setForeground(new java.awt.Color(0, 128, 255));
        lblCambiarMail1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCambiarMail1.setText("Administrar Perfiles");
        lblCambiarMail1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCambiarMail1MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cancelar Membresia");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCambiarPago))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(221, 221, 221))
                            .addComponent(jSeparator2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblContra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblCambiarPago1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblCambiarMail)
                                                .addComponent(lblCambiarContra, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCambiarMail1)))
                        .addGap(10, 10, 10))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblContra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCambiarMail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCambiarContra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCambiarPago1))
                .addGap(16, 16, 16)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCambiarPago, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCambiarMail1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setText(tPlan.conexionNombre(user.getTipoPlan()));
        jLabel7.setIcon(new ImageIcon(Imagenes.reducido50 + "//" + perfil.getFoto() + ".png"));
        jLabel7.setText(pDao.obtenerPerfil(id, selPer).getNombre());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblCambiarMailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCambiarMailMouseClicked
        CambiarMail cMail = new CambiarMail();
        Peliculas1.jScrollPaneChico.setViewportView(cMail);
        Conexion.cerrarConexion(Conexion.contarConexiones());
    }//GEN-LAST:event_lblCambiarMailMouseClicked

    private void lblCambiarContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCambiarContraMouseClicked
        CambiarContra cContra = new CambiarContra();
        Peliculas1.jScrollPaneChico.setViewportView(cContra);
        Conexion.cerrarConexion(Conexion.contarConexiones());
    }//GEN-LAST:event_lblCambiarContraMouseClicked

    private void lblCambiarPago1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCambiarPago1MouseClicked
        CambioTarjeta cTar = new CambioTarjeta();
        Peliculas1.jScrollPaneChico.setViewportView(cTar);
        Conexion.cerrarConexion(Conexion.contarConexiones());
    }//GEN-LAST:event_lblCambiarPago1MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        Peliculas1.z = 1;
        Peliculas1.jScrollPaneChico.setEnabled(true);
        Peliculas1.pnlMuestraPeli.setVisible(false);
        Peliculas1.jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        Conexion.cerrarConexion(Conexion.contarConexiones());
    }//GEN-LAST:event_jLabel9MouseClicked

    private void lblCambiarPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCambiarPagoMouseClicked
        CambioPlan cPlan = new CambioPlan();
        Peliculas1.jScrollPaneChico.setViewportView(cPlan);
        Conexion.cerrarConexion(Conexion.contarConexiones());
    }//GEN-LAST:event_lblCambiarPagoMouseClicked

    private void lblCambiarMail1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCambiarMail1MouseClicked
        sel = 1;
        SeleccionPerfil sel = new SeleccionPerfil(id);
        CambiarPanel cambio = new CambiarPanel(sel);
    }//GEN-LAST:event_lblCambiarMail1MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        DarDeBaja baja = new DarDeBaja();
        Peliculas1.jScrollPaneChico.setViewportView(baja);
        Conexion.cerrarConexion(Conexion.contarConexiones());
    }//GEN-LAST:event_jPanel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblCambiarContra;
    private javax.swing.JLabel lblCambiarMail;
    private javax.swing.JLabel lblCambiarMail1;
    private javax.swing.JLabel lblCambiarPago;
    private javax.swing.JLabel lblCambiarPago1;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNumTarjeta;
    // End of variables declaration//GEN-END:variables
}
