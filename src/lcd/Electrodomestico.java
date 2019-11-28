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
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F'){
            System.out.println("Letra correcta");
            this.consumoEnergetico = letra;
        }else{
            System.out.println("Letra incorrecta, le asignaremos una por defecto.");
            this.consumoEnergetico = 'F';
        }
    }

    private void comprobarColor(String color) {
        color = color.toLowerCase();
        if (color == "blanco" || color == "negro" || color == "rojo" || color == "azul" || color == "gris"){
            System.out.println("Letra correcta");
            this.color = color;
        }else{
            System.out.println("Letra incorrecta, le asignaremos una por defecto.");
            this.color = "blanco";
        }
    }

    public int precioFinal(){
        int precioFinal = 0;
        switch(this.consumoEnergetico){
            case 'A':
                if (peso >= 0 && peso<=19){
                    precioFinal = 100*10;
                }else if(peso >= 20 && peso<49){
                    precioFinal = 100*50;
                }else if(peso >= 50 && peso <= 79){
                    precioFinal = 100 * 80;
                }else if (peso > 80){
                    precioFinal = 100*100;
                }else{
                    System.out.println("peso incorrecto");
                    return 0;
                }
                break;
            case 'B':
                if (peso >= 0 && peso<=19){
                    precioFinal = 80*10;
                }else if(peso >= 20 && peso<49){
                    precioFinal = 80*50;
                }else if(peso >= 50 && peso <= 79){
                    precioFinal = 80 * 80;
                }else if (peso > 80){
                    precioFinal = 80*100;
                }else{
                    System.out.println("peso incorrecto");
                    return 0;
                }
                break;
            case 'C':
                if (peso >= 0 && peso<=19){
                    precioFinal = 60*10;
                }else if(peso >= 20 && peso<49){
                    precioFinal = 60*50;
                }else if(peso >= 50 && peso <= 79){
                    precioFinal = 60 * 80;
                }else if (peso > 80){
                    precioFinal = 60*100;
                }else{
                    System.out.println("peso incorrecto");
                    return 0;
                }
                break;
            case 'D':
                if (peso >= 0 && peso<=19){
                    precioFinal = 50*10;
                }else if(peso >= 20 && peso<49){
                    precioFinal = 50*50;
                }else if(peso >= 50 && peso <= 79){
                    precioFinal = 50 * 80;
                }else if (peso > 80){
                    precioFinal = 50*100;
                }else{
                    System.out.println("peso incorrecto");
                    return 0;
                }
                break;
            case 'E':
                if (peso >= 0 && peso<=19){
                    precioFinal = 30*10;
                }else if(peso >= 20 && peso<49){
                    precioFinal = 30*50;
                }else if(peso >= 50 && peso <= 79){
                    precioFinal = 30 * 80;
                }else if (peso > 80){
                    precioFinal = 30*100;
                }else{
                    System.out.println("peso incorrecto");
                    return 0;
                }
                break;
            case 'F':
                if (peso >= 0 && peso<=19){
                    precioFinal = 10*10;
                }else if(peso >= 20 && peso<49){
                    precioFinal = 10*50;
                }else if(peso >= 50 && peso <= 79){
                    precioFinal = 10 * 80;
                }else if (peso > 80){
                    precioFinal = 10*100;
                }else{
                    System.out.println("peso incorrecto");
                    return 0;
                }
                break;
        }
        return precioFinal;
    }
}
