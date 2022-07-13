package com.mycompany.ejercicio14;

import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class Ejercicio14 {

    /*
        Crea un programa que obtenga una medida
        en kg y la convierta a otra unidad de
        masa, mostrando las opciones posibles
     */
    public static void main(String[] args) {
        int opcion;
        float masa, resultado =0; 
        
        masa = Float.parseFloat(JOptionPane.showInputDialog("Ingresa cantidad de masa en Kg: "));
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa una de las siguientes opciones\n"
                + "1.Toneladas \n"
                + "2.Gramos\n"
                + "3.Miligramo\n"
                + "4.Microgramo\n"
                + "5.Nanogramo\n"
                + "6.Picogramo"));
        
        switch(opcion)
        {
            case 1:
                resultado = masa / 1000;
                JOptionPane.showMessageDialog(null, masa+"kg en Toneladas son: "+resultado);
                break;
            case 2:
                resultado = masa * 1000;
                JOptionPane.showMessageDialog(null, masa+"kg en Gramos son: "+resultado);
                break;
            case 3:
                resultado = masa * 1000000;
                JOptionPane.showMessageDialog(null, masa+"kg en Miligranos son: "+resultado);
                break;
            case 4:
                resultado = masa * 1000000000;
                JOptionPane.showMessageDialog(null, masa+"kg en Microgramos son: "+resultado);
                break;
            case 5:
                resultado = masa / 1000000000000f;
                JOptionPane.showMessageDialog(null, masa+"kg en Nanogramos son: "+resultado);
                break;
            case 6:
                resultado = masa / 1000000000000000f;
                JOptionPane.showMessageDialog(null, masa+"kg en Picogramos son: "+resultado);
                break;
        }
        
    }
    
}
