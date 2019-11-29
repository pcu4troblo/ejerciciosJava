package lcd;

public class Electrodomestico {
    int precioBase;
    String color;
    char consumoEnergetico;
    int peso;

    //CONSTRUCTORS
    public Electrodomestico() {
        this.precioBase = 100;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }

    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.comprobarColor(color);
        this.comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public Electrodomestico(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
    }

    //GETTERS
    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    //METHODS
    private void comprobarConsumoEnergetico(char letra) {
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            this.consumoEnergetico = letra;
        } else {
            System.out.println("Consumo energetico incorrecto, le asignaremos uno por defecto.");
            this.consumoEnergetico = 'F';
        }
    }

    private void comprobarColor(String color) {
        color = color.toLowerCase();
        if (color == "blanco" || color == "negro" || color == "rojo" || color == "azul" || color == "gris") {
            this.color = color;
        } else {
            this.color = "blanco";
        }
    }

    public int precioFinal() {
        int precioFinal = 0;
        switch (this.consumoEnergetico) {
            case 'A':
                precioFinal = this.precioBase + 100;
                break;
            case 'B':
                precioFinal = this.precioBase + 80;
                break;
            case 'C':
                precioFinal = this.precioBase + 60;
                break;
            case 'D':
                precioFinal = this.precioBase + 50;
                break;
            case 'E':
                precioFinal = this.precioBase + 30;
                break;
            case 'F':
               precioFinal = this.precioBase + 10;
                break;
        }

        if (peso >= 0 && peso <= 19) {
            precioFinal = precioFinal + 10;
        } else if (peso >= 20 && peso < 49) {
            precioFinal = precioFinal + 50;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal = precioFinal + 80;
        } else if (peso >= 80) {
            precioFinal = precioFinal + 100;
        } else {
            System.out.println("peso incorrecto");
            return 0;
        }
        return precioFinal;
    }
}


//CLASE LAVADORA
class Lavadora extends Electrodomestico {
    int carga;

    //CONSTRUCTORES
    public Lavadora() {
        super();
        this.carga = 5;
    }

    public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);
        this.carga = 5;
    }

    //GETTERS

    public int getCarga() {
        return carga;
    }

    //METHODS

    public int precioFinal() {
        int precioFinal;
        precioFinal = super.precioFinal();
        if (this.carga > 30) {
            precioFinal = precioFinal + 50;
        }
        return precioFinal;
    }
}



//CLASE TELEVISION
class Television extends Electrodomestico{
    float resolucion;
    boolean sintonizadorTDT;


    //CONSTRUCTORES
    public Television(){
        super();
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(int precioBase, int peso){
        super(precioBase, peso);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(int precioBase, String color, char consumoEnergetico, int peso, float resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //GETTERS
    public float getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    //METHODS

    public int precioFinal() {
        int precioFinal;
        double aumento;
        precioFinal = super.precioFinal();
        if (this.resolucion > 40){
            aumento = precioFinal % 0.30;
        }
        if (this.sintonizadorTDT) {
            precioFinal = precioFinal + 50;
        }
        return precioFinal;
    }

}




