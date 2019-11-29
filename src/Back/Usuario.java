package Back;

public class Usuario {
    
    String mail;
    String contrasena;
    Integer tipoPlan;
    Integer idTarjeta;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Integer getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(Integer tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public Integer getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(Integer idTarjeta) {
        this.idTarjeta = idTarjeta;
    }
    
}
