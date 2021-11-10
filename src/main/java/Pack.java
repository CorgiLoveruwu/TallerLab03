import java.util.ArrayList;

public class Pack {
    ArrayList<Producto> productos;

    public Pack(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    public static ArrayList<Producto> generarPack(){
        ArrayList<Producto> productos = new ArrayList<>();
        Producto p1 = new Producto("123456","comida");
        Producto p2 = new Producto("125456","utensilios");
        Producto p3 = new Producto("126456","ropa");
        Producto p4 = new Producto("1233456","ropa");
        Producto p5 = new Producto("1234756","comida");
        Producto p6 = new Producto("1234556","utensilios");
        Producto p7 = new Producto("1234526","herramientas");
        Producto p8 = new Producto("1235456","comida");
        Producto p9 = new Producto("12236456","herramientas");
        Producto p10 = new Producto("1243456","comida");
        Producto p11 = new Producto("1223456","limpieza");
        Producto p12 = new Producto("1263456","comida");
        Producto p13 = new Producto("1238456","limpieza");
        Producto p14 = new Producto("12342356","comida");
        Producto p15 = new Producto("123453456","herramientas");
        Producto p16 = new Producto("12345656","comida");
        Producto p17 = new Producto("1234556","comida");
        Producto p18 = new Producto("1234563","utensilios");
        Producto p19 = new Producto("123452346","comida");
        Producto p20 = new Producto("1234","comida");
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
        productos.add(p6);
        productos.add(p7);
        productos.add(p8);
        productos.add(p9);
        productos.add(p10);
        productos.add(p11);
        productos.add(p12);
        productos.add(p13);
        productos.add(p14);
        productos.add(p15);
        productos.add(p16);
        productos.add(p17);
        productos.add(p18);
        productos.add(p19);
        productos.add(p20);
        return productos;
    }
}
