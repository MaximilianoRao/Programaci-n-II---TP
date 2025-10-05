
package sistemapagos;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Transferencia implements Pagable {

    @Override
    public void pagar() {
        System.out.println("Pagado por transferencia");
    }

}
