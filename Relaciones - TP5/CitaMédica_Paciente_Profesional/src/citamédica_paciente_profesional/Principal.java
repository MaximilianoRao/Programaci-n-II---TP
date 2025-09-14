
package citamédica_paciente_profesional;

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
        // Crear paciente y profesional independientes
        Paciente paciente = new Paciente("María Elena Vega", "OSDE");
        Profesional profesional = new Profesional("Dr. Roberto Martínez", "Cardiología");
        
        // Crear cita médica
        CitaMedica cita = new CitaMedica("2024-04-20", "10:30");
        
        // ASOCIACIONES UNIDIRECCIONALES: Establecer después con setters
        cita.setPaciente(paciente);
        cita.setProfesional(profesional);
        
        // Mostrar información
        System.out.println("Cita");
        System.out.println(cita);
        
        System.out.println("\nPaciente");
        System.out.println(paciente);
        
        System.out.println("\nProfesional");
        System.out.println(profesional);
        
        System.out.println("\nAsociaciones");
        cita.mostrarPaciente();
        cita.mostrarProfecional();
        
        System.out.println("\n");
        // Crear otra citas con el mismo paciente
        CitaMedica otraCita = new CitaMedica("2024-04-27", "15:00");
        otraCita.setPaciente(paciente);
        Profesional otroProfesional = new Profesional("Dra. Carmen Silva", "Dermatología");
        otraCita.setProfesional(otroProfesional);
        System.out.println(otraCita);
        
        
    }

}
