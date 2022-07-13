package com.mycompany.ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class Ejercicio3 {

    /*
        Crea un programa que lea un caracter
        por teclado y compruebe si es una letra
        mayuscula
    */
    public static void main(String[] args) {
        String caracter;
        
        caracter = JOptionPane.showInputDialog("Ingrese una letra");
        
        //Tambien puedes usar "Character.isUpperCase(caracter)
        if (caracter == caracter.toUpperCase())
        {
            JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
        }
        else
        {
           JOptionPane.showMessageDialog(null, "Es una letra minuscula");
        }
    }
    
}
