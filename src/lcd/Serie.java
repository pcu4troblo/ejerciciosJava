package lcd;

public class Serie implements Entregable{
    String titulo;
    int numeroTemporadas;
    boolean entregado;
    String genero;
    String creador;

    //CONTRUCTORS
    public Serie(){
        this.titulo = "";
        this.numeroTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numeroTemporadas = 3;
        this.entregado = false;
        this.genero = "";
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = false;
    }

    //GETTERS
    public String getTitulo() {
        return titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    //SETTERS

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    //METHODS
    public String toString(){
        return ("Titulo: " + this.titulo+ " Temporadas: " + this.numeroTemporadas + " Entregado: " + this.entregado + " Genero" + this.genero + " Creador: " + this.creador);
    }

    @Override
    public void devolver(){
        this.entregado = false;
    }

    @Override
    public void entregar(){
        this.entregado = true;
    }

    @Override
    public boolean isEntregado(){
        return this.entregado;
    }

    @Override
    public boolean compareTo(Object a) {
        Serie b = (Serie) a;
        if(this.numeroTemporadas >= b.numeroTemporadas){
            return true;
        }else{
            return false;
        }
    }
}
