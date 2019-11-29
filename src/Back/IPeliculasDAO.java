package Back;

import java.util.List;

public interface IPeliculasDAO {
 
    public String buscarPeliculaPorNombre(String nombre);
    public String buscarPeliculaPorCategoria(String categoria);
    public void calificarPelicula();
    
}
