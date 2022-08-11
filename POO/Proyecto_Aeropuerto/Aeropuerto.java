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
  public Aeropuerto(String nombre, String cuidad, String pais, Compañia c[]){
    this.nombre = nombre;-
    this.cuidad = cuidad;
    this.pais = pais;
    listaCompañias = c;
    this.numCompañia = c.length;
  }
  public void insertarCompañia(Compañia compañia){
    listaCompañias[numCompañias] = compañia;
    numCompañia++;
  }
  public String getNombre(){
    return nombre;
  }
  public String getCuidad(){
    return cuidad;
  }
  public String getPais(){
    return pais;
  }
  public Compañias[] getListaCompañias(){
    return listaCompañias;
  }
  public int getNumCompañia{
    return numCompañia;
  }
  
}

