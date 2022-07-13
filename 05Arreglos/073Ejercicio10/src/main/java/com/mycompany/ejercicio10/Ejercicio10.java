package com.mycompany.ejercicio10;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Ejercicio10 {

    /*
        Crea un programa que que lea 10 datos y los
        almacene en un arreglo, despues desplazarlo
        tantas veces como el usuario quiera
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int numeroDesplazamiento, ultimo;
        
        System.out.println("Llena el arreglo: ");
        for (int i = 0; i < 10; i++) {
            arreglo[i] = entrada.nextInt();
        }
        
        System.out.println("Digita el numero de desplazamientos: ");
        numeroDesplazamiento = entrada.nextInt();
        
        for (int vuelta = 0; vuelta < numeroDesplazamiento; vuelta++) {
            ultimo = arreglo[9];    //Por cada vuelta almacena el ultimo numero
            for (int i = 8; i > 0; i--) {
                arreglo[i+1] = arreglo[i];
            }
            arreglo[0] = ultimo;
        }
        
        System.out.println("El arreglo actualizado es: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(arreglo[i]);
        }
    }
    
}
