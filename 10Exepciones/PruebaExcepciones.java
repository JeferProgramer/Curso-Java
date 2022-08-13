import java.util.*;
public class PruebaExcepciones {
    private int numero;
    private Scanner entrada;
    public void introducirNumeros(){
        entrada = new Scanner(System.in);

        do{
            System.out.println("Digite un numero:");
            numero = entrada.nextInt();
        }while(numero != 0);
    }
    public static void main(String[] args){

    }
}
