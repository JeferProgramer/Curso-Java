package com.mycompany.ejercicio11;

import java.util.Scanner;


public class Ejercicio11 {

    /*
        Crea un programa que almacene 5 valores
        crecientes y los almacene en un arreglo de 
        10 elementos posteriomente leer un numero dado
        por el usuario e identificar en que posicion 
        debe de ingresarse para que el arreglo siga estando
        ordenado de manera creciente
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        boolean creciente = true;
        int numero, posicion = 0, j = 0;
        
        //Verifica que el arreglo este creciente
        System.out.println("Llena el arreglo");
        do {            
            
            //Llena el arreglo
            for (int i = 0; i < 5; i++) {
                arreglo[i] = entrada.nextInt();
            }
            
            for (int i = 0; i < 4; i++) {
                if (arreglo[i] < arreglo[i+1]) {
                    creciente = true;
                }
                if(arreglo[i] > arreglo[i+1]){
                    creciente = false;
                }
                
            if (creciente == false) {
                    System.out.println("El arreglo no esta arreglado vuelva");
                }
            }
        } while (creciente == false);
        
        //Numero por el usuario
        System.out.println("Ingresa un numero: ");
        numero = entrada.nextInt();
        
        //Checa la posicion donde debe de ir el numero
        while (arreglo[j]<numero && j<5) {            
            posicion++;
            j++;
        }
        
        arreglo[posicion] = numero;
        
        System.out.println("Arreglo actualizado: ");
        for (int i = 0; i < 6; i++) {
            System.out.println(arreglo[i]);
        }
        
         
    }
    
}
