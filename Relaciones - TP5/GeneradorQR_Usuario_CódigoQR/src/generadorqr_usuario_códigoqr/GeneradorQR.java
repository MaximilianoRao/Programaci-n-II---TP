
package generadorqr_usuario_c�digoqr;


/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class GeneradorQR {
    public void generar(String valor, Usuario usuario){
        
        System.out.println("Generando c�digo QR...");
        System.out.println("Valor a codificar: " + valor);
        CodigoQR codigoQR = new CodigoQR(valor);
        codigoQR.setUsuario(usuario);
        System.out.println("C�digo QR generado exitosamente!");
        codigoQR.mostrarUsuario();
        
    }
}
