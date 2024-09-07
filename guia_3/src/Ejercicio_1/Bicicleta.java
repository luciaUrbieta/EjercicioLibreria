package Ejercicio_1;
/*
Clase Bicicleta:
- Implementa la interfaz Transporte.
- Atributos: numeroSerie (cadena de texto), tipo (TipoTransporte).
- Métodos: Implementa los métodos definidos en la interfaz y un método
adicional para ajustar la altura del asiento (ajustarAsiento(int altura)).
- obtenerCapacidad() devuelve 1 (porque solo tiene capacidad para una
persona).
 */
public class Bicicleta implements Transporte {

    private String numeroSerie;
    private TipoTransporte tipo;
    private int alturaAsiento;

    public Bicicleta(String numeroSerie, TipoTransporte tipo, int alturaAsiento){
        this.numeroSerie=numeroSerie;
        this.tipo=tipo;
        this.alturaAsiento=alturaAsiento;
    }

    public void ajustarAsiento(int altura){
        alturaAsiento = altura;
    }

    @Override
    public String arrancar() {
        return "Arrancando bici";
    }

    @Override
    public String detener() {
        return "Detener bici";
    }

    @Override
    public int obtenerCapacidad() {
        return 1;
    }

    @Override
    public String toString(){
        return "Numero de serie: "+numeroSerie+"\nTipo de transporte: "+tipo+"\nAltura del asiento: "+alturaAsiento;
    }

}
