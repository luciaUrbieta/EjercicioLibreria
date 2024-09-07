package Ejercicio_1;
/*
Clase Tranvía:
- Implementa la interfaz Transporte.
- Atributos: ruta (cadena de texto), capacidad (entero), tipo
(TipoTransporte).
- Métodos: Implementa los métodos definidos en la interfaz y un metodo
adicional para cambiar de vía (cambiarVia(int nuevaVia)).
 */

public class Tranvia implements Transporte {

    private String ruta;
    private int capacidad;
    private TipoTransporte tipo;
    private int via;

    public Tranvia(String ruta, int capacidad, TipoTransporte tipo, int via){
        this.ruta=ruta;
        this.capacidad=capacidad;
        this.tipo=tipo;
        this.via=via;
    }

    public void cambiarVia(int nuevaVia){
        via=nuevaVia;
    }

    @Override
    public String arrancar() {
        return "Arrancando tranvia";
    }

    @Override
    public String detener() {
        return "Deteniendo tranvia";
    }

    @Override
    public int obtenerCapacidad() {
        return capacidad;
    }

    @Override
    public String toString(){
        return "Ruta: "+ruta+"\nCapacidad: "+capacidad+"\nTipo de transporte: "+tipo+"\nVia: "+via;
    }
}
