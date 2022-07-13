package com.mycompany.ejercicio7;

import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class Ejercicio7 {

    //Crea un programa que ordene 3 numeros de mayor a menos ingresados por el usuario
    public static void main(String[] args) {
        float numero1, numero2, numero3, memoria;
        

        
        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero"));
        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero"));
        numero3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero"));        
        
        if(numero1>numero2 && numero2>numero3)
        {
            JOptionPane.showMessageDialog(null, "Orden: "+numero1+", "+numero2+", "+numero3);
        }
        else if(numero1>numero3 && numero3>numero2)
        {
            JOptionPane.showMessageDialog(null, "Orden: "+numero1+", "+numero3+", "+numero2);
        }
        else if(numero2>numero1 && numero1>numero3)
        {
            JOptionPane.showMessageDialog(null, "Orden: "+numero2+", "+numero1+", "+numero3);
        }
        else if(numero2>numero3 && numero3>numero1)
        {
            JOptionPane.showMessageDialog(null, "Orden: "+numero2+", "+numero3+", "+numero1);
        }
        else if(numero3>numero1 && numero1>numero2)
        {
            JOptionPane.showMessageDialog(null, "Orden: "+numero3+", "+numero1+", "+numero2);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Orden: "+numero3+", "+numero2+", "+numero1);
        }
        
        
        /*
            if(numero1 > numero2 && numero1 > numero3)
            {
                if(numero2 > numero3)
                {
                    numero1 = numero1;
                    numero2 = numero2;
                    numero3 = numero3;
                }
                else
                {
                    memoria = numero2;
                    numero2 = numero3;
                    numero3 = memoria;
                }
            }
            else if(numero2 > numero1 && numero2 > numero3)
            {
                if(numero1 > numero3)
                {
                    memoria = numero1;
                    numero1 = numero2;
                    numero2 = memoria;
                    numero3 = numero3;
                }
                else
                {
                    memoria = numero1;
                    numero1 = numero2;
                    numero2 = numero3;
                    numero3 = memoria;
                }
            }
            else if(numero3 > numero1 && numero3 > numero2)
            {
                if(numero1 > numero2)
                {
                    memoria = numero1;
                    numero1 = numero3;
                    numero3 = numero2;
                    numero2 = memoria;
                }
                else
                {
                    memoria = numero1;
                    numero1 = numero3;
                    numero3 = memoria;
                }
            }
            JOptionPane.showMessageDialog(null, "Del mayor al menor son: "+numero1+", "+numero2+", "+numero3);      
        */
    }
    
}
