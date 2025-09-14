
package impuesto_contribuyente_calculadora;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Calculadora {
    public void calcular(Impuesto impuesto){
        System.out.println("=== CÁLCULO DE IMPUESTO ===");
        impuesto.mostrarContribuyente();
        // Ejemplo de cálculos adicionales
        double descuento = impuesto.getMonto() * 0.05; // 5% descuento
        double recargo = impuesto.getMonto() * 0.10; // 10% recargo por mora
        double montoFinal = impuesto.getMonto() - descuento + recargo;
        
        System.out.println("Descuento (5%): -$" + String.format("%.2f", descuento));
        System.out.println("Recargo por mora (10%): +$" + String.format("%.2f", recargo));
        System.out.println("MONTO FINAL: $" + String.format("%.2f", montoFinal));
        System.out.println("Cálculo completado\n");
    }
}
