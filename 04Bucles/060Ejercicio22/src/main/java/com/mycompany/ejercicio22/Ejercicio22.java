package com.mycompany.ejercicio22;

import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class Ejercicio22 {

    /*
        Crea un programa que pida la calificacion
        final de 5 alumnos y muestre al final si hay
        algun suspenso
    */
    public static void main(String[] args) {
        int i, calificacion;
        boolean suspenso = false;
        
        for (i = 1; i <= 5; i++)
        {
            calificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificacion: "));
            
            if(calificacion < 5)
            {
                suspenso = true;
            }
        }
        if(suspenso = true)
        {
            System.out.println("Hay un suspenso");
        }
        else
        {
            System.out.println("Ningun suspenso");
        }
            
    }
    
}
