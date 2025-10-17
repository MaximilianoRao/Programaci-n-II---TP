
package ecommerce;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public interface PagoConDescuento extends Pago {
    public abstract double aplicarDescuento(double monto);
}
