
package editorvideo_proyecto_render;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Render {
    private String formato;
    private Proyecto proyecto;

    public Render(String formato) {
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void mostrarProyecto() {
        System.out.println("El render " + formato + " tiene el proyecto " + proyecto.getNombre());
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "Render{" + "formato=" + formato + ", proyecto=" + proyecto + '}';
    }
    
    
}
