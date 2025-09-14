
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
        Autor autor = new Autor("Gabriel Garc�a M�rquez", "Colombiana");
        
        // Crear editorial independiente
        Editorial editorial = new Editorial("Editorial Sudamericana", "Buenos Aires, Argentina");
        
        // Crear libro
        Libro libro = new Libro("978-84-376-0494-7", "Cien a�os de soledad", editorial);
        
        //Establece relaci�n con autor
        libro.setAutor(autor);
        
        // Mostrar informaci�n
        System.out.println("Libro");
        System.out.println(libro);
        
        System.out.println("\nAutor");
        System.out.println(autor);
        
        System.out.println("\nEditorial");
        System.out.println(editorial);
        
        //Obtener informaci�n de las relaciones
        System.out.println("\nRelaciones:");
        libro.mostrarAutor();
        System.out.println("Editorial: " + libro.getEditorial().getNombre());
        
        
        // La editorial se puede
        System.out.println("\nCambio editorial");
        Editorial otraEditorial = new Editorial("Planeta", "Barcelona, Espa�a");
        libro.setEditorial(otraEditorial);
        System.out.println(libro);
        
        
    }

}
