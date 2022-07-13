package com.mycompany.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Ejercicio7 {

    /*
        Crea un programa que vaya pidiendo numeros
        hasta que se le ingrese un no negativo
        al final mostrar la media de todos los numeros
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, contador, suma = 0;
        
        System.out.println("Introduce un numero: ");
        numero = entrada.nextInt();
        contador = 0;
        while (numero>0)
        {           
            contador++;
            suma = suma + numero;
            System.out.println("Introduce otro numero");
            numero = entrada.nextInt();            
        }
        System.out.println("La mecdia de todos los numeros es: "+suma/contador);
    }
    
}
