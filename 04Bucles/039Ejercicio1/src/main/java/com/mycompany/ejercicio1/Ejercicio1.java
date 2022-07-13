package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Ejercicio1 {

    /*
        Crea un programa donde lea numeros positivos y mostrar
        su cuadrado, repetir este proceso hasta que se introduzca
        un numero negativo
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese un numero");
        numero = entrada.nextInt();
        
        while (numero >= 0)
        {            
            System.out.println(Math.pow(numero, 2));
            System.out.println("Ingrese otro numero");
            numero = entrada.nextInt();
        }
        
    }
    
}
