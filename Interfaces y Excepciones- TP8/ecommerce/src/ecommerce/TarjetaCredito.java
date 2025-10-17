
package ecommerce;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class TarjetaCredito implements PagoConDescuento{

   @Override
    public double aplicarDescuento(double monto) {
        System.out.println("Aplicando 10% de descuento por pago con tarjeta de crédito...");
        return monto * 0.9;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito por $" + monto);
    }
  
}
