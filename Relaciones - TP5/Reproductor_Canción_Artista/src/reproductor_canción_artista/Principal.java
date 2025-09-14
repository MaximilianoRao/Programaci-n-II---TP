
package reproductor_canción_artista;

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
         // Crear artistas
        Artista artista1 = new Artista("The Beatles", "Rock");
        Artista artista2 = new Artista("Adele", "Pop");
        
        // Crear canciones (asociación unidireccional con artista)
        Cancion cancion1 = new Cancion("Hey Jude");
        cancion1.setArtista(artista1);
        Cancion cancion2 = new Cancion("Someone Like You");
        cancion2.setArtista(artista2);
        
        // Crear reproductor
        Reproductor reproductor = new Reproductor();
        
        // Demostrar dependencia de uso
        // El reproductor usa las canciones como parámetros pero no las almacena
        reproductor.reproducir(cancion1);
        reproductor.reproducir(cancion2);
        
        System.out.println("\nCanciones");
        System.out.println(cancion1);
        System.out.println(cancion2);
        
        
        
        
    }

}
