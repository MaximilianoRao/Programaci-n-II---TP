
package sistemapagos;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class TarjetaCredito implements Pagable {

    @Override
    public void pagar() {
        System.out.println("Pagado con Tarjeta de credito");
    }

}
