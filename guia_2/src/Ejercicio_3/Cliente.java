package Ejercicio_3;

import java.util.UUID;

/*
Es necesario modelar la clase Cliente, que posee un
atributo id como identificador del cliente, el mismo debe ser un valor
compuesto por letras y números aleatorios que se generan
automáticamente al crear un Cliente. El Cliente también posee un nombre,
un email y un porcentaje de descuento.

 */
public class Cliente {

    private String identificador; //static?
    private String nombre;
    private String email;
    private double descuento;

    public Cliente(){
        identificador= UUID.randomUUID().toString();
    }

    public Cliente(String nombre, String email, double descuento){
        identificador= UUID.randomUUID().toString();
        this.nombre=nombre;
        this.email=email;
        this.descuento=descuento;
    }

    public String getIdentificador(){
        return identificador;
    }

    public String getNombre(){
        return nombre;
    }

    public String getEmail(){
        return email;
    }

    public double getDescuento(){
        return descuento;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void setDescuento(double descuento){
        this.descuento=descuento;
    }

    @Override
    public String toString(){
        return "Identificador: "+identificador+"\nNombre: "+nombre+"\nEmail: "+email+"\nDescuento: "+descuento;
    }

}
