public class Aeropuerto{
  private String nombre;
  private String cuidad;
  private String pais;
  private Compañia listaCompañias[] = new Compañia[10];
  private int numCompañia;
  
  public Aeropuerto(String nombre, String cuidad, String pais){
    this.nombre = nombre;
    this.cuidad = cuidad;
    this.pais = pais;
    this.numCompañia = 0;
  }
  
}

