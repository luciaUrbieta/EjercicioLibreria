package Ejercicio_2;

public abstract class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre=nombre;
        this.edad=edad;
    }

    protected Animal() {
    }

    public abstract void comer();
    public abstract void dormir();
}
