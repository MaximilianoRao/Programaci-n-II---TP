
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
        // Crear bater�a independiente (agregaci�n)
        Bateria bateria = new Bateria("Li-Ion 4000", 4000);
        // Crear celular
        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S24",bateria);
        // Crear usuario
        Usuario usuario = new Usuario("Maxi Rao", "38000257");
        
        // Establecer relaci�n bidireccional (celular - usuario)
        celular.setUsuario(usuario);
        
        // Mostrar informaci�n
        System.out.println("Celular");
        System.out.println(celular);
        
        
        System.out.println("\nBateria");
        celular.mostrarBateria();
        
        //Independencia de la bater�a (agregaci�n)
        System.out.println("\nAgregaci�n");
        System.out.println("Bater�a antes de quitar del celular: " + bateria);
        celular.setBateria(null); // Removemos la bater�a del celular
        System.out.println("Celular sin bateria " + celular);
        System.out.println("Bater�a despu�s de quitar del celular: " + bateria);
        celular.setBateria(bateria);
        
        
        System.out.println("\nUsuario");
        System.out.println(usuario);
        System.out.println("Celular del usuario: " + usuario.getCelular().getMarca() + " " + usuario.getCelular().getModelo());
        
        // Cambiar usuario (bidireccionalidad)
        System.out.println("\nCambio de usuario");
        Usuario nuevoUsuario = new Usuario("Carlos Rodr�guez", "11223344C");
        nuevoUsuario.setCelular(celular);
        System.out.println(celular);
    }
    
}
