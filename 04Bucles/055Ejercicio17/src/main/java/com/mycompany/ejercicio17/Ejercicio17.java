package com.mycompany.ejercicio17;

import javax.swing.JOptionPane;

public class Ejercicio17 {

    /*
        Crea un programa que ayude con la facturacion
        de un sistema de ventas de desinfectantes,
        en el cual se piden el codigo del producto,
        la cantidad vendida en L. y el precio por
        litro
        Muestre la facturacion total de un total de 5
        ventas, la cantidad de litros vendidos del
        articulo uno y el numero de ventas
        superiores a $600
    */
    public static void main(String[] args) {
        int codigo, litros, litrosArticulo1 = 0, contador = 0;
        float precioLitro, importeFactura, total = 0;
        
        for (int i = 1; i <= 5; i++)
        {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del producto: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los litros del articulo vendido: "));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio por litro: "));
            
            importeFactura = (float) litros * precioLitro;
            total = total + importeFactura;
            
            if(codigo == 1)
            {
                litrosArticulo1 = litrosArticulo1 + litros;
            }
            if(importeFactura > 600)
            {
                contador++;
            }
        }
        System.out.println("El total de ventas es: $"+total);
        System.out.println("Se vendieron"+litrosArticulo1+" L. del articulo 1");
        System.out.println(contador+" ventas superaron los $600");
            
    }
    
}
