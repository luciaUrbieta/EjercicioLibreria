package Ejercicio_1;

public class EmpleadoTiempoCompleto extends Empleado {

    public EmpleadoTiempoCompleto(){

    }

    public EmpleadoTiempoCompleto(String nombre, double salario){
        super(nombre,salario);
    }

    @Override
    public double calcularPago(){
        return getSalario();
    }

}
