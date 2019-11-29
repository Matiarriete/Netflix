package Back;

public class Tarjeta {
    Long numTarjeta; 
    String nomTitular;
    String apeTitular;
    int codSeguridad;
    Fecha fecVenc;

    public Long getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(Long numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getNomTitular() {
        return nomTitular;
    }

    public void setNomTitular(String nomTitular) {
        this.nomTitular = nomTitular;
    }

    public String getApeTitular() {
        return apeTitular;
    }

    public void setApeTitular(String apeTitular) {
        this.apeTitular = apeTitular;
    }

    public int getCodSeguridad() {
        return codSeguridad;
    }

    public void setCodSeguridad(int codSeguridad) {
        this.codSeguridad = codSeguridad;
    }

    public Fecha getFecVenc() {
        return fecVenc;
    }

    public void setFecVenc(Fecha fecVenc) {
        this.fecVenc = fecVenc;
    }
    
}
