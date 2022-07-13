package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Ejercicio5 {

    /*
        La calificacion final de un estudiante se calcula con base a:
        Participacion - 10%
        1er Examen - 25%
        2do Examen - 25%
        Examen final - 40$
        Crea un programa que calcule la calificacion final obtenida
        por el estudiante  con base 10
    */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float part, exa1, exa2, exaf, calif;
        
        System.out.println("Ingrese la calificacion de sus participaciones");
        part = entrada.nextFloat();
        
        System.out.println("ingrese la calificacion de su primer examen");
        exa1 = entrada.nextFloat();
        
        System.out.println("ingrese la calificacion de su segundo examen");
        exa2 = entrada.nextFloat();
        
        System.out.println("ingrese la calificacion de su primer examen");
        exaf = entrada.nextFloat();
        
        calif = (part * 0.10f) + (exa1 * 0.25f) + (exa2 * 0.25f) + (exaf * 0.40f) ;
        System.out.println("La calificacion final es: "+calif);
              
    }
    
}
