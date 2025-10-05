
package vehiculos;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
//Extendemos Auto de la clase padre Vehiculo.
public class Auto extends Vehiculo {
    protected int cantidadPuertas;

    public Auto(int cantidadPuertas, String marca, String modelo) {
        //Llamamos el constructor de la clase padre.
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
        
    }
    
       
    @Override
    public void mostrarInfo() {
        System.out.println("marca= " + marca + ", modelo= " + modelo + ", puertas= " + cantidadPuertas); 
    }
    
}
