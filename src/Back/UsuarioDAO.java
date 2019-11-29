package Back;

import static Back.Conexion.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioDAO implements IUsuarioDAO {

    PreparedStatement ps;
    ResultSet rs;
    static public int id;

    public boolean registrarUsuario(Usuario user) {

        Connection con = null;

        try {
            con = getConexion();
            ps = con.prepareStatement("Insert into usuarios(mail,contrasena, idTarjeta,idTipoPlan) values (?,?,?,?)");
            ps.setString(1, user.getMail());
            ps.setString(2, user.getContrasena());
            ps.setInt(3, user.getIdTarjeta());
            ps.setInt(4, user.getTipoPlan());
            int i = ps.executeUpdate();
            if (i != 0) {
                return true;
            } else {
                return false;
            }
            
        } catch (Exception e) {
            return false;
        }
    }

    public boolean mailDisponible(String mail) {
        try {
            Connection con = null;
            con = getConexion();

            ps = con.prepareStatement("select idUsuarios from usuarios where mail = ?");
            ps.setString(1, mail);
            rs = ps.executeQuery();
            if (rs.next()) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    public boolean verificarContrasena(String contrasena) {
        if (contrasena.length() >= 4 && contrasena.length() <= 60) {
            return true;
        } else {
            return false;
        }

    }

    public boolean verificarMail(String mail) {
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher matcher = pattern.matcher(mail);

        if (matcher.find() == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean inicioSesion(Usuario usuario) {
        try {
            Connection con = null;
            con = getConexion();
            ps = con.prepareStatement("select idUsuarios from usuarios where mail = ? AND contrasena = ?");
            ps.setString(1, usuario.getMail());
            ps.setString(2, usuario.getContrasena());
            rs = ps.executeQuery();
            return rs.next();

        } catch (Exception e) {
            return false;
        }
    }

    public int obtenerId(Usuario usuario) {

        try {
            Connection con = null;
            con = getConexion();
            ps = con.prepareStatement("select idUsuarios from usuarios where mail = ? AND contrasena = ?");
            ps.setString(1, usuario.getMail());
            ps.setString(2, usuario.getContrasena());
            rs = ps.executeQuery();
            rs.next();
            id = rs.getInt(1);
            return id;
        } catch (Exception e) {
            return 0;
        }

    }
    
}
