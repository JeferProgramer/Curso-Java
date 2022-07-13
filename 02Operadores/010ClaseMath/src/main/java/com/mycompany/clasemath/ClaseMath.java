package com.mycompany.clasemath;

/**
 *
 * @author alemr
 */
public class ClaseMath {


    public static void main(String[] args) {
        double raiz, base, exp, res, rand;
        long red;
        
        //Raiz
        raiz = Math.sqrt(9);
        System.out.println("La raiz de 9 es: "+raiz);
        
        //Exponenciacion
        base = 4; exp = 3.14159;
        res = Math.pow(base, exp);
        System.out.println("Elevar 4 al cubo es: "+res);
        
        red = Math.round(res);
        System.out.println("El exponente redondeado es: "+red);
        
        rand = Math.random();
        System.out.println("El numero aleatorio es: "+rand);

        

        
       
    }
    
}
