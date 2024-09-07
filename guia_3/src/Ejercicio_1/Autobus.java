package Ejercicio_1;
/*
Clase Autobus:
- Implementa la interfaz Transporte.
- Atributos: numeroLinea (entero), capacidad (entero), tipo
(TipoTransporte).
- Métodos: Implementa los métodos definidos en la interfaz y un metodo
adicional para anunciar la próxima parada (anunciarParada(String
parada)).
 */
public class Autobus implements Transporte {

    private int numeroLinea;
    private int capacidad;
    private TipoTransporte tipo;

    public Autobus(int numeroLinea, int capacidad, TipoTransporte tipo){
        this.numeroLinea=numeroLinea;
        this.capacidad=capacidad;
        this.tipo=tipo;
    }

    public String anunciarParada(String parada){
        return "Proxima parada: " + parada;
    }

    @Override
    public String arrancar() {
        return "Arrancando autobus";
    }

    @Override
    public String detener() {
        return "Deteniendo autobus";
    }

    @Override
    public int obtenerCapacidad() {
        return capacidad;
    }

    @Override
    public String toString(){
        return "Numero de linea: "+numeroLinea+"\nCapacidad: "+capacidad+"\nTipo de transporte: "+tipo;
    }
}
