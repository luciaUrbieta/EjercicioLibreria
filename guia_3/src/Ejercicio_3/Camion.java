package Ejercicio_3;

public class Camion extends Vehiculo implements VehiculoDeCarga{

    private double pesoMaximo;

    public Camion(){
    }

    public Camion(String marca, String modelo, double velocidadMaxima){
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void establecerPesoMaximo(double pesoMaximo) {
        this.pesoMaximo=pesoMaximo;
    }

    @Override
    public String toString(){
        return "Marca: "+getMarca()+"\n Modelo: "+getModelo()+"\n Velocidad maxima: "+getVelocidadMaxima()+"\n Peso maximo: "+pesoMaximo;
    }
}
