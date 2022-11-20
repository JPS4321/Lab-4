import java.util.*;
public class Vista {
    Scanner scan = new Scanner(System.in);

    public int MenuIncial(){

        System.out.println("Bienvenido a tu similador de Mercedez");
        System.out.println("1. Cambiar Volumen");
        System.out.println("2. Modo Radio");
        System.out.println("3. Modo Reproduccion");
        System.out.println("4. Modo Telefono");
        System.out.println("5. Modo Productividad");
        System.out.println("6. Apagar");
        return solicitarI("");
    }

    public int MenuVolumen(){
        System.out.println("Desea Subir o Disminuir el volumen? 0.Subir, 1. Bajar");
        return solicitarI("");
    }
    
    public int MenuEstacion(){
        System.out.println("Desea aumentar la posicion de la emisora o disminuirla? 0. Aumentar., 1. Disminuir");
        return solicitarI("");
    }

    public int ModoRadioVista(){
        System.out.println("1. Cambiar de Emisora de FM a AM");
        System.out.println("2. Cambiar de estacion");
        System.out.println("3. Guardar Emsioras");
        System.out.println("4. Cargar Emisora");
        return solicitarI("");
    }

    //Funcion Obtenida del proyecto de POO
    public int solicitarI(String solicitud) {
        System.out.println(solicitud);
        int solicitar = 0;
        Boolean correcto = false;
        do {
            try {
                solicitar = scan.nextInt();
                correcto = true;
            } catch (InputMismatchException e) {
                scan.next();
                System.out.println("¡Cuidado! Ingresa un número entero.");
            }
        } while (correcto == false);
        scan.nextLine(); // Elimina la posibilidad de saltarse una linea de solicitud después
        return solicitar;
    }

    //Funcion Obtenida del proyecto de POO
    public String solicitarS(String solicitud) {
        System.out.println(solicitud);
        String recepcion = scan.nextLine();
        return recepcion;
    }
    //Funcion Obtenida del proyecto de POO
    public void MostrarMensaje(String text) {
        System.out.println("\n" + text);
    }



}
