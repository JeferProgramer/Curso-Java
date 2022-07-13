package com.mycompany.ejercicio6;

import java.util.Scanner;


public class Ejercicio6 {

    //Crea un programa que determine el cuadrado de una suma
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double a, b, res;
        
        System.out.println("Ingres el valor de a: ");
        a = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de b: ");
        b = entrada.nextDouble();
        
        res = Math.pow(a, 2) + Math.pow(b, 2) + 2 * a * b;
        System.out.println("(a+b)^2 = "+res);
    }
    
}
