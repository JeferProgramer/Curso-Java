package com.mycompany.ejercicio13;

import javax.swing.JOptionPane;

public class Ejercicio13 {

    /*
        Crea un programa que simule el menu de un cajero
        automatico, donde este tenga un saldo inicial de
        $1000, y teniendo las opciones de:
        1.Ingresar dinero
        2.Retirar dinero
        3. Salir
    */
    public static void main(String[] args) {
        int opcion;
        float efectivo, saldoFinal;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de una de las siguientes opciones: \n1.Ingresar dinero\n2.Retirar dinero\n3. Salir"));
    
        switch(opcion)
        {
            case 1:
                efectivo = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad a abonar: "));
                saldoFinal = 1000 + efectivo;
                JOptionPane.showMessageDialog(null, "Saldo en cuenta: "+saldoFinal+", Muchas gracias por su preferencia");
                break;
            case 2:
                efectivo = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad a retirar: "));
                if(efectivo>1000)
                {
                    JOptionPane.showMessageDialog(null, "Error, cantidades no mayores a $1000");
                }
                else if(efectivo>=1 && efectivo<=1000)
                {
                    saldoFinal = 1000 - efectivo;
                    JOptionPane.showMessageDialog(null, "Procesando... aqui se encuentra su efectivo");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Error");
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Gracias por su prefrencia");
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
            
        }   
    }
    
}
