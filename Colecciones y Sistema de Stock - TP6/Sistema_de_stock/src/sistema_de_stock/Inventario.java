
package sistema_de_stock;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p) {
        productos.add(p);
        System.out.println("Producto agregado: " + p.getNombre());
    }
    
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        System.out.println("\nLISTADO DE PRODUCTOS");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
        
    }
    
    public Producto buscarProductoPorId(String id){
        Producto productoEncontrado = null;
        Iterator<Producto> it = this.productos.iterator();
        while(it.hasNext() && productoEncontrado == null){
            Producto p = it.next();
            if (p.getId().equalsIgnoreCase(id)){
                productoEncontrado = p;
            }
        }
        return productoEncontrado;
    }
    
    public void eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            System.out.println("Producto eliminado: " + p.getNombre());
        } else {
            System.out.println("Producto con ID " + id + " no encontrado.");
        }
    }
    
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado para " + p.getNombre() + ": " + nuevaCantidad + " unidades");
        } else {
            System.out.println("Producto con ID " + id + " no encontrado.");
        }
    }
    
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("\nPRODUCTOS DE CATEGOR�A: " + categoria);
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos en esta categor�a.");
        }
    }
    
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }
    
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        Producto mayor = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayor.getCantidad()) {
                mayor = p;
            }
        }
        return mayor;
    }
    
    
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("\n=== PRODUCTOS CON PRECIO ENTRE $" + min + " Y $" + max + " ===");
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos en ese rango de precios.");
        }
    }

    
    public void mostrarCategoriasDisponibles() {
        System.out.println("\n=== CATEGOR�AS DISPONIBLES ===");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println(cat + ": " + cat.getDescripcion());
        }
    }
            
}
