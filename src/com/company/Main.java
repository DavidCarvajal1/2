package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	Analasis:
	    Objetivos: Diseñar un programa que lea por teclado las coordenadas, y en función de la opción que se elija
	                el módulo de los vectores, las coordenadas del vector suma, el producto escalar de dos
	                vectores, y las coordenadas del vector producto vectorial de dos vectores.
        Entradas: Coordenadas
        Salida: Segun opción elejida
        Suposiciones: Las coordenadas introducidad tienen un formato correcto

    Codico generico:
        //leerCordenadas
        //elejirOpcion
            Opcion1
                //opcion1
            Opcion2
                //opcion2
            Opcion3
                //opcion3
            Opcion4
                //opcion4
    Subprogramas
        //opcion1
            Analasis:
                Prototipo: opcion1 (int)
                Objetivo: imprimir pon pantalla en modulo de dos vectores
                Precondiciones:
                Entrada: ejes x e y de los vectores
                salida: no hay salida es un procedimiento
                Postcondiciones: se escribio por pantalla los modulos de los vectores
        //opcion2
            Analasis:
                Prototipo: opcion2 (int)
                Objetivo: imprimir pon pantalla las coordenadas del vector suma
                Precondiciones:
                Entrada: ejes x e y de los vectores
                salida: no hay salida es un procedimiento
                Postcondiciones: se escribio por pantalla las coordenadas de los vectores
        //opcion3
            Analasis:
                Prototipo: opcion3 (int)
                Objetivo: imprimir pon pantalla el producto escalar de los vectores
                Precondiciones:
                Entrada: ejes x e y de los vectores
                salida: no hay salida es un procedimiento
                Postcondiciones: se escribio por pantalla las el producto escalar de los vectores
    //opcion4
            Analasis:
                Prototipo: opcion4 (int)
                Objetivo: imprimir pon pantalla el producto vectorial de los vectores
                Precondiciones:
                Entrada: ejes x e y de los vectores
                salida: no hay salida es un procedimiento
                Postcondiciones: se escribio por pantalla las el producto vectorial de los vectores
        //modulo
            Analisis:
                Prototipo: int modulo (int)
                Objetivo: calcular el modulo de un vector
                Precondiciones:
                Entrada: ejes x e y del vector
                salida: el modulo
                Postcondiciones: se guarda el modulo del vector

	 */
        Scanner sc = new Scanner(System.in);
        int x1, x2, y1, y2, opciones, resultado = 0, resultado2 = 0;
        char seguir;
        //leerCoordenadas
        do {
            System.out.println("escriba las coordenadas x, y del primer vector");
            x1 = sc.nextInt();
            x2 = sc.nextInt();
            System.out.println("escriba las coordenadas del segundo vector");
            y1 = sc.nextInt();
            y2 = sc.nextInt();
            //elejirOpcionç
            do {
                System.out.println("Elija una de las siguientes ipciones:\n 1-Calcular modulo de los vectores" +
                        "\n 2-Calcular las coordenadas del vector suma\n 3-Calcular el producto escalar de los dos vectores" +
                        "\n 4-Calcular las coordenadas del vector producto de los dos vectores");
                opciones = sc.nextInt();
                if (opciones < 0 || opciones > 5) {
                    System.out.println("error");
                }
            } while (opciones < 0 || opciones > 5);
            switch (opciones) {
                case 1:
                    opcion1(x1, x2, y1, y2);
                    break;
                case 2:
                    opcion2(x1, x2, y1, y2);
                    break;
                case 3:
                    opcion3(x1, x2, y1, y2);
                    break;
                case 4:
                    opcion4(x1, x2, y1, y2);
                    break;
            }
            System.out.println("desea seguir?");
            seguir=sc.next().charAt(0);
        }while (seguir=='s');
    }

    public static void opcion1(int x1, int x2, int y1, int y2) {
        System.out.println(modulo(x1, y1));
        System.out.println(modulo(x2, y2));
    }
    public static void opcion2(int x1, int x2, int y1, int y2){
        System.out.println("("+(x1+x2)+","+(y1+y2)+")");
    }
    public static void opcion3(int x1, int x2, int y1, int y2){
        System.out.println(((x1*x2)+(y1*y2)));
    }

    /**
     * Realizara la opcion cuatro del programa (coordenadas del vector producto)
     * @param x1
     * @param x2
     * @param y1
     * @param y2
     */
    private static void opcion4(int x1, int x2, int y1, int y2){
        Scanner sc=new Scanner(System.in);
        int vector;
        do{
            System.out.println("Cual es el angulo entre los vectores");
            vector= sc.nextInt();
            if (vector<0){
                System.out.println("error");
            }
        }while (vector<0);
        System.out.println(modulo(x1,y1)*modulo(x2,y2)*Math.cos(vector));
    }

    /**
     * Esta funcion devuelve el modulo de un vector
     * @param x
     * @param y
     * @return
     * @see double
     */

    public static int modulo(double x, double y) {
        return (int) Math.sqrt(x * x + y * y);
    }
}
