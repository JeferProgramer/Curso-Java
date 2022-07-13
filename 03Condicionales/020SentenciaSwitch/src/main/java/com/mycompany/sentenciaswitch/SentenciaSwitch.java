package com.mycompany.sentenciaswitch;

import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class SentenciaSwitch {


    public static void main(String[] args) {
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 1 y 5"));
        
        //Evalua a dato con cada caso
        switch(dato)
        {
            case 1: JOptionPane.showMessageDialog(null, "Es el numero 1");
                break;  //Necesario para salir de la sentencia una vez cumplida
                
            case 2: JOptionPane.showMessageDialog(null, "Es el numero 2");
                break;

            case 3: JOptionPane.showMessageDialog(null, "Es el numero 3");
                break;
         
            case 4: JOptionPane.showMessageDialog(null, "Es el numero 4");
                break;
                
            case 5: JOptionPane.showMessageDialog(null, "Es el numero 5");
                break;
            
            //Opcion por defecto en caso de no cumplir las anteriores sentencias
            default: JOptionPane.showMessageDialog(null, "No esta en el rango seleccionado");
        }
        
    }
    
}
