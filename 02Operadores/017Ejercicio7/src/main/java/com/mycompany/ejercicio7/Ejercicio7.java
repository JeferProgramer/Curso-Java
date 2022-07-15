package com.mycompany.ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    /*
        Crea un programa que determine el equivalente en
        Semanas, dias, hrs; sabiendo que:
        1 Semana  - 168 hrs
        1 Dia - 24 hrs
        Dadas el numero de hrs totales
    */
    public static void main(String[] args) {
        //Intancia entrada y salida
        Scanner entrada = new Scanner(System.in);
        
        //Variables
        int n, sem, dias, hrs, timeres;
        
        //CAntidad de hrs a transformara
        System.out.println("Ingresa el numero de hrs totales: ");
        // n = 4 
        n = entrada.nextInt();
        
        //Cantidad de semanas
        // 4/168 esto nos dice la cantidad de semanas dependiendo de las horas dadas

        sem = n / 168;
        //Tiempo restante de las semanas
        timeres = n % 168;
        //Cantidad de dias
        dias = timeres / 24;
        //Tiempo restante de los dias
        hrs = timeres % 24;
        
        System.out.println(n+" hrs, equivalen a: "+sem+" semanas, "+dias+" dias y "+hrs+" horas");
        
        
        
    }
    
}
