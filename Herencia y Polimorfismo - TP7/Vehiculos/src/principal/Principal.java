
package principal;

import vehiculos.Auto;

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
        
        Auto a1 = new Auto(3, "Renault", "Kwid");
        //Llamamos al metodo para mostrar la información.
        a1.mostrarInfo();
       
    }

}
