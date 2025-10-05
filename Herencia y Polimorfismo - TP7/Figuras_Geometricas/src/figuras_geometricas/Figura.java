
package figuras_geometricas;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    
    //Metodo que se implementara en las subclases.
    public void calcularArea(){
        
    }
}
