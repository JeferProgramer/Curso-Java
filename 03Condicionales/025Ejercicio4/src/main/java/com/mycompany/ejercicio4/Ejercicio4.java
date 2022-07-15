package com.mycompany.ejercicio4;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    /*
        En una plaza se hace un descuento del 20%
        a los clientes donde cuya compra supere los
        $300.
        Crea un programa que determine el total a pagar
        del cliente dependiendo de su cantidad de compra
    */
    public static void main(String[] args) {
        float precioCompra, total;
        
        precioCompra = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de su compra: "));
        
        if (precioCompra > 300) 
        {
            total = precioCompra * 0.80f;
            JOptionPane.showMessageDialog(null, "El total a pagar es de: $"+total);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El total a pagar es de: $"+precioCompra);
        }
        
        
        
    }
    
}
