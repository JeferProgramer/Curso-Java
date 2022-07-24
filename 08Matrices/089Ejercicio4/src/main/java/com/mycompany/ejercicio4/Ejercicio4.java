package com.mycompany.ejercicio4;

public class Ejercicio4 {

    /*
        Crea un programa que dada una matriz de 7x7
        rellene con datos de tal forma que la diagonal
        sea 1 y el resto 0
    */
    public static void main(String[] args) {
        int[][] matriz = new int[7][7];
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                }
                else{
                    matriz[i][j] = 0;
                }
            }
        }
        
        System.out.println("La matriz es: ");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
