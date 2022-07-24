package com.mycompany.ejercicio7;

public class Ejercicio7 {

    /*
        Crea una matriz de 5x5 donde el "marco" de esta
        contenga datos 1 y el resto sean 0
        1 1 1 1 1
        1 0 0 0 1
        1 0 0 0 1
        1 0 0 0 1
        1 1 1 1 1
    */
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
       
       //vamos a rellenar el array
       for(int i = 0; i < 5; i++){
           for(int j = 0; j < 5; j++){
               if(i == 0 || i == 4){
                   //contro a las columnas
                   matriz[i][j] = 1;
               }else if(j == 0 || j == 4){
                   //contro las filas
                   matriz[i][j] = 1;
               }else{
                   matriz[i][j] = 0;
               }
           }
       }
       
       System.out.println("La matriz es : ");
       for(int i = 0; i < 5; i++){
           for(int j = 0; j < 5; j++){
               System.out.print(matriz[i][j] + " ");
           }
           System.out.println("");
       }
    }
    
}
