
package libro_autor_editorial;

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
        // Crear autor independiente
        Autor autor = new Autor("Gabriel García Márquez", "Colombiana");
        
        // Crear editorial independiente
        Editorial editorial = new Editorial("Editorial Sudamericana", "Buenos Aires, Argentina");
        
        // Crear libro
        Libro libro = new Libro("978-84-376-0494-7", "Cien años de soledad", editorial);
        
        //Establece relación con autor
        libro.setAutor(autor);
        
        // Mostrar información
        System.out.println("Libro");
        System.out.println(libro);
        
        System.out.println("\nAutor");
        System.out.println(autor);
        
        System.out.println("\nEditorial");
        System.out.println(editorial);
        
        //Obtener información de las relaciones
        System.out.println("\nRelaciones:");
        libro.mostrarAutor();
        System.out.println("Editorial: " + libro.getEditorial().getNombre());
        
        
        // La editorial se puede
        System.out.println("\nCambio editorial");
        Editorial otraEditorial = new Editorial("Planeta", "Barcelona, España");
        libro.setEditorial(otraEditorial);
        System.out.println(libro);
        
        
    }

}
