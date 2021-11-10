public class Sucursal {
    String codigo;
    String region;

    public Sucursal(String codigo, String region) {
        this.codigo = codigo;
        this.region = region;
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
