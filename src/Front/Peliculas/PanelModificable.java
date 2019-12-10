package Front.Peliculas;

import Back.PeliculaDAO;
import javax.swing.ImageIcon;


public class PanelModificable extends javax.swing.JPanel {

    PeliculaDAO pDao = new PeliculaDAO();
    String categoria;
    
    public PanelModificable(String cat) {
        categoria = cat;
        initComponents();
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomCategoria = new javax.swing.JLabel();
        foto1 = new javax.swing.JLabel();
        foto2 = new javax.swing.JLabel();
        foto3 = new javax.swing.JLabel();
        foto4 = new javax.swing.JLabel();
        foto5 = new javax.swing.JLabel();
        foto6 = new javax.swing.JLabel();
        foto7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        nomCategoria.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        nomCategoria.setForeground(new java.awt.Color(255, 255, 255));
        nomCategoria.setText(categoria);

        String cat;
        int numero = 1;
        foto1.setIcon(new ImageIcon(Back.Imagenes.peliculas + pDao.buscarPeliculaPorCategoria(categoria, numero)));
        numero = numero + 1;

        foto2.setIcon(new ImageIcon(Back.Imagenes.peliculas + pDao.buscarPeliculaPorCategoria(categoria, numero)));
        numero = numero + 1;

        foto3.setIcon(new ImageIcon(Back.Imagenes.peliculas + pDao.buscarPeliculaPorCategoria(categoria, numero)));
        numero = numero + 1;

        foto4.setIcon(new ImageIcon(Back.Imagenes.peliculas + pDao.buscarPeliculaPorCategoria(categoria, numero)));
        numero = numero + 1;

        foto5.setIcon(new ImageIcon(Back.Imagenes.peliculas + pDao.buscarPeliculaPorCategoria(categoria, numero)));
        numero = numero + 1;

        foto6.setIcon(new ImageIcon(Back.Imagenes.peliculas + pDao.buscarPeliculaPorCategoria(categoria, numero)));
        numero = numero + 1;

        foto7.setIcon(new ImageIcon(Back.Imagenes.peliculas + pDao.buscarPeliculaPorCategoria(categoria, numero)));
        numero = numero + 1;

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(foto3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(foto4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(foto5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(foto6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(foto7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nomCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(foto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(foto4, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(foto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(foto6, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addComponent(foto7, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                    .addComponent(foto5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel foto1;
    private javax.swing.JLabel foto2;
    private javax.swing.JLabel foto3;
    private javax.swing.JLabel foto4;
    private javax.swing.JLabel foto5;
    private javax.swing.JLabel foto6;
    private javax.swing.JLabel foto7;
    private javax.swing.JLabel nomCategoria;
    // End of variables declaration//GEN-END:variables
}
