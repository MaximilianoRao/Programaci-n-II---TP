
package ecommerce;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class PayPal implements Pago{
    
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal por $" + monto);
    }
}
