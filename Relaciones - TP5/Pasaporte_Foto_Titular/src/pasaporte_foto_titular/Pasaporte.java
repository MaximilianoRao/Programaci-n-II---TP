
package pasaporte_foto_titular;



/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto; //Composición 1:1
    private Titular titular; //Asociacion bidireccional 1:1

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato); //Creación interna
    }

    public void mostrarImagen() {
        System.out.println("Pasaporte: "+ numero + " tiene foto: " + foto.getImagen() );
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this){
            titular.setPasaporte(this);    
        }
    }

    public String getNumero() {
        return numero;
    }


    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + ", titular=" + titular + '}';
    }

    
    
  
}
