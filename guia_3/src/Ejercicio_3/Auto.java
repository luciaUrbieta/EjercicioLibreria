package Ejercicio_3;

public class Auto extends Vehiculo implements VehiculoDePasajeros{

    private int cantidadPasajeros;

    public Auto(){
    }

    public Auto(String marca, String modelo, double velocidadMaxima){
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void establecerCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros=cantidadPasajeros;
    }

    @Override
    public String toString(){
        return "Marca: "+getMarca()+"\n Modelo: "+getModelo()+"\n Velocidad maxima: "+getVelocidadMaxima()+"\n Cantidad pasajeros: "+cantidadPasajeros;
    }
}
