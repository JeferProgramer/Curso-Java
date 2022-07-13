package com.mycompany.ejercicio4;

import java.io.SerializablePermission;
import java.util.Scanner;


public class Ejercicio4 {

    /*
        Un Vendedor de autos ganas mensualmente $1000, mas $150
        por cada carro vendido mas el 5% del total de la venta
        por cada carro
        Crea un programa que determine el salario final del
        vendedor de acuerdo a los anteriores puntos
    */

    public static void main(String[] args) {
        //Instancia de Entrada y  Salida
        Scanner entrada = new Scanner(System.in);
        
        final int salmen = 1000;
        int numcar;
        float costcar, salfin;
                
        System.out.println("Ingresa cuantoss carros vendio");
        //me guardo los carros vendidos
        numcar = entrada.nextInt();
        
        System.out.println("Ingrese el costo de los carros");
        //me guardo el coste
        costcar = entrada.nextFloat();
        //(3 * 150) + (500 * 3 * 0.05f) + 1000 =
        salfin = (numcar * 150) + (costcar * numcar * 0.05f) + salmen;
        
        System.out.println("El salario final de Fulano es: $"+salfin);    
    }
    
}
