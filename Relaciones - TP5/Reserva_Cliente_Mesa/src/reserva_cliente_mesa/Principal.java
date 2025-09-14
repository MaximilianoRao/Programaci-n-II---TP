
package reserva_cliente_mesa;

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
        // Crear cliente independiente
        Cliente cliente = new Cliente("Luis Hernández", "555-1234");
        
        // Crear mesa independiente (necesaria para el constructor - agregación)
        Mesa mesa = new Mesa(5, 4);
        
        // AGREGACIÓN: Crear reserva con mesa obligatoria en constructor
        Reserva reserva = new Reserva("2024-03-15", "20:30", mesa);
        
        // ASOCIACIÓN UNIDIRECCIONAL: Establecer cliente después con setter
        reserva.setCliente(cliente);
        
        // Mostrar información
        System.out.println("Reserva");
        System.out.println(reserva);
        
        System.out.println("\nCliente");
        System.out.println(cliente);
        
        System.out.println("\nMesa");
        System.out.println(mesa);
        
        System.out.println("\nAGREGACIÓN (Mesa):");
        System.out.println("Mesa: " + reserva.getMesa().getNumero() + " (capacidad: " + reserva.getMesa().getCapacidad() + ")");
        
        System.out.println("\nASOCIACIÓN UNIDIRECCIONAL (Cliente):");
        reserva.mostrarCliente();
    }

}
