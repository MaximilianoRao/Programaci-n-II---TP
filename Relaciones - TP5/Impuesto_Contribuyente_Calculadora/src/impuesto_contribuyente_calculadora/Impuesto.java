
package impuesto_contribuyente_calculadora;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto) {
        this.monto = monto; 
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    public double getMonto() {
        return monto;
    }

    public void mostrarContribuyente() {
        System.out.println("El impuesto monto $" + monto+ " pertenece al contribuyente " + contribuyente.getNombre());
    }

    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto + ", contribuyente=" + contribuyente + '}';
    }
    
    
    
}
