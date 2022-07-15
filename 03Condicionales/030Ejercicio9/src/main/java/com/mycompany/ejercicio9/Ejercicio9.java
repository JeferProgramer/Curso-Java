package com.mycompany.ejercicio9;

import javax.swing.JOptionPane;

public class Ejercicio9 {

    /*
        Crea un programa que solicite el
        dia, mes y anio de de una fecha y 
        determine si es correcta
        Nota: supon que todos los meses son de 
        30 dias
    */
    public static void main(String[] args) {
        int dia, mes, anio;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes: "));
        anio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el anio: "));
        
        if(dia >= 1 && dia <=30)
        {
            if(mes >= 1 && mes <=12)
            {
                if(anio != 0)
                {
                    JOptionPane.showMessageDialog(null, "La fecha es correcta");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Anio incorrecto");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Mes incorrecto");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Dia incorrecto");
        }
    }
    
}
