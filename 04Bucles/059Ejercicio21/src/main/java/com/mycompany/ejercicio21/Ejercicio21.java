package com.mycompany.ejercicio21;

import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class Ejercicio21 {

    /*
        Crea un programa donde acepte 10 numeros
        y muestre al final si se introdujo
        algun numero negativo
    */
    public static void main(String[] args) {
        int i, numero, contador = 0;
        
        for(i =1; i<=10;i++)
        {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
            
            if(numero<0)
            {
                contador +=1;
            }
        }
        if(contador!=0)
        {
            System.out.println("Se introdujeron: "+contador+" numeros negativos");
        }
        else
        {
            System.out.println("No se introdujeron numeros negativos");
        }
    }
    
}
