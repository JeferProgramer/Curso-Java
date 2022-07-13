package com.mycompany.ejercicio9;

/**
 *
 * @author alemr
 */
public class Ejercicio9 {

    /*
        Crea un programa que muestre
        todos los numeros del 100 al 0
        de 7 en 7
    */
    public static void main(String[] args) {
        int i;
        
        for(i = 100; i >= 0; i = i - 7)
        {
            System.out.print(i+", ");
        }
    }
    
}
