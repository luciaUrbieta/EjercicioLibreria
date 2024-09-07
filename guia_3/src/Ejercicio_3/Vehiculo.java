package Ejercicio_3;

public class Vehiculo {

    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Vehiculo(){
    }

    public Vehiculo(String marca, String modelo, double velocidadMaxima){
        this.marca=marca;
        this.modelo=modelo;
        this.velocidadMaxima=velocidadMaxima;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public double getVelocidadMaxima(){
        return velocidadMaxima;
    }



}
