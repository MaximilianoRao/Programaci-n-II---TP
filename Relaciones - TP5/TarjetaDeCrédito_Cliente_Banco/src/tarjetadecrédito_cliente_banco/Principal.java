
package tarjetadecrédito_cliente_banco;

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
        // Crear banco (necesario para el constructor - agregación)
        Banco banco = new Banco("Banco Santander", "30-50000000-9");
        
        // AGREGACIÓN: Crear tarjeta con banco obligatorio en constructor
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4532-1234-5678-9012", "12/2028", banco);
        
         // Crear cliente
        Cliente cliente = new Cliente("Ana López", "23456789");
        
        // ASOCIACIÓN BIDIRECCIONAL: Establecer después con setter
        tarjeta.setCliente(cliente);
        // Mostrar información
        System.out.println("Tarjeta");
        System.out.println(tarjeta);
        
        System.out.println("\nCliente");
        System.out.println(cliente);
        System.out.println("Tarjeta del cliente: " + cliente.getTarjeta().getNumero());
        
        System.out.println("\nBanco");
        System.out.println(banco);
        
        //Cambio de titular de tarjeta
        Cliente nuevoCliente = new Cliente("Carlos Rodríguez", "34567890D");
        // Cambiar cliente desde la tarjeta
        tarjeta.setCliente(nuevoCliente);
        System.out.println("\nTarjeta asignada a nuevo cliente");
        System.out.println(tarjeta);
        
        //Tarjeta del mismo banco
        TarjetaDeCredito otraTarjeta = new TarjetaDeCredito("5555-4444-3333-2222", "06/2027", banco);
        otraTarjeta.setCliente(cliente);
        System.out.println("\nSegunda tarjeta del mismo banco");
        System.out.println(otraTarjeta);
        
        
        //Cambio de banco
        Banco nuevoBanco = new Banco("Banco BBVA", "30-50000001-7");
        System.out.println("\nAntes del cambio");
        otraTarjeta.mostrarBanco();
        System.out.println("Luego del cambio");
        otraTarjeta.setBanco(nuevoBanco);
        otraTarjeta.mostrarBanco();
        
    }

}
