import java.util.*;
public class Controlador {   
    boolean ciclo = true;
    boolean repetido = false;
    double volumen = 50;
    double Estacion = 50;
    ArrayList<Double> EstacionesGuardadas = new ArrayList<Double>();
    int playlist = 0;
    int PosicionPlaylist = 0;
    boolean Telefono = false;
    boolean Llamada = false;

    public void Iniciar(Vista vista1){
        Radio radio1 = new Radio();
        Reproduccion reproduccion1 = new Reproduccion();
        Telefono telefono1 = new Telefono();
        Productividad produ1 = new Productividad();

        while( ciclo == true){
            int MenuP = vista1.MenuIncial();
            if(MenuP == 1){
                int menuvolu = vista1.MenuVolumen();
                if(menuvolu == 0){
                    volumen= volumen+1;
                    vista1.MostrarMensaje("Su nuevo volumen es de:" + volumen);
                }
                if(menuvolu == 1){
                    volumen = volumen-1;
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
                        repetido = false;
                        for(int i = 0; i <= EstacionesGuardadas.size()-1;i++){
                            if(EstacionesGuardadas.get(i) == Estacion){
                                repetido = true;
                            }
                        }
                        if(repetido == false){
                        vista1.MostrarMensaje(radio1.guardaremisora());
                        EstacionesGuardadas.add(Estacion);}

                        if(repetido == true){
                            vista1.MostrarMensaje("Esa Estacion ya ha sido guardada previamente.");
                        }
                    }
                    if(EstacionesGuardadas.size() > 50){
                        vista1.MostrarMensaje("Ya ha guardado 50 estaciones");
                    }
                }
                if(menuRadio == 4){
                    vista1.MostrarMensaje("\nEstaciones Guardadas");
                    for(int i = 0; i <= EstacionesGuardadas.size()-1;i++){
                        vista1.MostrarMensaje(i+". "+EstacionesGuardadas.get(i));
                    }
                    int carga=vista1.ElegirCargar();
                    Estacion = EstacionesGuardadas.get(carga);
                    vista1.MostrarMensaje(radio1.cargaremisora());
                }
                }
                if(MenuP == 3){
                    int menuRepre = vista1.MenuReproduccion();
                    if(menuRepre == 1){
                        if(playlist == 0){
                            playlist =1;
                            vista1.MostrarMensaje("Se ha cambiado a playlist 2");
                            PosicionPlaylist = 0;
                        }
                        if(playlist == 1){
                            playlist = 0;
                            vista1.MostrarMensaje("Se ha cambiado a plalist 1");
                            PosicionPlaylist = 0;
                        }
                        vista1.MostrarMensaje(reproduccion1.seleccionarListaReproduccion());
                    }
                    if(menuRepre == 2){
                        int adela = vista1.cambiarCancion();
                        if(adela == 1){
                            if(playlist == 0){
                                if( PosicionPlaylist <= reproduccion1.playlist1.size()-1 && PosicionPlaylist+1 != reproduccion1.playlist1.size()){
                                    PosicionPlaylist = PosicionPlaylist+1;
                                    vista1.MostrarMensaje(reproduccion1.cambiarCancion());
                                }
                                if(PosicionPlaylist == reproduccion1.playlist1.size()){
                                    vista1.MostrarMensaje("Haz llegado al final de la playlist");
                                }
                            }
                            if(playlist == 1){
                                if( PosicionPlaylist <= reproduccion1.playlist2.size()-1 && PosicionPlaylist+1 != reproduccion1.playlist2.size()){
                                    PosicionPlaylist = PosicionPlaylist+1;
                                    vista1.MostrarMensaje(reproduccion1.cambiarCancion());
                                }
                                if(PosicionPlaylist == reproduccion1.playlist2.size()){
                                    vista1.MostrarMensaje("Haz llegado al final de la playlist");
                                }
                            }
                        }
                        if(adela == 2){
                                if( PosicionPlaylist > 0){
                                    PosicionPlaylist = PosicionPlaylist-1;
                                    vista1.MostrarMensaje(reproduccion1.cambiarCancion());
                                }
                                if(PosicionPlaylist == 0){
                                    vista1.MostrarMensaje("Haz llegado al final de la playlist");
                                }
                        }
                    }

                    if(menuRepre == 3){
                        vista1.MostrarMensaje(reproduccion1.escucharCancion());
                        if(playlist == 0){
                            vista1.MostrarMensaje("Nombre de la cancion: "+reproduccion1.playlist1.get(PosicionPlaylist).Nombre);
                            vista1.MostrarMensaje("Duracion de la cancion: "+reproduccion1.playlist1.get(PosicionPlaylist).Duracion+" minutos");
                            vista1.MostrarMensaje("Autor de la cancion: "+reproduccion1.playlist1.get(PosicionPlaylist).Autor);
                            vista1.MostrarMensaje("Genero de la cancion: "+reproduccion1.playlist1.get(PosicionPlaylist).Genero);
                        }
                        if(playlist == 1){
                            vista1.MostrarMensaje("Nombre de la cancion: "+reproduccion1.playlist2.get(PosicionPlaylist).Nombre);
                            vista1.MostrarMensaje("Duracion de la cancion: "+reproduccion1.playlist2.get(PosicionPlaylist).Duracion+" minutos");
                            vista1.MostrarMensaje("Autor de la cancion: "+reproduccion1.playlist2.get(PosicionPlaylist).Autor);
                            vista1.MostrarMensaje("Genero de la cancion: "+reproduccion1.playlist2.get(PosicionPlaylist).Genero);
                        }
                    }
                }
                if(MenuP == 4){
                    int menuTel = vista1.menuTelefono();
                    if(menuTel == 1){
                        if(Telefono == false){
                            Telefono = true;
                            vista1.MostrarMensaje(telefono1.Conectar());
                        }
                        if(Telefono == true){
                            Telefono = false;
                            vista1.MostrarMensaje(telefono1.desconectar());
                        }
                    }
                    if(menuTel ==2){
                        if(Telefono == true){
                        vista1.MostrarMensaje(telefono1.MostrarContactos());
                        for(int i = 0; i <= telefono1.Contactos.size()-1;i++){
                            vista1.MostrarMensaje(telefono1.Contactos.get(i));
                        }
                        }

                        else{
                            vista1.MostrarMensaje("El telefono esta apagado");
                        }
                    }

                    if(menuTel == 3){
                        if(Telefono == true){
                            vista1.MostrarMensaje("Contactos Guardados: ");
                            for(int i = 0; i <= telefono1.Contactos.size()-1;i++){
                                vista1.MostrarMensaje(i+". "+telefono1.Contactos.get(i));
                            }
                            int llamar = vista1.LlamarContatos();
                            vista1.MostrarMensaje("Se esta llamando a "+telefono1.Contactos.get(llamar));
                            vista1.MostrarMensaje(telefono1.LlamarContacto());
                            Llamada = true;
                        }
                        else{
                            vista1.MostrarMensaje("El telefono esta apagado");
                        }
                    }
                    if(menuTel == 4){
                        if(Telefono == true){
                            if(Llamada == true){
                                vista1.MostrarMensaje(telefono1.FinalizarLLamada());
                                Llamada = false;
                            }
                            if(Llamada == false){
                                vista1.MostrarMensaje("No hay llamada activa");
                            }
                        }
                        if(Telefono == false){
                            vista1.MostrarMensaje("El telefono esta apagado");
                        }
                    }
                    if(menuTel == 5){
                        if(Telefono == true){
                            if(Llamada == true){
                                vista1.MostrarMensaje(telefono1.PonerEnEspera());
                                Llamada = false;
                            }
                            if(Llamada == false){
                                vista1.MostrarMensaje("No hay llamada activa");
                            }
                        }
                        if(Telefono == false){
                            vista1.MostrarMensaje("El telefono esta apagado");
                        }
                    }
                }
                if(MenuP == 5){
                    vista1.MostrarMensaje(produ1.vertiempo());
                }
                if(MenuP == 6){
                    break;
                }
        }
    }
}

