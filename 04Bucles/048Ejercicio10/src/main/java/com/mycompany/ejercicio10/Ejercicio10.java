package com.mycompany.ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    /*
        Crea un programa que pida 10 numeros
        y muestre la suma total de ellos
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, i, suma = 0;
        
        for(i = 1; i<=10; i++)
        {
            System.out.println("Ingresa un numero: ");
            numero = entrada.nextInt();
            suma = suma + numero;
        }
        System.out.println("La suma final es: "+suma);
    }
    
}
