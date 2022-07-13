package com.mycompany.ejercicio16;

import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class Ejercicio16 {

    /*
        Crea un programa que que muestre la tabla
        de multiplicar que el usuario solicite
        en un rango del 0 al 10
    */
    public static void main(String[] args) {
        int numero, i,j, resultado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        System.out.println("Tabla de multiplicar del: "+numero);
        for(i = 0; i<=10; i++)
        {
            System.out.println(numero+" x "+i+" = "+numero*i);
        }
        
    }
    
}
