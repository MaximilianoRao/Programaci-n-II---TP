
package universidad_profesor_y_curso;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Universidad universidad = new Universidad("Universidad Nacional");
        
        // TAREA 1: Crear 3 profesores y 5 cursos
        System.out.println("TAREA 1: CREAR PROFESORES Y CURSOS");
        Profesor prof1 = new Profesor("P001", "Dr. Carlos Méndez", "Programación");
        Profesor prof2 = new Profesor("P002", "Dra. Ana Rodríguez", "Base de Datos");
        Profesor prof3 = new Profesor("P003", "Mg. Luis Torres", "Redes");
        
        Curso curso1 = new Curso("CS101", "Programación I");
        Curso curso2 = new Curso("CS102", "Programación II");
        Curso curso3 = new Curso("DB201", "Base de Datos");
        Curso curso4 = new Curso("NET301", "Redes de Computadoras");
        Curso curso5 = new Curso("CS201", "Estructuras de Datos");
        
        // TAREA 2: Agregar a la universidad
        System.out.println("\nTAREA 2: AGREGAR A LA UNIVERSIDAD");
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);
        
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);
        
        // TAREA 3: Asignar profesores a cursos
        System.out.println("\nTAREA 3: ASIGNAR PROFESORES A CURSOS");
        universidad.asignarProfesorACurso("CS101", "P001");
        universidad.asignarProfesorACurso("CS102", "P001");
        universidad.asignarProfesorACurso("CS201", "P001");
        universidad.asignarProfesorACurso("DB201", "P002");
        universidad.asignarProfesorACurso("NET301", "P003");
        
        // TAREA 4: Listar cursos y profesores
        System.out.println("\nTAREA 4: LISTAR CURSOS Y PROFESORES");
        universidad.listarCursos();
        universidad.listarProfesores();
        
        // TAREA 5: Cambiar profesor de un curso
        System.out.println("\nTAREA 5: CAMBIAR PROFESOR DE UN CURSO");
        System.out.println("Reasignando CS102 de Prof1 a Prof2...");
        universidad.asignarProfesorACurso("CS102", "P002");
        System.out.println("\nVerificando sincronización:");
        universidad.listarProfesores();
        
        // TAREA 6: Remover un curso
        System.out.println("\nTAREA 6: ELIMINAR CURSO");
        universidad.eliminarCurso(curso3);
        System.out.println("\nVerificando que se eliminó de la lista del profesor:");
        universidad.listarProfesores();
        
        // TAREA 7: Remover un profesor
        System.out.println("\nTAREA 7: ELIMINAR PROFESOR");
        universidad.eliminarProfesor(prof3);
        System.out.println("\nVerificando que el curso quedó sin profesor:");
        universidad.listarCursos();
        
        // TAREA 8: Reporte de cursos por profesor
        System.out.println("\nTAREA 8: REPORTE CURSOS POR PROFESOR");
        universidad.mostrarReporteCursosPorProfesor();
        
       
    }

}
