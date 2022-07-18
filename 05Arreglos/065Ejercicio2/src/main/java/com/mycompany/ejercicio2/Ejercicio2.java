package com.mycompany.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    /*
        Crea un programa donde almacene 5
        numeros en un arreglo y muestre
        los elementos en el orden inverso
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //declaro el array de 5 posiciones
        int[] numeros = new int[5];
        //en el for recorro las 5 veces y voy llenando el array
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Ingresa un numero:");
            numeros[i] = entrada.nextInt();
        }
        //hago el reverso entonces con i decremento e i es igual a 4
        for (int i = 4; i >= 0; i--)
        {
            System.out.println("Numero: "+numeros[i]);
        }
    }
    
}
