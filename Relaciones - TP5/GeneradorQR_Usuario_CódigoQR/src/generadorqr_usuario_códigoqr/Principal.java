
package generadorqr_usuario_c�digoqr;

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
        // Crear usuarios
        Usuario usuario1 = new Usuario("Ana Mart�nez", "ana.martinez@email.com");
        Usuario usuario2 = new Usuario("Carlos L�pez", "carlos.lopez@email.com");
        
        // Crear generador QR
        GeneradorQR generador = new GeneradorQR();
        System.out.println("=== GENERACI�N INDIVIDUAL ===");
        generador.generar("https://www.ejemplo.com/perfil/ana", usuario1);
        System.out.println("\n");
                
        generador.generar("EVENTO-CONFERENCIA-2024", usuario2);
    }

}
