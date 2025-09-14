
package celular_bateria_usuario;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; //Asociación bidireccional 1:1

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        // Evita un bucle infinito y asegura la consistencia de la relación
        if (celular != null && celular.getUsuario() != this){
            celular.setUsuario(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Celular getCelular() {
        return celular;
    }


    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }    
    
}