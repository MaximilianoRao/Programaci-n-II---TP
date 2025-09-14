
package cuentabancaria_claveseguridad_titular;

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
        // COMPOSICI�N: Crear cuenta bancaria (ClaveSeguridad se crea internamente)
        CuentaBancaria cuenta = new CuentaBancaria("0001234567890123456789", 50000.00, "1234", "2024-03-15");
        
        // Crear titular
        Titular titular = new Titular("Alejandra Moreno Vega", "34567890H");
        
        // ASOCIACI�N BIDIRECCIONAL: Establecer despu�s con setter
        cuenta.setTitular(titular);
        
        // Mostrar informaci�n
        System.out.println("Cuenta");
        System.out.println(cuenta);
        
        System.out.println("\nTitular");
        System.out.println(titular);
        System.out.println("Cuenta del titular: " + titular.getCuentaBancaria().getCbu());
        
        System.out.println("\nClave");
        cuenta.mostrarClaveSeguridad();
        
              
        // Demostrar bidireccionalidad
        Titular nuevoTitular = new Titular("Fernando Castillo L�pez", "45678901I");
        cuenta.setTitular(nuevoTitular);
        System.out.println("\nDespu�s del cambio (desde cuenta):");
        System.out.println("Titular original: " + titular.getNombre() + 
                          " - Tiene cuenta: " + (titular.getCuentaBancaria() != null));
        System.out.println("Nuevo titular: " + nuevoTitular.getNombre() + 
                          " - Tiene cuenta: " + (nuevoTitular.getCuentaBancaria() != null));
        System.out.println("CBU de la cuenta del nuevo titular: " + nuevoTitular.getCuentaBancaria().getCbu());
        
    }
    
}
