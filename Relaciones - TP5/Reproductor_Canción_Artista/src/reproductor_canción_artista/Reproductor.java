
package reproductor_canci�n_artista;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Reproductor {
    public void reproducir(Cancion cancion){
        System.out.println("Reproduciendo: " + cancion.getTitulo());
        cancion.mostrarArtista();
    }
}
