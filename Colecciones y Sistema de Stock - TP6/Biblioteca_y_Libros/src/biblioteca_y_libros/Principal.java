
package biblioteca_y_libros;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TAREA 1: Crear una biblioteca
        System.out.println("=== TAREA 1: CREAR BIBLIOTECA ===");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        System.out.println("Biblioteca creada: " + biblioteca.getNombre());
        
        // TAREA 2: Crear al menos tres autores
        System.out.println("\n=== TAREA 2: CREAR AUTORES ===");
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A002", "Jorge Luis Borges", "Argentina");
        Autor autor3 = new Autor("A003", "Isabel Allende", "Chilena");
        
        System.out.println("Autores creados:");
        autor1.mostrarInfo();
        autor2.mostrarInfo();
        autor3.mostrarInfo();
        
        // TAREA 3: Agregar 5 libros a la biblioteca
        System.out.println("\n=== TAREA 3: AGREGAR LIBROS ===");
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("ISBN003", "Ficciones", 1944, autor2);
        biblioteca.agregarLibro("ISBN004", "El Aleph", 1949, autor2);
        biblioteca.agregarLibro("ISBN005", "La casa de los espíritus", 1982, autor3);
        
        
        // TAREA 4: Listar todos los libros
        System.out.println("\n=== TAREA 4: LISTAR TODOS LOS LIBROS ===");
        biblioteca.listarLibros();
        
        
        // TAREA 5: Buscar un libro por ISBN
        System.out.println("\n=== TAREA 5: BUSCAR LIBRO POR ISBN ===");
        String isbnBuscar = "ISBN003";
        Libro encontrado = biblioteca.buscarLibroPorIsbn(isbnBuscar);
        if (encontrado != null) {
            System.out.println("Libro encontrado:");
            encontrado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }
        
        
        // TAREA 6: Filtrar libros por año
        System.out.println("\n=== TAREA 6: FILTRAR LIBROS POR AÑO ===");
        biblioteca.filtrarLibrosPorAnio(1985);
        
        // TAREA 7: Eliminar un libro y listar restantes
        System.out.println("\n=== TAREA 7: ELIMINAR LIBRO ===");
        biblioteca.eliminarLibro("ISBN004");
        System.out.println("\nLibros restantes:");
        biblioteca.listarLibros();
        
        
        // TAREA 8: Mostrar cantidad total de libros
        System.out.println("\n=== TAREA 8: CANTIDAD TOTAL DE LIBROS ===");
        int cantidad = biblioteca.obtenerCantidadLibros();
        System.out.println("Total de libros en la biblioteca: " + cantidad);
        
        // TAREA 9: Listar todos los autores disponibles
        System.out.println("\n=== TAREA 9: AUTORES DISPONIBLES ===");
        biblioteca.mostrarAutoresDisponibles();
        
        
        
        
    }

}
