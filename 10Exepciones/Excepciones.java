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

}