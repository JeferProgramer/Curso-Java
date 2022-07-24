package com.mycompany.ejercicio1;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio1 {

    /*
        Crea un programa que ayude al usuario a comprobar
        si la matriz que esta ingresando es simetrica, es
        decir, que contengan el mismo numero de filas y columnas,
        y que su matriz traspuesta sea igual a la original
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz;
        int numeroFilas, numeroColumnas;
        boolean simetrica = true;
        
        numeroFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas: "));
        numeroColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas: "));
        matriz = new int[numeroFilas][numeroColumnas];
        
        System.out.println("Ingresa los valores de la matriz: ");
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                System.out.println("Matriz ["+i+"] ["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        if (numeroFilas == numeroColumnas) {
            int i=0;
            while (i<numeroFilas && simetrica == true) {                
                int j = 0;
                while (j<i && simetrica == true) {                    
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if (simetrica == true) {
                System.out.println("La matriz es simetrica");
            }
            else{
                System.out.println("La matriz no es simetrica");
            }
        }
        else{
            System.out.println("La matriz no es simetrica");
        }
    }
    
}
