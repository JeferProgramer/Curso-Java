package com.mycompany.ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    /*
        Crea un programa que almacene en un arreglo
        un total de 10 numeros enteros, posteriomente
        indicar si los elementos estan ordenados
        creciente, decreciente, esten desordenados
        o son todos iguales.
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        boolean creciente = false, decreciente = false;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = entrada.nextInt();
        }
        
        //Booleanos para el orden
        for (int i = 0; i < 9; i++) {
            if(numeros[i] < numeros[i+1])
            {
                creciente = true;
            }
            if(numeros[i] > numeros[i+1])
            {
                decreciente = true;
            }
        }
        
        if (creciente == true && decreciente == false) {
            System.out.println("El arreglo es creciente");
        }
        else if (creciente = false && decreciente == true ) {
            System.out.println("El arreglo es decreciente");
        }
        else if(creciente == true && decreciente == true){
            System.out.println("El arreglo es desordenado");
        }
        else{
            System.out.println("Todos los valores son iguales");
        }
        
        
    }
    
}
