package com.mycompany.ejercicio15;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Ejercicio15 {

    /*
        Crea un programa que almacene 10 numeros
        enteros en un arreglo ordenado de manera
        creciente, posteriormente preguntar por un numero
        y buscarlo en en arreglo, mostrar su posicion
        si es que existe y si no, indicarlo con un
        mensaje
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int numero;
        boolean creciente = true;
        
        //Zona de llenado de los arreglos
        System.out.println("Llena el arreglo: ");
        do {            
            for (int i = 0; i < 10; i++) {
                arreglo[i] = entrada.nextInt();
            }
            
            for (int i = 0; i < 9; i++) {
                if (arreglo[i] < arreglo[i+1]) {
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i+1])
                {
                    creciente = false;
                    break;
                }
            }
            
            if(creciente == false){
                System.out.println("Vuelva a digitar los numeros: ");
            }
            
        } while (creciente == false);
        
        System.out.println("Ingrese un numero para buscarlo en el arreglo: ");
        numero = entrada.nextInt();
        
        int i = 0;
        while(i<10 && arreglo[i] < numero){
            i++;
        }
        
        if(i == 10){
            System.out.println("El numero "+numero+" no existe en el arreglo");
        }
        else{
            if(arreglo[i] == numero){
                System.out.println("El numero: "+numero+" esta en la posicion: "+i);
            }
            else{
                System.out.println("El numero "+numero+" no existe en el arreglo");
            }
        }
        
            
    }
    
}
