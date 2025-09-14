
package reserva_cliente_mesa;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Mesa mesa;
    private Cliente cliente;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public String getFecha() {
        return fecha;
    }


    public String getHora() {
        return hora;
    }


    public void mostrarCliente() {
        if (cliente != null) {
            System.out.println("Reserva: " + fecha + "\nCliente: " + cliente.getNombre());
        } else{
            System.out.println("La reserva no posee cliente");
        }
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }
    

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", mesa=" + mesa + ", cliente=" + cliente + '}';
    }
    
    
}
