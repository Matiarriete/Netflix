package Back;

import java.sql.Blob;
import java.util.List;

public interface IPerfilDAO {

    public boolean registrarPerfil(Perfiles perfil);

    public boolean modificarPerfil(Perfiles perfil, int idPerfil);

    public int obtenerIdPerfil(Perfiles perfiles);

    public Perfiles obtenerPerfil(int idUsuario, int row);

    public int contarPerfiles(int id);

    public boolean borrarPerfil(int id);
}
