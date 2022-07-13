package com.mycompany.ejercicio9;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Ejercicio9 {

    /*
        Crea un programa donde se almacene por teclado
        10 elementos y los almacene en un arreglo
        posteriormente debera desplazar todos los
        datos una posicio
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int ultimo;
        
        //LLena el arreglo
        System.out.println("Llena el arreglo");
        for (int i = 0; i < 10; i++) {
            arreglo[i] = entrada.nextInt();
        }
        
        //guarda en memoria el ultimo dato
        ultimo = arreglo[9];
        
        //Va moviendo los datos
        for (int i = 8; i > 0; i--) {
            arreglo[i+1] = arreglo[i];
        }
        
        arreglo[0] = ultimo;
        
        System.out.println("El arreglo actualizado es: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(arreglo[i]);
        }
    }
    
}
