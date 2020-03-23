package Front.Registro;

import Back.Fecha;
import Back.FechaDAO;
import Back.IFechaDAO;
import Back.ITarjetaDAO;
import Back.ITipoPlanDAO;
import Back.IUsuarioDAO;
import Back.Tarjeta;
import Back.TarjetaDAO;
import Back.TipoPlanDAO;
import Back.Usuario;
import Back.UsuarioDAO;
import Front.CambiarPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Calendar;
import static Front.Netflix.panelPrincipal1;

public class Registro6Pag extends javax.swing.JPanel {

    public Registro6Pag() {
        initComponents();
    }

    static int verDisp = 0;
    ITarjetaDAO tDao = new TarjetaDAO();
    IUsuarioDAO uDao = new UsuarioDAO();
    IFechaDAO fDao = new FechaDAO();
    int tipPlan = Registro2Pag.i;
    public static int cambio;
    Registro4Pag reg4 = new Registro4Pag();
    String mail = reg4.mail;
    String contrasena = reg4.contrasena;

    static String nombre = "Nombre";
    static String apellido = "Apellido";
    static String numTarjeta = "Numero de tarjeta";
    static String codSeguridad = "Código de seguridad(CVV)";
    static Integer mes;
    static Integer anio;
    static int plan = 0;
    int a, b, c, d;
    Calendar cal = Calendar.getInstance();
    Integer yA = cal.get(Calendar.YEAR);


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNumTarjeta = new javax.swing.JTextField();
        txtCodSeguridad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblNTarjeta = new javax.swing.JLabel();
        lblCodSeguridad = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("PASO 3 DE 3");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Logo_Netflix_opt.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Cerrar Sesión");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Configura tu tarjeta de crédito o débito.");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\visa.png")); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\mastercard.png")); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\amex.png")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\icon_AR_naranja_rect.png")); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\icon_AR_cabal.png")); // NOI18N

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        if(plan == 0 && nombre.equals("Nombre"))
        txtNombre.setText(nombre);
        if(plan == 1)
        {
            txtNombre.setText(nombre);
            txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        }
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        txtApellido.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(204, 204, 204));
        if(plan == 0 && apellido.equals("Apellido"))
        txtApellido.setText(apellido);
        if(plan == 1)
        {
            txtApellido.setText(apellido);
            txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        }
        txtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidoFocusLost(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
        });

        txtNumTarjeta.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNumTarjeta.setForeground(new java.awt.Color(204, 204, 204));
        if(plan == 1)
        {
            txtNumTarjeta.setText(numTarjeta);
            txtNumTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        }
        if(plan == 0 && numTarjeta.equals("Numero de tarjeta"))
        txtNumTarjeta.setText(numTarjeta);
        txtNumTarjeta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumTarjetaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumTarjetaFocusLost(evt);
            }
        });
        txtNumTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumTarjetaKeyReleased(evt);
            }
        });

        txtCodSeguridad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtCodSeguridad.setText(codSeguridad);
        txtCodSeguridad.setForeground(new java.awt.Color(204, 204, 204));
        if(plan == 1)
        {
            txtCodSeguridad.setText(codSeguridad);
            txtCodSeguridad.setForeground(new java.awt.Color(0, 0, 0));

        }
        txtCodSeguridad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodSeguridadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodSeguridadFocusLost(evt);
            }
        });
        txtCodSeguridad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodSeguridadKeyReleased(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Terminos de registro.png")); // NOI18N

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(115, 115, 115));
        jLabel11.setText("TU PLAN");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Cambiar");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        ITipoPlanDAO tPDao = new TipoPlanDAO();
        jLabel13.setText(tPDao.conexionNombre(tipPlan));

        jLabel14.setText("por " + tPDao.conexionPrecio(tipPlan) );

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Finalizar Registro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblApellido.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N

        lblNombre.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N

        lblNTarjeta.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N

        lblCodSeguridad.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N

        lblFecha.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04","05", "06", "07", "08","09", "10", "11", "12" }));

        Calendar c = Calendar.getInstance();
        Integer yA = c.get(Calendar.YEAR);
        Integer y = c.get(Calendar.YEAR);
        Integer m = c.get(Calendar.MONTH);
        for(int i = 0; i < 25; i++){
            jComboBox2.addItem(y.toString());
            y++;
        }

        if(plan == 1){
            jComboBox2.setSelectedIndex(anio - yA);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre)
                    .addComponent(txtApellido)
                    .addComponent(txtNumTarjeta)
                    .addComponent(txtCodSeguridad)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(lblCodSeguridad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(lblApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNTarjeta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel14)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        if(plan == 1){
            jComboBox1.setSelectedIndex(mes - 1);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked

        Tarjeta tar = new Tarjeta();
        Fecha f = new Fecha();
        Usuario user = new Usuario();
        tar.setApeTitular(apellido);
        tar.setNomTitular(nombre);
        tar.setNumTarjeta(Long.parseLong(numTarjeta));
        tar.setCodSeguridad(Integer.parseInt(codSeguridad));
        f.setAnio(jComboBox2.getSelectedIndex() + yA);
        f.setMes(jComboBox1.getSelectedIndex() + 1);
        tar.setFecVenc(f);
        user.setContrasena(contrasena);
        user.setMail(mail);
        user.setTipoPlan(tipPlan);
        if (tDao.registrarTarjeta(tar)) {
            user.setIdTarjeta(tDao.buscarIdTarjeta(tar.getNumTarjeta()));
            boolean v = uDao.registrarUsuario(user);
            if (v) {
                Registro7Pag pag7 = new Registro7Pag();
                CambiarPanel cambio = new CambiarPanel(pag7);
            }
        } else {
            lblNTarjeta.setText("Este numero de tarjeta ya fue utilizado");

        }

    }//GEN-LAST:event_jPanel2MouseClicked

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        if (a == 0 && plan == 0) {
            nombre = "";
        }
        txtNombre.setText(nombre);
        txtNombre.setForeground(Color.BLACK);
        a = 1;
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        if (txtNombre.getText().equals("")) {
            txtNombre.setText("Nombre");
            txtNombre.setForeground(new Color(204, 204, 204));
            a = 0;
        } else {
            nombre = txtNombre.getText();
        }
        verificarNombre(nombre);

    }//GEN-LAST:event_txtNombreFocusLost

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        verificarNombre(nombre);
        nombre = txtNombre.getText();
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusGained
        if (b == 0 && plan == 0) {
            apellido = "";
        }
        txtApellido.setText(apellido);
        txtApellido.setForeground(Color.BLACK);
        b = 1;
    }//GEN-LAST:event_txtApellidoFocusGained

    private void txtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusLost
        if (txtApellido.getText().equals("")) {
            txtApellido.setText("Apellido");
            txtApellido.setForeground(new Color(204, 204, 204));
            b = 0;
        } else {
            apellido = txtApellido.getText();
        }
        verificarApellido(apellido);

    }//GEN-LAST:event_txtApellidoFocusLost

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        verificarApellido(apellido);
        apellido = txtApellido.getText();
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void txtNumTarjetaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumTarjetaFocusGained
        if (c == 0 && plan == 0) {
            numTarjeta = "";
        }
        txtNumTarjeta.setText(numTarjeta);
        txtNumTarjeta.setForeground(Color.BLACK);
        c = 1;
    }//GEN-LAST:event_txtNumTarjetaFocusGained

    private void txtNumTarjetaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumTarjetaFocusLost
        numTarjeta = txtNumTarjeta.getText();
        if (numTarjeta.length() == 0) {
            txtNumTarjeta.setText("Numero de tarjeta");
            txtNumTarjeta.setForeground(new Color(204, 204, 204));
            lblNTarjeta.setText("El numero de tarjeta es obligatorio");
            c = 0;
        }
        verificarNumTarjetaMomento(Long.parseLong(txtNumTarjeta.getText()));
    }//GEN-LAST:event_txtNumTarjetaFocusLost

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

    private void txtCodSeguridadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodSeguridadFocusGained
        if (d == 0 && plan == 0) {
            codSeguridad = "";
        }
        txtCodSeguridad.setText(codSeguridad);
        txtCodSeguridad.setForeground(Color.BLACK);
        d = 1;
    }//GEN-LAST:event_txtCodSeguridadFocusGained

    private void txtCodSeguridadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodSeguridadFocusLost
        codSeguridad = txtCodSeguridad.getText();
        if (codSeguridad.length() == 0) {
            lblCodSeguridad.setText("El código de seguridad (CVV) es obligatorio.");
            txtCodSeguridad.setText("Código de seguridad(CVV)");
            txtCodSeguridad.setForeground(new Color(204, 204, 204));
            d = 0;
        }
        verificarCodSeguridadMomento(Integer.parseInt(txtCodSeguridad.getText()));
    }//GEN-LAST:event_txtCodSeguridadFocusLost

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        Registro2Pag pag2 = new Registro2Pag();
        CambiarPanel cambio = new CambiarPanel(pag2);
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        numTarjeta = txtNumTarjeta.getText();
        codSeguridad = txtCodSeguridad.getText();
        mes = jComboBox1.getSelectedIndex() + 1;
        anio = jComboBox2.getSelectedIndex() + yA;
        plan = 1;
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        CerrarSesion cerr = new CerrarSesion();
        CambiarPanel cambio = new CambiarPanel(cerr);
    }//GEN-LAST:event_jLabel2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCodSeguridad;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNTarjeta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodSeguridad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumTarjeta;
    // End of variables declaration//GEN-END:variables

    private void verificarNombre(String nombre) {
        if (txtNombre.getText().length() == 0) {
            lblNombre.setText("El nombre es obligatorio");
        } else {
            lblNombre.setText("");
        }
    }

    private void verificarApellido(String apellido) {
        if (txtApellido.getText().length() == 0) {
            lblApellido.setText("El apellido es obligatorio");
        } else {
            lblApellido.setText("");
        }
    }

    private void verificarNumTarjetaMomento(Long numTarjeta) {
        if (tDao.verificarNumTarjeta(numTarjeta)) {
            lblNTarjeta.setText("");
        } else {
            lblNTarjeta.setText("Ingrese un numero de tarjeta de credito valido");
        }

    }

    private void verificarCodSeguridadMomento(int codSeguridad) {
        if (tDao.verificarCodSeguridad(codSeguridad)) {
            lblCodSeguridad.setText("");
        } else {
            lblCodSeguridad.setText("Ingrese un CVV valido");
        }
    }

}
