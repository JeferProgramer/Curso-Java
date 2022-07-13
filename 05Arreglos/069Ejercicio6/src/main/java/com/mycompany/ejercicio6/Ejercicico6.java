package com.mycompany.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Ejercicico6 {

    /*
        Crea un programa que almacene 12 elementos
        para 2 arreglos A y B, y mezclarlos en un
        tercero para mostrarlos en la forma de:
        3 de A. 3 de b, 3 de A, 3 de B,...,etc.  
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arregloA = new int[12];
        int[] arregloB = new int[12];
        int[] arregloC = new int[24];
        //Llenado del arreglo A
        for (int i = 0; i < 12; i++) {
            arregloA[i] = i;
        }
        //Llenado del arreglo B
        for (int i = 0; i < 12; i++) {
            arregloB[i] = i;
        }
        
        //Puntero para los arreglos A, B
        int i = 0;
        //Puntero para el arreglo C
        int j = 0;
        while(i < 12)
        {
            for (int k = 0; k < 3; k++) {
               arregloC[j] = arregloA[i+k];
               j++;
            }
            for (int k = 0; k < 3; k++) {
               arregloC[j] = arregloB[i+k];
               j++;
            }
            i = i +3;
        }
        //Muestra los elementos de arreglo C
        for (i = 0; i < 24; i++) {
            System.out.print(arregloC[i]+" ");
        }
           
    }
    
}
