package Ejercicio_5;
/*
miembro de Staff: es una Persona pero con características propias de alguien que
trabaja para una institución, por ejemplo salario y turno, este puede ser
mañana o noche.
 */

public class Profesor extends Persona {

    private double salario;
    private Turno turno;

    public enum Turno{
        MAÑANA,
        NOCHE;
    }

    public Profesor(){

    }

    public Profesor(int dni, String nombre, String apellido, String mail, String direccion, double salario, Turno turno){
        super(dni, nombre, apellido, mail, direccion);
        this.salario=salario;
        this.turno=turno;
    }

    @Override
    public String toString(){
        return "Nombre: "+getNombre()+"\nApellido: "+getApellido()+"\nMail: "+getMail()+"\nDireccion: "+getDireccion()+"\nSalario: "+salario+
        "\nTurno: "+turno;
    }


}
