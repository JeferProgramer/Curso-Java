package com.mycompany.burbuja;

import java.util.Scanner;

public class Burbuja {
    public static void main(String[] args) {
        //el metodo burbuja es basicamente recorrer toda la lista del array y organizarlo
        //declarar las variables necesarios 
        Scanner entrada = new Scanner(System.in);
        int[] arreglo;
        int numeroElementos, memoria;
        //le pido que ingrese la cantidad de elementos del array
        System.out.println("Ingrese la cantidad de elementos del arreglo");
        numeroElementos = entrada.nextInt();
        //parametrizo y creo el nuevo array depnediendo de lo que puso el usuario
        arreglo = new int[numeroElementos];
        //le pido que ingrese los datos array y lleno el array
        System.out.println("Ingrese los datos del arreglo: ");
        for (int i = 0; i < numeroElementos; i++) {
            arreglo[i] = entrada.nextInt();
        }
        
        //Metodo burbuja
        // array = [1,2,3,4]
        //            |
        // i = 1 , numeroElementos -1 = 2 , j = 1 memoria = 3
        for (int i = 0; i < (numeroElementos-1); i++) { //Vueltas que necesitara dar para ordenar los elementos
            for (int j = 0; j < (numeroElementos-1); j++) { //Se desplaza entre los elementos
                if (arreglo[j] > arreglo[j+1]) {//preguntamos si el actual es mayor al siguiente
                    //aca me guardo el contenido actual
                    memoria = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = memoria;
                }
            }
        }
        
        System.out.println("Arreglo ordenado creciente: ");
        for (int i = 0; i < numeroElementos; i++) {
            System.out.print(arreglo[i]+" ");
        }
        
        System.out.println("\nArreglo ordenado decreciente");
        for (int i = numeroElementos-1; i >= 0; i--) {
            System.out.print(arreglo[i]+" ");
        }
    }
    
}
