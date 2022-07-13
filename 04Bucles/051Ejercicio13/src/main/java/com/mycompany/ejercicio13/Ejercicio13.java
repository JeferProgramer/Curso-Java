package com.mycompany.ejercicio13;

import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class Ejercicio13 {

    /*
        Crea un programa que pida 10 numeros
        muestre la media de los numeros positivos
        la media de los numeros negativos
        y la cantidad de ceros ingresados
    */
    public static void main(String[] args) {
        float i, numero, contadorPositivos = 0, contadorNegativo = 0, sumaPositiva = 0, sumaNegativa = 0, ceros = 0;
        
        for(i = 1; i<=10; i++)
        {
            numero = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero: "));
            if(numero > 0)
            {
                contadorPositivos++;
                sumaPositiva = sumaPositiva + numero;
            }
            else if(numero < 0)
            {
                contadorNegativo++;
                sumaNegativa = sumaNegativa + numero;
            }
            else
            {
                ceros++;
            }
        }
        if(contadorPositivos!=0)
        {
            System.out.println("La media positiva es: "+sumaPositiva/contadorPositivos);
        }
        else
        {
            System.out.println("La media positiva es: 0");
        }        
        if(contadorNegativo!=0)
        {
            System.out.println("La media negativa es: "+sumaNegativa/contadorNegativo);
        }
        else
        {
            System.out.println("La media negativa es: 0");
        }

        System.out.println("La cantidad de ceros es: "+ceros);
    }
    
}
