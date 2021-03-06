import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    //Metodo para iniciar el Programa de manera correcta.
    public static void iniciarPrograma(){
        mostrarMenu ();
        switchesMenu ();
    }

    //Metodo que muestra el menu.
    private static void mostrarMenu (){
        System.out.println ("------------------------------------------");
        System.out.println ("1. Agregar o quitar productos del embarque.");
        System.out.println ("2. Cambiar estado del camión.");
        System.out.println ("3. Agregar nuevo camión a la flota.");
        System.out.println ("4. Desvincular camión de la flota.");
        System.out.println ("5. Salir");
        System.out.println ("------------------------------------------");
    }
    //Switches del menú principal.
    public static void switchesMenu() {
        ArrayList<Camion> c = new ArrayList<>();
        añadirCamionesDefecto(c);
        Empresa empresa = new Empresa("disney","orlando 133",new Sucursal("456875", "metropolitana",c));
        int opcionSwitch = -1;
        do {
            opcionSwitch = validarMenu(5);
            switch (opcionSwitch) {
                case 1 -> {
                    cambiarProductos(empresa);
                    mostrarMenu();
                }
                case 2 -> {
                    cambiarEstado(empresa);
                    mostrarMenu();
                }
                case 3 -> añadirCamion(empresa);
                case 4 -> {
                    desvincularCamiones(empresa);
                    mostrarMenu();
                }
                case 5 -> finalizarPrograma();
            }
        } while (opcionSwitch<5);
    }

    private static void añadirCamion(Empresa empresa) {
        Scanner teclado = new Scanner(System.in);
        boolean serv = false;
        System.out.println("ingrese datos del nuevo camion");
        System.out.println("codigo:");
        String codigo = teclado.next();
        System.out.println("patente:");
        String patente = teclado.next();
        System.out.println("descripcion:");
        String descripcion = teclado.next();
        System.out.println("esta en servicio? [1]Si [2]No");
        int servicio = validarMenu(2);
        if (servicio==1){
            serv=true;
        }
        empresa.sucursal.camiones.add(new Camion(codigo,patente,descripcion,serv));
    }

    private static void desvincularCamiones(Empresa empresa) {
        mostrarCamiones(empresa);
        int opcion = validarMenu(empresa.sucursal.camiones.size())-1;
        empresa.sucursal.camiones.remove(opcion);
    }

    private static void cambiarProductos(Empresa empresa) {
        System.out.println("desea añadir o quitar productos?");
        System.out.println("[1]Añadir [2]Quitar");
        int opcion = validarMenu(2);
        System.out.println("de que camion desea hacer el cambio?");
        System.out.println(empresa.sucursal.camiones.toString());
        int opcioncamion = validarMenu(empresa.sucursal.camiones.size())-1;
        if (opcion==1){
            addProductos(empresa,opcioncamion);
        }else {
            deleteProductos(empresa,opcioncamion);
        }
    }

    private static void deleteProductos(Empresa empresa, int opcioncamion) {
        System.out.println(empresa.sucursal.camiones.get(opcioncamion).fletes.get(0).pack.get(0).productos.toString());
        System.out.println("que producto desea eliminar?");
        int remover = validarMenu(empresa.sucursal.camiones.get(opcioncamion).fletes.get(0).pack.get(0).productos.size())-1;
        empresa.sucursal.camiones.get(opcioncamion).fletes.get(0).pack.get(0).productos.remove(validarMenu(remover));
    }

    private static void addProductos(Empresa empresa, int camion) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese datos de producto a añadir");
        System.out.println("codigo:");
        String codigo = teclado.next();
        System.out.println("tipo:");
        String tipo = teclado.next();
        if ( empresa.sucursal.camiones.get(camion).fletes.get(0).pack.get(0).productos.size()>=20){
            System.out.println("no se pueden agregar mas productos");
        }else {
            empresa.sucursal.camiones.get(camion).fletes.get(0).pack.get(0).productos.add(new Producto(codigo,tipo));//vamos a asumir que no hay mas lista de fletes ni packs
        }
    }

    private static void cambiarEstado(Empresa empresa) {
        mostrarCamiones(empresa);
        int opcion = validarMenu(empresa.sucursal.camiones.size())-1;
        empresa.sucursal.camiones.get(opcion).setEnServicio(!empresa.sucursal.camiones.get(opcion).isEnServicio());
    }

    private static void mostrarCamiones(Empresa empresa) {
        System.out.println("Que camion desea cambiar de estado?");
        System.out.println(empresa.sucursal.camiones.toString());
    }

    private static void añadirCamionesDefecto(ArrayList<Camion> c) {
        ArrayList<Pack> p = new ArrayList<>();
        p.add(new Pack(Pack.generarPack()));
        Flete flete = new Flete("78954","cosas",p);
        ArrayList<Flete> f = new ArrayList<>();
        f.add(flete);
        Camion c1 = new Camion("123","DSF564","transporta lechugas",true,f );
        Camion c2 = new Camion("143","DPF564","transporta pepinos",false, f);
        Camion c3 = new Camion("129","OSF564","transporta papas",true, f);
        c.add(c1);
        c.add(c2);
        c.add(c3);
    }

    private static void finalizarPrograma() {
        System.out.println ("Programa finalizado.");
    }

    //Metodo para validar menu principal.
    public static int validarMenu ( int x){
        int n = -1;
        do {
            //Scanner ponerlo dentro del DO, y dentro de una funcion
            Scanner teclado = new Scanner (System.in);
            //System.out.println("ingrese otro numero");
            try {
                n = teclado.nextInt ();
            } catch (Exception e) {
                System.out.println ("Error");
            }
            if (n < 0 || n > x) {
                System.out.println ("Ingrese un numero valido");
            }
        } while (n < 0 || n > x);
        return n;
    }

}
