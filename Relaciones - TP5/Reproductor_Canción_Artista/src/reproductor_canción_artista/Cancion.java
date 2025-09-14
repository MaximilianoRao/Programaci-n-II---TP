
package reproductor_canción_artista;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void mostrarArtista() {
         System.out.println("La canción " + titulo + " pertenece al artista " + artista.getNombre());
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + '}';
    }
    
    
    
    
    
}
