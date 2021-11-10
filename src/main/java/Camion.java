import java.util.ArrayList;

public class Camion {
    String codigo;
    String patente;
    String descripcion;
    boolean enServicio;
    ArrayList<Flete> fletes;

    public Camion(String codigo, String patente, String descripcion, boolean enServicio, ArrayList<Flete> fletes) {
        this.codigo = codigo;
        this.patente = patente;
        this.descripcion = descripcion;
        this.enServicio = enServicio;
        this.fletes = fletes;
    }

    public Camion(String codigo, String patente, String descripcion, boolean enServicio) {
        this.codigo = codigo;
        this.patente = patente;
        this.descripcion = descripcion;
        this.enServicio = enServicio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEnServicio() {
        return enServicio;
    }

    public void setEnServicio(boolean enServicio) {
        this.enServicio = enServicio;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "codigo='" + codigo + '\'' +
                ", patente='" + patente + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", enServicio=" + enServicio +
                '}';
    }
}
