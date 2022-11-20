import java.util.*;
public class Reproduccion implements iReproduccion {
    String Respuesta;
    ArrayList<Cancion> playlist1 = new ArrayList<Cancion>();
    ArrayList<Cancion> playlist2 = new ArrayList<Cancion>();


    Reproduccion(){
        Cancion cancion1 = new Cancion("Mala Mia",6,"lit Killah","Pop");
        Cancion cancion2 = new Cancion("Baby", 3, "Justin", "Pop");
        Cancion cancion3 = new Cancion("Bad Habits", 3, "Steve Lacy", "Pop");
        playlist1.add(cancion1);
        playlist1.add(cancion2);
        playlist1.add(cancion3);

        Cancion cancion4 = new Cancion("Malbec", 3, "Duki", "Rap");
        Cancion cancion5 = new Cancion("She Dont give a fo", 3, "Duko", "rap");
        playlist2.add(cancion4);
        playlist2.add(cancion5);
    }



    @Override
    public String seleccionarListaReproduccion() {

        Respuesta = "Se ha cambiado correctamente de playlist";
        return Respuesta;
    }

    @Override
    public String cambiarCancion() {
        Respuesta = "Se ha cambiado de cancion correctamente";
        return Respuesta;
    }

    @Override
    public String escucharCancion() {
        Respuesta = "Datos de la cancion";
        return Respuesta;
    }

    
}
