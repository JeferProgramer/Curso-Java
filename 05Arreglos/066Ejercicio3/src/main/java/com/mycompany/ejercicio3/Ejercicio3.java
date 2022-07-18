package com.mycompany.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    /*
        Crea un programa que lea 5 numeros por el usuario
        y los almacene en un arreglo, obtener la media
        de los numeros positivos, la media de los numeros
        negativos y la cantidad de ceros que se 
        introdujeron
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        int contadorPositivo=0, contadorNegativo=0, sumaPositiva=0, sumaNegativa= 0, cantidadCeros = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = entrada.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
             if(numeros[i] > 0)
             {
                 contadorPositivo++;
                 sumaPositiva = sumaPositiva + numeros[i];
             }
             else if(numeros[i] < 0)
             {
                 contadorNegativo++;
                 sumaNegativa = sumaNegativa + numeros[i];
             }
             else
             {
                 cantidadCeros++;
             }
        }
        if(contadorPositivo >0)
        {
            System.out.println("La media positiva es: "+sumaPositiva/contadorPositivo);            
        }
        if(contadorNegativo >0)
        {
            System.out.println("La media negativa es: "+sumaNegativa/contadorNegativo);
        }
        System.out.println("La cantidad de ceros es: "+cantidadCeros);  
    }
    
}
