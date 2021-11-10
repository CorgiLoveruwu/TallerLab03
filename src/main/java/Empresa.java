public class Empresa {
    String nombre;
    String direccion;
    Sucursal sucursal;

    public Empresa(String nombre, String direccion, Sucursal s) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.sucursal = s;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Empresa{" + "," + nombre + "," + direccion  + '}';
    }
}
