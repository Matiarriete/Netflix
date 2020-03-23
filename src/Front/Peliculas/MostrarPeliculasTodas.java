package Front.Peliculas;

import Back.IPeliculasDAO;
import Back.IPerfilDAO;
import Back.PeliculaDAO;
import Back.Peliculas;
import Back.Imagenes;
import Back.PerfilDAO;
import Front.InicioSesion.SeleccionPerfil;
import static Front.Peliculas.Peliculas1.id;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;

public class MostrarPeliculasTodas extends javax.swing.JPanel {

    public MostrarPeliculasTodas() {
        initComponents();
    }

    IPeliculasDAO pDao = new PeliculaDAO();
    IPerfilDAO perfilDao = new PerfilDAO();
    static int id = SeleccionPerfil.idUsuario();
    int selPer = SeleccionPerfil.selPer;
    Peliculas peli = seleccionCategoria();
    public boolean kids = perfilDao.verificarKids(id, selPer);
    PanelModificable mod;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAccion = new javax.swing.JPanel();
        pnlReco = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblClasificacion = new javax.swing.JLabel();
        pnlLista1 = new javax.swing.JPanel();
        lblReproducir = new javax.swing.JLabel();
        pnlLista = new javax.swing.JPanel();
        lblLista = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        pnlAventuras = new javax.swing.JPanel();
        pnlTerror = new javax.swing.JPanel();
        pnlFamiliar = new javax.swing.JPanel();
        pnlDrama = new javax.swing.JPanel();
        pnlDeporte = new javax.swing.JPanel();
        pnlSuspenso = new javax.swing.JPanel();
        pnlCFiccion = new javax.swing.JPanel();
        pnlMiLista = new javax.swing.JPanel();
        pnlLatin = new javax.swing.JPanel();
        pnlDocumental = new javax.swing.JPanel();
        pnlComedia = new javax.swing.JPanel();
        pnlMusical = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mod = new PanelModificable("Accion");
        mod.setSize(910, 200);
        mod.setLocation(0, 0);
        pnlAccion.removeAll();
        pnlAccion.add(mod, BorderLayout.CENTER);
        pnlAccion.revalidate();
        pnlAccion.repaint();

