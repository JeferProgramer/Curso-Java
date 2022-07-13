package com.mycompany.ejercicio4;

/**
 *
 * @author alemr
 */
public class Ejercicio4 {

    /*
        Crea un programa que donde lea 10 numeros
        enteros y los guarde en un arreglo, posteriomente
        debera mostrarlos en el orden:
        Primero, Ultimo, Segundo, Penultimo, Tercero,...,etc.
    */
    public static void main(String[] args) {
        int[] numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            numeros[i] = i;
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i]+" ");
            System.out.print(numeros[9-i]+" ");
        }
    }
    
}
