package Ejercicio_1;

public class EmpleadoPorHoras extends Empleado{

    private int horas;

    public EmpleadoPorHoras(){

    }

    public EmpleadoPorHoras(String nombre, double salario, int horas){
        super(nombre,salario);
        this.horas=horas;
    }

    public int getHoras(){
        return horas;
    }

    public void setHoras(int horas){
        this.horas=horas;
    }

    @Override
    public double calcularPago(){
        double salario = getSalario()*horas;
        return salario;
    }

}
