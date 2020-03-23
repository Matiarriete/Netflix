package Front.InicioSesion;

import Back.Conexion;
import Back.IUsuarioDAO;
import Back.Usuario;
import Back.UsuarioDAO;
import Front.CambiarPanel;
import static Front.Netflix.panelPrincipal1;
import Front.Registro.Registro1Pag;
import Front.Registro.Registro7Pag;
import Front.Registro.Registro9Pag;
import java.awt.BorderLayout;
import java.awt.Color;

public class InicioSesion1 extends javax.swing.JPanel {

    public InicioSesion1() {

        initComponents();

    }

    IUsuarioDAO uDao = new UsuarioDAO();
    Usuario user = new Usuario();
    Usuario usuarioParaRec = new Usuario();
    String mail;
    String contrasena;
    public static int id;
    public static int o = 0; // Para ver en donde quedo el registro
    int j = 0; // Para ver cuando esta apretado el btnMostrar
    int k = 0; // Ver si esta dentro de txtContrasena para poder apretar btnMostrar
    int m = 0; // variable para buscar recuerdame
    int n = 0; // Variable para ver si el check esta activado o no

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInicio = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        lblAdvertencia = new javax.swing.JLabel();
        lblAyuda = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        txtMail = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(null);

        lblInicio.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblInicio.setText("Inicia sesión");
        lblInicio.requestFocus();
        add(lblInicio);
        lblInicio.setBounds(320, 160, 270, 30);

        jPanel1.requestFocus();
        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Iniciar sesión");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1);
        jPanel1.setBounds(320, 320, 280, 40);

