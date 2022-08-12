import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Excepciones{
    public void leerArchivo() throws FileNotFoundException{
        File archivo = new File("CC:/Documents/texto.txt");
        FileReader fr = new FileReader(archivo);
        System.out.println(fr);
    }
    public void leerArchivo2() throws IOException{
        try {
            leerArchivo();
        } catch (FileNotFoundException e) {
           System.out.println("No se ha encontre el archivo");
        }catch(IOException e){
            System.out.println("Ha ocurrido una excepcion verificada");
        }finally{
            System.out.println("Final");
        }

    }
    public static void main(String[] args){
       Excepciones prueba = new Excepciones();
       prueba.leerArchivo();
    }

}