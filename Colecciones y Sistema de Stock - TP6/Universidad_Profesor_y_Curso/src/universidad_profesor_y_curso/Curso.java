
package universidad_profesor_y_curso;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */

public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }
    
    // Sincroniza ambos lados de la relaci�n bidireccional
    public void setProfesor(Profesor nuevoProfesor) {
        // Si ya ten�a un profesor previo, quitarse de su lista
        // Si ya ten�a profesor y es distinto, remover este curso de la lista del profesor previo
        if (this.profesor != null && this.profesor != nuevoProfesor) {
            Profesor antiguo = this.profesor;
            this.profesor = null; // evitar loop
            antiguo.eliminarCurso(this); // eliminar sin provocar recursi�n porque profesor.eliminarCurso llamar� setProfesor(null) solo si corresponde
        }
        // Asignar nuevo profesor (puede ser null)
        this.profesor = nuevoProfesor;
        // Asegurar que el profesor nuevo tiene este curso en su lista
        if (nuevoProfesor!= null && nuevoProfesor.getCursos().contains(this)) {
            // usar el m�todo del profesor para mantener invariante
            nuevoProfesor.agregarCurso(this);
        }
    }
    
    public void mostrarInfo() {
        String nombreProf = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.println("C�digo: " + codigo + " | Curso: " + nombre + 
                         " | Profesor: " + nombreProf);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    
}
