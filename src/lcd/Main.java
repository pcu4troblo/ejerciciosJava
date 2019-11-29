package lcd;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;

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
                case 9:
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
                //PERSONAS
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
                    if (persona1.calcularIMC() == 1) {
                        System.out.println("IMC: Sobrepeso");
                    } else if (persona1.calcularIMC() == 0) {
                        System.out.println("IMC: Ideal");
                    } else if (persona1.calcularIMC() == -1) {
                        System.out.println("IMC: Debajo del peso ideal");
                    }
                    System.out.println("Mayor de edad: " + persona1.esMayorDeEdad() + "\n");

                    persona2.toStrings();
                    if (persona2.calcularIMC() == 1) {
                        System.out.println("IMC: Sobrepeso");
                    } else if (persona2.calcularIMC() == 0) {
                        System.out.println("IMC: Ideal");
                    } else if (persona2.calcularIMC() == -1) {
                        System.out.println("IMC: Debajo del peso ideal");
                    }
                    System.out.println("Mayor de edad: " + persona2.esMayorDeEdad() + "\n");

                    persona3.toStrings();
                    if (persona3.calcularIMC() == 1) {
                        System.out.println("IMC: Sobrepeso");
                    } else if (persona3.calcularIMC() == 0) {
                        System.out.println("IMC: Ideal");
                    } else if (persona3.calcularIMC() == -1) {
                        System.out.println("IMC: Debajo del peso ideal");
                    }
                    System.out.println("Mayor de edad: " + persona3.esMayorDeEdad() + "\n");
                    break;
                //ELECTRODOMESTICOS
                case 15:
                    int lavadoras = 0, televisores = 0, electrodomesticosFinal = 0;
                    Electrodomestico electrodomesticos[] = new Electrodomestico[10];
                    electrodomesticos[0] = new Electrodomestico(200, "blanca", 'A', 80);
                    electrodomesticos[1] = new Television(300, "negro", 'B', 90, 30, true);
                    electrodomesticos[2] = new Lavadora(400, "rojo", 'E', 45, 10);
                    electrodomesticos[3] = new Electrodomestico();
                    electrodomesticos[4] = new Television();
                    electrodomesticos[5] = new Lavadora();
                    electrodomesticos[6] = new Electrodomestico(80, 60);
                    electrodomesticos[7] = new Television(120, 110);
                    electrodomesticos[8] = new Lavadora(50, 30);
                    electrodomesticos[9] = new Television(320, 400);

                    for (int i = 0; i < electrodomesticos.length; i++) {
                        if (electrodomesticos[i] instanceof Television) {
                            televisores = televisores + electrodomesticos[i].precioFinal();
                            electrodomesticosFinal = electrodomesticosFinal + electrodomesticos[i].precioFinal();
                        } else if (electrodomesticos[i] instanceof Lavadora) {
                            lavadoras = lavadoras + electrodomesticos[i].precioFinal();
                            electrodomesticosFinal = electrodomesticosFinal + electrodomesticos[i].precioFinal();
                        } else {
                            electrodomesticosFinal = electrodomesticosFinal + electrodomesticos[i].precioFinal();
                        }
                    }
                    System.out.println("Precio de los televisores = " + televisores + "Euros");
                    System.out.println("Precio de las lavadoras = " + lavadoras + "Euros");
                    System.out.println("Precio de todos electrodomesticos = " + electrodomesticosFinal + "Euros");
                    break;
                case 16:

                    int videojuegosEntregados = 0, seriesEntregadas = 0;
                    Serie[] series = new Serie[5];
                    Videojuego[] videojuegos = new Videojuego[5];
                    videojuegos[0] = new Videojuego("lol", 12, "MOBA", "Riot");
                    videojuegos[1] = new Videojuego("WoW", 20, "MMORPG", "Blizzard");
                    videojuegos[2] = new Videojuego("CoD", 14, "FPS", "Activision");
                    videojuegos[3] = new Videojuego("Hearthstone", 8, "Strategy", "Blizzard");
                    videojuegos[4] = new Videojuego();
                    series[0] = new Serie("GoT", 8, "Aventura", "NN");
                    series[1] = new Serie("HTGAWM", 3, "Investigacion", "NN");
                    series[2] = new Serie("HIMYM", 10, "Comedia", "NN");
                    series[3] = new Serie("Vikingos", 5, "Accion", "NN");
                    series[4] = new Serie("Breaking Bad", 12, "Aventura", "NN");

                    LinkedList<Object> listaVideojuegos = new LinkedList<Object>(Arrays.asList(videojuegos));
                    LinkedList<Object> listaSeries = new LinkedList<Object>(Arrays.asList(series));


                    series[0].entregar();
                    series[3].entregar();
                    videojuegos[1].entregar();
                    videojuegos[2].entregar();
                    videojuegos[4].entregar();


                    //DEFINIR CUANTOS VIDEOJUEGOS Y SERIES HAN SIDO ENTREGADAS
                    for (int i = 0; i < videojuegos.length; i++) {
                        if (videojuegos[i].isEntregado()) {
                            videojuegosEntregados = videojuegosEntregados + 1;
                        }
                        if (series[i].isEntregado()) {
                            seriesEntregadas = seriesEntregadas + 1;
                        }
                    }

                    System.out.println("Hay " + seriesEntregadas + " series entregadas");
                    System.out.println("Hay " + videojuegosEntregados + " videojuegos entregados");

                    //VER EL MAYOR DE LAS SERIES Y VIDEOJUEGOS

                    if (series[0].compareTo(series[1])) {
                        if (series[0].compareTo(series[2])) {
                            if (series[0].compareTo(series[3])) {
                                if (series[0].compareTo(series[4])) {
                                    System.out.println("La serie con mas temporadas es: \n" + series[0].toString());
                                }
                            }
                        }
                    }
                    if (series[1].compareTo(series[2])) {
                        if (series[1].compareTo(series[3])) {
                            if (series[1].compareTo(series[4])) {
                                if (series[1].compareTo(series[0])) {
                                    System.out.println("La serie con mas temporadas es: \n" + series[1].toString());
                                }
                            }
                        }
                    }
                    if (series[2].compareTo(series[1])) {
                        if (series[2].compareTo(series[0])) {
                            if (series[2].compareTo(series[3])) {
                                if (series[2].compareTo(series[4])) {
                                    System.out.println("La serie con mas temporadas es: \n" + series[2].toString());
                                }
                            }
                        }
                    }
                    if (series[3].compareTo(series[1])) {
                        if (series[3].compareTo(series[2])) {
                            if (series[3].compareTo(series[0])) {
                                if (series[3].compareTo(series[4])) {
                                    System.out.println("La serie con mas temporadas es: \n" + series[3].toString());
                                }
                            }
                        }
                    }
                    if (series[4].compareTo(series[1])) {
                        if (series[4].compareTo(series[2])) {
                            if (series[4].compareTo(series[0])) {
                                if (series[4].compareTo(series[3])) {
                                    System.out.println("La serie con mas temporadas es: \n" + series[4].toString());
                                }
                            }
                        }
                    }




                    if (videojuegos[0].compareTo(videojuegos[1])) {
                        if (videojuegos[0].compareTo(videojuegos[2])) {
                            if (videojuegos[0].compareTo(videojuegos[3])) {
                                if (videojuegos[0].compareTo(videojuegos[4])) {
                                    System.out.println("El videojuego con mas horas es: \n" + videojuegos[0].toString());
                                }
                            }
                        }
                    }
                    if (videojuegos[1].compareTo(videojuegos[0])) {
                        if (videojuegos[1].compareTo(videojuegos[2])) {
                            if (videojuegos[1].compareTo(videojuegos[3])) {
                                if (videojuegos[1].compareTo(videojuegos[4])) {
                                    System.out.println("El videojuego con mas horas es: \n" + videojuegos[1].toString());
                                }
                            }
                        }
                    }
                    if (videojuegos[2].compareTo(videojuegos[1])) {
                        if (videojuegos[2].compareTo(videojuegos[0])) {
                            if (videojuegos[2].compareTo(videojuegos[3])) {
                                if (videojuegos[2].compareTo(videojuegos[4])) {
                                    System.out.println("El videojuego con mas horas es: \n" + videojuegos[2].toString());
                                }
                            }
                        }
                    }
                    if (videojuegos[3].compareTo(videojuegos[1])) {
                        if (videojuegos[3].compareTo(videojuegos[2])) {
                            if (videojuegos[3].compareTo(videojuegos[3])) {
                                if (videojuegos[3].compareTo(videojuegos[4])) {
                                    System.out.println("El videojuego con mas horas es: \n" + videojuegos[3].toString());
                                }
                            }
                        }
                    }
                    if (videojuegos[4].compareTo(videojuegos[1])) {
                        if (videojuegos[4].compareTo(videojuegos[2])) {
                            if (videojuegos[4].compareTo(videojuegos[3])) {
                                if (videojuegos[4].compareTo(videojuegos[0])) {
                                    System.out.println("El videojuego con mas horas es: \n" + videojuegos[4].toString());
                                }
                            }
                        }
                    }


                    break;
            }

        } while (opcion != 0);
    }


}
