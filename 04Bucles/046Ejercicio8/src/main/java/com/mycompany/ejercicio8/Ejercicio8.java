package com.mycompany.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Ejercicio8 {

    /*
        Crea un programa que pida un numero y muestre
        la serie sucesiva de 1 hasta el numero
        dado por el usuario
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, i;
        
        System.out.println("Ingresa un numero: ");
        numero = entrada.nextInt();
        for (i = 1; i <= numero; i++)
        {
            System.out.print(i+", ");
        }
    }
    
}
