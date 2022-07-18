package com.mycompany.ejercicio18;

import javax.swing.JOptionPane;

public class Ejercicio18 {

    /*
        Crea un programa que ayude con la facturacion
        de un sistema de ventas de desinfectantes,
        en el cual se piden el codigo del producto,
        la cantidad vendida en L.
        Codigo del producto - Precio
                1             $0.6/L
                2             $3/L  
                3             Euro 1.25/L -> $1.45/L
        Muestre la facturacion total de un total de 5
        ventas, la cantidad de litros vendidos del
        articulo uno y el numero de ventas
        superiores a $600
    */
    public static void main(String[] args) {
        int codigo, litros, litrosArticulo1 = 0, contador = 0;
        float importeFactura = 0, total = 0;
        
        for (int i = 1; i <= 5; i++)
        {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del producto: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los litros del articulo vendido: "));

            if(codigo == 1)
            {
                importeFactura = litros * 0.6f;
                litrosArticulo1 = litrosArticulo1 + litros;
            }
            else if(codigo == 2)
            {
                importeFactura = litros * 3;
            }
            else if(codigo == 3)
            {
                importeFactura = litros * 1.45f;
            }
            else
            {
                System.out.println("Codigo Erroneo");
            }
            if(importeFactura > 600)
            {
                contador++;
            }
            total = total + importeFactura;
        }
        System.out.println("El total de ventas es: $"+total);
        System.out.println("Se vendieron "+litrosArticulo1+" L. del articulo 1");
        System.out.println(contador+" ventas superaron los $600");
            
    }
    
}
