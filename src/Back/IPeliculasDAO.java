package Back;

import java.util.List;

public interface IPeliculasDAO {
 
    public String buscarPeliculaPorNombre(String nombre);
    public Peliculas buscarPeliculaPorCategoria(String categoria);
    public void calificarPelicula();
    
}
