
package tarjetadecrédito_cliente_banco;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }
    
    public void mostrarBanco(){
        System.out.println("La tarjeta " + numero + " pertenece al banco " + banco.getNombre());
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if(cliente != null && cliente.getTarjeta() != this){
            cliente.setTarjeta(this);
        }
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", banco=" + banco + ", cliente=" + cliente + '}';
    }
    
    
    
}
