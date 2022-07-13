package com.mycompany.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    //Crea un programa que calcule la suma de 3 calificaciones
    public static void main(String[] args) {
        //Instancia Scanner
        Scanner entrada = new Scanner(System.in);
        //puedo declarar muchas variables del mismo tipo con , 
        float num1,num2,num3, suma;

        System.out.println("Ingrese un numero");
        num1  = entrada.nextFloat();
        
        System.out.println("Ingrese un numero");
        num2 = entrada.nextFloat();
        
        System.out.println("Ingrese un numero");
        num3 = entrada.nextFloat();
        
        suma = num1 + num2 + num3;
        
        System.out.println("\nLa suma de las calificaciones: "+num1+" + "+num2+" + "+num3+", es: "+suma);
        
    }
    
}
