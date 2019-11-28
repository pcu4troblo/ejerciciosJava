package lcd;

import java.io.*;

import java.math.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Ejercicios {

    public void numeroMayor() {
        int a = 0, b = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("/// CUAL NUMERO ES MAYOR ///");
        System.out.println("Digite el primer numero");
        try {
            a = Integer.parseInt(in.readLine());
        } catch (Exception e) {
        }

        System.out.println("Digite el segundo numero");
        try {
            b = Integer.parseInt(in.readLine());
        } catch (Exception e) {
        }

        if (a > b) {
            System.out.println(a + " es mayor a " + b);
        } else if (b > a) {
            System.out.println(b + " es mayor a " + a);
        } else {
            System.out.println(a + " es igual a " + b);
        }
    }

    public void areaCirculo() {
        double r = 0, area = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("/// AREA DEL CIRCULO ///");
        System.out.println("Digite el radio del circulo");
        try {
            r = Double.parseDouble(in.readLine());
        } catch (Exception e) {
        }
        r = Math.pow(r, 2);
        area = Math.PI * r;
        System.out.println("El area del circulo es igual a: " + area);
    }

    public void precioIVA() {
        double precio = 0, IVA = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("/// PRECIO FINAL CON IVA ///");
        System.out.println("Digite el precio inicial del producto, si es decimal se debe separar con un \".\" :");
        try {
            precio = Double.parseDouble(in.readLine());
        } catch (Exception e) {
        }
        System.out.println(precio);
        IVA = precio * 0.21;
        System.out.println(IVA);
        precio = precio + IVA;
        System.out.println("El precio con IVA es de: " + precio);
    }

    public void numerosWhile() {
        System.out.println("/// NUMEROS PARES E IMPARES ///");
        LinkedList<Integer> pares = new LinkedList<Integer>();
        LinkedList<Integer> impares = new LinkedList<Integer>();
        int x = 1;
        while (x <= 100) {
            if (x % 2 != 0) {
                impares.add(x);
            } else {
                pares.add(x);
            }
            x++;
        }

        System.out.println("Numeros pares: " + pares);
        System.out.println("Numeros impares: " + impares);
    }

    public void numerosFor() {
        LinkedList<Integer> pares = new LinkedList<Integer>();
        LinkedList<Integer> impares = new LinkedList<Integer>();
        for (int x = 1; x <= 100; x++) {
            if (x % 2 != 0) {
                impares.add(x);
            } else {
                pares.add(x);
            }
        }

        System.out.println("Numeros pares: " + pares);
        System.out.println("Numeros impares: " + impares);
    }

    public void numeroMayorACero() {
        double numero = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("/// NUMERO MAYOR A CERO ///");
        do {
            System.out.println("Digite cualquier numero:");
            try {
                numero = Double.parseDouble(in.readLine());
            } catch (Exception e) {
            }
            if (numero >= 0) {
                System.out.println("El numero " + numero + " Es mayor o igual a cero");
            }
        } while (numero <= 0);
    }

    public void diaLaboral() {
        String dia = "";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("/// DIA LABORAL ///");
            System.out.println("Digite un dia de la semana:");
            try {
                dia = in.readLine();
                dia = dia.toLowerCase();
            } catch (Exception e) {
            }
        switch (dia){
            case "lunes":
                System.out.println("El dia "+ dia + " es laboral.");
                break;
            case "martes":
                System.out.println("El dia "+ dia + " es laboral.");
                break;
            case "miercoles":
                System.out.println("El dia "+ dia + " es laboral.");
                break;
            case "jueves":
                System.out.println("El dia "+ dia + " es laboral.");
                break;
            case "viernes":
                System.out.println("El dia "+ dia + " es laboral.");
                break;
            case "sabado":
                System.out.println("El dia "+ dia + " no es laboral.");
                break;
            case "domingo":
                System.out.println("El dia "+ dia + " no es laboral.");
                break;
            default:
                System.out.println("Dia no reconocido");
        }
    }

    public void eliminarChar(){
        System.out.println("/// REEMPLAZO DE UN CHAR///");
        String frase = "La sonrisa sera la mejor arma contra la tristeza. ", fraseUsuario = "";
        frase = frase.replace('a', 'e');
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite una frase aleatoria:");
        try {
            fraseUsuario = in.readLine();
        } catch (Exception e) {
        }
        frase = frase.concat(fraseUsuario);
        System.out.println(frase);
    }

    public void eliminarEspacios(){
        String frase  = "";
        System.out.println("/// ELIMINAR ESPACIOS ///");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite una frase aleatoria:");
        try {
            frase = in.readLine();
            frase = frase.replaceAll("\\s+", "");
        } catch (Exception e) {
        }
        System.out.println(frase);
    }

    public void vocales(){
        String frase  = "";
        int tamaño = 0;
        long a = 0, e = 0, i = 0, o = 0, u = 0;
        System.out.println("/// VOCALES EN UN STRING ///");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite una frase aleatoria:");
        try {
            frase = in.readLine();
            frase = frase.toLowerCase();
            tamaño = frase.length();
        } catch (Exception ex) {
        }
        a = frase.chars().filter(num -> num == 'a').count();
        e = frase.chars().filter(num -> num == 'e').count();
        i = frase.chars().filter(num -> num == 'i').count();
        o = frase.chars().filter(num -> num == 'o').count();
        u = frase.chars().filter(num -> num == 'u').count();
        System.out.println("La longitud de la frase es de: "+ tamaño);
        System.out.println("La vocal a aparece " +a+ " veces.");
        System.out.println("La vocal e aparece " +e+ " veces.");
        System.out.println("La vocal i aparece " +i+ " veces.");
        System.out.println("La vocal o aparece " +o+ " veces.");
        System.out.println("La vocal u aparece " +u+ " veces.");
    }

    public void palabrasIguales(){
        String palabra1  = "", palabra2 = "";
        System.out.println("/// PALABRAS IGUALES///");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite una palabra:");
        try {
            palabra1 = in.readLine();
            palabra1 = palabra1.toLowerCase();
        } catch (Exception ex) {
        }

        System.out.println("Digite nuevamente una palabra:");
        try {
            palabra2 = in.readLine();
            palabra2 = palabra2.toLowerCase();
        } catch (Exception ex) {
        }
        System.out.println(palabra1);
        System.out.println(palabra2);
        if(palabra1.equalsIgnoreCase(palabra2)){
            System.out.println("Las palabras son iguales");
        }else{
            System.out.println("Las palabras no son iguales");
        }
    }

    public void fecha(){
        Date date = new Date();
        System.out.println("/// FECHA ///");
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        System.out.println("Hora y fecha: "+ hourdateFormat.format(date));
    }

    public void numerosHastaMil(){
        LinkedList<Integer> lista = new LinkedList<Integer>();
        int numero = 0;
        System.out.println("/// PALABRAS IGUALES///");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite un numero menor a mil:");
        try {
            numero = Integer.parseInt(in.readLine());
        } catch (Exception ex) {
        }

        for(int i = numero; i <= 1000; i += 2){
            lista.add(i);
        }
        System.out.println("Los numeros para llegar a mil desde "+ numero+ " de 2 en 2 son: "+ lista);
    }

    public void gestionCine(){
        int opcion = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.flush();
            System.out.println("****** GESTION CINEMATOGRÁFICA ******");
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6-VER PELICULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8- SALIR");
            System.out.println("\n Digite el numero de una opcion");
            try {
                opcion = Integer.parseInt(in.readLine());
            } catch (Exception ex) {
            }
            switch(opcion){
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6: break;
                case 7: break;
                case 8: break;
                default:
                    System.out.println("Opcion incorrecta");


            }
        }while(opcion!=8);
    }

}
