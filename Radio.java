public class Radio implements iRadio {
    
    boolean fm = true;
    String Respuesta;

    public void bandas(){


    }


    @Override
    public String cambiarbanda() {
        if(fm == true){
            fm = false;
            Respuesta = "Se ha cambiado de FM a AM";
            return Respuesta;
        }
        else{
            fm = true;
            Respuesta = "Se ha cambiado de AM a FM";
            return Respuesta;
        }
    }

    @Override
    public String cambiaremisoras() {
        Respuesta = "Se ha cambiado la estacion de radio";
        return Respuesta;
    }

    @Override
    public String guardaremisora() {
        
        Respuesta = "Se ha guardadol la estacion actual";
        return Respuesta;
    }

    @Override
    public String cargaremisora() {
        
        return Respuesta;
    }
    
}
