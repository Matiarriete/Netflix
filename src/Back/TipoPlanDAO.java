package Back;

import static Back.Conexion.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TipoPlanDAO implements ITipoPlanDAO {
    
    public String conexionPrecio(int i) {
        try {
            //Cuando aprieto el boton este me conecta y si se pudo conectar me muestra un valor
            Connection con = null;
            con = getConexion();//static que me conecta a la base de datos y me dice si se conecto o no

            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select precio from tipoPlan where idTipoPlan = ? ");
            ps.setInt(1, i);
            rs = ps.executeQuery();

            if (rs.next()) {//comprueba si hay datos
                String a = rs.getString("precio");
                return a;
            }

        } catch (Exception e) {
        }
        return null;
    }
    public String conexionNombre(int i) {
        try {
            //Cuando aprieto el boton este me conecta y si se pudo conectar me muestra un valor
            Connection con = null;
            con = getConexion();//static que me conecta a la base de datos y me dice si se conecto o no

            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select nombre from tipoPlan where idTipoPlan = ? ");
            ps.setInt(1, i);
            rs = ps.executeQuery();

            if (rs.next()) {//comprueba si hay datos
                String a = rs.getString("nombre");
                return a;
            }

        } catch (Exception e) {
        }
        return null;
    }
    
}
