package com.mycompany.ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class Ejercicio1 {

    /*
        Crea un programa que determine si un
        numero entero ingresado por el usuario es 
        multiplo de 10
    */
    public static void main(String[] args) {
        //Declaracion de variables
        int numero;
        
        //Entrada del numeor
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        //Mensaje al usuario
        JOptionPane.showMessageDialog(null, (numero % 10 == 0) ? "Es multiplo de 10" : "No es multiplo de 10");         
    }
    
}
