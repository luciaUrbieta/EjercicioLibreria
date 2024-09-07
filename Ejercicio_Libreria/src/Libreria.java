/*
Los libros y los videojuegos son comprados mediante alquiler, es decir, pueden ser prestados y devueltos.
En cambio los cómics se comercian mediante venta.
Crear la clase librería, que se encargará del ABM(alta, baja lógica, modificación) y la comercialización de los productos.
 */

import java.util.Date;

public class Libreria implements Alquilable, Vendible{

    Libro[] libros = new Libro[20];
    int l=0;
    Comic[] comics = new Comic[20];
    int c=0;
    Videojuego[] videojuegos = new Videojuego[20];
    int v=0;

    public void agregarItem(){

    }

    public void agregarLibro(String titulo, Date fechaLanzamiento, String publicador, int stock, Clasificacion clasificacion, double precio,

        int cantidadPaginas, String autor, GeneroLiterario generoLiterario, int cantidadCapitulos){
        libros[l]= new Libro();
        libros[l].setTitulo(titulo);
    }


}
