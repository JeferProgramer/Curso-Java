package com.mycompany.sentenciaswitch;

import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class SentenciaSwitch {


    public static void main(String[] args) {
        int dato;
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 1 y 5"))

        //con switch son como muchis if donde voy a validar una condicion 
        switch(dato){
            case 1: JOptionPane.showMessageDialog(null,"Es el numero 1");
                break;//Necesario para salir de la sentecia una vez cumplido ese caso
            case 2: JOptionPane.showMessageDialog(null,"Es el numero 2");
                break;
            case 3: JOptionPane.showMessageDialog(null,"Es el  numero 3");
                break;
            case 4: JOptionPane.showMessageDialog(null,"Es el numero 2");
                break;
            case 5: JOptionPane.showMessageDialog(null,"Es el numero 5");
                break;
            default: JOptionPane.showMessageDialog(null,"No esta en el rando de 1 a 5")

        }
    }
    
}
