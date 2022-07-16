package com.mycompany.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    /*
        Realizar un juego donde el usuario
        adivine un numero aleatorio generado
        del 0 al 100, e ir indicando en cada intento
        si es mayor o menor
        Mostrar al final el numero de veces que le
        llevo adivinar el numero
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, intentos, aleatorio;
        aleatorio = (int) Math.random()*100;
        System.out.println("Bienvenido al juego del numero aleatorio \nPor favor ingresa un numero entre 0 y 100");
        numero = entrada.nextInt();
        intentos = 1;
        while(numero != aleatorio)
        {
            if(numero<aleatorio)
            {
                System.out.println("El numero aleatorio es mayor");
            }
            else
            {
                System.out.println("El numero aleatorio es menor");
            }
            System.out.println("Ingresa otro numero: ");
            numero = entrada.nextInt();
            intentos++;
            
        }
        System.out.println("Felicidades!, haz encontrado el numero");
        System.out.println("Le llevo un total de: "+intentos+" encontrar el numero aleatorio");
    }
    
}
