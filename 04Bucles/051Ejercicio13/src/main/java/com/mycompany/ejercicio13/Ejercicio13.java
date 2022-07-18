package com.mycompany.ejercicio13;

import javax.swing.JOptionPane;

public class Ejercicio13 {

    /*
        Crea un programa que pida 10 numeros
        muestre la media de los numeros positivos
        la media de los numeros negativos
        y la cantidad de ceros ingresados
    */
    public static void main(String[] args) {
        //declaro variables 
        float i, numero, contadorPositivos = 0, contadorNegativo = 0, sumaPositiva = 0, sumaNegativa = 0, ceros = 0;
        //itero hastas los 10 numeros que necesito
        for(i = 1; i<=10; i++)
        {
            //me guardo el numero que ingresa el usuario
            numero = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero: "));
            //si es mayor 0 lo sumo en suma positiva ese numero y le suma 1 al contador de positivo
            if(numero > 0)
            {
                contadorPositivos++;
                sumaPositiva = sumaPositiva + numero;
            }
            //si es menor a 0 le sumo el numero con sumanegativa para tener toda la suma y le sumo 1 al contador de negativo
            else if(numero < 0)
            {
                contadorNegativo++;
                sumaNegativa = sumaNegativa + numero;
            }
            //si es cero incremento el contador de cero
            else
            {
                ceros++;
            }
        }
        //es decir si escribimos numeros positivos sacamos a media con la suma total y el contador de los positivos
        if(contadorPositivos!=0)
        {
            System.out.println("La media positiva es: "+sumaPositiva/contadorPositivos);
        }
        //si no la media va hacer 0
        else
        {
            System.out.println("La media positiva es: 0");
        }        
        //si escribimso numeros negativos sacamos la media con la suma de negativos dividido por el contador negativo
        if(contadorNegativo!=0)
        {
            System.out.println("La media negativa es: "+sumaNegativa/contadorNegativo);
        }
        //si no la media negativa es 0
        else
        {
            System.out.println("La media negativa es: 0");
        }
        //por ultimo mostramos la cantidad de ceros
        System.out.println("La cantidad de ceros es: "+ceros);
    }
    
}
