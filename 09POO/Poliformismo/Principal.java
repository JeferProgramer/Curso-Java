public class Principal {
    public static void main(String[] args){
        Vehiculo misVehiculos[] = new Vehiculo[2];
        misVehiculos[0] = new Vehiculo("gh4758", "ferrari", "a87");
        misVehiculos[1] = new VehiculoTurismo(4, "78hj", "Toyato", "a87");
        for(Vehiculo vehiculos: misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
        //Conversion ascendente de tipos (Upcasting) esto es la conversion hacia arriba de una subclase o clase hija a una clase super o padre
        Vehiculo vehiculo = new VehiculoTurismo(4, "gt57", "renault","a405");
        System.out.println(vehiculo);
        //Conversion downcasting este tipo de conversion es hacia abajo en la jerarquia vamos a pasar de una clase padre a una clase hija o subclase 
        VehiculoTurismo nuevoVehiculo = (VehiculoTurismo) vehiculo;
        System.out.println(nuevoVehiculo);

    }
}
