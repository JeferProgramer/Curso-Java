package com.mycompany.insercion;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Insercion {

    public static void main(String[] args) {
        //declaro scanner y
        Scanner entrada = new Scanner(System.in);
        int[] arreglo;
        int numeroElementos, posicion, memoria;
        
        System.out.println("Ingrese el numero de elementos: ");
        numeroElementos = entrada.nextInt();
        
        arreglo = new int[numeroElementos];
        
        System.out.println("Ingrese el los datos del arreglo: ");
        for (int i = 0; i < numeroElementos; i++) {
            arreglo[i] = entrada.nextInt();
        }
        //[4,3,2,1,5]
        //         |
        //numeroElementos = 4, posicion = 3, memoria = 1 , i = 4
        //Insercion
        for (int i = 0; i < numeroElementos; i++) { //Puntero del arreglo
            posicion = i;
            memoria = arreglo[i]; //Guarda el dato de tal posicion
            
            while (posicion > 0 && (arreglo[posicion-1] > memoria)) {   //Comprueba que los datos anteriores a dicha posicion sean menores
                arreglo[posicion] = arreglo[posicion-1];    //Va moviendo hacia la izquierda
                posicion--;
            }
            arreglo[posicion] = memoria;    //Vuelve a colocar en la posicion que le corresponde el dato guardado
        }
        //lo muestro creciente
        System.out.println("Arreglo ordenado creciente: ");
        for (int i = 0; i < numeroElementos; i++) {
            System.out.print(arreglo[i]+" ");
        }
        //lo muestro decreciente
        System.out.println("\nArreglo ordenado decreciente: ");
        for (int i = numeroElementos-1; i >= 0; i--){
            System.out.print(arreglo[i]+" ");
        }
    }
    
}
