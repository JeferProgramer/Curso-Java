package com.mycompany.secuencial;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Secuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = {4,1,5,2,3};
        int dato;
        boolean bandera = false;
        
        dato = entrada.nextInt();
        
        //Busqueda Secuencial:
        int i = 0;  //Iterador
        while (i<5 && bandera == false) {            
            if (arreglo[i] == dato) {
                bandera = true;
            }
            i++;
        }
        
        if (bandera == false) {
            System.out.println("No hay conincidencia: ");
        }
        else{
            System.out.println("Si existe resultado en la posicion: "+(i-1));
        }
    }
    
}
