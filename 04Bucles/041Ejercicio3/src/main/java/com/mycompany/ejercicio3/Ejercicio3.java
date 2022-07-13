package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Ejercicio3 {

    /*
        Crea un programa que lea numeros
        hasta que se introduzca un 0 e indicar
        para cada uno si es par o impar
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();
        
        while (numero != 0)
        {            
            if(numero % 2 == 0)
            {
                System.out.println(numero+", Es par");
            }
            else
            {
                System.out.println(numero+", Es impar");
            }
            System.out.println("Ingrese otro numero: ");
            numero = entrada.nextInt();
        }
               
    }
    
}
