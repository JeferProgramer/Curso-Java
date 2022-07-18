package com.mycompany.ejercicio22;

import javax.swing.JOptionPane;

public class Ejercicio22 {

    /*
        Crea un programa que pida la calificacion
        final de 5 alumnos y muestre al final si hay
        algun suspenso
    */
    public static void main(String[] args) {
        //declaro variables
        int i, calificacion;
        boolean suspenso = false;
        //recorro los 5 estudiantes
        for (i = 1; i <= 5; i++)
        {
            //capturo la calificacion ingresada
            calificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificacion: "));
            //si la calificacion es menor a 5 suspenso pasa a true
            if(calificacion < 5)
            {
                suspenso = true;
            }
        }
        //si suspenso es igual a true digo que hay suspensos
        if(suspenso = true)
        {
            System.out.println("Hay un suspenso");
        }
        //si no no hay suspenso
        else
        {
            System.out.println("Ningun suspenso");
        }
            
    }
    
}
