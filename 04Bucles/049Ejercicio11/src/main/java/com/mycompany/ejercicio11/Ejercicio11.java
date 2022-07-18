package com.mycompany.ejercicio11;

public class Ejercicio11 {

    /*
        Crea un programa que muestre el producto
        de los primeros 10 numeros impares
    */
    public static void main(String[] args) {
        long i, producto = 1;
        
        for (i = 1; i <= 20; i++)
        {
            if(i % 2 !=0)
            {
                producto = producto * i;
            }
        }
        System.out.println("El producto de los primeros 10 numeros impares es: "+producto);
    }
    
}
