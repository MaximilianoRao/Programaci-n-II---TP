
package pasaporte_foto_titular;

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
        // Crear pasaporte (composición con foto)
        Pasaporte pasaporte = new Pasaporte("A1528749", "12/2/2024", "foto_titular.jpg", "JPEG");
        
        // Crear titular
        Titular titular = new Titular("Juan Pérez", "12345678A");
        
        // Se establece relación bidireccional
        pasaporte.setTitular(titular);
        
        // Mostrar información
        System.out.println("Pasaporte");
        System.out.println(pasaporte);
        
        System.out.println("\nFoto");
        pasaporte.mostrarImagen();
        
        
        System.out.println("\nTitular");
        System.out.println(titular);
        System.out.println("Pasaporte del titular: " + titular.getPasaporte().getNumero());
    }

}
