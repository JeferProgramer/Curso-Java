package com.mycompany.entradasalidagrafica;

import javax.swing.JOptionPane;


public class EntradaSalidaGrafica {

    public static void main(String[] args) {
        String nombre;
        int edad;
        char letra;
        float decimal;
        //me guardo en las varibales lo que ingrese el usuario showInputDialog para string de input
        nombre = JOptionPane.showInputDialog("Digite su nombre: ");
        //todo lo que llegue de joptionpane llega  como una cade de texto por ende cuando necesitamos datos como numeros tenemos que convertirloa un dato que queramos
        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        decimal = Float.parseFloat(JOptionPane.showInputDialog("Digite un numero decimal: "));
        
        JOptionPane.showMessageDialog(null, "Su nombre es: "+nombre);
        JOptionPane.showMessageDialog(null, "Su edad es: "+edad+" anios");
        JOptionPane.showMessageDialog(null, "La letra es: "+letra);
        JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);
        
        
    }
    
}
