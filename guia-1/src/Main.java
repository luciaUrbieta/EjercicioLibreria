public class Main {
    public static void main(String[] args) {

        /*
        1. En el main, realice las siguientes operaciones:
        a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial
        de 25000.
        b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
        27500.
        c. Imprima ambos objetos por pantalla.
        d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
        salario anual del mismo.
         */

        Empleado carlos = new Empleado(23456345, "Carlos", "Gutierrez", 25000);

        Empleado ana = new Empleado(34234123, "Ana", "Sanchez", 27500);

        carlos.mostrarEmpleado();
        ana.mostrarEmpleado();

        System.out.println("Salario de Carlos: "+ carlos.getSalario());
        carlos.aumentarSalario(15);
        System.out.println("Salario aumentado de Carlos: "+ carlos.getSalario());
        System.out.println("Salario anual de Carlos: "+carlos.calcularSalarioAnual());



    }
}