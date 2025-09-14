
package computadora_placamadre_propietario;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private Propietario propietario; //Asociacion bidireccional 1:1
    private PlacaMadre placaMadre;  //Composición 1:1

    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        placaMadre = new PlacaMadre(modelo, chipset); //Creación interna
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public Propietario getPropietario() {
        return propietario;
    }
    
    public void mostrarPlaca(){
        System.out.println("Computadora: "+ numeroSerie + " tiene la placa madre: " + placaMadre.getModelo() );
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if(propietario != null && propietario.getComputadora() != this){
            propietario.setComputadora(this);
        }
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", propietario=" + propietario + ", placaMadre=" + placaMadre + '}';
    }
    
    
    
}
