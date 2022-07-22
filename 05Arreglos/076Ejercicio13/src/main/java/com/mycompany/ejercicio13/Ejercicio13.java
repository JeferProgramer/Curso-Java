package com.mycompany.ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    /*
        Crea un programa que almacene 10 numeros en un arreglo
        posteriormente guardar en uno aquellos que sean pares 
        en un tercero los que son impares
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arregloA = new int[10];
        //Conocer cuantos son:
        int contadorPares = 0, contadorImpares = 0;
        System.out.println("Llenado del arreglo");
        for (int i = 0; i < 10; i++) {
            arregloA[i] = entrada.nextInt();
            
            if (arregloA[i] % 2 == 0) {
                contadorPares++;
            }
            else{
                contadorImpares++;
            }                
        }
        
        int[] pares = new int[contadorPares];
        int[] impares = new int[contadorImpares];
        
        //Se vuelves iteradores
        contadorPares = 0; contadorImpares = 0;
        for (int i = 0; i < 10; i++) {
            if (arregloA[i] % 2 == 0) {
                pares[contadorPares] = arregloA[i];
                contadorPares++;
            }
            else{
                impares[contadorImpares] = arregloA[i];
                contadorImpares++;
            }
        }
        
        System.out.println("Arreglo de pares: ");
        for (int i = 0; i < contadorPares; i++) {
            System.out.print(pares[i]+" ");
        }
        System.out.println("");
        
        System.out.println("Arreglo de impares: ");
        for (int i = 0; i < contadorImpares; i++) {
            System.out.print(impares[i]+" ");
        }
        System.out.println("");
        
        System.out.println("Arreglo completo: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arregloA[i]+" ");
        }
    }
    
}
