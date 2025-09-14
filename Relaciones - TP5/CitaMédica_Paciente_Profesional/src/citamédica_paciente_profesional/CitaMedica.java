
package citamédica_paciente_profesional;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Profesional profesional;
    private Paciente paciente;

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
    
    
    public void mostrarPaciente(){
        System.out.println("La cita medica " + fecha+ " " + hora + " pertenece al paciente " + paciente.getNombre());
    }
    
    public void mostrarProfecional(){
        System.out.println("La cita medica " + fecha+ " " + hora + " pertenece al profesional " + profesional.getNombre());
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + ", profesional=" + profesional + ", paciente=" + paciente + '}';
    }
    
    
        
}
