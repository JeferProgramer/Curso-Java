package com.mycompany.ejercicio19;

import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class Ejercicio19 {

    /*
        Crea un programa que dadas las calificaciones
        finales de 6 alumnos mostrar cuantos de estos
        aprobaron, son condicionados y suspensos
    */
    public static void main(String[] args) {
        int i, calificaciones;
        
        for(i = 1; i <= 6; i++)
        {
            calificaciones = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la calificacion final: "));
            
            if(calificaciones >=6)
            {
                System.out.println("Aprobado");
            }
            else if(calificaciones == 4)
            {
                System.out.println("Condicionado");
            }
            else if(calificaciones>=0  && calificaciones <=5 && calificaciones!=4)
            {
                System.out.println("Suspenso");
            }
            else
            {
                System.out.println("Calificacion erronea");
            }
            
        }
    }
    
}
