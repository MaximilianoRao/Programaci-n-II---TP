
package editorvideo_proyecto_render;



/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class EditorVideo {
    public void exportar (String formato, Proyecto proyecto){
        System.out.println("=== INICIANDO EXPORTACIÓN ===");
        System.out.println("Proyecto: " + proyecto.getNombre());
        System.out.println("Duración: " + proyecto.getDuracionMin() + " minutos");
        System.out.println("Formato: " + formato.toUpperCase());
        System.out.println("Procesando video...");
        Render render = new Render(formato.toUpperCase());
        render.setProyecto(proyecto);
        System.out.println("Exportación completada!");
        render.mostrarProyecto();
        
    }
}
