package com.mycompany.seleccion;

import java.util.Scanner;
public class Seleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaro scanner y variables
        Scanner entrada = new Scanner(System.in);
        int[] arreglo;
        int numeroElementos, numeroMenor, memoria;
        //le pido que digite el numero de elementos que va a tner el arry y lo capturo
        System.out.println("Digite el numero de elementos del arreglo: ");
        numeroElementos = entrada.nextInt();
        //inicializo el array dependiendo de lo que escriba el usuario
        arreglo = new int[numeroElementos];
        //le pido que ingrese los datos
        System.out.println("Ingrese los datos del arreglo: ");
        for (int i = 0; i < numeroElementos; i++) {
            arreglo[i] = entrada.nextInt();
        }
        //[1,2,3,4]
        //     |
        // i = 2 numeroElementos = 3 numeroMenor = 2 j = 3, memoria = 3, 
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
