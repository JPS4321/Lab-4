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

    public int MenuReproduccion(){
        System.out.println("1. Seleccionar Playlist");
        System.out.println("2. Cambiar Cancion");
        System.out.println("3. Ver Info de la cancion");
        return solicitarI("");
    }
    public int cambiarCancion(){
        System.out.println("Deseas: 1. Adelantar La cancion, 2. Regresar a la cancion anterior");
        return solicitarI("");
    }


    public int MenuVolumen(){
        System.out.println("Desea Subir o Disminuir el volumen? 0.Subir, 1. Bajar");
        return solicitarI("");
    }
    
    public int ElegirCargar(){
        System.out.println("Elije una estacion para cargar:");
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

    public int menuTelefono(){

        System.out.println("1. Conectar/ Desconectar Telefono");
        System.out.println("2. Mostrar Contactos");
        System.out.println("3. Llamar a contacto");
        System.out.println("4. Finalizar Llamada");
        System.out.println("5. Cambiar a llamada en espera");
        return solicitarI("");
    }
    public int LlamarContatos(){
        System.out.println("Elije un contacto para llamar: ");

        return solicitarI("");
    }


}
