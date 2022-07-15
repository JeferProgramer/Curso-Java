package com.mycompany.ejercicio5;

import javax.swing.JOptionPane;

public class Ejercicio5 {

    /*
        Un usuario necesita calcular su salario semanal
        el cual se obtiene por:
        ->Si trabaja 40 hrs o menos se le paga $16 x hr
        ->Si trabaja mas de 40 hrs se le paga  $16 x hr
        las primeras 40 y $20 las hrs extra.
        Crea un programa que le muestre al usuario su 
        salario en base a las condiciones establecidadas.
    */
    public static void main(String[] args) {
        int horasTrabajadas, salarioSemanal;
        
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las horas trabajadas en la semana: "));
        
        if (horasTrabajadas > 400)
        {
                
            salarioSemanal = (horasTrabajadas * 16) + ((horasTrabajadas - 40) * 20);
        }
        else
        {
            salarioSemanal = horasTrabajadas * 16;
        }
        
        JOptionPane.showMessageDialog(null, "Su salario semanal es de: $"+salarioSemanal);
    }
    
}
