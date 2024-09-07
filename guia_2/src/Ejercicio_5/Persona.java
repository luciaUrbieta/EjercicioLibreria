package Ejercicio_5;

public class Persona {

    private int dni;
    private String nombre;
    private String apellido;
    private String mail;
    private String direccion;

    public Persona(){

    }

    public Persona(int dni, String nombre, String apellido, String mail, String direccion){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.mail=mail;
        this.direccion=direccion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nApellido: "+apellido+"\nMail: "+mail+"\nDireccion: "+direccion;
    }


}
