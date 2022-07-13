package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Ejercicio2 {

    /*
        Crea un programa donde almacene 5
        numeros en un arreglo y muestre
        los elementos en el orden inverso
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Ingresa un numero:");
            numeros[i] = entrada.nextInt();
        }
        
        for (int i = 4; i >= 0; i--)
        {
            System.out.println("Numero: "+numeros[i]);
        }
    }
    
}
