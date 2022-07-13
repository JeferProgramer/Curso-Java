/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicio10;

import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia, mes, anio;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes"));
        anio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el anio: "));
        
        
        if(anio != 0)
        {
            if((mes == 2) && (dia >= 1 && dia <= 28))
            {
                JOptionPane.showMessageDialog(null, "La fecha es correcta");
            }
            else if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia >=1 && dia<=31))
            {
                JOptionPane.showMessageDialog(null, "La fecha es correcta");
            }
            else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia >= 1 && dia <= 30))
            {
                JOptionPane.showMessageDialog(null, "La fecha es correcta");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "La fecha es incorrecta");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El anio es incorrecto");
        }

    }
    
}
