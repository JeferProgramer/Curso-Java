package com.mycompany.burbuja;

import java.util.Scanner;

public class Burbuja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo;
        int numeroElementos, memoria;
        
        System.out.println("Ingrese la cantidad de elementos del arreglo");
        numeroElementos = entrada.nextInt();
        
        arreglo = new int[numeroElementos];
        
        System.out.println("Ingrese los datos del arreglo: ");
        for (int i = 0; i < numeroElementos; i++) {
            arreglo[i] = entrada.nextInt();
        }
        
        //Metodo burbuja
        for (int i = 0; i < (numeroElementos-1); i++) { //Vueltas que necesitara dar para ordenar los elementos
            for (int j = 0; j < (numeroElementos-1); j++) { //Se desplaza entre los elementos
                if (arreglo[j] > arreglo[j+1]) {
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
