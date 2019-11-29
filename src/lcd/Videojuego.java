package lcd;

public class Videojuego implements Entregable{
    String titulo;
    int horasEstimadas;
    boolean entregado;
    String genero;
    String compañia;


    //CONSTRUCTORS
    public Videojuego() {
        this.titulo = "";
        this.horasEstimadas = 10;
        this.entregado = false;
        this.genero = "";
        this. compañia = "";
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = "";
        this. compañia = "";
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = genero;
        this.compañia = compañia;
    }
    //GETTERS
    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompañia() {
        return compañia;
    }

    //SETTERS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    //METHODS
    public String toString(){
        return ("Titulo: " + this.titulo+ " Horas estimadas: " + this.horasEstimadas + " Entregado: " + this.entregado + " Genero: " + this.genero + " Compañia: " + this.compañia);
    }

    @Override
    public void devolver(){
        this.entregado = false;
    }

    public void entregar(){
        this.entregado = true;
    }

    public boolean isEntregado(){
        return this.entregado;
    }


    public boolean compareTo(Object a) {
        Videojuego b = (Videojuego) a;
        if(this.horasEstimadas >= b.horasEstimadas){
            return true;
        }else{
            return false;
        }
    }

}
