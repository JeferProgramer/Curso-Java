package com.mycompany.operadorternario;

import javax.swing.JOptionPane;

/**
 *
 * @author alemr
 */
public class OperadorTernario {

    public static void main(String[] args) {
        int numero;
        String mensaje;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        //En caso de cumplir la condicion () toma opcion de la izquierda, si es falsa retorna la de la derecha
        mensaje = (numero % 2 == 0) ? "Es par" : "Es impar";
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
