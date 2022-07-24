public class VehiculoTurismo extends Vehiculo{
    //creamos las varibales necesarias
    private int nPuertas;
    //creo el constructor
    public VehiculoTurismo(int nPuertas, String matricula, String marca, String modelo){
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }
    public int getnPuertas(){
        return nPuertas;
    }
    @Override
}
