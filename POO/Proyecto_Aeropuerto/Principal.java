public class Principal{
  static Scanner entrada = new Scanner(System.in);
  final static int num = 4 //Numero de aeropuertos;
  static Aeropuerto aeropuertos[] = new Aeropuerto[num];
  
  public static void main(String[] args){
    //insertar datos de los aeropuertos
  }
  
  public static void insertarDatosAeropuerto(Aeropuerto aero[]){
    aero[0] = new AeropuertoPublico(80000000,"Jorge Chavez","Lima","Peru");
    aero[0].insertarCompañia(new Compañia("AeroPeru"));
    aero[0].insertarCompañia(new Compañia("Latam"));
    aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB178","Lima","Mexico",150.90,150));
    aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB179","Lima","Bogota",180.90,120));
    aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB180","Lima","Londres",500.90,100));
    aero[0].getCompañia("AeroPeru").getVuelo("IB12").insertarPasajero(new Pasajero("Alejandra","20BGP","Colombiana"));
    aero[0].getCompañia("AeroPeru").getVuelo("IB12").insertarPasajero(new Pasajero("David","606BH","Colombiano"));
    aero[0].getCompañia("LATAM"),getVuelo("FC12").insertarPasajero(new Pasajero("Magda","5839H","Colombiana"));
  }
}
