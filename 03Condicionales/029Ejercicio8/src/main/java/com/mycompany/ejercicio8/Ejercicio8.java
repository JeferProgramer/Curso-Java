package com.mycompany.ejercicio8;

import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class Ejercicio8 {

    /*
        Crea un progranma que determine el numero
        de crifras entre un rango de 0 a 99 999   
    */
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 0 y 99 999: "));
        
       if(numero <10)
       {
           JOptionPane.showMessageDialog(null, "EL numero: "+numero+", tiene 1 cifra");
       }
       else if (numero < 100) 
       {
           JOptionPane.showMessageDialog(null, "EL numero: "+numero+", tiene 2 cifra");
       }
       else if (numero < 1000) 
       {
           JOptionPane.showMessageDialog(null, "EL numero: "+numero+", tiene 3 cifra");
       }
       else if (numero < 10000) 
       {
           JOptionPane.showMessageDialog(null, "EL numero: "+numero+", tiene 4 cifra");
       }
       else if (numero < 100000) 
       {
           JOptionPane.showMessageDialog(null, "EL numero: "+numero+",tiene 5 cifra");
       }
       else
       {
           JOptionPane.showMessageDialog(null, "EL numero tiene mas de 5 cifras");
       }
       
    }
    
}
