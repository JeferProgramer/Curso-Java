package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Ejercicio4 {

    /*
        Crea un prorama que pida numero y
        repetir este proceso hasta que se
        introduzca uno negativo, mostrar
        cuantos numeros se han introducido
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, contador = 0;
        
        System.out.println("Ingrese un numero");
        numero = entrada.nextInt();
        
        while (numero>=0)
        {   
            contador+=1;
            System.out.println("Ingrese un numero");
            numero = entrada.nextInt();            
        }
        System.out.println("Se han introducido: "+contador+" numeros");
        
    }
    
}
