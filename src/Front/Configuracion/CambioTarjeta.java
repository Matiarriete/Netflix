package Front.Configuracion;

import Back.Conexion;
import Back.Fecha;
import Back.FechaDAO;
import Back.IFechaDAO;
import Back.ITarjetaDAO;
import Back.IUsuarioDAO;
import Back.Tarjeta;
import Back.TarjetaDAO;
import Back.Usuario;
import Back.UsuarioDAO;
import Front.InicioSesion.SeleccionPerfil;
import Front.Registro.Registro2Pag;
import Front.Registro.Registro4Pag;
import java.awt.Color;
import java.util.Calendar;
import javax.swing.JOptionPane;
import static Front.Peliculas.Peliculas1.jScrollPaneChico;

public class CambioTarjeta extends javax.swing.JPanel {

    public CambioTarjeta() {
        initComponents();
    }

    ITarjetaDAO tDao = new TarjetaDAO();
    IFechaDAO fDao = new FechaDAO();
    Usuario usuario = new Usuario();
    IUsuarioDAO uDao = new UsuarioDAO();
    static int id = SeleccionPerfil.idUsuario();
    Tarjeta tar = new Tarjeta();
    Fecha fecVenc;

    String nombre;
    String apellido;
    String numTarjeta;
    String codSeguridad;
    Integer mes;
    Integer anio;
    int plan = 0;
    Calendar ca = Calendar.getInstance();
    Integer yA = ca.get(Calendar.YEAR);
    int a, b, c, d;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario = uDao.buscarUsuario(id);
        tar = tDao.buscarTarjeta(usuario.getIdTarjeta());
        nombre = tar.getNomTitular();
        apellido = tar.getApeTitular();
        numTarjeta = tar.getNumTarjeta().toString();
        codSeguridad = tar.getCodSeguridad().toString();
        mes = tar.getFecVenc().getMes();
        anio = tar.getFecVenc().getAnio();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNumTarjeta = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        txtCodSeguridad = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNTarjeta = new javax.swing.JLabel();
        lblCodSeguridad = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Actualiza tu tarjeta de crédito o débito.");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\visa.png")); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\mastercard.png")); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\amex.png")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\icon_AR_naranja_rect.png")); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\icon_AR_cabal.png")); // NOI18N

        txtNombre.setBackground(new java.awt.Color(0, 0, 0));
        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNombre.setForeground(java.awt.Color.white);
        txtNombre.setText(nombre);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        txtApellido.setBackground(new java.awt.Color(0, 0, 0));
        txtApellido.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtApellido.setForeground(java.awt.Color.white);
        txtApellido.setText(apellido);
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
        });

        txtNumTarjeta.setBackground(new java.awt.Color(0, 0, 0));
        txtNumTarjeta.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNumTarjeta.setForeground(java.awt.Color.white);
        txtNumTarjeta.setText(numTarjeta);
        txtNumTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumTarjetaKeyReleased(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04","05", "06", "07", "08","09", "10", "11", "12" }));
        jComboBox1.setSelectedIndex(mes - 1);

        Calendar c = Calendar.getInstance();
        Integer yA = c.get(Calendar.YEAR);
        Integer y = c.get(Calendar.YEAR);
        Integer m = c.get(Calendar.MONTH);
        for(int i = 0; i < 25; i++){
            jComboBox2.addItem(y.toString());
            y++;
        }
        jComboBox2.setSelectedIndex(anio - yA);
        jComboBox2.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));

        txtCodSeguridad.setBackground(new java.awt.Color(0, 0, 0));
        txtCodSeguridad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtCodSeguridad.setForeground(java.awt.Color.white);
        txtCodSeguridad.setText(codSeguridad);
        txtCodSeguridad.setForeground(new java.awt.Color(255, 255, 255));
        txtCodSeguridad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodSeguridadKeyReleased(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(176, 5, 0));
        lblNombre.setText(" ");

        lblApellido.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(176, 5, 0));
        lblApellido.setText(" ");

        lblNTarjeta.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblNTarjeta.setForeground(new java.awt.Color(176, 5, 0));
        lblNTarjeta.setText(" ");

        lblCodSeguridad.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblCodSeguridad.setForeground(new java.awt.Color(176, 5, 0));
        lblCodSeguridad.setText(" ");

        jPanel2.setBackground(new java.awt.Color(0, 128, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Guardar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cancelar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(176, 5, 0));
        jLabel1.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNumTarjeta, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCodSeguridad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(lblNTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 95, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre)
                .addGap(6, 6, 6)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblApellido)
                .addGap(6, 6, 6)
                .addComponent(txtNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNTarjeta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(txtCodSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCodSeguridad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        verificarNombre(nombre);
        nombre = txtNombre.getText();
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        verificarApellido(apellido);
        apellido = txtApellido.getText();
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void txtNumTarjetaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumTarjetaKeyReleased
        try {
            verificarNumTarjetaMomento(Long.parseLong(txtNumTarjeta.getText()));
            numTarjeta = txtNumTarjeta.getText();
        } catch (NumberFormatException e) {
            lblNTarjeta.setText("Ingrese un numero de tarjeta de credito valido");
        }
    }//GEN-LAST:event_txtNumTarjetaKeyReleased

    private void txtCodSeguridadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodSeguridadKeyReleased
        try {
            verificarCodSeguridadMomento(Integer.parseInt(txtCodSeguridad.getText()));
            codSeguridad = txtCodSeguridad.getText();
        } catch (NumberFormatException e) {
            lblCodSeguridad.setText("Ingrese un CVV valido");
        }
    }//GEN-LAST:event_txtCodSeguridadKeyReleased

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        Integer idTarjeta = tar.getIdTarjeta();
        tar = new Tarjeta();
        tar.setApeTitular(apellido);
        tar.setNomTitular(nombre);
        tar.setNumTarjeta(Long.parseLong(txtNumTarjeta.getText()));
        tar.setCodSeguridad(Integer.parseInt(txtCodSeguridad.getText()));
        tar.setIdTarjeta(idTarjeta);
        fecVenc = new Fecha();
        fecVenc.setAnio(jComboBox2.getSelectedIndex() + yA);
        fecVenc.setMes(jComboBox1.getSelectedIndex() + 1);
        tar.setFecVenc(fecVenc);

        if (tDao.modificarTarjeta(tar)) {
            System.out.println("Front.Configuracion.CambioTarjeta.jPanel2MouseClicked()");
            System.out.println(tar.toString());
            Configuracio conf = new Configuracio();
            jScrollPaneChico.setViewportView(conf);
        } else {
            jLabel1.setText("Revise los datos");
        }
        
        Conexion.cerrarConexion(Conexion.contarConexiones());
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        Configuracio conf = new Configuracio();
        jScrollPaneChico.setViewportView(conf);
        Conexion.cerrarConexion(Conexion.contarConexiones());
    }//GEN-LAST:event_jPanel3MouseClicked

    private void verificarNombre(String nombre) {
        if (txtNombre.getText().length() == 0) {
            lblNombre.setText("El nombre es obligatorio");
        } else {
            lblNombre.setText(" ");
        }
    }

    private void verificarApellido(String apellido) {
        if (txtApellido.getText().length() == 0) {
            lblApellido.setText("El apellido es obligatorio");
        } else {
            lblApellido.setText(" ");
        }
    }

    private void verificarNumTarjetaMomento(Long numTarjeta) {
        if (tDao.verificarNumTarjeta(numTarjeta)) {
            lblNTarjeta.setText(" ");
        } else {
            lblNTarjeta.setText("Ingrese un numero de tarjeta de credito valido");
        }

    }

    private void verificarCodSeguridadMomento(int codSeguridad) {
        if (tDao.verificarCodSeguridad(codSeguridad)) {
            lblCodSeguridad.setText(" ");
        } else {
            lblCodSeguridad.setText("Ingrese un CVV valido");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCodSeguridad;
    private javax.swing.JLabel lblNTarjeta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodSeguridad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumTarjeta;
    // End of variables declaration//GEN-END:variables
}
