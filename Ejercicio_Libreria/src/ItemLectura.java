/*
Por su parte, los ítems de lectura además tendrán una cantidad de páginas, y un autor.

 */

import java.util.Date;

public abstract class ItemLectura extends Item {

    private int cantidadPaginas;
    private String autor;

    public ItemLectura(){

    }

    public ItemLectura(String titulo, Date fechaLanzamiento, String publicador, int stock, Clasificacion clasificacion, double precio,
                       int cantidadPaginas, String autor) {
        super(titulo, fechaLanzamiento, publicador, stock, clasificacion, precio);
        this.cantidadPaginas=cantidadPaginas;
        this.autor=autor;
    }

    // Getters
    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public String getAutor() {
        return autor;
    }

    // Setters
    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
