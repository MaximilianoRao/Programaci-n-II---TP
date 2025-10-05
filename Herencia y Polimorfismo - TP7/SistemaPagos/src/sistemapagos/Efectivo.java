
package sistemapagos;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Efectivo implements Pagable {

    @Override
    public void pagar() {
        System.out.println("Pagado con efectivo");
    }

}
