
package vehículo_motor_conductor;

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
        // Crear motor independiente (necesario para el constructor - agregación)
        Motor motor = new Motor("V6", "MT123456789");
        
        // AGREGACIÓN: Crear vehículo con motor obligatorio en constructor
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Etios", motor);
        
        // Crear conductor
        Conductor conductor = new Conductor("Miguel Torres", "B123456789");
        
        // ASOCIACIÓN BIDIRECCIONAL: Establecer después con setter
        vehiculo.setConductor(conductor);
        
        // Mostrar información
        System.out.println("Vehiculo");
        System.out.println(vehiculo);
        System.out.println("\nConductor");
        System.out.println(conductor);
        System.out.println("Vehículo del conductor: " + conductor.getVehiculo().getPatente() + 
                          " (" + conductor.getVehiculo().getModelo() + ")");
        
        System.out.println("\nMotor");
        System.out.println(motor);
        
        System.out.println("\nAGREGACIÓN (Motor):");
        vehiculo.mostrarMotor();
         
        System.out.println("\nASOCIACIÓN BIDIRECCIONAL (Conductor):");
        System.out.println("Conductor: " + vehiculo.getConductor().getNombre());
        
        System.out.println("\nReutilización MOTOR");
        Vehiculo otroVehiculo = new Vehiculo("XYZ789", "Honda Accord", motor);
        
        System.out.println("Segundo vehículo creado con el mismo motor:");
        System.out.println("Vehículo 1: " + vehiculo.getPatente());
        vehiculo.mostrarMotor();
        
        System.out.println("Vehículo 2: " + otroVehiculo.getPatente());
        otroVehiculo.mostrarMotor();
        
        
        // Demostrar bidireccionalidad
        System.out.println("\nCambio conductor");
        Conductor nuevoConductor = new Conductor("Elena Vásquez", "C987654321");
        // Cambiar conductor desde el vehículo
        vehiculo.setConductor(nuevoConductor);
        System.out.println(vehiculo);
    }

}
