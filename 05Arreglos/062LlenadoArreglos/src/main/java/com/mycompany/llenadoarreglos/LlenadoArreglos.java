package com.mycompany.llenadoarreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class LlenadoArreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Variable del numero total de elementos
        int numeroElementos;
        numeroElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos del arreglos: "));
        
        //Arreglo de puras letras
        char[] letras = new char[numeroElementos];
        
        System.out.println("Digite los elemeentos de su arreglo: ");
        for (int i = 0; i < numeroElementos; i++)   //Bucle para ir llenando el arreglo
        {
            System.out.print("Digite un caracter");
            letras[i] = entrada.next().charAt(0);   //Elementos a llenar
        }
        
        for (int i = 0; i < numeroElementos; i++) 
        {
            //Muestra el arreglo final
            System.out.print(letras[i]+" ");
        }
    }
    
}
