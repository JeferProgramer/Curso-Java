package com.mycompany.sentenciaif;

import javax.swing.JOptionPane;


public class SentenciaIf 
{
    public static void main(String[] args) 
    {
        // int numero, dato = 5;
        
        // numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        // if (numero == dato)
        // {
        //     JOptionPane.showMessageDialog(null, "El numero es 5");
        // }
        // else
        // {
        //     JOptionPane.showConfirmDialog(null, "El numero es diferente de 5");
        // }
        int numero, dato = 5;
        //le digo usuario que ingrese un numero
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        if(numero == dato){
            JOptionPane.showMessageDialog(null,"El numero es 5");
        }else{
            JOptionPane.showConfirmDialog(null,"El numero es diferente de 5")
        }
    }
    
}
