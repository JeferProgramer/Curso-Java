package com.mycompany.ejercicio20;

import javax.swing.JOptionPane;

public class Ejercicio20 {

    /*
        Crea un programa que pida tantos sueldos
        indique el usuario y muestre cual es el
        sueldo maximo
    */
    public static void main(String[] args) {
        //declaro variables
        int i, sueldo, numeroSueldos, sueldoMaximo;
        //numero de sueldos que quiere el usuario
        numeroSueldos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa cuantos sueldos vas a registrar"));
        //si es mayor 0 entro aca
        if(numeroSueldos > 0)
        {
            //ingreso el primerr sueldo y se lo asigno a sueldo maximo
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto del sueldo: "));
            sueldoMaximo = sueldo;
            //recorro los sueldos que solicito el usuario
            for(i = 1; i<numeroSueldos; i++)
            {
                //dentro del for le pido que ingrese el sueldo
                sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto del sueldo: "));
                //si es mayor mi sueldo ultimo ingresado al sueldo maximo le asigno ese valor de ese seuldo a sueldo maximo
                if(sueldo > sueldoMaximo)
                {
                    sueldoMaximo = sueldo;
                }
            }
            //imprimo el sueldo
            System.out.println("El sueldo maximo es: $"+sueldoMaximo);
        }
        else
        {
            System.out.println("Error");
        }
    }
    
}
