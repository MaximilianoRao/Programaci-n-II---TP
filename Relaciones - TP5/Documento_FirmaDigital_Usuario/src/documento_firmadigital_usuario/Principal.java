
package documento_firmadigital_usuario;

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
        // Crear usuario independiente (necesario para la FirmaDigital - agregación)
        Usuario usuario = new Usuario("Ana Ruiz", "ana.ruiz@empresa.com");
        
        Documento documento = new Documento("Contrato de Servicios", "Este documento establece...", 
                                           "SHA256HASH123", "2024-03-15", usuario);
        
        // Mostrar información
        System.out.println("Documento");
        System.out.println(documento);
        
        System.out.println("\nFirma digital");
        documento.mostrarFirmaDigital();
                
        System.out.println("\nUsuario");
        System.out.println(usuario);
        
        System.out.println("\nNuevo documento con el mismo usuario");
        Documento otroDocumento = new Documento("Acuerdo de Confidencialidad", "Las partes acuerdan...",
                                               "SHA256HASH456", "2024-03-16", usuario);
        System.out.println("Nuevo Documento");
        System.out.println(otroDocumento);
        
    }

}
