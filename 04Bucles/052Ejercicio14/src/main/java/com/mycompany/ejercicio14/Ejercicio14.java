package com.mycompany.ejercicio14;

import javax.swing.JOptionPane;

public class Ejercicio14 {

    /*
        Crea un programa que pida 10 sueldos 
        mostrar la suma de ellos y cuantos de estos
        son menores a $1000
    */
    public static void main(String[] args) {
        //declarar variables 
        float i, sueldos, contador = 0, suma = 0;
        //recorremos y solicitamos los 10 sueldos que necesitamos
        for (i = 1; i <= 10; i++) 
        {
            //me guardo el sueldo que escribe
            sueldos = Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu sueldo"));
            //si el numero es menor a 1000 incremento el contador de menor a 1000
            if (sueldos <1000)
            {
                contador++;
            }
            //hago la suma con todos los sueldos uno por uno por cada recorrido
            suma = suma + sueldos;
        }
        //mostrar la suma 
        System.out.println("La suma de todos los sueldos es: "+suma);
        //mostrar el contador
        System.out.println("El numero de sueldos menores a mil es: "+contador);
    }
    
}
