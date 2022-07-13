package com.mycompany.ejercicio15;

import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class Ejercicio15 {

    /*
        Crea un prorgama que le solicite la edad
        y estatura a 5 usuarios
        Determina la media de las edades, y las alturas
        asi tambien mostrar, cuantos de estos usuarios
        son mayores a 18 anios y miden mas de 1.75m
    */
    public static void main(String[] args) {
        int i, edad, contadorEdad = 0, contadorEstatura = 0;
        float estatura, sumaEstatura = 0, sumaEdad = 0;
        
        for(i = 1; i<=5; i++)
        {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
            estatura = Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu estatura en metros"));
            if(edad > 18)
            {
                contadorEdad++;
            }
            if(estatura > 1.75f)
            {
                contadorEstatura++;
            }
            sumaEdad = sumaEdad + edad;
            sumaEstatura = sumaEstatura + estatura;
        }
        System.out.println("La media de las edades es: "+sumaEdad/5);
        System.out.println("La media de las estaturas es: "+sumaEstatura/5);
        System.out.println("La cantidad de alumnos mayores a 18 son: "+contadorEdad);
        System.out.println("La cantidad de alumnos mayores a 1.75m son: "+contadorEstatura);
    }
    
}
