package com.mycompany.entradasalidagrafica;

import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class EntradaSalidaGrafica {

    public static void main(String[] args) {
        String nombre;
        int edad;
        char letra;
        float decimal;
        
        nombre = JOptionPane.showInputDialog("Digite su nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        decimal = Float.parseFloat(JOptionPane.showInputDialog("Digite un numero decimal: "));
        
        JOptionPane.showMessageDialog(null, "Su nombre es: "+nombre);
        JOptionPane.showMessageDialog(null, "Su edad es: "+edad+" anios");
        JOptionPane.showMessageDialog(null, "La letra es: "+letra);
        JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);
        
        
    }
    
}
