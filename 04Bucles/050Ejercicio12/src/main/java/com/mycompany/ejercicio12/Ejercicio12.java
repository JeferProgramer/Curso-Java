package com.mycompany.ejercicio12;

import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class Ejercicio12 {

    /*
        Crea un programa que calcule el 
        factorial de un numero dado por el usuario
    */
    public static void main(String[] args) {
        int i, numero, factorial=1;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
        
        for(i = 1; i<= numero; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("El factorial de: "+numero+"!, es: "+factorial);
        
    }
    
}
