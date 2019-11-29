package Back;

import java.sql.SQLException;

public interface ITarjetaDAO {
    
    public boolean registrarTarjeta(Tarjeta tarjeta);
    public int buscarIdTarjeta(Long numTarjeta);
    public boolean verificarNumTarjeta(Long numTarjeta);
    public boolean verificarCodSeguridad(Integer codSeguridad);
}
