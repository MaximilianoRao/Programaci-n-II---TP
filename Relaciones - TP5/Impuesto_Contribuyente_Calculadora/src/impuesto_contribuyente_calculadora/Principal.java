
package impuesto_contribuyente_calculadora;

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
       // Crear contribuyentes
        Contribuyente contribuyente1 = new Contribuyente("Juan Pérez", "20-12345678-9");
        Contribuyente contribuyente2 = new Contribuyente("María González", "27-87654321-3");
        
        // Crear impuestos (asociación unidireccional con contribuyente)
        Impuesto impuesto1 = new Impuesto(15000.50);
        impuesto1.setContribuyente(contribuyente1);
        Impuesto impuesto2 = new Impuesto(8750.25);
        impuesto2.setContribuyente(contribuyente2);
        
        // Crear calculadora
        Calculadora calculadora = new Calculadora();
        
        
        // Demostrar dependencia de uso
        // La calculadora usa los impuestos como parámetros pero no los almacena
        calculadora.calcular(impuesto1);  
        calculadora.calcular(impuesto2);
        
        System.out.println("=== Información de los impuestos ===");
        System.out.println(impuesto1);
        System.out.println(impuesto2);
}
}
