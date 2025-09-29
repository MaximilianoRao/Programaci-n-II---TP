
package editorvideo_proyecto_render;



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
         // Crear proyectos
        Proyecto proyecto1 = new Proyecto("Tutorial Java", 45);
        Proyecto proyecto2 = new Proyecto("Presentación Empresa", 12);
        
        // Crear editor de video
        EditorVideo editor = new EditorVideo();
       
        // Demostrar dependencia de creación
        // El editor CREA renders pero no los almacena
        System.out.println("=== EXPORTACIONES INDIVIDUALES ===");
        editor.exportar("MP4", proyecto1);
        System.out.println("\n");
        editor.exportar("AVI", proyecto2);
        
    }

}
