package Back;


public class Perfiles {
    
    int idUsuario;
    int kids;
    String nombre;
    Integer foto;

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getKids() {
        return kids;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Perfiles{" + "idUsuario=" + idUsuario + ", kids=" + kids + ", nombre=" + nombre + ", foto=" + foto + '}';
    }
    
    
    
}
