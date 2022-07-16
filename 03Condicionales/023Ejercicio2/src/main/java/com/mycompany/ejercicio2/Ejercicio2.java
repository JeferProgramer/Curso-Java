package com.mycompany.ejercicio2;

import javax.swing.JOptionPane;


public class Ejercicio2 {

    /*
        Crea un programa que pida dos numeros
        y retorne cual es el mayor o si son iguales
    */
    public static void main(String[] args) {
        //Declaro variables 
        float num1, num2;

        //Entrada de los numeros
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero"));

        //Condicion principal
        if(num1 > num2){
            JOptionPane.showMessageDialog(null, num1 + "es el mayor");
        }else if(num2 > num1){
            JOptionPane.showMessageDialog(null, num2+"es el mayor");
        }else{
            JOptionPane.showMessageDialog(null,"Los numeros son iguales");
        }
    }
    
}
