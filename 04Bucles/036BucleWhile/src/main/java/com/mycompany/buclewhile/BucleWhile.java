package com.mycompany.buclewhile;

import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class BucleWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, limite;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el limite de la serie: ");
        limite = entrada.nextInt();
        
        if(limite>=0)
        {
            i = 1;
            while(i<=limite)
            {
                System.out.println(i);
                i++;
            }
        }
        else
        {
            i = -1;
            while (i>=limite) 
            {                
                System.out.println(i);
                i--;
            }
        }

        
        
    }
    
}
