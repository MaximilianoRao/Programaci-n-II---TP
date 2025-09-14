
package pasaporte_foto_titular;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; //Asociación bidireccional 1:1

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        // Evita un bucle infinito y asegura la consistencia de la relación
        if (pasaporte != null && pasaporte.getTitular() != this){
            pasaporte.setTitular(this);
        }
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
    
    
}
