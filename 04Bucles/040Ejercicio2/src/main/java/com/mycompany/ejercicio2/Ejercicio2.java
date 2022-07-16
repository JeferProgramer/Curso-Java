package com.mycompany.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    /*
        Crea un programa que lea numeros e
        indique is estos son positivos o negativos
        repetir el proceso hasta que se ingrese
        el valor de 0
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese un numero");
        numero = entrada.nextInt();
        
        while (numero !=0)
        {            
            if(numero>0)
            {
                System.out.println(numero+", Es positivo");
            }
            else
            {
                System.out.println(numero+", Es negativo");
            }
            System.out.println("Ingrese otro numero");
            numero = entrada.nextInt();
        }
        
    }
    
}
