
package libro_autor_editorial;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Libro {
    private String isbn;
    private String titulo;
    private Editorial editorial;
    private Autor autor;

    public Libro(String isbn, String titulo, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void mostrarAutor() {
        if (autor != null) {
            System.out.println("Libro: " + titulo + "\nAutor: " + autor.getNombre());
        } else{
            System.out.println("El libro es anonimo");
        }
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public void setAutor(Autor Autor) {
        this.autor = Autor;
    }

    public Autor getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", editorial=" + editorial + ", autor=" + autor + '}';
    }
    
    
}
