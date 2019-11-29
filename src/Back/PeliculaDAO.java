package Back;

import java.sql.Connection;
import static Back.Conexion.getConexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class PeliculaDAO implements IPeliculasDAO {

    PreparedStatement ps;
    ResultSet rs;

    public String buscarPeliculaPorNombre(String nombre) {
        try {
            Connection con = null;
            con = getConexion();
            ps = con.prepareStatement("select * from Peliculas where nombre like '?%' ");
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            String imagen = rs.getString("imagen");
            return imagen;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Peliculas buscarPeliculaPorCategoria(String categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calificarPelicula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
