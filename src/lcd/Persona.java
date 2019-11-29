package lcd;

import java.util.Random;

public class Persona {
    public String nombre;
    private char sexo;
    private int edad;
    private String DNI;
    private double peso, altura;

    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.peso = 0;
        this.altura = 0;
        this.sexo = 'H';
        this.generaDNI();
    }

    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
        this.generaDNI();
    }

    public Persona(String nombre, char sexo, int edad, double peso, double altura){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.generaDNI();
    }

    public int calcularIMC(){
       double IMC = 0;
       if(this.altura <= 0 || this.peso <= 0){
           return 1;
       }
       IMC = this.peso/(Math.pow(this.altura, 2));
       if(IMC < 20){
           return -1;
       }else if(IMC>=20 && IMC<=25){
           return 0;
       }else{
           return 1;
       }
    }

    public boolean esMayorDeEdad(){
        if (this.edad > 18){
            return true;
        }else{
            return false;
        }
    }

    private void comprobarSexo(char sexo){
        if(sexo != 'H' || sexo != 'M'){
            System.out.println("Sexo introducido incorrecto, le asignaremos uno por defecto");
            this.sexo = 'H';
        }else{
            System.out.println("Sexo introducido correcto.");
        }
    }

    public void toStrings(){
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: "+ this.altura);
        System.out.println("DNI: " + this.DNI );
    }

    private void generaDNI(){
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K', 'E'};
        char letra;
        int numeroLetra = 0;
        Random r = new Random();
        int low = 10000000, high = 99999999;
        int result = r.nextInt(high-low) + low;
        numeroLetra = result%23;
        letra = letras[numeroLetra];
        this.DNI = Integer.toString(result) + "-" + letra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}
