import java.util.*;
public class Controlador {   
    boolean ciclo = true;
    double volumen = 50;
    double Estacion = 50;
    ArrayList<Double> EstacionesGuardadas = new ArrayList<Double>();

    public void Iniciar(Vista vista1){
        Radio radio1 = new Radio();
        while( ciclo == true){
            int MenuP = vista1.MenuIncial();

            if(MenuP == 1){
                int menuvolu = vista1.MenuVolumen();
                if(menuvolu == 0){
                    volumen= volumen+0.5;
                    vista1.MostrarMensaje("Su nuevo volumen es de:" + volumen);
                }
                if(menuvolu == 1){
                    volumen = volumen-0.5;
                    vista1.MostrarMensaje("Su nuevo volumen es de:" + volumen);
                }
            }

            if(MenuP == 2){
                int menuRadio = vista1.ModoRadioVista();
                if(menuRadio == 1){
                    vista1.MostrarMensaje(radio1.cambiarbanda());
                }

                if(menuRadio == 2){
                    int menuesta = vista1.MenuEstacion();
                    vista1.MostrarMensaje(radio1.cambiaremisoras());
                        if(menuesta == 0){
                            Estacion= Estacion+0.5;
                            vista1.MostrarMensaje("Su nuevo estacion es de:" + Estacion);
                        }
                        if(menuesta == 1){
                            Estacion = Estacion-0.5;
                            vista1.MostrarMensaje("Su nuevo estacion es de:" + Estacion);
                        }
                }
                if(menuRadio == 3){
                    if(EstacionesGuardadas.size() <= 50){
                        vista1.MostrarMensaje(radio1.guardaremisora());
                        EstacionesGuardadas.add(Estacion);
                    }
                    if(EstacionesGuardadas.size() > 50){
                        vista1.MostrarMensaje("Ya ha guardado 50 estaciones");
                    }




                }
                

            }
        }
    }
}
