import Ejercicio_2.Autor;
import Ejercicio_2.Libro;
import Ejercicio_3.Cliente;
import Ejercicio_3.Factura;
import Ejercicio_5.Estudiante;
import Ejercicio_5.Persona;
import Ejercicio_5.Profesor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //1.
        /*
        Empleado[] empleados = new Empleado[10];
        int i=0;
        String nombre;
        double salario;
        int horas;
        double tarifaProyecto;
        int seleccion;

        do{
            seleccion=menu1();
            switch(seleccion){
                case 1:
                    if(i<empleados.length){
                        System.out.println("Ingrese el nombre del empleado");
                        nombre=scan.nextLine();
                        System.out.println("Ingrese el salario por hora");
                        salario=scan.nextDouble();
                        scan.nextLine();
                        empleados[i]= new EmpleadoTiempoCompleto(nombre, salario);
                        i++;
                    }
                    break;
                case 2:
                    if(i<empleados.length){
                        System.out.println("Ingrese el nombre del empleado");
                        nombre=scan.nextLine();
                        System.out.println("Ingrese el salario por hora");
                        salario=scan.nextDouble();
                        scan.nextLine();
                        System.out.println("Ingrese las horas trabajadas");
                        horas=scan.nextInt();
                        scan.nextLine();
                        empleados[i]= new EmpleadoPorHoras(nombre, salario, horas);
                        i++;
                    }
                    break;
                case 3:
                    if(i< empleados.length){
                        System.out.println("Ingrese el nombre del empleado");
                        nombre=scan.nextLine();
                        System.out.println("Ingrese el salario por hora");
                        salario=scan.nextDouble();
                        scan.nextLine();
                        System.out.println("Ingrese las horas trabajadas");
                        horas=scan.nextInt();
                        scan.nextLine();
                        System.out.println("Ingrese la tarifa del proyecto");
                        tarifaProyecto=scan.nextDouble();
                        scan.nextLine();
                        empleados[i]= new EmpleadoContratista(nombre, salario, horas, tarifaProyecto);
                        i++;
                    }
                    break;
                case 4:
                    for(int j=0; j<i; j++){
                        System.out.println("Empleado: "+empleados[j].getNombre()+"\n Salario: "+empleados[j].calcularPago());
                    }
                case 0:
                    System.out.println("Gracias!");
                    break;
                default:
                    System.out.println("Opcion invalida >:(");
                    break;
            }
        }while(seleccion!=0);

        */
        //2.
        /*
        Autor autor1 = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        Libro libro1 = new Libro("Effective Java", 450, 150, autor1);

        System.out.println(autor1.toString());
        // System.out.println("Nombre: "+autor1.getNombre()+"\nApellido: "+autor1.getApellido()+"\nEmail: "+autor1.getEmail()+"\nGenero: "+autor1.getGenero());
        System.out.println(libro1.toString());
        libro1.setPrecio(500);
        libro1.setStock(libro1.getStock()+50);
        System.out.println(libro1.toString());
        System.out.println(libro1.mensajePredeterminado());
         */

        //3.
        /*
        Cliente cliente1 = new Cliente("Lucia", "lu06@gmail.com", 20);
        System.out.println(cliente1.toString());
        Factura factura1 = new Factura(100, cliente1);
        System.out.println(factura1.toString());
        factura1.calcularMontoTotal();
        System.out.println(factura1.toString());
        */

        //4.
        /*

         */

        //5.
        /*
        Estudiante estudiante1 = new Estudiante(20218054, "Andrew", "Bernard", "andrew2008@gmail.com", "Lonesome Street 347", 2014, 500, "Coro Profesional");
        Estudiante estudiante2 = new Estudiante(20219023, "Pam", "Beesly", "pam.beesly@gmail.com", "Scranton Avenue 123", 2015, 700, "Artes Plásticas");
        Estudiante estudiante3 = new Estudiante(20214567, "Jim", "Halpert", "jim.halpert@gmail.com", "Stamford Plaza 78", 2013, 600, "Administración de Empresas");
        Estudiante estudiante4 = new Estudiante(20215678, "Dwight", "Schrute", "dwight.schrute@gmail.com", "Beet Farm Road 555", 2016, 400, "Agronomía");

        Profesor profesor1 = new Profesor(18789753, "Creed", "Bratton", "creedbratton@gmail.com", "Under the bridge 303", 1500, Profesor.Turno.NOCHE);
        Profesor profesor2 = new Profesor(17456321, "Michael", "Scott", "michael.scott@gmail.com", "Dunder Mifflin 456", 2000, Profesor.Turno.MAÑANA);
        Profesor profesor3 = new Profesor(18345672, "Stanley", "Hudson", "stanley.hudson@gmail.com", "Scranton Circle 789", 1800, Profesor.Turno.MAÑANA);
        Profesor profesor4 = new Profesor(16894753, "Phyllis", "Vance", "phyllis.vance@gmail.com", "Vance Refrigeration 101", 1700, Profesor.Turno.NOCHE);

        Persona[] personas = new Persona[]{estudiante1, estudiante2, estudiante3, estudiante4, profesor1, profesor2, profesor3, profesor4};

        double ganancia=0;
        int estudiantes=0;
        int profesores=0;

        for(int i=0; i<personas.length; i++){
            if(personas[i]instanceof Estudiante){
                estudiantes++;
                System.out.println("ESTUDIANTE \n");
                Estudiante e = (Estudiante) personas[i];
                System.out.println(e.toString());
                ganancia=ganancia+e.getCuotaMensual();
            }
            else if(personas[i]instanceof Profesor){
                profesores++;
                System.out.println("PROFESOR \n");
                Profesor p = (Profesor) personas[i];
                System.out.println(p.toString());
            }
            System.out.println("\n");
        }

        System.out.println("Cantidad de profesores: "+profesores);
        System.out.println("Cantidad de estudiantes: "+estudiantes);
        System.out.println("Ingresos de la institucion: "+ganancia);
        */

    }

    public static int menu1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("MENU DE OPCIONES. \n");
        System.out.println("1. Ingrese 1 para cargar un empleado a tiempo completo. \n");
        System.out.println("2. Ingrese 2 para cargar un empleado por horas. \n");
        System.out.println("3. Ingrese 3 para cargar un empleado contratista. \n");
        System.out.println("4. Ingrese 4 para mostrar los salarios de los empleados. \n");
        System.out.println("5. Ingrese 0 para salir. \n");
        int seleccion = scan.nextInt();
        scan.nextLine();
        return seleccion;
    }

}