package com.mycompany.ejercicio12;

import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class Ejercicio12 {

    /*
        Crea un programa donde pida una nota del
        0 al 10 y muestre los siguentes mensajes
        nota<7 - Insuficiente
        nota>=7 nota <8 - Suficiente
        nota>=8 nota<9 - Bien
        nota>=9 nota<10 - Notable
        nota == 10 - Sobresaliente
    */
    public static void main(String[] args) {
        float nota;
        
        nota = Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu calificacion: "));
        
        if(nota>=0 && nota< 7)
        {
            JOptionPane.showMessageDialog(null, "Insuficiente");
        }
        else if(nota>=7 && nota<8)
        {
            JOptionPane.showMessageDialog(null, "Suficiente");
        }
        else if(nota>=8 && nota<9)
        {
            JOptionPane.showMessageDialog(null, "Bien");
        }
        else if(nota>=9 && nota<10)
        {
            JOptionPane.showMessageDialog(null, "Notable");
        }
        else if(nota == 10)
        {
            JOptionPane.showMessageDialog(null, "Sobresaliente");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Nota incorrecta");
        }
        
    }
    
}
