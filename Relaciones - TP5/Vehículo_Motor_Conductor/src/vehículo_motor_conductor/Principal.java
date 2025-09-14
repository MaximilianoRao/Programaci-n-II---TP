
package veh�culo_motor_conductor;

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
        // Crear motor independiente (necesario para el constructor - agregaci�n)
        Motor motor = new Motor("V6", "MT123456789");
        
        // AGREGACI�N: Crear veh�culo con motor obligatorio en constructor
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Etios", motor);
        
        // Crear conductor
        Conductor conductor = new Conductor("Miguel Torres", "B123456789");
        
        // ASOCIACI�N BIDIRECCIONAL: Establecer despu�s con setter
        vehiculo.setConductor(conductor);
        
        // Mostrar informaci�n
        System.out.println("Vehiculo");
        System.out.println(vehiculo);
        System.out.println("\nConductor");
        System.out.println(conductor);
        System.out.println("Veh�culo del conductor: " + conductor.getVehiculo().getPatente() + 
                          " (" + conductor.getVehiculo().getModelo() + ")");
        
        System.out.println("\nMotor");
        System.out.println(motor);
        
        System.out.println("\nAGREGACI�N (Motor):");
        vehiculo.mostrarMotor();
         
        System.out.println("\nASOCIACI�N BIDIRECCIONAL (Conductor):");
        System.out.println("Conductor: " + vehiculo.getConductor().getNombre());
        
        System.out.println("\nReutilizaci�n MOTOR");
        Vehiculo otroVehiculo = new Vehiculo("XYZ789", "Honda Accord", motor);
        
        System.out.println("Segundo veh�culo creado con el mismo motor:");
        System.out.println("Veh�culo 1: " + vehiculo.getPatente());
        vehiculo.mostrarMotor();
        
        System.out.println("Veh�culo 2: " + otroVehiculo.getPatente());
        otroVehiculo.mostrarMotor();
        
        
        // Demostrar bidireccionalidad
        System.out.println("\nCambio conductor");
        Conductor nuevoConductor = new Conductor("Elena V�squez", "C987654321");
        // Cambiar conductor desde el veh�culo
        vehiculo.setConductor(nuevoConductor);
        System.out.println(vehiculo);
    }

}
