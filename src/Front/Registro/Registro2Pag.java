package Front.Registro;

import java.awt.BorderLayout;
import Back.ITipoPlanDAO;
import Back.TipoPlanDAO;
import Front.CambiarPanel;
import Front.InicioSesion.InicioSesion1;
import java.awt.event.MouseEvent;
import static Front.Netflix.panelPrincipal1;

public class Registro2Pag extends javax.swing.JPanel {

    private MouseEvent evt;

    public Registro2Pag() {
        initComponents();
        if (i == 1) {
            panelBasicoMouseClicked(evt);
        } else {
            if (i == 2) {
                panelEstandarMouseClicked(evt);
            } else {
                panelPremiumMouseClicked(evt);
            }
        }
    }

    public static int i = 1;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelBasico = new javax.swing.JPanel();
        lblBasico = new javax.swing.JLabel();
        panelEstandar = new javax.swing.JPanel();
        lblEstandar = new javax.swing.JLabel();
        panelPremium = new javax.swing.JPanel();
        lblPremium = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblPrecio1 = new javax.swing.JLabel();
        lblPrecio2 = new javax.swing.JLabel();
        lblPrecio3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblHDEstandar = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblHDPremium = new javax.swing.JLabel();
        lblHDBasico = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblUHDBasico = new javax.swing.JLabel();
        lblUHDEstandar = new javax.swing.JLabel();
        lblUHDPremium = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblCantPantBasico = new javax.swing.JLabel();
        lblCantPantEstandar = new javax.swing.JLabel();
        lblCantPantPremium = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        lblVistaBasico = new javax.swing.JLabel();
        lblVistaEstandar = new javax.swing.JLabel();
        lblVistaPremium = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        lblPeliculasBasico = new javax.swing.JLabel();
        lblPeliculasEstandar = new javax.swing.JLabel();
        lblPeliculasPremium = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        lblCancelaPremium = new javax.swing.JLabel();
        lblCancelaEstandar = new javax.swing.JLabel();
        lblCancelaBasico = new javax.swing.JLabel();
        lblComent1 = new javax.swing.JLabel();
        lblComent2 = new javax.swing.JLabel();
        panelContinuar = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel4.setText("PASO 1 DE 3");

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Untitled-2.png")); // NOI18N

        jToolBar1.setRollover(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Logo_Netflix_opt.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Iniciar Sesión");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 618, Short.MAX_VALUE)
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

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel5.setText("PASO 1 DE 3");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Selecciona el plan ideal para ti");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cambia a un plan inferior o superior en cualquier momento");

