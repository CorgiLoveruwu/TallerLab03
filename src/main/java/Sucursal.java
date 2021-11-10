import java.util.ArrayList;

public class Sucursal {
    String codigo;
    String region;
    ArrayList<Camion> camiones;

    public Sucursal(String codigo, String region, ArrayList<Camion> c) {
        this.codigo = codigo;
        this.region = region;
        this.camiones = c;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
