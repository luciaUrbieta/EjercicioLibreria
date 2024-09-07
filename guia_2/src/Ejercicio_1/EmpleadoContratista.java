package Ejercicio_1;
public class EmpleadoContratista extends Empleado{

    private int horas;
    private double tarifaProyecto;

    public EmpleadoContratista(){

    }

    public EmpleadoContratista(String nombre, double salario, int horas, double tarifaProyecto){
        super(nombre,salario);
        this.horas=horas;
        this.tarifaProyecto=tarifaProyecto;
    }

    public int getHoras(){
        return horas;
    }

    public void setHoras(int horas){
        this.horas=horas;
    }

    public double getTarifaProyecto() {
        return tarifaProyecto;
    }

    public void setTarifaProyecto(double tarifaProyecto){
        this.tarifaProyecto=tarifaProyecto;
    }

    @Override
    public double calcularPago(){
        double salario = getSalario()*horas;
        salario=salario+getTarifaProyecto();
        return salario;
    }

}