
package celular_bateria_usuario;


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
        // Crear batería independiente (agregación)
        Bateria bateria = new Bateria("Li-Ion 4000", 4000);
        // Crear celular
        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S24",bateria);
        // Crear usuario
        Usuario usuario = new Usuario("Maxi Rao", "38000257");
        
        // Establecer relación bidireccional (celular - usuario)
        celular.setUsuario(usuario);
        
        // Mostrar información
        System.out.println("Celular");
        System.out.println(celular);
        
        
        System.out.println("\nBateria");
        celular.mostrarBateria();
        
        //Independencia de la batería (agregación)
        System.out.println("\nAgregación");
        System.out.println("Batería antes de quitar del celular: " + bateria);
        celular.setBateria(null); // Removemos la batería del celular
        System.out.println("Celular sin bateria " + celular);
        System.out.println("Batería después de quitar del celular: " + bateria);
        celular.setBateria(bateria);
        
        
        System.out.println("\nUsuario");
        System.out.println(usuario);
        System.out.println("Celular del usuario: " + usuario.getCelular().getMarca() + " " + usuario.getCelular().getModelo());
        
        // Cambiar usuario (bidireccionalidad)
        System.out.println("\nCambio de usuario");
        Usuario nuevoUsuario = new Usuario("Carlos Rodríguez", "11223344C");
        nuevoUsuario.setCelular(celular);
        System.out.println(celular);
    }
    
}
