public class Vuelo {
    private String identificador;
    private String cuidadOrigen;
    private String cuidadDestino;
    private double precio;
    private int numMaxPasajeros;
    private int numActualPasajeros;
    private Pasajero listaPasajero[];

    public Vuelo(String identificador, String cuidadOrigen, String cuidadDestino, double precio, int numMaxPasajeros, int numActualPasajeros, Pasajero listaPasajero[]){
        this.identificador = identificador;
        this.cuidadOrigen = cuidadOrigen;
        this.cuidadDestino = cuidadDestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActualPasajeros = 0;
        this.listaPasajero = new Pasajero[numMaxPasajeros];
    }
    public void insertarPasajero(Pasajero pasajero){
        listaPasajero[numActualPasajeros] = pasajero;
        numActualPasajeros++;
    }
    public String getCuidadDestino(){
        return cuidadDestino;
    }
    public String getCuidadOrigen(){
        return cuidadOrigen;
    }
    public String getIdentificador(){
        return identificador;
    }
    public String getNumActualPasajero(){
        return nombre;
    }
    public Pasajero getPasajero(int i){
        return listaPasajero[i];
    }
    public Pasajero getPasajero(String pasaporte){
        boolean encontrado = false;
        int i = 0;
        Pasajero pas = null;
        while((!encontrado) && (i<listaPasajero.length)){
            if(pasaporte.equals(listaPasajero[i].getPasaporte())){
                encontrado = true;
                pas = listaPasajero[i];
            }
            i++;
        }
        return pas;
    }
}
