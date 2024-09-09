import java.util.Date;

/*
los videojuegos cuentan con un género de videojuegos, para el cual se brindó una lista específica(shooter, RPG, MMO, deportivo),
cuentan con la opción de poder jugarlos online o no, y en que consolas está disponible.
 */
public class Videojuego extends Item implements Alquilable {

    private GeneroVideojuego generoVideojuego;
    private boolean juegaOnline;
    private String consolas;
    private int alquilados;

    public Videojuego(){
    }

    public Videojuego(String titulo, Date fechaLanzamiento, String publicador, int stock, Clasificacion clasificacion, double precio, GeneroVideojuego generoVideojuego, boolean juegaOnline, String consolas, int alquilados) {
        super(titulo, fechaLanzamiento, publicador, stock, clasificacion, precio);
        this.generoVideojuego=generoVideojuego;
        this.consolas=consolas;
        this.alquilados=alquilados;
    }

    // Getters
    public GeneroVideojuego getGeneroVideojuego() {
        return generoVideojuego;
    }

    public boolean isJuegaOnline() {
        return juegaOnline;
    }

    public String getConsolas() {
        return consolas;
    }

    // Setters
    public void setGeneroVideojuego(GeneroVideojuego generoVideojuego) {
        this.generoVideojuego = generoVideojuego;
    }

    public void setJuegaOnline(boolean juegaOnline) {
        this.juegaOnline = juegaOnline;
    }

    public void setConsolas(String consolas) {
        this.consolas = consolas;
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
