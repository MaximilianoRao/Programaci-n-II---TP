
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
        Cliente cliente = new Cliente("Luis Hern�ndez", "555-1234");
        
        // Crear mesa independiente (necesaria para el constructor - agregaci�n)
        Mesa mesa = new Mesa(5, 4);
        
        // AGREGACI�N: Crear reserva con mesa obligatoria en constructor
        Reserva reserva = new Reserva("2024-03-15", "20:30", mesa);
        
        // ASOCIACI�N UNIDIRECCIONAL: Establecer cliente despu�s con setter
        reserva.setCliente(cliente);
        
        // Mostrar informaci�n
        System.out.println("Reserva");
        System.out.println(reserva);
        
        System.out.println("\nCliente");
        System.out.println(cliente);
        
        System.out.println("\nMesa");
        System.out.println(mesa);
        
        System.out.println("\nAGREGACI�N (Mesa):");
        System.out.println("Mesa: " + reserva.getMesa().getNumero() + " (capacidad: " + reserva.getMesa().getCapacidad() + ")");
        
        System.out.println("\nASOCIACI�N UNIDIRECCIONAL (Cliente):");
        reserva.mostrarCliente();
    }

}
