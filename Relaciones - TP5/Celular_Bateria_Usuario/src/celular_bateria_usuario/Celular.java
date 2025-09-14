
package celular_bateria_usuario;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Usuario usuario; //Asociacion bidireccional 1:1
    private Bateria bateria; //Agregacion 1:1

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public String getImei() {
        return imei;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        // Evita un bucle infinito y asegura la consistencia de la relación
        if (usuario != null && usuario.getCelular() != this){
            usuario.setCelular(this);
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
   
    
    public void mostrarBateria(){
        System.out.println("Celular: "+ imei + " tiene la batería: " + bateria.getModelo() );
    }

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", usuario=" + usuario + ", bateria=" + bateria + '}';
    }
    
    
    
}
