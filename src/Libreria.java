/*
Los libros y los videojuegos son comprados mediante alquiler, es decir, pueden ser prestados y devueltos.
En cambio los cómics se comercian mediante venta.
Crear la clase librería, que se encargará del ABM(alta, baja lógica, modificación) y la comercialización de los productos.
 */

import java.util.ArrayList;
import java.util.Date;

public class Libreria {

    ArrayList<Libro> libros = new ArrayList<Libro>();

    ArrayList<Comic> comics = new ArrayList<Comic>();

    ArrayList<Videojuego> videojuegos = new ArrayList<Videojuego>();

    // METODOS PARA AGREGAR ITEMS
    // Deberian ser diferentes metodos para cada tipo de item o uno en comun con un switch adentro segun el item a cargar?

    public void agregarLibro(String titulo, Date fechaLanzamiento, String publicador, int stock, Clasificacion clasificacion, double precio, int cantidadPaginas, String autor, GeneroLiterario generoLiterario, int cantidadCapitulos){
        Libro nuevoLibro = new Libro();

        // Asignar valores a los atributos del nuevo libro
        nuevoLibro.setTitulo(titulo);
        nuevoLibro.setFechaLanzamiento(fechaLanzamiento);
        nuevoLibro.setPublicador(publicador);
        nuevoLibro.setStock(stock);
        nuevoLibro.setClasificacion(clasificacion);
        nuevoLibro.setPrecio(precio);
        nuevoLibro.setCantidadPaginas(cantidadPaginas);
        nuevoLibro.setAutor(autor);
        nuevoLibro.setGeneroLiterario(generoLiterario);
        nuevoLibro.setCantidadCapitulos(cantidadCapitulos);

        // Agregar el libro a la lista
        libros.add(nuevoLibro);
    }

    public void agregarComic(String titulo, Date fechaLanzamiento, String publicador, int stock, Clasificacion clasificacion, double precio, int cantidadPaginas, String autor, String dibujante, int numeroEdicion){
        Comic nuevoComic = new Comic();

        nuevoComic.setTitulo(titulo);
        nuevoComic.setFechaLanzamiento(fechaLanzamiento);
        nuevoComic.setPublicador(publicador);
        nuevoComic.setStock(stock);
        nuevoComic.setClasificacion(clasificacion);
        nuevoComic.setPrecio(precio);
        nuevoComic.setCantidadPaginas(cantidadPaginas);
        nuevoComic.setAutor(autor);
        nuevoComic.setDibujante(dibujante);
        nuevoComic.setNumeroEdicion(numeroEdicion);

        comics.add(nuevoComic);
    }

    public void agregarVideojuego(String titulo, Date fechaLanzamiento, String publicador, int stock, Clasificacion clasificacion, double precio, GeneroVideojuego generoVideojuego, boolean juegaOnline, String consolas){
        Videojuego nuevoVideojuego = new Videojuego();

        nuevoVideojuego.setTitulo(titulo);
        nuevoVideojuego.setFechaLanzamiento(fechaLanzamiento);
        nuevoVideojuego.setPublicador(publicador);
        nuevoVideojuego.setStock(stock);
        nuevoVideojuego.setClasificacion(clasificacion);
        nuevoVideojuego.setPrecio(precio);
        nuevoVideojuego.setGeneroVideojuego(generoVideojuego);
        nuevoVideojuego.setJuegaOnline(juegaOnline);
        nuevoVideojuego.setConsolas(consolas);

        videojuegos.add(nuevoVideojuego);
    }

    // METODOS PARA LEER TODOS LOS ITEMS DE CADA TIPO

    public String verTodosLosLibros(){
        //Uso StringBuilder para hacer una cadena de caracteres capaz de almacenar cualquier tipo de dato de manera directa
        StringBuilder todosLosLibros = new StringBuilder();
        for(Libro libro : libros){
            //concateno toda la informacion con .append
            todosLosLibros.append("Titulo: ").append(libro.getTitulo()).append("\n")
                    .append("Fecha de lanzamiento: ").append(libro.getFechaLanzamiento()).append("\n")
                    .append("Publicador: ").append(libro.getPublicador()).append("\n")
                    .append("Stock: ").append(libro.getStock()).append("\n")
                    .append("Clasificación: ").append(libro.getClasificacion()).append("\n")
                    .append("Precio: ").append(libro.getPrecio()).append("\n")
                    .append("Cantidad de páginas: ").append(libro.getCantidadPaginas()).append("\n")
                    .append("Autor: ").append(libro.getAutor()).append("\n")
                    .append("Género literario: ").append(libro.getGeneroLiterario()).append("\n")
                    .append("Cantidad de capítulos: ").append(libro.getCantidadCapitulos()).append("\n")
                    .append("Identificador: ").append(libro.getIdUnico()).append("\n")
                    .append("-----------------------------\n");
        }
        //convierto el StringBuilder en String para retornarlo
        return todosLosLibros.toString();
    }

