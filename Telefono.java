import java.util.*;
public class Telefono implements iTelefono {
    String Respuesta;
    ArrayList<Cancion> playlist2 = new ArrayList<Cancion>();


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
        return Respuesta;
    }

    @Override
    public String LlamarContacto() {
        return Respuesta;
    }

    @Override
    public String FinalizarLLamada() {
        
        return Respuesta;
    }

    @Override
    public String PonerEnEspera() {
        
        return Respuesta;
    }
    
}
