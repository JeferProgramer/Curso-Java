 package com.mycompany.ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    /*
        Crea un programa que almacene 10 datos en un
        arreglo, posteriomente el usuario debera
        ingresar una posicion del arreglo
        y borrar ese dato sin dejar ningun hueco intermedio
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int posicion;
        
        System.out.println("Llena el arreglo");
        for (int i = 0; i < 10; i++) {
            arreglo[i] = entrada.nextInt();
        }
        
        do {
            System.out.println("Digite una posicion entre 0 y 9: ");
            posicion = entrada.nextInt();
        } while (posicion<0 || posicion>9);
        
        for (int i = posicion; i < 9; i++) {
            arreglo[i] = arreglo[i+1];
        }
        
        for (int i = 0; i < 9; i++) {
            System.out.print(arreglo[i]+" ");
        }
    }
    
}
