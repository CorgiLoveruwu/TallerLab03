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
        int x = -1;
        do {
            switch (validarMenu (5)) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    finalizarPrograma();
                    break;
            }
            System.out.println ("Desea hacer algo mas?[1]Si [2]No");
            x = validarMenu (2);
            if (x==1){
                mostrarMenu();
            }
        } while (x == 1);
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
