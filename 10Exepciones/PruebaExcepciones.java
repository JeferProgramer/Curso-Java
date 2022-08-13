import java.util.*;
public class PruebaExcepciones {
    private int numero;
    private Scanner entrada;
    public void introducirNumeros() throws Excepcion0{
        entrada = new Scanner(System.in);

        do{
            System.out.println("Digite un numero:");
            numero = entrada.nextInt();

            if(numero ==0){
                throw new Excepcion0();
            }
        }while(numero != 0);
    }
    public static void main(String[] args){

    }
}
