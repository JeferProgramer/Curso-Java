package com.mycompany.ejercicio5;

import java.util.Scanner;


public class Ejercicio5 {

    /*
        Crea un programa donde se llene 2 arreglos (A, B)
        de 10 elementos con numeros enteros
        y despues muestre sus elementos en el orden del
        1ro de A, 1ro de B, 2do de A, 2do de B
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arregloA = new int[10];
        int[] arregloB = new int[10];
        int[] arregloJunto = new int[20];
        
        //Rellena el arreglo A
        for (int i = 0; i < 10; i++) {
            arregloA[i] = i;
        }
        //Rellena el arreglo B
        for (int i = 0; i < 10; i++) {
            arregloB[i] = i; 
        }
        
        //Puntero del arreglo C
        int j = 0;
        //Va  llenando con los elementos del arreglo A y arreglo B
        for (int i = 0; i < 10; i++) {
            arregloJunto[j] = arregloA[i];
            j++;
            arregloJunto[j] = arregloB[i];
            j++;
        }
        
        //Mensaje final al usuario
        for (int i = 0; i < 20; i++) {
            System.out.print(arregloJunto[i]+" ");
        }

    }
    
}
