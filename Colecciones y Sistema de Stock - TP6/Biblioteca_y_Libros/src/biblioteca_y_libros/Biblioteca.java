
package biblioteca_y_libros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        // Verificar si ya existe un libro con ese ISBN
        if (buscarLibroPorIsbn(isbn) != null) {
            System.out.println("Error: Ya existe un libro con ISBN " + isbn);
            return;
        }
        
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
        System.out.println("Libro agregado: " + titulo);
    }
    
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        System.out.println("\nLIBROS EN LA BIBLIOTECA: " + nombre);
        for (Libro libro : libros) {
            libro.mostrarInfo();
            System.out.println("---");
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
        Libro libroEncontrado = null;
        Iterator<Libro> it = this.libros.iterator();
        while(it.hasNext() && libroEncontrado == null){
            Libro l = it.next();
            if (l.getIsbn().equalsIgnoreCase(isbn)){
                libroEncontrado = l;
            }
        }
        return libroEncontrado;
    }
    
    public void eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            libros.remove(libro);
            System.out.println("Libro eliminado: " + libro.getTitulo());
        } else {
            System.out.println("Libro con ISBN " + isbn + " no encontrado.");
        }
    }
    
    
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    
    
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n=== LIBROS PUBLICADOS EN " + anio + " ===");
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                System.out.println("---");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay libros publicados en ese año.");
        }
    }
    
    public void mostrarAutoresDisponibles() {
        System.out.println("\nAUTORES DISPONIBLES EN LA BIBLIOTECA");
        
        // Creamos un ArrayList para guardar los IDs de autores ya mostrados
        List<String> autoresIds = new ArrayList<>();
        
        for (Libro libro : libros) {
            Autor autor = libro.getAutor();
            String autorId = autor.getId();
        
            // Verificamos si el ID ya está en la lista
            if (!autoresIds.contains(autorId)) {
                autoresIds.add(autorId);  // Lo agregamos a la lista
                autor.mostrarInfo();       // Lo mostramos
            }
        }

    }
    
    
}
