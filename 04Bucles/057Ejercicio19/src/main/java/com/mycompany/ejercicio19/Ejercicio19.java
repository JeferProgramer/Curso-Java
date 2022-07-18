package com.mycompany.ejercicio19;

import javax.swing.JOptionPane;

public class Ejercicio19 {

    /*
        Crea un programa que dadas las calificaciones
        finales de 6 alumnos mostrar cuantos de estos
        aprobaron, son condicionados y suspensos
    */
    public static void main(String[] args) {
        //declaro variables
        int i, calificaciones;
        //recorro los 6 estudiantes
        for(i = 1; i <= 6; i++)
        {
            //capturo las calificaciones
            calificaciones = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la calificacion final: "));
            //si es mayor a 6 esta a probado
            if(calificaciones >=6)
            {
                System.out.println("Aprobado");
            }
            //si es igual a 4 es condicionado
            else if(calificaciones == 4)
            {
                System.out.println("Condicionado");
            }
            //si es mayor a cero y menor a 5 o igual y difrente de 4 suspenso
            else if(calificaciones>=0  && calificaciones <=5 && calificaciones!=4)
            {
                System.out.println("Suspenso");
            }
            //si no es erronea
            else
            {
                System.out.println("Calificacion erronea");
            }
            
        }
    }
    
}