        javax.swing.GroupLayout pnlAccionLayout = new javax.swing.GroupLayout(pnlAccion);
        pnlAccion.setLayout(pnlAccionLayout);
        pnlAccionLayout.setHorizontalGroup(
            pnlAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlAccionLayout.setVerticalGroup(
            pnlAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(pnlAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 487, 890, -1));

        pnlReco.setBackground(new java.awt.Color(20, 20, 20));
        pnlReco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setText(peli.getNombre());
        lblNombre.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        pnlReco.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 250, 60));

        lblDescripcion.setText(peli.getDescripcion());
        lblDescripcion.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        pnlReco.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 260, 50));

        lblClasificacion.setText(peli.getClasificacion());
        lblClasificacion.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblClasificacion.setForeground(new java.awt.Color(255, 255, 255));
        lblClasificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClasificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pnlReco.add(lblClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 300, 90, 40));

        pnlLista1.setBackground(new java.awt.Color(20, 20, 20));

        lblReproducir.setBackground(new java.awt.Color(20, 20, 20));
        lblReproducir.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblReproducir.setForeground(new java.awt.Color(255, 255, 255));
        lblReproducir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReproducir.setText("Reproducir");
        lblReproducir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout pnlLista1Layout = new javax.swing.GroupLayout(pnlLista1);
        pnlLista1.setLayout(pnlLista1Layout);
        pnlLista1Layout.setHorizontalGroup(
            pnlLista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLista1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblReproducir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlLista1Layout.setVerticalGroup(
            pnlLista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReproducir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnlReco.add(pnlLista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 40));

        pnlLista.setBackground(new java.awt.Color(20, 20, 20));

        lblLista.setBackground(new java.awt.Color(20, 20, 20));
        lblLista.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblLista.setForeground(new java.awt.Color(255, 255, 255));
        lblLista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLista.setText("Mi lista");
        lblLista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lblLista.setOpaque(true);
        boolean f = false;
        int i = 1;
        int contador = pDao.contarPeliculasMiLista(id, selPer);
        while(f != true && contador >= i){
            if(peli.getIdPelicula() != pDao.buscarPeliculaMiLista(i, id, selPer).getIdPelicula()){
                lblLista.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\mini_pngocean.com.png"));
                f = false;
            } else {
                lblLista.setIcon(new ImageIcon(Imagenes.general + "//tildeBlanco.png"));
                f = true;
            }
            i = i + 1;
        }
        if(contador == 0){
            lblLista.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\mini_pngocean.com.png"));
        }
        lblLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblListaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlListaLayout = new javax.swing.GroupLayout(pnlLista);
        pnlLista.setLayout(pnlListaLayout);
        pnlListaLayout.setHorizontalGroup(
            pnlListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(pnlListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblLista, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
        );
        pnlListaLayout.setVerticalGroup(
            pnlListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(pnlListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblLista, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        pnlReco.add(pnlLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 120, 40));

        lblFoto.setBackground(new java.awt.Color(20, 20, 20));
        pnlReco.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 890, 520));

        add(pnlReco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, -1, -1));

        mod = new PanelModificable("Deporte");
        mod = new PanelModificable("Aventuras");
        mod.setSize(910, 200);
        mod.setLocation(0, 0);
        pnlAventuras.removeAll();
        pnlAventuras.add(mod, BorderLayout.CENTER);
        pnlAventuras.revalidate();
        pnlAventuras.repaint();

        javax.swing.GroupLayout pnlAventurasLayout = new javax.swing.GroupLayout(pnlAventuras);
        pnlAventuras.setLayout(pnlAventurasLayout);
        pnlAventurasLayout.setHorizontalGroup(
            pnlAventurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlAventurasLayout.setVerticalGroup(
            pnlAventurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(pnlAventuras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 705, 890, -1));

        mod = new PanelModificable("Terror");
        mod.setSize(910, 200);
        mod.setLocation(0, 0);
        pnlTerror.removeAll();
        pnlTerror.add(mod, BorderLayout.CENTER);
        pnlTerror.revalidate();
        pnlTerror.repaint();

        javax.swing.GroupLayout pnlTerrorLayout = new javax.swing.GroupLayout(pnlTerror);
        pnlTerror.setLayout(pnlTerrorLayout);
        pnlTerrorLayout.setHorizontalGroup(
            pnlTerrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlTerrorLayout.setVerticalGroup(
            pnlTerrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(pnlTerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 923, 890, -1));

        mod = new PanelModificable("Familiar");
        mod.setSize(910, 200);
        mod.setLocation(0, 0);
        pnlFamiliar.removeAll();
        pnlFamiliar.add(mod, BorderLayout.CENTER);
        pnlFamiliar.revalidate();
        pnlFamiliar.repaint();

        javax.swing.GroupLayout pnlFamiliarLayout = new javax.swing.GroupLayout(pnlFamiliar);
        pnlFamiliar.setLayout(pnlFamiliarLayout);
        pnlFamiliarLayout.setHorizontalGroup(
            pnlFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlFamiliarLayout.setVerticalGroup(
            pnlFamiliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(pnlFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1141, 890, -1));

        mod = new PanelModificable("Drama");
        mod.setSize(910, 200);
        mod.setLocation(0, 0);
        pnlDrama.removeAll();
        pnlDrama.add(mod, BorderLayout.CENTER);
        pnlDrama.revalidate();
        pnlDrama.repaint();

        javax.swing.GroupLayout pnlDramaLayout = new javax.swing.GroupLayout(pnlDrama);
        pnlDrama.setLayout(pnlDramaLayout);
        pnlDramaLayout.setHorizontalGroup(
            pnlDramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlDramaLayout.setVerticalGroup(
            pnlDramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(pnlDrama, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1795, 890, -1));

        mod = new PanelModificable("Deporte");
        mod.setSize(910, 200);
        mod.setLocation(0, 0);
        pnlDeporte.removeAll();
        pnlDeporte.add(mod, BorderLayout.CENTER);
        pnlDeporte.revalidate();
        pnlDeporte.repaint();

        javax.swing.GroupLayout pnlDeporteLayout = new javax.swing.GroupLayout(pnlDeporte);
        pnlDeporte.setLayout(pnlDeporteLayout);
        pnlDeporteLayout.setHorizontalGroup(
            pnlDeporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlDeporteLayout.setVerticalGroup(
            pnlDeporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(pnlDeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2013, 890, -1));

        mod = new PanelModificable("Suspenso");
        mod.setSize(910, 200);
        mod.setLocation(0, 0);
        pnlSuspenso.removeAll();
        pnlSuspenso.add(mod, BorderLayout.CENTER);
        pnlSuspenso.revalidate();
        pnlSuspenso.repaint();

        javax.swing.GroupLayout pnlSuspensoLayout = new javax.swing.GroupLayout(pnlSuspenso);
        pnlSuspenso.setLayout(pnlSuspensoLayout);
        pnlSuspensoLayout.setHorizontalGroup(
            pnlSuspensoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlSuspensoLayout.setVerticalGroup(
            pnlSuspensoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(pnlSuspenso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1359, 890, -1));

        mod = new PanelModificable("Ciencia Ficcion");
        mod.setSize(910, 200);
        mod.setLocation(0, 0);
        pnlCFiccion.removeAll();
        pnlCFiccion.add(mod, BorderLayout.CENTER);
        pnlCFiccion.revalidate();
        pnlCFiccion.repaint();

        javax.swing.GroupLayout pnlCFiccionLayout = new javax.swing.GroupLayout(pnlCFiccion);
        pnlCFiccion.setLayout(pnlCFiccionLayout);
        pnlCFiccionLayout.setHorizontalGroup(
            pnlCFiccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlCFiccionLayout.setVerticalGroup(
            pnlCFiccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(pnlCFiccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1577, 890, -1));

        PanelMiLista mList = new PanelMiLista();
        mList.setSize(910, 200);
        mList.setLocation(0, 0);
        pnlMiLista.removeAll();
        pnlMiLista.add(mList, BorderLayout.CENTER);
        pnlMiLista.revalidate();
        pnlMiLista.repaint();

        javax.swing.GroupLayout pnlMiListaLayout = new javax.swing.GroupLayout(pnlMiLista);
        pnlMiLista.setLayout(pnlMiListaLayout);
        pnlMiListaLayout.setHorizontalGroup(
            pnlMiListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlMiListaLayout.setVerticalGroup(
            pnlMiListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(pnlMiLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3103, 890, -1));

        mod = new PanelModificable("Latin");
        mod.setSize(910, 200);
        mod.setLocation(0, 0);
        pnlLatin.removeAll();
        pnlLatin.add(mod, BorderLayout.CENTER);
        pnlLatin.revalidate();
        pnlLatin.repaint();

        javax.swing.GroupLayout pnlLatinLayout = new javax.swing.GroupLayout(pnlLatin);
        pnlLatin.setLayout(pnlLatinLayout);
        pnlLatinLayout.setHorizontalGroup(
            pnlLatinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlLatinLayout.setVerticalGroup(
            pnlLatinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(pnlLatin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2231, 890, -1));

        mod = new PanelModificable("Documental");
        mod.setSize(910, 200);
        mod.setLocation(0, 0);
        pnlDocumental.removeAll();
        pnlDocumental.add(mod, BorderLayout.CENTER);
        pnlDocumental.revalidate();
        pnlDocumental.repaint();

        javax.swing.GroupLayout pnlDocumentalLayout = new javax.swing.GroupLayout(pnlDocumental);
        pnlDocumental.setLayout(pnlDocumentalLayout);
        pnlDocumentalLayout.setHorizontalGroup(
            pnlDocumentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlDocumentalLayout.setVerticalGroup(
            pnlDocumentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(pnlDocumental, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2449, 890, -1));

        mod = new PanelModificable("Comedia");
        mod.setSize(910, 200);
        mod.setLocation(0, 0);
        pnlComedia.removeAll();
        pnlComedia.add(mod, BorderLayout.CENTER);
        pnlComedia.revalidate();
        pnlComedia.repaint();

        javax.swing.GroupLayout pnlComediaLayout = new javax.swing.GroupLayout(pnlComedia);
        pnlComedia.setLayout(pnlComediaLayout);
        pnlComediaLayout.setHorizontalGroup(
            pnlComediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlComediaLayout.setVerticalGroup(
            pnlComediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(pnlComedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2885, 890, -1));

        mod = new PanelModificable("Musical");
        mod.setSize(910, 200);
        mod.setLocation(0, 0);
        pnlMusical.removeAll();
        pnlMusical.add(mod, BorderLayout.CENTER);
        pnlMusical.revalidate();
        pnlMusical.repaint();

        javax.swing.GroupLayout pnlMusicalLayout = new javax.swing.GroupLayout(pnlMusical);
        pnlMusical.setLayout(pnlMusicalLayout);
        pnlMusicalLayout.setHorizontalGroup(
            pnlMusicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlMusicalLayout.setVerticalGroup(
            pnlMusicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        add(pnlMusical, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2667, 890, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lblListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListaMouseClicked
        boolean f = pDao.verificarEstadoMiLista(id, selPer, peli.getIdPelicula());
        if (f == false) {
            lblLista.setIcon(new ImageIcon(Imagenes.general + "//tildeBlanco.png"));
            pDao.agregarPeliculaMiLista(id, selPer, peli.getIdPelicula());
        } else {
            lblLista.setIcon(new javax.swing.ImageIcon("C:\\Users\\matia\\Desktop\\Imagenes Trabajo\\Trabajo Netflix\\mini_pngocean.com.png"));
            pDao.eliminarPeliculaMilista(id, selPer, peli.getIdPelicula());
        }
        PanelMiLista pnlLista = new PanelMiLista();
        pnlLista.setLocation(0, 0);
        pnlLista.setSize(910, 200);
        pnlMiLista.removeAll();
        pnlMiLista.add(pnlLista, BorderLayout.CENTER);
        pnlMiLista.revalidate();
        pnlMiLista.repaint();
    }//GEN-LAST:event_lblListaMouseClicked

    public Peliculas seleccionCategoria() {
        String cat = null;
        int numero;
        Peliculas pelicula;
        
        do {
            do {
                int numeroAzar = (int) (Math.random() * 12);
                switch (numeroAzar) {
                    case 1:
                        cat = "Accion";
                        break;
                    case 2:
                        cat = "Aventura";
                        break;
                    case 3:
                        cat = "Ciencia Ficcion";
                        break;
                    case 4:
                        cat = "Comedia";
                        break;
                    case 5:
                        cat = "Deporte";
                        break;
                    case 6:
                        cat = "Documental";
                        break;
                    case 7:
                        cat = "Drama";
                        break;
                    case 8:
                        cat = "Familiar";
                        break;
                    case 9:
                        cat = "Latin";
                        break;
                    case 10:
                        cat = "Musical";
                        break;
                    case 11:
                        cat = "Suspenso";
                        break;
                    case 12:
                        cat = "Terror";
                        break;
                }
            } while (pDao.contarPeliculas(cat) == 0);
            do {
                numero = (int) (Math.random() * pDao.contarPeliculas(cat));
            } while (numero == 0);

            pelicula = pDao.buscarPeliculaPorId(numero, cat);
        } while (kids && !pelicula.getClasificacion().equals("ATP"));
        return pelicula;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblClasificacion;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblLista;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblReproducir;
    private javax.swing.JPanel pnlAccion;
    private javax.swing.JPanel pnlAventuras;
    private javax.swing.JPanel pnlCFiccion;
    private javax.swing.JPanel pnlComedia;
    private javax.swing.JPanel pnlDeporte;
    private javax.swing.JPanel pnlDocumental;
    private javax.swing.JPanel pnlDrama;
    private javax.swing.JPanel pnlFamiliar;
    private javax.swing.JPanel pnlLatin;
    private javax.swing.JPanel pnlLista;
    private javax.swing.JPanel pnlLista1;
    public static javax.swing.JPanel pnlMiLista;
    private javax.swing.JPanel pnlMusical;
    private javax.swing.JPanel pnlReco;
    private javax.swing.JPanel pnlSuspenso;
    private javax.swing.JPanel pnlTerror;
    // End of variables declaration//GEN-END:variables
}
