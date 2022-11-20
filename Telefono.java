import java.util.*;
public class Telefono implements iTelefono {
    String Respuesta;
    ArrayList<String> Contactos = new ArrayList<String>();


    Telefono(){
        Contactos.add("Esteban");
        Contactos.add("Bruce");
        Contactos.add("Sofia");
    }

    @Override
    public String Conectar() {
        Respuesta = "Se ha conectado el telefono";
        return Respuesta;
    }

    @Override
    public String desconectar() {
        Respuesta = "Se ha deconectado el telefono";
        return Respuesta;
    }

    @Override
    public String MostrarContactos() {
        Respuesta = "Lista De Contactos";
        return Respuesta;
    }

    @Override
    public String LlamarContacto() {
        Respuesta = "Llamando a contacto elegido";
        return Respuesta;
    }

    @Override
    public String FinalizarLLamada() {

        Respuesta = "Se ha terminado la llamada";
        return Respuesta;
    }

    @Override
    public String PonerEnEspera() {
        
        Respuesta = "La llamada actual se ha puesto en espera";
        return Respuesta;
    }
    
}
