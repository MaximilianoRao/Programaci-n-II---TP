
package poo.tp3;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private int calificacion;
    
    // Constantes para validación
    private static final int calificacionMinima = 0;
    private static final int calificacionMaxima = 10;

    public Estudiante(String nombre, String apellido, String curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacionMinima;
    }
    
    
     /*
    Metodo para imprimir en pantalla la información del objeto.
    */
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
         if (calificacion >= calificacionMinima && calificacion <= calificacionMaxima) {
            this.calificacion = calificacion;
        }else {
            System.out.println("Error: La calificación debe estar entre " + calificacionMinima + " y " + calificacionMaxima);  
        }
    }
    
    /*
        Metodo para subir la calificación.
    */
    
    public void subirCalificacion(int puntos){
         if (puntos <= 0) {
            System.out.println("Error: Los puntos a subir deben ser positivos.");
            return;
        }
        
         
        int nuevaCalificacion = calificacion + puntos;
        
        if (nuevaCalificacion > calificacionMaxima) {
            calificacion = calificacionMaxima;
            System.out.println("Calificación ajustada al máximo permitido: " + calificacionMaxima);
        } else {
            calificacion = nuevaCalificacion;
        }
        
        System.out.println("Calificación aumentada");
        System.out.println("Calificación actual " + getCalificacion());
    }
    
    
     /*
        Metodo para bajar la calificación.
    */
    
    public void bajarCalificacion(int puntos){
         if (puntos <= 0) {
            System.out.println("Error: Los puntos a subir deben ser positivos.");
            return;
        }
        
         
        int nuevaCalificacion = calificacion - puntos;
        
        if (nuevaCalificacion < calificacionMinima) {
            calificacion = calificacionMinima;
            System.out.println("Calificación ajustada al mínimo permitido: " + calificacionMinima);
        } else {
            calificacion = nuevaCalificacion;
        }
        
        System.out.println("Calificación disminuida");
        System.out.println("Calificación actual " + getCalificacion());
    }
    
    
}
