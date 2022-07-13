package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Ejercicio1 {

    /*
        Crea un programa donde se almacena
        5 numeros en un arreglo y los muestra
        en el orden en el que se fueron
        ingresando
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        
        System.out.println("Ingrese los elementos de su arreglo ");
        for(int i = 0; i<5; i++)
        {
            System.out.print("Digite un numero:");
            numeros[i] = entrada.nextInt();
        }
        
        for(int i:numeros)
        {
            System.out.print(i+" ");
        }
    }
    
}
