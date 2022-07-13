/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class Ejercicio6 {
    
    //Crea un programa que determine si dos numeros son pares o impares
    public static void main(String[] args) {
        float numero1, numero2;
        
        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero"));
        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero"));
        
        if (numero1 % 2 == 0 && numero2 % 2 == 0)
        {
            JOptionPane.showMessageDialog(null, "Ambos numros son pares");
        }
        else if (numero1 % 2 != 0 && numero2 % 2 != 0)
        {
            JOptionPane.showMessageDialog(null, "Ambos numeros son impares");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Uno de los numeros es par y el otro impar");
        }
    }
    
    
}
