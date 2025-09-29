
package universidad_profesor_y_curso;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;
    
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) {
            profesores.add(p);
            System.out.println("Profesor agregado: " + p.getNombre());
        }
    }
    
    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
            System.out.println("Curso agregado: " + c.getNombre());
        }
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        
        if (curso == null) {
            System.out.println("Error: Curso " + codigoCurso + " no encontrado.");
            return;
        }
        if (profesor == null) {
            System.out.println("Error: Profesor " + idProfesor + " no encontrado.");
            return;
        }
        
        curso.setProfesor(profesor);
        System.out.println("Asignado: " + profesor.getNombre() + " -> " + curso.getNombre());
    }
    
    public void listarProfesores() {
        System.out.println("\nPROFESORES DE " + nombre);
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }
        for (Profesor p : profesores) {
            p.mostrarInfo();
            System.out.println("---");
        }
    }
    
    public void listarCursos() {
        System.out.println("\nCURSOS DE " + nombre);
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados.");
            return;
        }
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }
    
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
    
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }
    
    
    public void eliminarCurso(Curso curso) {
         if (curso != null && cursos.contains(curso)) {
            curso.setProfesor(null);
            cursos.remove(curso);
            System.out.println("Curso eliminado: " + curso.getNombre());
        }
        
    }
    
     public void eliminarProfesor(Profesor profesor) {
        
        if (profesor != null && profesores.contains(profesor)) {
           
            for (Curso curso : new ArrayList<>(profesor.getCursos())) {
                curso.setProfesor(null);
            }
            profesores.remove(profesor);
            System.out.println("Profesor eliminado: " + profesor.getNombre());
        }
        
    }
    
    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\nREPORTE: CURSOS POR PROFESOR");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + " (" + p.getEspecialidad() + "): " + 
                             p.getCursos().size() + " curso(s)");
        }
    }
    
    public String getNombre() { 
        return nombre; 
    }

}
