package Back;

import static Back.Conexion.getConexion;
import static Back.UsuarioDAO.id;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PerfilDAO implements IPerfilDAO {

    int idUsuario = UsuarioDAO.id;
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrarPerfil(Perfiles perfil) {
        Connection con = null;
        try {
            con = getConexion();
            ps = con.prepareStatement("Insert into perfiles(NomPerfil, Kids, idUsuarios,fotoPerfil) values (?, ?, ?, ?)");
            ps.setString(1, perfil.getNombre());
            ps.setInt(2, perfil.getKids());
            ps.setInt(3, perfil.getIdUsuario());
            ps.setInt(4, perfil.getFoto());
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

    public boolean modificarPerfil(Perfiles perfil, int idPerfil) {
        Connection con = null;
        try {
            con = getConexion();
            ps = con.prepareStatement("Update perfiles SET NomPerfil= ?, Kids = ?, idUsuarios = ?, fotoPerfil = ? WHERE idPerfiles = ?");
            ps.setString(1, perfil.getNombre());
            ps.setInt(2, perfil.getKids());
            ps.setInt(3, perfil.getIdUsuario());
            ps.setInt(4, perfil.getFoto());
            ps.setInt(5, idPerfil);
            int i = ps.executeUpdate();
            if (i != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public Perfiles obtenerPerfil(int idUsuario, int row) {
        Perfiles perfil = new Perfiles();
        int i = 0;
        try {
            Connection con = null;
            con = getConexion();
            ps = con.prepareStatement("Select * From Perfiles where idUsuarios = ?");
            ps.setInt(1, idUsuario);
            rs = ps.executeQuery();
            while (rs.next() && i < row) {
                perfil.setIdUsuario(idUsuario);
                perfil.setKids(rs.getInt("Kids"));
                perfil.setNombre(rs.getString("NomPerfil"));
                perfil.setFoto(rs.getInt("fotoPerfil"));
                i++;
            }

        } catch (SQLException e) {
            return null;
        }
        return perfil;
    }

    public int contarPerfiles(int id) {
        try {
            Connection con = null;
            con = getConexion();
            ps = con.prepareStatement("select count(idPerfiles) from perfiles p inner join usuarios u on p.idUsuarios = u.idUsuarios where p.idUsuarios = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.next();
            id = rs.getInt("count(idPerfiles)");
            return id;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }

    public int obtenerIdPerfil(Perfiles perfiles) {
        try {
            Connection con = null;
            con = getConexion();
            ps = con.prepareStatement("select idPerfiles from perfiles where idUsuarios = ?  AND NomPerfil = ?");
            ps.setInt(1, perfiles.getIdUsuario());
            ps.setString(2, perfiles.getNombre());
            rs = ps.executeQuery();
            rs.next();
            int id = rs.getInt("idPerfiles");
            return id;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    @Override
    public boolean borrarPerfil(int id) {
        Connection con = null;
        try {
            con = getConexion();
            ps = con.prepareStatement("delete from perfiles where idPerfiles = ?");
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            if (i != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

}
