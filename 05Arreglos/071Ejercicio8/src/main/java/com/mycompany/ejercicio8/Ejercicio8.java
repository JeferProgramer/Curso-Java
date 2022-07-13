package com.mycompany.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Ejercicio8 {

    /*
        Crea un programa que declare un arreglo de 
        10 elementos enteros, posteriomente el usuario
        debera ingresar 8 de ellos y un final mas aparte
        la posicion de este elemento final, desplazando asi
        los demas datos
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int numero, posicion;
        
        System.out.println("Llena el arreglo");
        for (int i = 0; i < 8; i++) {
            numeros[i] = entrada.nextInt();
        }
        
        System.out.println("Ingresa un numero");
        numero = entrada.nextInt();
        System.out.println("Ingresa una posicion");
        posicion = entrada.nextInt();
        
        for (int i = 7; i < 10; i++) {
            numeros[i+1] = numeros[i];
        }
        
        numeros[posicion] = numero;
        
        System.out.println("El arreglo actualizado es: ");
        for (int i = 0; i < 9; i++) {
            System.out.println(numeros[i]);
        }
    }
    
}
