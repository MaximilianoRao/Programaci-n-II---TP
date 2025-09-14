
package generadorqr_usuario_códigoqr;


/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class GeneradorQR {
    public void generar(String valor, Usuario usuario){
        
        System.out.println("Generando código QR...");
        System.out.println("Valor a codificar: " + valor);
        CodigoQR codigoQR = new CodigoQR(valor);
        codigoQR.setUsuario(usuario);
        System.out.println("Código QR generado exitosamente!");
        codigoQR.mostrarUsuario();
        
    }
}
