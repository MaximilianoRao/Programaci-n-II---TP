
package universidad_profesor_y_curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;
    
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    // Sincroniza ambos lados
    public void agregarCurso(Curso c) {
        if (c == null) return;
        
        if (!cursos.contains(c)) {
            cursos.add(c);
            // Sincronizar el lado del curso
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }
    
    //Sincroniza ambos lados
    public void eliminarCurso(Curso c) {
       if (c == null) return;
       cursos.remove(c);
       if (c.getProfesor() == this) {
            c.setProfesor(null);
       }
    }
    
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("  No dicta cursos actualmente.");
            return;
        }
        System.out.println("  Cursos que dicta:");
        for (Curso c : cursos) {
            System.out.println("    - " + c.getCodigo() + ": " + c.getNombre());
        }
    }
    
    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + 
                         " | Especialidad: " + especialidad + 
                         " | Cursos: " + cursos.size());
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    public List<Curso> getCursos() { 
        return Collections.unmodifiableList(cursos); 
    }
    
}
