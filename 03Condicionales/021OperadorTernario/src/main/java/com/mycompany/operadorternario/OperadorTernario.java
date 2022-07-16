package com.mycompany.operadorternario;

import javax.swing.JOptionPane;

public class OperadorTernario {

    public static void main(String[] args) {
        int numero;
        String mensaje;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        mensaje = (numero % 2 == 0) ? "Es par" : "Es impar";

        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