        jCheckBox1.setBackground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(153, 153, 153));
        jCheckBox1.setText("Recuerdame");
        jCheckBox1.setToolTipText("");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        add(jCheckBox1);
        jCheckBox1.setBounds(320, 370, 90, 23);

        lblAdvertencia.setBackground(new java.awt.Color(0, 0, 0));
        lblAdvertencia.setVisible(false);
        lblAdvertencia.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lblAdvertencia.setForeground(new java.awt.Color(232, 124, 3));
        lblAdvertencia.setText("El usuario o contraseña son incorrectos");
        add(lblAdvertencia);
        lblAdvertencia.setBounds(320, 290, 280, 16);

        lblAyuda.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        lblAyuda.setForeground(new java.awt.Color(153, 153, 153));
        lblAyuda.setText("¿ Necesitas ayuda ?");
        add(lblAyuda);
        lblAyuda.setBounds(504, 370, 100, 20);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("¿Primera vez en Netflix?");
        add(jLabel5);
        jLabel5.setBounds(320, 550, 140, 14);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Suscribite ya");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        add(jLabel6);
        jLabel6.setBounds(460, 550, 90, 14);

        txtContrasena.setBackground(new java.awt.Color(51, 51, 51));
        txtContrasena.setForeground(new java.awt.Color(153, 153, 153));
        txtContrasena.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtContrasena.setEchoChar((char)0);
        txtContrasena.setText("Contraseña");
        txtContrasena.setBorder(null);
        txtContrasena.setCaretColor(new java.awt.Color(255, 255, 255));
        txtContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContrasenaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContrasenaFocusLost(evt);
            }
        });
        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyReleased(evt);
            }
        });
        add(txtContrasena);
        txtContrasena.setBounds(320, 250, 280, 30);

        txtMail.setBackground(new java.awt.Color(51, 51, 51));
        txtMail.setText(mail);
        verificarExistRec();
        txtMail.setCaretColor(Color.WHITE);
        txtMail.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtMail.setForeground(new java.awt.Color(153, 153, 153));
        txtMail.setBorder(null);
        txtMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMailFocusLost(evt);
            }
        });
        txtMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMailMouseClicked(evt);
            }
        });
        txtMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMailKeyReleased(evt);
            }
        });
        add(txtMail);
        txtMail.setBounds(320, 210, 280, 30);

        lblFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\FondoConPanelpng.png")); // NOI18N
        add(lblFondo);
        lblFondo.setBounds(0, 0, 900, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Registro1Pag registro = new Registro1Pag();
        registro.setSize(910, 700);
        registro.setLocation(0, 0);
        panelPrincipal1.removeAll();
        panelPrincipal1.add(registro, BorderLayout.CENTER);
        panelPrincipal1.revalidate();
        panelPrincipal1.repaint();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        uDao = new UsuarioDAO();
        user.setContrasena(txtContrasena.getText());
        user.setMail(txtMail.getText());
        id = uDao.obtenerId(user);
        if (uDao.inicioSesion(user)) {
            if (o == 0) {
                SeleccionPerfil perfil = new SeleccionPerfil(id);
                CambiarPanel cambio = new CambiarPanel(perfil);
                Conexion.cerrarConexion(Conexion.contarConexiones());
            } else {
                if (o == 7) {
                    Registro7Pag reg7 = new Registro7Pag();
                    CambiarPanel cambio = new CambiarPanel(reg7);
                } else {
                    Registro9Pag reg9 = new Registro9Pag();
                    CambiarPanel cambio = new CambiarPanel(reg9);
                }
            }
        } else {
            lblAdvertencia.setVisible(true);
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void txtMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMailFocusGained
        txtMail.setText(mail);
        if (jCheckBox1.isSelected()) {
            jCheckBox1.setSelected(false);
        }
    }//GEN-LAST:event_txtMailFocusGained

    private void txtContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusGained
        if (j == 0) {
            txtContrasena.setText(contrasena);
            txtContrasena.setEchoChar('*');
        } else {
            txtContrasena.setText(contrasena);
        }
        k = 1;

        if (jCheckBox1.isSelected()) {
            jCheckBox1.setSelected(false);
        }

    }//GEN-LAST:event_txtContrasenaFocusGained

    private void txtMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMailFocusLost
        mail = txtMail.getText();
        if (mail.length() == 0) {
            txtMail.setText("Mail");
        }
        verificarExistRec();
    }//GEN-LAST:event_txtMailFocusLost

    private void txtContrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContrasenaFocusLost
        contrasena = txtContrasena.getText();
        if (contrasena.length() == 0) {
            txtContrasena.setText("Contrasena");
            txtContrasena.setEchoChar((char) 0);
        }
        k = 0;
    }//GEN-LAST:event_txtContrasenaFocusLost

    private void txtMailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMailMouseClicked
        txtMail.setFocusable(true);
    }//GEN-LAST:event_txtMailMouseClicked

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        if (usuarioParaRec.getMail() != null || txtMail.getText().equals("Mail")) {
            txtMail.setText("Mail");
            txtContrasena.setText("Contrasena");
            txtMail.setEnabled(true);
            txtContrasena.setEnabled(true);
            txtContrasena.setEchoChar((char) 0);
            mail = "";
            contrasena = "";
            uDao.eliminarRecuerdame(m);
            usuarioParaRec = new Usuario();
        } else {
            m = uDao.idAgregar(mail);
            usuarioParaRec = uDao.buscarUsuario(m);
            txtMail.setEnabled(false);
            txtContrasena.setEnabled(false);
            uDao.agregarRecuerdame(m);
        }
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void txtContrasenaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyReleased
        contrasena = txtContrasena.getText();
    }//GEN-LAST:event_txtContrasenaKeyReleased

    private void txtMailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMailKeyReleased
        mail = txtMail.getText();
    }//GEN-LAST:event_txtMailKeyReleased

    private void verificarExistRec() {
        m = uDao.buscarRecuerdame();
        if (m != 0) {
            usuarioParaRec = uDao.buscarUsuario(m);
            txtMail.setText(usuarioParaRec.getMail());
            txtContrasena.setText(usuarioParaRec.getContrasena());
            mail = usuarioParaRec.getMail();
            contrasena = usuarioParaRec.getContrasena();
            txtMail.setEnabled(false);
            txtContrasena.setEnabled(false);
            txtContrasena.setEchoChar('*');
            jCheckBox1.setSelected(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdvertencia;
    private javax.swing.JLabel lblAyuda;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtMail;
    // End of variables declaration//GEN-END:variables
}
