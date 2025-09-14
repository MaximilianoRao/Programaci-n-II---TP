
package cuentabancaria_claveseguridad_titular;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        if(cuentaBancaria != null && cuentaBancaria.getTitular() != this){
            cuentaBancaria.setTitular(this);
        }
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
    
}
