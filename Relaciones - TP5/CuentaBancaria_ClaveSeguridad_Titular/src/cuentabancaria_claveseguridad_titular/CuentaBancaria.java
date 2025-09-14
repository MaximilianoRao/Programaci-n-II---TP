
package cuentabancaria_claveseguridad_titular;


/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private Titular titular;
    private ClaveSeguridad claveSeguridad;

    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion); 
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void mostrarClaveSeguridad() {
       System.out.println("La cuenta bancaria " + cbu + " tiene el codigo " + claveSeguridad.getCodigo());
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular != null && titular.getCuentaBancaria() != this){
            titular.setCuentaBancaria(this);
            
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", titular=" + titular + ", claveSeguridad=" + claveSeguridad + '}';
    }
    
    
    
    
    
    
    
    
    
}
