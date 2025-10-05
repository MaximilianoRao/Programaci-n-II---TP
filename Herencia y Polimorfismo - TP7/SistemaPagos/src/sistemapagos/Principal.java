
package sistemapagos;

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
        TarjetaCredito tc1 = new TarjetaCredito();
        Transferencia t1 = new Transferencia();
        Efectivo e1 = new Efectivo();
        
        ProcesarPago(tc1);
        ProcesarPago(t1);
        ProcesarPago(e1);
        
    }
    
    //Método estatico para que pueda llamarce desde el main. General para todos los medios de pago.
    public static void ProcesarPago(Pagable medio){
        medio.pagar();
    }

}
