package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Ejercicio3 {

    /*
        Crea un programa que ingrese una matriz
        de 3 x 3 y mostrar su traspuesta
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        
        System.out.println("Ingrese los datos d ela matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Matriz ["+i+"] ["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("La matriz original: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
        //Trasponer la matriz
        int memoria = 0; 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                memoria = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = memoria;
            }
        }    
        
        System.out.println("La matriz original: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
}
