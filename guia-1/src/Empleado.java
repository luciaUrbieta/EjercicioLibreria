/*
Modele el objeto Empleado que posee las siguientes características, dni,
nombre, apellido y salario. El mismo debe contar con la posibilidad de
calcular el salario anual. A su vez se requiere otro método que permita
aumentar el salario dependiendo del porcentaje que se le pase por
parámetro. Considere crear un método que facilite imprimir por pantalla las
características del objeto de la siguiente forma:
Empleado[dni=?, nombre=?, apellido=?, salario=?]
En el main, realice las siguientes operaciones:
a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial
de 25000.
b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
27500.
c. Imprima ambos objetos por pantalla.
d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
salario anual del mismo.
 */

public class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(int dni, String nombre, String apellido, double salario){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.salario=salario;
    }

    public int getDni(){
        return dni;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalarioAnual(){
        double salarioAnual=salario*12;
        return salarioAnual;
    }

    public void aumentarSalario(double porcentaje){
        double aumento = (salario/100)*porcentaje;
        double salarioAumentado = salario+aumento;
        salario=salarioAumentado;
    }

    public void mostrarEmpleado(){
        System.out.println("EMPLEADO \n");
        System.out.println("DNI: "+dni+"\n");
        System.out.println("Nombre: "+nombre+"\n");
        System.out.println("Apellido: "+apellido+"\n");
        System.out.println("Salario: "+salario+"\n");
    }
}


