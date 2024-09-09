import java.util.Date;
/*
cuentan con un dibujante y un número de edición
 */
public class Comic extends ItemLectura implements Vendible{
    private String dibujante;
    private int numeroEdicion;
    private int vendidos;

    public Comic(){
    }

    public Comic(String titulo, Date fechaLanzamiento, String publicador, int stock, Clasificacion clasificacion, double precio, int cantidadPaginas, String autor, String dibujante, int numeroEdicion, int vendidos){
        super(titulo, fechaLanzamiento, publicador, stock, clasificacion, precio, cantidadPaginas, autor);
        this.dibujante=dibujante;
        this.numeroEdicion=numeroEdicion;
        this.vendidos=vendidos;
    }

    // Getters
    public String getDibujante() {
        return dibujante;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    // Setters
    public void setDibujante(String dibujante) {
        this.dibujante = dibujante;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public int getVendidos() {
        return vendidos;
    }

    @Override
    public void setVendidos(int vendidos) {
        this.vendidos=vendidos;
    }
}
