package com.mycompany.ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    /*
        Crea un programa que determine las raices
        de una ecuacion de 2do grado
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, respos, resneg;
        
        System.out.println("Ingrese el valor de a: ");
        a = entrada.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        b = entrada.nextDouble();
        System.out.println("Ingrese el valor de c: ");
        c = entrada.nextDouble();
        
        respos = ((-1 * b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/ (2 *a);
        resneg = ((-1 * b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/ (2 *a);
        
        System.out.println("La variante positiva es: "+respos);
        System.out.println("La variante negativa es: "+resneg);
        
        
    }
    
}
