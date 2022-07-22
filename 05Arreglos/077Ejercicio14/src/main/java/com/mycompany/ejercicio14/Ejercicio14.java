package com.mycompany.ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    /*
        Crea un programa que lea 2 series de 10
        elementos enteros los cuales ya estaran
        ordenados de manera creciente, despues se deberan
        fusionar en una 3ra de tal manera que estos
        tendran que seguir ordenados
    */
    public static void main(String[] args) {
        //objeto scanner
        Scanner entrada = new Scanner(System.in);
        
        //Variables
        int[] arregloA = new int[10];
        int[] arregloB = new int[10];
        int[] arregloFusion = new int[20];
        boolean creciente = true;
        int interadorA = 0;
        int interadorB = 0;
        int interadorC = 0;
        
        //Zona de llenado de los arreglos
        System.out.println("Llena el primer arreglo: ");
        //ingreso al do while
        do { 
            //empiezo a llenar el ciclo solicitandole al usuario
            for (int i = 0; i < 10; i++) {
                arregloA[i] = entrada.nextInt();
            }
            //aca recorro lo que ingrese anteror -1 para no salime del arreglo por el i + 1
            for (int i = 0; i < arregloA.length - 1; i++) {
                //si el actual es menor al siguiente 
                if (arregloA[i] < arregloA[i+1]) {
                    creciente = true;
                }
                //significa que es menor decreciente
                if (arregloA[i] > arregloA[i+1])
                {
                    creciente = false;
                    //salgo del for y vuelvo a digitar los numeros 
                    break;
                }
            }
            
            if(creciente == false){
                System.out.println("Vuelva a digitar los numeros: ");
            }
            
        } while (creciente == false);

        System.out.println("Llena el segundo arreglo: ");
        //hago lo mismo que en el arregloA pero ahora en el arregloB
        do {            
            for (int i = 0; i < 10; i++) {
                arregloB[i] = entrada.nextInt();
            }
            
            for (int i = 0; i < 9; i++) {
                if (arregloB[i] < arregloB[i+1]) {
                    creciente = true;
                }
                if (arregloB[i] > arregloB[i+1])
                {
                    creciente = false;
                    break;
                }
            }
            
            if(creciente == false){
                System.out.println("Vuelva a digitar los numeros: ");
            }
            
        } while (creciente == false);
        
        //Empieza a fusionar los datos hasta que uno de los primeros acabe completo
        while(interadorA<10 && interadorB<10){
            if(arregloA[interadorA] < arregloB[interadorB]){
                arregloFusion[interadorC] = arregloA[interadorA];
                interadorA++;
            }
            else{
                arregloFusion[interadorC] = arregloB[interadorB];
                interadorB++;
            }
            interadorC++;
        }
        
        //Integra lo que haya faltado
        if(interadorA == 10) {
            //y empezo a recorrer lo que me queda del arreglo b y lo fusiono con c
            while(interadorB < 10) {                
                arregloFusion[interadorC] = arregloB[interadorB];
                interadorB++;
                interadorC++;
            }
        }
        else{
            //en caso de que sea contrario itero lo que me queda da a y me lo guardo en c
            while(interadorA < 10){
                arregloFusion[interadorC] = arregloA[interadorA];
                interadorA++;
                interadorC++;
            }
                
        }
        
        //Muestra el arreglo ya fusionado
        System.out.println("El arreglo fusionado; ");
        for (int i = 0; i < 20; i++) {
            System.out.print(arregloFusion[i]+" ");
        }
    }
    
}