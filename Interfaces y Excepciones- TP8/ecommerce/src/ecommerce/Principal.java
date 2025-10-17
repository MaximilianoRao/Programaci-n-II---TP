
package ecommerce;

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
        // Crear productos
        Producto laptop = new Producto("Laptop HP", 800.00);
        Producto mouse = new Producto("Mouse Logitech", 25.00);
        Producto teclado = new Producto("Teclado Mecánico", 75.00);
        
        // Crear cliente
        Cliente cliente = new Cliente("Juan Pérez");
        
        // Crear pedido y agregar productos
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(laptop);
        pedido.agregarProducto(mouse);
        pedido.agregarProducto(teclado);
        
        // Calcular total
        double total = pedido.calcularTotal();
        System.out.println("\nTotal del pedido: $" + total);
        
        
        // Cambiar estado (notifica al cliente)
        System.out.println("\n--- Procesando pedido ---");
        pedido.cambiarEstado("En Preparación");
        
        // Pago con tarjeta con descuento
        PagoConDescuento pago = new TarjetaCredito();
        double totalConDescuento = pago.aplicarDescuento(total);
        pago.procesarPago(totalConDescuento);
    }

}