    public String verTodosLosComics() {
        StringBuilder todosLosComics = new StringBuilder(); // Usar StringBuilder para una concatenación eficiente
        // Iterar sobre todos los comics en la lista
        for (Comic comic : comics) {
            todosLosComics.append("Titulo: ").append(comic.getTitulo()).append("\n")
                    .append("Fecha de lanzamiento: ").append(comic.getFechaLanzamiento()).append("\n")
                    .append("Publicador: ").append(comic.getPublicador()).append("\n")
                    .append("Stock: ").append(comic.getStock()).append("\n")
                    .append("Clasificación: ").append(comic.getClasificacion()).append("\n")
                    .append("Precio: ").append(comic.getPrecio()).append("\n")
                    .append("Cantidad de páginas: ").append(comic.getCantidadPaginas()).append("\n")
                    .append("Autor: ").append(comic.getAutor()).append("\n")
                    .append("Dibujante: ").append(comic.getDibujante()).append("\n")
                    .append("Número de edición: ").append(comic.getNumeroEdicion()).append("\n")
                    .append("-----------------------------\n"); // Separador para cada cómic
        }
        return todosLosComics.toString(); // Convertir StringBuilder a String
    }

    public String verTodosLosVideojuegos() {
        StringBuilder todosLosVideojuegos = new StringBuilder(); // Usar StringBuilder para una concatenación eficiente
        // Iterar sobre todos los videojuegos en la lista
        for (Videojuego videojuego : videojuegos) {
            todosLosVideojuegos.append("Titulo: ").append(videojuego.getTitulo()).append("\n")
                    .append("Fecha de lanzamiento: ").append(videojuego.getFechaLanzamiento()).append("\n")
                    .append("Publicador: ").append(videojuego.getPublicador()).append("\n")
                    .append("Stock: ").append(videojuego.getStock()).append("\n")
                    .append("Clasificación: ").append(videojuego.getClasificacion()).append("\n")
                    .append("Precio: ").append(videojuego.getPrecio()).append("\n")
                    .append("Género de videojuego: ").append(videojuego.getGeneroVideojuego()).append("\n")
                    .append("Juega online: ").append(videojuego.isJuegaOnline() ? "Sí" : "No").append("\n") //Se usa una expresión condicional para mostrar "Sí" o "No" en lugar de true o false para el atributo juegaOnline.
                    .append("Consolas: ").append(videojuego.getConsolas()).append("\n")
                    .append("-----------------------------\n"); // Separador para cada videojuego
        }
        return todosLosVideojuegos.toString(); // Convertir StringBuilder a String
    }

    // METODOS PARA BUSCAR Y MOSTRAR UN DETERMINADO ITEM

    public String buscarLibroPorTitulo(String tituloBuscado){
        String idEncontrado="Id no encontrado";
        for(Libro libro : libros){
            if(libro.getTitulo().equalsIgnoreCase(tituloBuscado)){
                idEncontrado=libro.getIdUnico();
                break;
            }
        }
        return idEncontrado;
    }

    public String mostrarLibro(String idUnico){
        StringBuilder infoLibro = new StringBuilder();
        for(Libro libro : libros){
            if(libro.getIdUnico().equals(idUnico)){
                infoLibro.append("Titulo: ").append(libro.getTitulo()).append("\n")
                        .append("Fecha de lanzamiento: ").append(libro.getFechaLanzamiento()).append("\n")
                        .append("Publicador: ").append(libro.getPublicador()).append("\n")
                        .append("Stock: ").append(libro.getStock()).append("\n")
                        .append("Clasificación: ").append(libro.getClasificacion()).append("\n")
                        .append("Precio: ").append(libro.getPrecio()).append("\n")
                        .append("Cantidad de páginas: ").append(libro.getCantidadPaginas()).append("\n")
                        .append("Autor: ").append(libro.getAutor()).append("\n")
                        .append("Género literario: ").append(libro.getGeneroLiterario()).append("\n")
                        .append("Cantidad de capítulos: ").append(libro.getCantidadCapitulos()).append("\n")
                        .append("Identificador: ").append(libro.getIdUnico()).append("\n")
                        .append("-----------------------------\n");
                break;
            }
        }
        return infoLibro.toString();
    }

