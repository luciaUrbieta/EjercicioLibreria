/*
Tanto los ítems de lectura, como los videojuegos tienen un Título, una fecha de lanzamiento, un publicador,un stock,
una clasificación, esta última siendo una de una lista predeterminada que la librería nos otorgó (ATP, PG-13, +16,+18) y un precio.
 */

import java.util.Date;
import java.util.UUID;

public abstract class Item {

    private String idUnico;
    private String titulo;
    private Date fechaLanzamiento;
    private String publicador; // hacer clase publicador?
    private int stock;
    private Clasificacion clasificacion;
    private double precio;

    public Item(){
        this.idUnico= UUID.randomUUID().toString();
    }

    public Item(String titulo, Date fechaLanzamiento, String publicador, int stock, Clasificacion clasificacion, double precio) {
        this.idUnico=UUID.randomUUID().toString();
        this.titulo=titulo;
        this.fechaLanzamiento=fechaLanzamiento;
        this.publicador=publicador;
        this.stock=stock;
        this.clasificacion=clasificacion;
        this.precio=precio;
    }

    // Getters
    public String getIdUnico(){
        return idUnico;
    }

    public String getTitulo() {
        return titulo;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public String getPublicador() {
        return publicador;
    }

    public int getStock() {
        return stock;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public double getPrecio() {
        return precio;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setPublicador(String publicador) {
        this.publicador = publicador;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

