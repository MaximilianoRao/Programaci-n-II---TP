
package documento_firmadigital_usuario;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;

    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
        
    }
    
    public void mostrarFirmaDigital(){
        System.out.println("El documento " + titulo + " tiene la firma " + firmaDigital.getCodigoHash());
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firmaDigital=" + firmaDigital + '}';
    }
    
    
    
}