    public String buscarComicPorTitulo(String tituloBuscado){
        String idEncontrado="Id no encontrado";
        for(Comic comic : comics){
            if(comic.getTitulo().equalsIgnoreCase(tituloBuscado)){
                idEncontrado=comic.getIdUnico();
                break;
            }
        }
        return idEncontrado;
    }

    public String mostrarComic(String idUnico){
        StringBuilder infoComic = new StringBuilder();
        for(Comic comic : comics){
            if(comic.getIdUnico().equals(idUnico)){
                infoComic.append("Titulo: ").append(comic.getTitulo()).append("\n")
                        .append("Fecha de lanzamiento: ").append(comic.getFechaLanzamiento()).append("\n")
                        .append("Publicador: ").append(comic.getPublicador()).append("\n")
                        .append("Stock: ").append(comic.getStock()).append("\n")
                        .append("Clasificación: ").append(comic.getClasificacion()).append("\n")
                        .append("Precio: ").append(comic.getPrecio()).append("\n")
                        .append("Cantidad de páginas: ").append(comic.getCantidadPaginas()).append("\n")
                        .append("Autor: ").append(comic.getAutor()).append("\n")
                        .append("Dibujante: ").append(comic.getDibujante()).append("\n")
                        .append("Número de edición: ").append(comic.getNumeroEdicion()).append("\n")
                        .append("-----------------------------\n");
                break;
            }
        }
        return infoComic.toString();
    }

    public String buscarVideojuegoPorTitulo(String tituloBuscado){
        String idEncontrado="Id no encontrado";
        for(Videojuego videojuego : videojuegos){
            if(videojuego.getTitulo().equalsIgnoreCase(tituloBuscado)){
                idEncontrado=videojuego.getIdUnico();
                break;
            }
        }
        return idEncontrado;
    }

    public String mostrarVideojuego(String idUnico){
        StringBuilder infoVideojuego = new StringBuilder();
        for(Videojuego videojuego : videojuegos){
            if(videojuego.getIdUnico().equals(idUnico)){
                infoVideojuego.append("Titulo: ").append(videojuego.getTitulo()).append("\n")
                        .append("Fecha de lanzamiento: ").append(videojuego.getFechaLanzamiento()).append("\n")
                        .append("Publicador: ").append(videojuego.getPublicador()).append("\n")
                        .append("Stock: ").append(videojuego.getStock()).append("\n")
                        .append("Clasificación: ").append(videojuego.getClasificacion()).append("\n")
                        .append("Precio: ").append(videojuego.getPrecio()).append("\n")
                        .append("Género de videojuego: ").append(videojuego.getGeneroVideojuego()).append("\n")
                        .append("Juega online: ").append(videojuego.isJuegaOnline() ? "Sí" : "No").append("\n") //Se usa una expresión condicional para mostrar "Sí" o "No" en lugar de true o false para el atributo juegaOnline.
                        .append("Consolas: ").append(videojuego.getConsolas()).append("\n")
                        .append("-----------------------------\n");
                break;
            }
        }
        return infoVideojuego.toString();
    }

    // METODOS PARA ALQUILAR Y VENDER ITEMS

    public void alquilar(Item item) {
        if(item instanceof Libro || item instanceof Videojuego){
            item.setStock(item.getStock()-1);
            ((Alquilable) item).setAlquilados(((Alquilable) item).getAlquilados()+1);
        }
    }

    public void vender(Comic comic) {
        comic.setStock(comic.getStock()-1);
        comic.setVendidos(comic.getVendidos()+1);
    }

    // METODOS PARA MODIFICAR UN DETERMINADO ITEM



    // METODOS PARA ELIMINAR UN DETERMINADO ITEM






}
