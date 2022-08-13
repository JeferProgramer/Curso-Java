import java.util.*;
public class PruebaExcepciones {
    private int numero;
    private Scanner entrada;
    public void introducirNumeros() throws Excepcion0{
        entrada = new Scanner(System.in);

        do{
            System.out.println("Digite un numero:");
            numero = entrada.nextInt();

            if(numero ==0){//quiero que se produce una excepcion personalizada
                throw new Excepcion0();
            }
        }while(numero != 0);
    }
    public static void main(String[] args) {
        PruebaExcepciones prueba = new PruebaExcepciones();
        try {
            prueba.introducirNumeros();
        } catch (Excepcion0 e) {
            System.out.println("Ha indtroducido el numero 0");
        }
        System.out.println("finalizo e programa");
    }
}
