/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicio6;

import javax.swing.JOptionPane;

public class Ejercicio6 {
    
    //Crea un programa que determine si dos numeros son pares o impares
    public static void main(String[] args) {
        //decalro variables
        float numero1, numero2;
        //me guardo las entradas del usuario y combierto a decimales
        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero"));
        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero"));
        //empiezo a preguntas caminos con ifs
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
