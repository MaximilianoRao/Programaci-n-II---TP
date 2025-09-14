
package computadora_placamadre_propietario;

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
         // Crear computadora (composici�n con foto)
        Computadora computadora = new Computadora("Dell", "DLL123456", "ASUS B450", "AMD B450");
        
        // Crear propietario
        Propietario propietario = new Propietario("Roberto Garc�a", "56789012F");
        
        // Se establece relaci�n bidireccional
        computadora.setPropietario(propietario);
        
        // Mostrar informaci�n
        System.out.println("Computadora");
        System.out.println(computadora);
        
        System.out.println("\nPlacaMadre");
        computadora.mostrarPlaca();
        
        
        System.out.println("\nPropietario");
        System.out.println(propietario);
        System.out.println("Computadora: " + propietario.getComputadora().getNumeroSerie());
        
        System.out.println("\nCambio de propietario");
        Propietario nuevoPropietario = new Propietario("Sandra Mart�n", "67890123G");
        computadora.setPropietario(nuevoPropietario);
        System.out.println(computadora);
    }

}
