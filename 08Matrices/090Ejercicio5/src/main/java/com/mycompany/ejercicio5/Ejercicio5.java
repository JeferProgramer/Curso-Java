package com.mycompany.ejercicio5;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class Ejercicio5 {

    /*
        Crea un programa que reciba una matriz de n x m 
        y muestre la suma de cada fila y cada columna
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz;
        int numeroFilas, numeroColumnas, sumaFilas, sumaColumnas;
        
        numeroFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas: "));
        numeroColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas: "));
        matriz = new int[numeroFilas][numeroColumnas];
        
        System.out.println("Ingrese los datos de la matriz: ");
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                System.out.println("Matriz ["+i+"] ["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("La matriz es: ");
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("La suma de filas: ");
        for (int i = 0; i < numeroFilas; i++) {
            sumaFilas = 0;
            for (int j = 0; j < numeroColumnas; j++) {
                sumaFilas = sumaFilas + matriz[i][j];
            }
            System.out.println("La suma de la fila ["+i+"] es: "+sumaFilas);
        }
        System.out.println("");
        
        
        System.out.println("Suma de columnas: ");
        for (int j = 0; j < numeroColumnas; j++) {
            sumaColumnas = 0;
            for (int i = 0; i < numeroFilas; i++) {
                sumaColumnas = sumaColumnas + matriz[i][j];
            }
            System.out.println("La suma de la fila ["+j+"] es: "+sumaColumnas);
        }
        System.out.println("");
    }
    
}
