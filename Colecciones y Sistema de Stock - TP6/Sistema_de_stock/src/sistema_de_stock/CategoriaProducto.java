
package sistema_de_stock;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public enum CategoriaProducto {
ALIMENTOS("Productos comestibles"),
ELECTRONICA("Dispositivos electr�nicos"),
ROPA("Prendas de vestir"), 
HOGAR("Art�culos para el hogar"); 
private final String descripcion; 

CategoriaProducto(String descripcion) { 
    this.descripcion = descripcion;
}
public String getDescripcion() { 
    return descripcion;
}

}