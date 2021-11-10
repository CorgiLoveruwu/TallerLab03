import java.util.ArrayList;

public class Flete {
    String codigo;
    String descripcion;
    ArrayList<Pack> pack;

    public Flete(String codigo, String descripcion, ArrayList<Pack> pack) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.pack = pack;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Flete{" + "," + codigo + "," + descripcion +'}';
    }
}
