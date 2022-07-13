package com.mycompany.seleccion;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Seleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo;
        int numeroElementos, numeroMenor, memoria;
        
        System.out.println("Digite el numero de elementos del arreglo: ");
        numeroElementos = entrada.nextInt();
        
        arreglo = new int[numeroElementos];
        
        System.out.println("Ingrese los datos del arreglo: ");
        for (int i = 0; i < numeroElementos; i++) {
            arreglo[i] = entrada.nextInt();
        }
        
        //Seleccion
        for (int i = 0; i < numeroElementos; i++) { //Puntero del arreglo a checar
            numeroMenor = i;    //Supone como menor el que esta en esa posicion
            for (int j = i+1; j < numeroElementos; j++) {  //Recorre los datos del arreglo
                if (arreglo[j] < arreglo[numeroMenor]) {    //Checa si la suposicion es incorrecta
                    numeroMenor = j;    //Almacena el valor que si es mas chico
                }
            }
            //Realiza el cambio
            memoria = arreglo[i];
            arreglo[i] = arreglo[numeroMenor];
            arreglo[numeroMenor] = memoria;
            
        }
        
        System.out.println("Arreglo orden creciente: ");
        for (int i = 0; i < numeroElementos; i++) {
            System.out.print(arreglo[i]+" ");
        }
        
        System.out.println("\nArreglo orden decreciente: ");
        for (int i = numeroElementos-1; i >= 0; i--) {
            System.out.print(arreglo[i]+" ");
        }
    }
    
}