        panelBasico.setBackground(new java.awt.Color(255, 0, 0));
        panelBasico.setEnabled(false);
        panelBasico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBasicoMouseClicked(evt);
            }
        });

        lblBasico.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblBasico.setForeground(new java.awt.Color(255, 255, 255));
        lblBasico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBasico.setText("Básico");

        javax.swing.GroupLayout panelBasicoLayout = new javax.swing.GroupLayout(panelBasico);
        panelBasico.setLayout(panelBasicoLayout);
        panelBasicoLayout.setHorizontalGroup(
            panelBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBasico, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        panelBasicoLayout.setVerticalGroup(
            panelBasicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBasico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        panelEstandar.setBackground(new java.awt.Color(255, 0, 0));
        panelEstandar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEstandarMouseClicked(evt);
            }
        });

        lblEstandar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblEstandar.setForeground(new java.awt.Color(255, 255, 255));
        lblEstandar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstandar.setText("Éstandar");

        javax.swing.GroupLayout panelEstandarLayout = new javax.swing.GroupLayout(panelEstandar);
        panelEstandar.setLayout(panelEstandarLayout);
        panelEstandarLayout.setHorizontalGroup(
            panelEstandarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEstandar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelEstandarLayout.setVerticalGroup(
            panelEstandarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEstandar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );

        panelPremium.setBackground(new java.awt.Color(255, 0, 0));
        panelPremium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPremiumMouseClicked(evt);
            }
        });

        lblPremium.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblPremium.setForeground(new java.awt.Color(255, 255, 255));
        lblPremium.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPremium.setText("Premium");

        javax.swing.GroupLayout panelPremiumLayout = new javax.swing.GroupLayout(panelPremium);
        panelPremium.setLayout(panelPremiumLayout);
        panelPremiumLayout.setHorizontalGroup(
            panelPremiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPremium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelPremiumLayout.setVerticalGroup(
            panelPremiumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPremium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Precio mensual (sin impuestos)");

        ITipoPlanDAO tPDAO = new TipoPlanDAO();
        lblPrecio1.setText(tPDAO.conexionPrecio(1));
        lblPrecio1.setForeground(new java.awt.Color(255, 0, 0));
        lblPrecio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblPrecio2.setText(tPDAO.conexionPrecio(2));
        lblPrecio2.setForeground(new java.awt.Color(255, 0, 0));
        lblPrecio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblPrecio3.setText(tPDAO.conexionPrecio(3));
        lblPrecio3.setForeground(new java.awt.Color(255, 0, 0));
        lblPrecio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("HD Disponible");

        lblHDEstandar.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Untitled-1_opt.png")); // NOI18N

        lblHDPremium.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Untitled-1_opt.png")); // NOI18N

        lblHDBasico.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Untitled-2.png")); // NOI18N

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Ultra HD Disponible");

        lblUHDBasico.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Untitled-2.png")); // NOI18N

        lblUHDEstandar.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Untitled-2.png")); // NOI18N

        lblUHDPremium.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Untitled-1_opt.png")); // NOI18N

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel17.setText("Pantallas en las que puedes ver al mismo");

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel18.setText("tiempo");

        lblCantPantBasico.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblCantPantBasico.setForeground(new java.awt.Color(255, 0, 0));
        lblCantPantBasico.setText("1");

        lblCantPantEstandar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblCantPantEstandar.setForeground(new java.awt.Color(255, 0, 0));
        lblCantPantEstandar.setText("2");

        lblCantPantPremium.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblCantPantPremium.setForeground(new java.awt.Color(255, 0, 0));
        lblCantPantPremium.setText("4");

        jLabel22.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel22.setText("Ve en tu laptop, TV, teléfono y tablet");

        lblVistaBasico.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Untitled-1_opt.png")); // NOI18N

        lblVistaEstandar.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Untitled-1_opt.png")); // NOI18N

        lblVistaPremium.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Untitled-1_opt.png")); // NOI18N

        jLabel26.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel26.setText("Películas y programas ilimitados");

        lblPeliculasBasico.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Untitled-1_opt.png")); // NOI18N

        lblPeliculasEstandar.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Untitled-1_opt.png")); // NOI18N

        lblPeliculasPremium.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Untitled-1_opt.png")); // NOI18N

        jLabel30.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel30.setText("Cancela en cualquier momento");

        lblCancelaPremium.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Untitled-1_opt.png")); // NOI18N

        lblCancelaEstandar.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Untitled-1_opt.png")); // NOI18N

        lblCancelaBasico.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\Untitled-1_opt.png")); // NOI18N

        lblComent1.setText("La disponibilidad del contenido HD y Ultra HD depende de tu proveedor de servicios de internet y del dispositivo en uso.");

        lblComent2.setText("No todo el contenido está disponible en HD o en Ultra HD.");

        panelContinuar.setBackground(new java.awt.Color(255, 0, 0));
        panelContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelContinuarMouseClicked(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("CONTINUAR");

        javax.swing.GroupLayout panelContinuarLayout = new javax.swing.GroupLayout(panelContinuar);
        panelContinuar.setLayout(panelContinuarLayout);
        panelContinuarLayout.setHorizontalGroup(
            panelContinuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContinuarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelContinuarLayout.setVerticalGroup(
            panelContinuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContinuarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(308, 308, 308))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(187, 187, 187)
                            .addComponent(lblUHDBasico)
                            .addGap(131, 131, 131)
                            .addComponent(lblUHDEstandar)
                            .addGap(122, 122, 122)
                            .addComponent(lblUHDPremium))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18)
                                .addComponent(jLabel17))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                            .addComponent(lblCantPantBasico)
                            .addGap(134, 134, 134)
                            .addComponent(lblCantPantEstandar)
                            .addGap(138, 138, 138)
                            .addComponent(lblCantPantPremium)
                            .addGap(40, 40, 40))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(131, 131, 131)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(panelBasico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPrecio2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(panelPremium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPrecio3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHDBasico)
                            .addGap(125, 125, 125)
                            .addComponent(lblHDEstandar)
                            .addGap(114, 114, 114)
                            .addComponent(lblHDPremium)
                            .addGap(31, 31, 31)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel22)
                            .addGap(158, 158, 158)
                            .addComponent(lblVistaBasico)
                            .addGap(114, 114, 114)
                            .addComponent(lblVistaEstandar)
                            .addGap(117, 117, 117)
                            .addComponent(lblVistaPremium))
                        .addComponent(jSeparator4)
                        .addComponent(jSeparator5)
                        .addComponent(lblComent1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel26)
                                .addComponent(jLabel30))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPeliculasBasico)
                                    .addGap(114, 114, 114)
                                    .addComponent(lblPeliculasEstandar)
                                    .addGap(118, 118, 118)
                                    .addComponent(lblPeliculasPremium))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(lblCancelaBasico)
                                    .addGap(112, 112, 112)
                                    .addComponent(lblCancelaEstandar)
                                    .addGap(119, 119, 119)
                                    .addComponent(lblCancelaPremium)))
                            .addGap(28, 28, 28)))
                    .addComponent(lblComent2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(17, 17, 17)
                        .addComponent(panelBasico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrecio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrecio3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblHDEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblHDBasico)
                        .addComponent(lblHDPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(lblUHDBasico, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUHDEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUHDPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCantPantBasico)
                            .addComponent(lblCantPantEstandar)
                            .addComponent(lblCantPantPremium))
                        .addGap(17, 17, 17)))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVistaBasico, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVistaEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVistaPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(lblPeliculasBasico, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeliculasEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeliculasPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCancelaBasico, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCancelaEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCancelaPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(lblComent1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblComent2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(panelContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void panelBasicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBasicoMouseClicked
        panelBasico.setBackground(new java.awt.Color(255, 0, 0));
        lblCancelaBasico.setEnabled(true);
        lblCancelaEstandar.setEnabled(false);
        lblCancelaPremium.setEnabled(false);
        lblCantPantBasico.setEnabled(true);
        lblCantPantEstandar.setEnabled(false);
        lblCantPantPremium.setEnabled(false);
        lblHDBasico.setEnabled(true);
        lblHDEstandar.setEnabled(false);
        lblHDPremium.setEnabled(false);
        lblUHDBasico.setEnabled(true);
        lblUHDEstandar.setEnabled(false);
        lblUHDPremium.setEnabled(false);
        lblPeliculasBasico.setEnabled(true);
        lblPeliculasEstandar.setEnabled(false);
        lblPeliculasPremium.setEnabled(false);
        lblPrecio1.setEnabled(true);
        lblPrecio2.setEnabled(false);
        lblPrecio3.setEnabled(false);
        lblVistaBasico.setEnabled(true);
        lblVistaEstandar.setEnabled(false);
        lblVistaPremium.setEnabled(false);
        panelEstandar.setBackground(new java.awt.Color(204, 0, 51));
        panelPremium.setBackground(new java.awt.Color(204, 0, 51));
        i = 1;
    }//GEN-LAST:event_panelBasicoMouseClicked

    private void panelEstandarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEstandarMouseClicked
        panelEstandar.setBackground(new java.awt.Color(255, 0, 0));
        lblCancelaBasico.setEnabled(false);
        lblCancelaEstandar.setEnabled(true);
        lblCancelaPremium.setEnabled(false);
        lblCantPantBasico.setEnabled(false);
        lblCantPantEstandar.setEnabled(true);
        lblCantPantPremium.setEnabled(false);
        lblHDBasico.setEnabled(false);
        lblHDEstandar.setEnabled(true);
        lblHDPremium.setEnabled(false);
        lblUHDBasico.setEnabled(false);
        lblUHDEstandar.setEnabled(true);
        lblUHDPremium.setEnabled(false);
        lblPeliculasBasico.setEnabled(false);
        lblPeliculasEstandar.setEnabled(true);
        lblPeliculasPremium.setEnabled(false);
        lblPrecio1.setEnabled(false);
        lblPrecio2.setEnabled(true);
        lblPrecio3.setEnabled(false);
        lblVistaBasico.setEnabled(false);
        lblVistaEstandar.setEnabled(true);
        lblVistaPremium.setEnabled(false);
        panelBasico.setBackground(new java.awt.Color(204, 0, 51));
        panelPremium.setBackground(new java.awt.Color(204, 0, 51));
        i = 2;
    }//GEN-LAST:event_panelEstandarMouseClicked

    private void panelPremiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPremiumMouseClicked
        panelPremium.setBackground(new java.awt.Color(255, 0, 0));
        lblCancelaBasico.setEnabled(false);
        lblCancelaEstandar.setEnabled(false);
        lblCancelaPremium.setEnabled(true);
        lblCantPantBasico.setEnabled(false);
        lblCantPantEstandar.setEnabled(false);
        lblCantPantPremium.setEnabled(true);
        lblHDBasico.setEnabled(false);
        lblHDEstandar.setEnabled(false);
        lblHDPremium.setEnabled(true);
        lblUHDBasico.setEnabled(false);
        lblUHDEstandar.setEnabled(false);
        lblUHDPremium.setEnabled(true);
        lblPeliculasBasico.setEnabled(false);
        lblPeliculasEstandar.setEnabled(false);
        lblPeliculasPremium.setEnabled(true);
        lblPrecio1.setEnabled(false);
        lblPrecio2.setEnabled(false);
        lblPrecio3.setEnabled(true);
        lblVistaBasico.setEnabled(false);
        lblVistaEstandar.setEnabled(false);
        lblVistaPremium.setEnabled(true);
        panelBasico.setBackground(new java.awt.Color(204, 0, 51));
        panelEstandar.setBackground(new java.awt.Color(204, 0, 51));
        i = 3;
    }//GEN-LAST:event_panelPremiumMouseClicked

    private void panelContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContinuarMouseClicked
        Registro6Pag pag6 = new Registro6Pag();
        if (pag6.plan == 1) {
            Registro6Pag.cambio = 1;
            CambiarPanel cambiar = new CambiarPanel(pag6);
        } else {
            Registro3Pag pag3 = new Registro3Pag();
            CambiarPanel cambiar = new CambiarPanel(pag3);
        }

    }//GEN-LAST:event_panelContinuarMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        InicioSesion1 ini = new InicioSesion1();
            CambiarPanel cambio = new CambiarPanel(ini);
    }//GEN-LAST:event_jLabel2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblBasico;
    private javax.swing.JLabel lblCancelaBasico;
    private javax.swing.JLabel lblCancelaEstandar;
    private javax.swing.JLabel lblCancelaPremium;
    private javax.swing.JLabel lblCantPantBasico;
    private javax.swing.JLabel lblCantPantEstandar;
    private javax.swing.JLabel lblCantPantPremium;
    private javax.swing.JLabel lblComent1;
    private javax.swing.JLabel lblComent2;
    private javax.swing.JLabel lblEstandar;
    private javax.swing.JLabel lblHDBasico;
    private javax.swing.JLabel lblHDEstandar;
    private javax.swing.JLabel lblHDPremium;
    private javax.swing.JLabel lblPeliculasBasico;
    private javax.swing.JLabel lblPeliculasEstandar;
    private javax.swing.JLabel lblPeliculasPremium;
    private javax.swing.JLabel lblPrecio1;
    private javax.swing.JLabel lblPrecio2;
    private javax.swing.JLabel lblPrecio3;
    private javax.swing.JLabel lblPremium;
    private javax.swing.JLabel lblUHDBasico;
    private javax.swing.JLabel lblUHDEstandar;
    private javax.swing.JLabel lblUHDPremium;
    private javax.swing.JLabel lblVistaBasico;
    private javax.swing.JLabel lblVistaEstandar;
    private javax.swing.JLabel lblVistaPremium;
    private javax.swing.JPanel panelBasico;
    private javax.swing.JPanel panelContinuar;
    private javax.swing.JPanel panelEstandar;
    private javax.swing.JPanel panelPremium;
    // End of variables declaration//GEN-END:variables

}
