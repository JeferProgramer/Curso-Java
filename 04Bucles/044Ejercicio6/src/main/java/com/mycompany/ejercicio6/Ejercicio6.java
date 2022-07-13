package com.mycompany.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Ejercicio6 {

    /*
        Crea un programa que vaya sumando todos
        los numeros introducidos por el 
        usuario hasta que se teclee el valor de 0
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;
        
        System.out.println("Introduce un numero: ");
        numero = entrada.nextInt();
        
        while (numero!=0)
        {            
            suma = suma + numero;
            System.out.println("Introduce otro numero");
            numero = entrada.nextInt();
        }
        System.out.println("La suma de todos los numeros es: "+suma);
        
    }
    
}
