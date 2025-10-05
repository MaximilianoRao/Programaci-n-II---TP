
package vehiculos;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    
    //Método para mostrar información. Se sobreescribirá en subclase.
    public void mostrarInfo() {
        System.out.println("marca= " + marca + ", modelo= " + modelo); 
    }
    
    
          
}
