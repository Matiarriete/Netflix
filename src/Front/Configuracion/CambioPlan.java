package Front.Configuracion;

import Back.Conexion;
import Back.ITipoPlanDAO;
import Back.IUsuarioDAO;
import Back.TipoPlan;
import Back.TipoPlanDAO;
import Back.Usuario;
import Back.UsuarioDAO;
import Front.InicioSesion.SeleccionPerfil;
import static Front.Peliculas.Peliculas1.jScrollPaneChico;

public class CambioPlan extends javax.swing.JPanel {

    public CambioPlan() {
        initComponents();
        java.awt.event.MouseEvent evt = null;
        if (user.getTipoPlan() == 1) {
            pnlBasicoGrandeMouseClicked(evt);
        } else {
            if (user.getTipoPlan() == 2) {
                pnlEstandarGrandeMouseClicked(evt);
            } else {
                pnlPremiumGrandeMouseClicked(evt);
            }
        }
    }

    int planA = 0;
    TipoPlan tPlan = new TipoPlan();
    ITipoPlanDAO tPDao = new TipoPlanDAO();
    Usuario user = new Usuario();
    IUsuarioDAO uDAO = new UsuarioDAO();
    int seleccion = 0;
    int bloqueo = 0;
    static int id = SeleccionPerfil.idUsuario();


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user = uDAO.buscarUsuario(id);
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlBasicoGrande = new javax.swing.JPanel();
        pnlBasicoChico = new javax.swing.JPanel();
        nomBasico = new javax.swing.JLabel();
        planActual1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlPremiumGrande = new javax.swing.JPanel();
        pnlPreChico = new javax.swing.JPanel();
        planActual3 = new javax.swing.JLabel();
        nomPre = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pnlEstandarGrande = new javax.swing.JPanel();
        pnlEstChico = new javax.swing.JPanel();
        planActual2 = new javax.swing.JLabel();
        nomEst = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        planA = user.getTipoPlan();

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cambia el plan de streaming");

