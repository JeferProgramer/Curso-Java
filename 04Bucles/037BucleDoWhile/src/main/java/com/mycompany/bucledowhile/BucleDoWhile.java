package com.mycompany.bucledowhile;

import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i, contador;
        
        System.out.println("Digite un numero: ");
        contador = entrada.nextInt();
        if(contador >= 0)
        {
            i = 1;
            do 
            {            
                System.out.println(i);
                i++;
            } while (i<=contador);
        }
        else
        {
            i = -1;
            do {                
                System.out.println(i);
                i--;
            } while (i>=contador);
        }

    }
    
}
