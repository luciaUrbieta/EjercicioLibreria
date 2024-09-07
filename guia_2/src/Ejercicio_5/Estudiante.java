package Ejercicio_5;
/*
Estudiante posee las características de
Persona y las de un estudiante, que en este caso son, año de ingreso,
cuota mensual y carrera
 */
public class Estudiante extends Persona {

    private int añoIngreso;
    private double cuotaMensual;
    private String carrera;

    public Estudiante(){

    }

    public Estudiante(int dni, String nombre, String apellido, String mail, String direccion, int añoIngreso,double cuotaMensual, String carrera){
        super(dni, nombre, apellido, mail, direccion);
        this.añoIngreso=añoIngreso;
        this.cuotaMensual=cuotaMensual;
        this.carrera=carrera;
    }

    public int getAñoIngreso(){
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso){
        this.añoIngreso=añoIngreso;
    }

    public double getCuotaMensual(){
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual){
        this.cuotaMensual=cuotaMensual;
    }

    public String getCarrera(){
        return carrera;
    }

    public void setCarrera(String carrera){
        this.carrera=carrera;
    }

    @Override
    public String toString(){
        return "Nombre: "+getNombre()+"\nApellido: "+getApellido()+"\nMail: "+getMail()+"\nDireccion: "+getDireccion()+"\nAño de ingreso: "+añoIngreso
        +"\nCuota mensual: "+cuotaMensual+"\nCarrera: "+carrera;
    }

}
