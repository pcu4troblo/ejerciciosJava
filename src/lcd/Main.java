package lcd;

import java.io.*;

import lcd.Ejercicios;
import lcd.Persona;
public class Main {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Ejercicios ejercicios = new Ejercicios();
        short opcion = 0;
        do {
            System.out.println("Digite el numero de la opción deseada, digite 0 para salir:");
            try {
                opcion = Short.parseShort(in.readLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
            switch (opcion) {
                case 1:
                    ejercicios.numeroMayor();
                    break;
                case 2:
                    ejercicios.areaCirculo();
                    break;
                case 3:
                    ejercicios.precioIVA();
                    break;
                case 4:
                    ejercicios.numerosWhile();
                    break;
                case 5:
                    ejercicios.numeroMayorACero();
                    break;
                case 6:
                    ejercicios.diaLaboral();
                    break;
                case 7:
                    ejercicios.eliminarChar();
                    break;
                case 8:
                    ejercicios.eliminarEspacios();
                    break;
                case 9 :
                    ejercicios.vocales();
                    break;
                case 10:
                    ejercicios.palabrasIguales();
                    break;
                case 11:
                    ejercicios.fecha();
                    break;
                case 12:
                    ejercicios.numerosHastaMil();
                    break;
                case 13:
                    ejercicios.gestionCine();
                    break;
                case 14:
                    String nombre = "";
                    char sexo = ' ';
                    int edad = 0;
                    float peso = 0, altura = 0;
                    System.out.println("/// CLASE PERSONA ///");
                    System.out.println("Ingrese su nombre completo");
                    try {
                        nombre = in.readLine();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("Ingrese su peso");
                    try {
                        peso = Float.parseFloat(in.readLine());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("Ingrese su altura en metros");
                    try {
                        altura = Float.parseFloat(in.readLine());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("Ingrese su edad");
                    try {
                        edad = Integer.parseInt(in.readLine());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("Ingrese su sexo, H o M");
                    try {
                        sexo = in.readLine().charAt(0);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Persona persona1 = new Persona(nombre, sexo, edad, peso, altura);
                    Persona persona2 = new Persona(nombre, edad, sexo);
                    Persona persona3 = new Persona();

                    persona3.setNombre("Paula Rios");
                    persona3.setSexo('M');
                    persona3.setAltura(1.6);
                    persona3.setEdad(15);
                    persona3.setPeso(60);

                    persona1.toStrings();
                    if(persona1.calcularIMC() == 1){
                        System.out.println("IMC: Sobrepeso");
                    }else if (persona1.calcularIMC() == 0){
                        System.out.println("IMC: Ideal");
                    }else if(persona1.calcularIMC() == -1){
                        System.out.println("IMC: Debajo del peso ideal");
                    }
                    System.out.println("Mayor de edad: " + persona1.esMayorDeEdad() + "\n");

                    persona2.toStrings();
                    if(persona2.calcularIMC() == 1){
                        System.out.println("IMC: Sobrepeso");
                    }else if (persona2.calcularIMC() == 0){
                        System.out.println("IMC: Ideal");
                    }else if(persona2.calcularIMC() == -1){
                        System.out.println("IMC: Debajo del peso ideal");
                    }
                    System.out.println("Mayor de edad: " + persona2.esMayorDeEdad() + "\n");

                    persona3.toStrings();
                    if(persona3.calcularIMC() == 1){
                        System.out.println("IMC: Sobrepeso");
                    }else if (persona3.calcularIMC() == 0){
                        System.out.println("IMC: Ideal");
                    }else if(persona3.calcularIMC() == -1){
                        System.out.println("IMC: Debajo del peso ideal");
                    }
                    System.out.println("Mayor de edad: " + persona3.esMayorDeEdad() + "\n");
                    break;
                case 15:


            }

        } while (opcion != 0);
    }


}
