public class AeropuertoPrivado extends Aeropuerto{
  private String listaEmpresas[] = new String[10];
  private int numEmpresa;
  
  public AeropuertoPrivado(String nombre, String cuidad, String pais){
    super(nombre, cuidad, pais);
  }
  
  public AeropuertoPrivado(String nombre, String cuidad, String pais, Compañia[]c, String e[]){
    super(nombre. cuidad, pais, c);
    this.listaEmpresas = e;
    numEmpresas = e.lenght;
  }
  
}
