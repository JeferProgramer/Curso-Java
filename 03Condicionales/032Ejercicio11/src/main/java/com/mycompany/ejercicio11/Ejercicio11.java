package com.mycompany.ejercicio11;

import javax.swing.JOptionPane;

public class Ejercicio11 {

    /*
        Crea un programa que simule una calculadora con
        las operaciones de (suma, resta, producto, division)
        El usuario tendra la posibilidad de elegir
        
    ---Opcion   // Parametro ---
        Suma        s / S
        Resta       r / R
        Producto    p / P / m / M
        Division    d / D
        
        Para especificar la opercion a realizar
    */
    public static void main(String[] args) {
        //inizialiso variables
        char opcion;
        float numero1, numero2, resultado =0;
        
        //capturo los datos y los convierto
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        opcion = JOptionPane.showInputDialog("Ingrese la opcion para operar los numeros: Suma, Resta, Multiplicacion, Division").charAt(0);
        //char at para capturar el primer caracter
        
        if(opcion == 's' || opcion == 'S')
        {
            resultado = numero1 + numero2;
        }
        else if(opcion == 'r' || opcion == 'R')
        {
            resultado = numero1 - numero2;
        }
        else if(opcion == 'p' || opcion == 'P' || opcion == 'm' || opcion == 'M')
        {
            resultado = numero1 * numero2;
        }
        else if(opcion == 'd' || opcion == 'D')
        {
            if(numero2 != 0)
            {
                resultado = numero1 / numero2;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error, divison sobre 0");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error, respuesta incorrecta");
        }
        
        JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);
    }
    
}
