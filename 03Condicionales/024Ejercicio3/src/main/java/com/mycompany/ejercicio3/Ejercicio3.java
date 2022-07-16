package com.mycompany.ejercicio3;

import javax.swing.JOptionPane;


public class Ejercicio3 {

    /*
        Crea un programa que lea un caracter
        por teclado y compruebe si es una letra
        mayuscula
    */
    public static void main(String[] args) {
        //Declaro variable
        String caracter;

        //guardo lo que ingresa el usuario
        caracter = JOptionPane.showInputDialog("Ingrese una letra");

        //valido condicion
        if(caracter == caracter.toUpperCase()){
            JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
        }else{
            JOptionPane.showMessageDialog(null, "Es una letras minuscula");
        }

    }
    
}
