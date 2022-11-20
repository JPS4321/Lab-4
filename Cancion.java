public class Cancion {
    String Nombre;
    int Duracion;
    String Autor;
    String Genero;

    
    public Cancion(String nombre, int duracion, String autor, String genero) {
        this.Nombre = nombre;
        this.Duracion = duracion;
        this.Autor = autor;
        this.Genero = genero;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getDuracion() {
        return Duracion;
    }
    public void setDuracion(int duracion) {
        Duracion = duracion;
    }
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String autor) {
        Autor = autor;
    }
    public String getGenero() {
        return Genero;
    }
    public void setGenero(String genero) {
        Genero = genero;
    }

    

}
