package Front;

import static Front.Netflix.panelPrincipal1;
import Front.Peliculas.Peliculas1;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class CambiarPanel {

    public CambiarPanel(JPanel panel) {
        panel.setSize(910, 700);
        panel.setLocation(0, 0);
        panelPrincipal1.removeAll();
        panelPrincipal1.add(panel, BorderLayout.CENTER);
        panelPrincipal1.revalidate();
        panelPrincipal1.repaint();
    }
    
    
    
    
}
