
package documento_firmadigital_usuario;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario;

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
    
    public void mostrarUsuario(){
        System.out.println("La firma digital " + codigoHash + " pertenece al usuario " + usuario.getNombre());
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital{" + "codigoHash=" + codigoHash + ", fecha=" + fecha + ", usuario=" + usuario + '}';
    }
    
    
    
      
}