        pnlBasicoGrande.setBackground(new java.awt.Color(30, 30, 30));
        pnlBasicoGrande.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150), 3));
        pnlBasicoGrande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBasicoGrandeMouseClicked(evt);
            }
        });

        pnlBasicoChico.setBackground(new java.awt.Color(15, 15, 15));

        nomBasico.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        nomBasico.setForeground(new java.awt.Color(255, 255, 255));
        nomBasico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomBasico.setText("Basico");

        planActual1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        planActual1.setForeground(new java.awt.Color(255, 255, 255));
        planActual1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        if(planA == 1){
            planActual1.setText("Plan Actual");
        } else {
            planActual1.setText(" ");
        }

        javax.swing.GroupLayout pnlBasicoChicoLayout = new javax.swing.GroupLayout(pnlBasicoChico);
        pnlBasicoChico.setLayout(pnlBasicoChicoLayout);
        pnlBasicoChicoLayout.setHorizontalGroup(
            pnlBasicoChicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBasicoChicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomBasico, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(planActual1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlBasicoChicoLayout.setVerticalGroup(
            pnlBasicoChicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBasicoChicoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(planActual1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomBasico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html>Puedes ver en 1 pantalla a la vez en definición estándar. Descarga videos en 1 teléfono o tableta.<html>");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("$ " + tPDao.conexionPrecio(1) + " al mes (sin impuestos incluidos)");

        javax.swing.GroupLayout pnlBasicoGrandeLayout = new javax.swing.GroupLayout(pnlBasicoGrande);
        pnlBasicoGrande.setLayout(pnlBasicoGrandeLayout);
        pnlBasicoGrandeLayout.setHorizontalGroup(
            pnlBasicoGrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBasicoGrandeLayout.createSequentialGroup()
                .addComponent(pnlBasicoChico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlBasicoGrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        pnlBasicoGrandeLayout.setVerticalGroup(
            pnlBasicoGrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBasicoChico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlBasicoGrandeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPremiumGrande.setBackground(new java.awt.Color(30, 30, 30));
        pnlPremiumGrande.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150), 3));
        pnlPremiumGrande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlPremiumGrandeMouseClicked(evt);
            }
        });

        pnlPreChico.setBackground(new java.awt.Color(15, 15, 15));

        planActual3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        planActual3.setForeground(new java.awt.Color(255, 255, 255));
        planActual3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        if(planA == 3){
            planActual3.setText("Plan Actual");
        } else {
            planActual3.setText(" ");
        }

        nomPre.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        nomPre.setForeground(new java.awt.Color(255, 255, 255));
        nomPre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomPre.setText("Premium");

        javax.swing.GroupLayout pnlPreChicoLayout = new javax.swing.GroupLayout(pnlPreChico);
        pnlPreChico.setLayout(pnlPreChicoLayout);
        pnlPreChicoLayout.setHorizontalGroup(
            pnlPreChicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPreChicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomPre, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(planActual3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlPreChicoLayout.setVerticalGroup(
            pnlPreChicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPreChicoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(planActual3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomPre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("$ " + tPDao.conexionPrecio(3) + " al mes (sin impuestos incluidos)");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("<html>Puedes ver en 4 pantallas a la vez en definición HD y Ultra HD. Descarga videos en 4 teléfonos o tabletas.<html>");

        javax.swing.GroupLayout pnlPremiumGrandeLayout = new javax.swing.GroupLayout(pnlPremiumGrande);
        pnlPremiumGrande.setLayout(pnlPremiumGrandeLayout);
        pnlPremiumGrandeLayout.setHorizontalGroup(
            pnlPremiumGrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPremiumGrandeLayout.createSequentialGroup()
                .addComponent(pnlPreChico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlPremiumGrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        pnlPremiumGrandeLayout.setVerticalGroup(
            pnlPremiumGrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPreChico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPremiumGrandeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEstandarGrande.setBackground(new java.awt.Color(30, 30, 30));
        pnlEstandarGrande.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150), 3));
        pnlEstandarGrande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlEstandarGrandeMouseClicked(evt);
            }
        });

        pnlEstChico.setBackground(new java.awt.Color(15, 15, 15));

        planActual2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        planActual2.setForeground(new java.awt.Color(255, 255, 255));
        planActual2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        if(planA == 2){
            planActual2.setText("Plan Actual");
        } else {
            planActual2.setText(" ");
        }

        nomEst.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        nomEst.setForeground(new java.awt.Color(255, 255, 255));
        nomEst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomEst.setText("Estandar");

        javax.swing.GroupLayout pnlEstChicoLayout = new javax.swing.GroupLayout(pnlEstChico);
        pnlEstChico.setLayout(pnlEstChicoLayout);
        pnlEstChicoLayout.setHorizontalGroup(
            pnlEstChicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstChicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomEst, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(planActual2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlEstChicoLayout.setVerticalGroup(
            pnlEstChicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstChicoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(planActual2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomEst)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("$ " + tPDao.conexionPrecio(2) + " al mes (sin impuestos incluidos)");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("<html>Puedes ver en 2 pantallas a la vez en definición HD. Descarga videos en 2 teléfonos o tabletas.<html>");

        javax.swing.GroupLayout pnlEstandarGrandeLayout = new javax.swing.GroupLayout(pnlEstandarGrande);
        pnlEstandarGrande.setLayout(pnlEstandarGrandeLayout);
        pnlEstandarGrandeLayout.setHorizontalGroup(
            pnlEstandarGrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstandarGrandeLayout.createSequentialGroup()
                .addComponent(pnlEstChico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEstandarGrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlEstandarGrandeLayout.setVerticalGroup(
            pnlEstandarGrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEstChico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEstandarGrandeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnGuardar.setBackground(new java.awt.Color(0, 128, 255));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Guardar");

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cancelar");

        javax.swing.GroupLayout btnCancelarLayout = new javax.swing.GroupLayout(btnCancelar);
        btnCancelar.setLayout(btnCancelarLayout);
        btnCancelarLayout.setHorizontalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBasicoGrande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPremiumGrande, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEstandarGrande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(pnlBasicoGrande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEstandarGrande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPremiumGrande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        if (bloqueo == 0) {
            uDAO.modificarTipoPlan(seleccion, id);
            Configuracio conf = new Configuracio();
            jScrollPaneChico.setViewportView(conf);
            Conexion.cerrarConexion(Conexion.contarConexiones());
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        Configuracio conf = new Configuracio();
        jScrollPaneChico.setViewportView(conf);
        Conexion.cerrarConexion(Conexion.contarConexiones());
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void pnlBasicoGrandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBasicoGrandeMouseClicked
        pnlBasicoGrande.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 128, 255), 3));
        pnlEstandarGrande.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150), 3));
        pnlPremiumGrande.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150), 3));
        nomBasico.setForeground(new java.awt.Color(0, 128, 255));
        nomEst.setForeground(new java.awt.Color(255, 255, 255));
        nomPre.setForeground(new java.awt.Color(255, 255, 255));
        pnlBasicoChico.setBackground(new java.awt.Color(10, 10, 10));
        pnlEstChico.setBackground(new java.awt.Color(15, 15, 15));
        pnlPreChico.setBackground(new java.awt.Color(15, 15, 15));
        seleccion = 1;
        controlarGuardar();
    }//GEN-LAST:event_pnlBasicoGrandeMouseClicked

    private void pnlPremiumGrandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPremiumGrandeMouseClicked
        pnlPremiumGrande.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 128, 255), 3));
        pnlEstandarGrande.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150), 3));
        pnlBasicoGrande.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150), 3));
        nomPre.setForeground(new java.awt.Color(0, 128, 255));
        nomEst.setForeground(new java.awt.Color(255, 255, 255));
        nomBasico.setForeground(new java.awt.Color(255, 255, 255));
        pnlPreChico.setBackground(new java.awt.Color(10, 10, 10));
        pnlEstChico.setBackground(new java.awt.Color(15, 15, 15));
        pnlBasicoChico.setBackground(new java.awt.Color(15, 15, 15));
        seleccion = 3;
        controlarGuardar();
    }//GEN-LAST:event_pnlPremiumGrandeMouseClicked

    private void pnlEstandarGrandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEstandarGrandeMouseClicked
        pnlEstandarGrande.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 128, 255), 3));
        pnlPremiumGrande.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150), 3));
        pnlBasicoGrande.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150), 3));
        nomEst.setForeground(new java.awt.Color(0, 128, 255));
        nomPre.setForeground(new java.awt.Color(255, 255, 255));
        nomBasico.setForeground(new java.awt.Color(255, 255, 255));
        pnlEstChico.setBackground(new java.awt.Color(10, 10, 10));
        pnlPreChico.setBackground(new java.awt.Color(15, 15, 15));
        pnlBasicoChico.setBackground(new java.awt.Color(15, 15, 15));
        seleccion = 2;
        controlarGuardar();
    }//GEN-LAST:event_pnlEstandarGrandeMouseClicked

    private void controlarGuardar() {
        if (seleccion == user.getTipoPlan()) {
            btnGuardar.setBackground(new java.awt.Color(99, 125, 150));
            bloqueo = 1;
        } else {
            btnGuardar.setBackground(new java.awt.Color(0, 128, 255));
            bloqueo = 0;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nomBasico;
    private javax.swing.JLabel nomEst;
    private javax.swing.JLabel nomPre;
    private javax.swing.JLabel planActual1;
    private javax.swing.JLabel planActual2;
    private javax.swing.JLabel planActual3;
    private javax.swing.JPanel pnlBasicoChico;
    private javax.swing.JPanel pnlBasicoGrande;
    private javax.swing.JPanel pnlEstChico;
    private javax.swing.JPanel pnlEstandarGrande;
    private javax.swing.JPanel pnlPreChico;
    private javax.swing.JPanel pnlPremiumGrande;
    // End of variables declaration//GEN-END:variables
}
