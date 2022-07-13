package com.mycompany.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Ejercicio6 {

    /*
        Crea un programa que lea una matriz de 5 x 9
        y traspon los datos en otra matriz de 9 x 5
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz1 = new int[5][9];
        int[][] matriz2 = new int[9][5];
        
        System.out.println("Ingrese la matriz: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matriz1[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("La matriz original es: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println(matriz1[i][j]+" ");
            }
            System.out.println("");
        }
        
        //Trasponiendo
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matriz2[i][j] = matriz1[j][i];
            }
        }
        
        System.out.println("La matriz traspuesta es: ");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(matriz2[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
