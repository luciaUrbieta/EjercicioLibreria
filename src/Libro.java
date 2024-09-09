import java.util.Date;

/*
Los ítems literarios pueden ser libros, que cuentan con un género literario, para el cual también se nos brindó una lista
(romance, drama, no-ficción, fantasía, ciencia-ficción) y una cantidad de capitulos;
 */
public class Libro extends ItemLectura implements Alquilable{

    private GeneroLiterario generoLiterario;
    private int cantidadCapitulos;
    private int alquilados;

    public Libro(){
    }

    public Libro(String titulo, Date fechaLanzamiento, String publicador,  int stock, Clasificacion clasificacion, double precio,
    int cantidadPaginas, String autor, GeneroLiterario generoLiterario, int cantidadCapitulos, int alquilados){
        super(titulo, fechaLanzamiento, publicador, stock, clasificacion, precio, cantidadPaginas, autor);
        this.generoLiterario=generoLiterario;
        this.cantidadCapitulos=cantidadCapitulos;
        this.alquilados=alquilados;
    }

    // Getters
    public GeneroLiterario getGeneroLiterario() {
        return generoLiterario;
    }

    public int getCantidadCapitulos() {
        return cantidadCapitulos;
    }

    // Setters
    public void setGeneroLiterario(GeneroLiterario generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    public void setCantidadCapitulos(int cantidadCapitulos) {
        this.cantidadCapitulos = cantidadCapitulos;
    }

    @Override
    public int getAlquilados() {
        return alquilados;
    }

    @Override
    public void setAlquilados(int alquilados) {
        this.alquilados=alquilados;
    }
}
