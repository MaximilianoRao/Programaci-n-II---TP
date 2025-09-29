
package sistema_de_stock;

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
        Inventario inventario = new Inventario();
        
        // TAREA 1: Crear al menos cinco productos
        System.out.println("=== TAREA 1: AGREGAR PRODUCTOS ===");
        Producto p1 = new Producto("P001", "Leche Entera", 1500, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Laptop Dell", 45000, 15, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Camisa Formal", 2500, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Lámpara LED", 1800, 25, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Pan Integral", 800, 100, CategoriaProducto.ALIMENTOS);
        
        //Se agregan al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        // TAREA 2: Listar todos los productos
        System.out.println("\n=== TAREA 2: LISTAR TODOS LOS PRODUCTOS ===");
        inventario.listarProductos();
        
        // TAREA 3: Buscar un producto por ID
        System.out.println("\n=== TAREA 3: BUSCAR PRODUCTO POR ID ===");
        Producto encontrado = inventario.buscarProductoPorId("P002");
        if (encontrado != null) {
            System.out.println("Producto encontrado:");
            encontrado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }
        
        
         // TAREA 4: Filtrar productos por categoría
        System.out.println("\n=== TAREA 4: FILTRAR POR CATEGORÍA ===");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        
        
        // TAREA 5: Eliminar un producto
        System.out.println("\n=== TAREA 5: ELIMINAR PRODUCTO ===");
        inventario.eliminarProducto("P005");
        inventario.listarProductos();
        
        // TAREA 6: Actualizar stock
        System.out.println("\n=== TAREA 6: ACTUALIZAR STOCK ===");
        inventario.actualizarStock("P001", 75);
        
        // TAREA 7: Mostrar total de stock
        System.out.println("\n=== TAREA 7: TOTAL DE STOCK ===");
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("Total de unidades en stock: " + totalStock);
        
        
        
        // TAREA 8: Producto con mayor stock
        System.out.println("\n=== TAREA 8: PRODUCTO CON MAYOR STOCK ===");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("Producto con mayor stock:");
            mayorStock.mostrarInfo();
        }
        
        
        // TAREA 9: Filtrar productos por precio
        System.out.println("\n=== TAREA 9: FILTRAR POR PRECIO ===");
        inventario.filtrarProductosPorPrecio(1000, 3000);
        
        // TAREA 10: Mostrar categorías disponibles
        System.out.println("\n=== TAREA 10: CATEGORÍAS DISPONIBLES ===");
        inventario.mostrarCategoriasDisponibles();
        
    }

}
