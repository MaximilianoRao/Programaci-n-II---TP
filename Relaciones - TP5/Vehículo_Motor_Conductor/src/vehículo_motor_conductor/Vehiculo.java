
package vehículo_motor_conductor;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void mostrarMotor() {
        System.out.println("El vehiculo " + patente + " posee el motor " + motor.getNumeroSerie());
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if(conductor != null && conductor.getVehiculo() != this){
            conductor.setVehiculo(this);
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", motor=" + motor + ", conductor=" + conductor + '}';
    }
    
    
    
}
