package com.mycompany.datosprimitovs;


public class DatosPrimitivos {

    public static void main(String[] args) {
        //Los siguientes son los tipos de datos primitivos enteros son
        byte chiquito;
        short mediano;
        int entero;
        long largo;
        
        //Las variables se pueden iniciar sus valores en la misma linea o por separado
        chiquito = 12;
        mediano = 31124;
        entero = 2000000000;
        largo = 400000000;
        
        /*
            Para los datos primitivos de tipo flotante (float)
            se les declara a los valores al final con una f
            declarando que son de ese tipo de dato
        */
        
        float decimal = 3.14f;
        double doble = 3.1415945;
        
        /*
            Para almacenar caracteres se sigue la estructura
            char nombre_variable
            y el valor a asignar se declara entre comillas simples ''
        */
        char caract = 'a';
        
        //Los datos booleanos solo pueden ser verdaderos o falsos
        boolean verdad = true;
        boolean falso = false;
        
        //Mensaje final en consola
        System.out.println("Tipo de dato 'byte': "+chiquito);
        System.out.println("Tipo de dato 'short': "+mediano);
        System.out.println("Tipo de dato 'int': "+entero);
        System.out.println("Tipo de dato 'long': "+largo);
        System.out.println("Tipo de dato 'float': "+decimal);
        System.out.println("Tipo de dato 'double': "+doble);
        System.out.println("Tipo de dato 'char': "+caract);
        System.out.println("Tipo de dato 'boolean': "+verdad+" y "+falso);

    }
    
}
