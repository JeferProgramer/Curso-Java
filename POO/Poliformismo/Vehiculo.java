public class Vehiculo {
    //declaro las propiedades de la clase 
    protected String marca;
    protected String matricula;
    protected String modelo;

    //declarar mis contructor para instanciar los objetos de mi clase
    public Vehiculo(String matricula, String marca, String modelo){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    //metodos get
    public String getMatricula(){
        return matricula;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String mostrarDatos(){
        return "Matricula : " + matricula + "Marca: " + marca + "Modelo: " + modelo;
    }

}
