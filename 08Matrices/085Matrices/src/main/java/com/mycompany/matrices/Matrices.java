package com.mycompany.matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Dimension - Nombre - Cantidad de filas - (OPCIONAL) Elementos a guardar
        int[][] matriz;
        int numeroFilas, numeroColumnas;
        
        numeroFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        numeroColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        
        matriz = new int[numeroFilas][numeroColumnas];
        
        System.out.println("Ingrese los datos de la matriz: ");
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                System.out.println("Matriz: ["+i+"] ["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("La matriz es: ");
        for (int i = 0; i < numeroFilas; i++) {   //Numero de filas
            for (int j = 0; j < numeroColumnas; j++) {   //Numero de columnas
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
