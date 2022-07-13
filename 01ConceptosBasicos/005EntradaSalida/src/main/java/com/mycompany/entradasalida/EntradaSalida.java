package com.mycompany.entradasalida;

//Se importa la clase Scanner
import java.util.Scanner;

/**
 *
 * @author alemr
 */
public class EntradaSalida {

    public static void main(String[] args) {
        //Se debe de instanciar la clase escaner para usarla en un objeto
        Scanner entrada = new Scanner(System.in);
        
        //Declaracion de la variable
        float edad;
        int cp;
        String nombre;
        char letra;
             
        /*
            Para guardar valores en variables de diferentes
            tipos de datos se usan las sentencias
        */
        System.out.println("Ingrese su nombre: ");
        //Textos
        nombre = entrada.nextLine();
        System.out.println("Ingrese su edad");
        //Flotantes
        edad = entrada.nextFloat();
        System.out.println("Ingrese su codigo posta");
        //enteros
        cp = entrada.nextInt();
        System.out.println("Ingrese la primera letra de su nombre");
        //Caracteres
        letra = entrada.next().charAt(0);
        
            
        System.out.println("Hola "+nombre+" siendo '"+letra+"' la primera letra de tu nombre, tu edad es: "+edad+" anios, C.P."+cp);
    }
    
}
