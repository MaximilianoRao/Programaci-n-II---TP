
package ecommerce;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Cliente implements Notificable {
    private String nombre;
    
    public Cliente(String nombre) {
        this.nombre = nombre;
     
    }
    
    @Override
    public void notificar(String mensaje) {
        System.out.println("\n Notificación para " + nombre + ":");
        System.out.println("   " + mensaje);
    }
    
    public String getNombre() {
        return nombre;
    }

}
