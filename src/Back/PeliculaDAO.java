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
            String busqueda = rs.getString("nombre");
            return busqueda;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String buscarPeliculaPorCategoria(String categoria) {
        try {
            Connection con = null;
            con = getConexion();
            ps = con.prepareStatement("select * from Peliculas where genero = ? ");
            ps.setString(1, categoria);
            rs = ps.executeQuery();
            String nombre = rs.getString("nombre");
            return nombre;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public void calificarPelicula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int contarPeliculas(String categoria) {
        int cant = 0;
        try {
            Connection con = null;
            con = getConexion();
            if (categoria.equalsIgnoreCase("inicio")) {
                ps = con.prepareStatement("select count(nombre) from Peliculas ");
                rs = ps.executeQuery();
                cant = rs.getInt("count(nombre)");
                return cant;
            } else {
                ps = con.prepareStatement("select count(nombre) from Peliculas where genero = ? ");
                ps.setString(1, categoria);
                rs = ps.executeQuery();
                cant = rs.getInt("count(nombre)");
                return cant;
            }
        } catch (Exception e) {
            return 0;
        }

    }

}
