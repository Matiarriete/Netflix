package Back;

import static Back.Conexion.getConexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TarjetaDAO implements ITarjetaDAO {

    public boolean registrarTarjeta(Tarjeta tarjeta){
        try {
            Connection con = null;
            con = getConexion();

            PreparedStatement ps;

            ps = con.prepareStatement("Insert into tarjetas(numTarjeta , nomTitular, apeTitular, codSeguridad, fecVenc) Values (?,?,?,?,?)");
            ps.setLong(1, tarjeta.getNumTarjeta());
            ps.setString(2, tarjeta.getNomTitular());
            ps.setString(3, tarjeta.getApeTitular());
            ps.setInt(4, tarjeta.getCodSeguridad());
            ps.setString(5, tarjeta.getFecVenc().toString());
            int i = ps.executeUpdate();
            if (i != 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            return false;
        }
    }

    public int buscarIdTarjeta(Long numTarjeta) {
        int a = 0;
        try {
            Connection con = null;
            con = getConexion();

            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement("Select * from tarjetas where numTarjeta = ?");
            ps.setLong(1, numTarjeta);
            rs = ps.executeQuery();
            rs.next();
            a = rs.getInt("idTarjeta");
        } catch (Exception e) {
            a = 0;
        }
        return a;
    }

    public boolean verificarNumTarjetaSQL(Long numTarjeta) {
        Connection con = null;
        con = getConexion();

        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = con.prepareStatement("Select numTarjeta from tarjetas where numTarjeta = ?");
            ps.setLong(1, numTarjeta);
            rs = ps.executeQuery();
            return true;
        } catch (SQLException ex) {
            return false;
        }

    }

    public boolean verificarNumTarjeta(Long numTarjeta) {
        if (numTarjeta.toString().length() == 16) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarCodSeguridad(Integer codSeguridad) {
        if (codSeguridad.toString().length() == 3) {
            return true;
        } else {
            return false;
        }
    }

}
