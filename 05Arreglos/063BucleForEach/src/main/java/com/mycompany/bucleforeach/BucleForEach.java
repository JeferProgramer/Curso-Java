package com.mycompany.bucleforeach;


public class BucleForEach {

    public static void main(String[] args) {
        String[] nombres = {"Alejandro", "Daphne", "Anahi", "Emilio"};
        
        /*
            ---Formato---
            for(tipoDatoArreglo iterador:nombreArreglo)
            {
                Instrucciones
            }
        */
        for(String i:nombres)
        {
            System.out.println("Nombres: "+i);
        }
    }
    
}
