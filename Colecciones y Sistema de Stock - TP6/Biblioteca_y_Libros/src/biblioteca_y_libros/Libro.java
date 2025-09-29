
package biblioteca_y_libros;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;
    
    
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
     
    public void mostrarInfo() {
        System.out.println("ISBN: " + isbn + " | Título: " + titulo + 
                         " | Año: " + anioPublicacion);
        System.out.print("  Autor: ");
        autor.mostrarInfo();
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
    
    
     
}
