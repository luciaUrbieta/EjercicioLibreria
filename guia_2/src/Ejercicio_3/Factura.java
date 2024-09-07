package Ejercicio_3;
/*
Por otro lado vamos a tener el objeto Factura que representa una venta
del local, cada Factura posee un identificador de las mismas
características usadas en Cliente. A su vez cada factura posee un monto
total, una fecha y el Cliente que generó la compra. Para la fecha de la
venta se le va a asignar la fecha y hora al momento de creación del objeto
Factura. El tipo Factura debe contar con un metodo que calcule el monto
final luego de aplicarle el descuento que posee el cliente.
*/

import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {

    private String identificador;
    private double montoInicial;
    private LocalDateTime fecha;
    private Cliente cliente;
    private double montoFinal;

    public Factura(){
        identificador= UUID.randomUUID().toString();
    }

    public Factura(double montoTotal, Cliente cliente){
        identificador= UUID.randomUUID().toString();
        fecha=LocalDateTime.now();
        this.montoInicial =montoTotal;
        this.cliente=cliente;
    }

    public String getIdentificador(){
        return identificador;
    }

    public double getMontoInicial(){
        return montoInicial;
    }

    public LocalDateTime getFecha(){
        return fecha;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setMontoInicial(double montoInicial){
        this.montoInicial = montoInicial;
    }

    public void setCliente(Cliente cliente){
        this.cliente=cliente;
    }

    public void calcularMontoTotal(){
        double descuento=(montoInicial /100)*cliente.getDescuento();
        montoFinal= montoInicial-descuento;
    }

    @Override
    public String toString(){
        return "Identificador: "+identificador+"\nFecha: "+fecha+"\nMonto inicial: "+ montoInicial+"\nMonto final: "+
                montoFinal+"\nCliente: "+cliente.getNombre();
    }
}
