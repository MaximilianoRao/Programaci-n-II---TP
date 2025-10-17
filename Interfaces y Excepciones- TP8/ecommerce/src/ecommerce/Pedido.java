
package ecommerce;

import java.util.ArrayList;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Pedido implements Pagable {
    private ArrayList<Producto> listaProductos;
    private String estado;
    private Notificable cliente;

    public Pedido(Notificable cliente) {
        this.listaProductos =new ArrayList<>();
        this.estado = "Creado";
        this.cliente = cliente;
    }
    
    public void agregarProducto(Producto p){
        listaProductos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : listaProductos) {
            total += producto.calcularTotal();
        }
        return total;
    }
    
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarCliente("El estado de tu pedido cambió a: " + nuevoEstado);
    }
    
    private void notificarCliente(String mensaje) {
        if (cliente != null) {
            cliente.notificar(mensaje);
        }
    }


  
    
    
}
