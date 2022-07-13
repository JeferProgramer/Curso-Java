package com.mycompany.ejercicio14;

import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class Ejercicio14 {

    /*
        Crea un programa que pida 10 sueldos 
        mostrar la suma de ellos y cuantos de estos
        son menores a $1000
    */
    public static void main(String[] args) {
        float i, sueldos, contador = 0, suma = 0;
        
        for (i = 1; i <= 10; i++) 
        {
            sueldos = Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu sueldo"));
            if (sueldos <1000)
            {
                contador++;
            }
            suma = suma + sueldos;
        }
        System.out.println("La suma de todos los sueldos es: "+suma);
        System.out.println("El numero de sueldos menores a mil es: "+contador);
    }
    
}
