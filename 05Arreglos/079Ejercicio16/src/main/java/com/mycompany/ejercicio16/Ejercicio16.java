package com.mycompany.ejercicio16;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class Ejercicio16 {

    /*
        Crea un programa que permita a un centro educativo gestionar
        las notas de calificaciones de los grupos. Cada grupo (o clase)
        esta compuesto por 5 alumnos, el programa debera pedir las notas
        del primer, segundo y tercer trimestre de un grupo. mostrar al final
        la media del grupo por cada trimestre y la media del alumno solicitado
        por una N posicion
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] trimestre1 = new float[5];
        float[] trimestre2 = new float[5];
        float[] trimestre3 = new float[5];
        float sumaTrimestre1 = 0, sumaTrimestre2 = 0, sumaTrimestre3 = 0, sumaAlmuno = 0;
        int posicion;
        System.out.println("Ingrese las calificaciones del trimestre 1:");
        for(int i = 0; i < 5; i++){
            trimestre1[i] = entrada.nextFloat();
            sumaTrimestre1 = sumaTrimestre1 + trimestre1[i];
        }
        System.out.println("Ingrese las calificaciones dle trimestre 2:");
        for(int i = 0; i < 5; i++){
            trimestre2[i] = entrada.nextFloat();
            sumaTrimestre2 = sumaTrimestre2 + trimestre2[i];
        }
        System.out.println("Ingrese las calificaciones dle trimestre 3: ");
        for(int i = 0; i < 5; i++){
            trimestre3[i] = entrada.nextFloat();
            sumaTrimestre3 = sumaTrimestre3 + trimestre3[i];
        }
        do{
            System.out.println("Ingrese la posicion del alumno para conocer la media: ");
            posicion = entrada.nextInt();
        }while(posicion < 0 || posicion > 4);
        
        sumaAlmuno = trimestre1[posicion] + trimestre2[posicion] + trimestre3[posicion];
        System.out.println("La media del primer trimestre es: " + sumaTrimestre1/5);
        System.out.println("La media del segundo trimestre es: " + sumaTrimestre2/5);
        System.out.println("La media del tercer trimestre es: " + sumaTrimestre3/5);
        System.out.println("La media del alumno es: " + sumaAlmuno/5);
    }
}
