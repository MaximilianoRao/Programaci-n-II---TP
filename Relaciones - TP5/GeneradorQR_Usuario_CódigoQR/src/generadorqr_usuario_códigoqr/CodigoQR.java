
package generadorqr_usuario_códigoqr;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class CodigoQR {
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void mostrarUsuario() {
        System.out.println("El codigo QR" +" pertenece al usuario " + usuario.getNombre());
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "CodigoQR{" + "valor=" + valor + ", usuario=" + usuario + '}';
    }
    
    
}
