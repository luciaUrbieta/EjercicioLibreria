package Ejercicio_2;
/*
Es necesario modelar el objeto de tipo Libro con las siguientes
caracteristicas: titulo, precio, stock y Autor, este último posee las
características de: nombre, apellido, email y genero ( ‘M’ o ‘F’ ). Para este
ejercicio vamos a asumir que un libro tiene un único autor
 */
public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;

    public Libro(){

    }

    public Libro(String titulo, double precio, int stock, Autor autor){
        this.titulo=titulo;
        this.precio=precio;
        this.stock=stock;
        this.autor=autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public double getPrecio(){
        return precio;
    }

    public int getStock(){
        return stock;
    }

    public Autor getAutor(){
        return autor;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public void setPrecio(double precio){
        this.precio=precio;
    }

    public void setStock(int stock){
        this.stock=stock;
    }

    public void setAutor(Autor autor){
        this.autor=autor;
    }

    @Override
    public String toString(){
        return "Titulo: "+titulo+"\nPrecio: "+precio+"\nStock: "+stock+"\nAutor: "+autor.getNombre()+" "+autor.getApellido();
    }

    public String mensajePredeterminado(){
        return "El libro "+titulo+" de "+autor.getNombre()+" "+autor.getApellido()+" se vende a "+precio+" pesos.";
    }
}
