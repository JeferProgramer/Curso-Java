package com.mycompany.ejercicio20;

import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class Ejercicio20 {

    /*
        Crea un programa que pida tantos sueldos
        indique el usuario y muestre cual es el
        sueldo maximo
    */
    public static void main(String[] args) {
        int i, sueldo, numeroSueldos, sueldoMaximo;
        
        numeroSueldos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa cuantos sueldos vas a registrar"));
        if(numeroSueldos > 0)
        {
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto del sueldo: "));
            sueldoMaximo = sueldo;
            for(i = 1; i<numeroSueldos; i++)
            {
                sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto del sueldo: "));
                if(sueldo > sueldoMaximo)
                {
                    sueldoMaximo = sueldo;
                }
            }
            System.out.println("El sueldo maximo es: $"+sueldoMaximo);
        }
        else
        {
            System.out.println("Error");
        }
    }
    
}
