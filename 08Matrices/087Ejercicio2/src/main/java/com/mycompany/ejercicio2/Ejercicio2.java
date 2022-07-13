package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Ejercicio2 {

    /*
        Crea un programa que sume 2 matrices de
        3 x 3 y la muestre al usuario
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] suma = new int[3][3];
        
        System.out.println("Ingrese los datos de la matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Matriz 1 ["+i+"] ["+j+"]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("Ingrese los datos de la matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Matriz 2 ["+i+"] ["+j+"]: ");
                matriz2[i][j] = entrada.nextInt();
            }
        }
        
        //Suma de las matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        System.out.println("La suma de las matrices es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(suma[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
