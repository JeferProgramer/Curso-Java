package com.mycompany.binaria;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Binaria {

    /**
     *  Requiere que el arreglo este ordenado de manera ascendente 
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = {1,2,3,4,5};
        int dato, inferior, superior, mitad, i;
        boolean bandera = false;
        
        dato = entrada.nextInt();
        
        //Busqueda binaria
        inferior = 0;
        superior = 5;   //Cantidad de elementos del arreglo
        i = 0;
        
        mitad = (inferior + superior) / 2;
        while (inferior<=superior && i<5) {            
            if (arreglo[mitad] == dato) {
                bandera = true;
                break;
            }
            if (arreglo[mitad] > dato) {
                superior = mitad;
                mitad = (inferior + superior) / 2;
            }
            if (arreglo[mitad] < dato) {
                inferior = mitad;
                mitad = (inferior + superior) / 2;
            }
            i++;
        }
        
        if (bandera == true) {
            System.out.println("El numero esta en la posicion: "+mitad);
        }
        else{
            System.out.println("El numero no se encuentra en el arreglo");
        }
        
    }
    
}
