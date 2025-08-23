
package poo.tp3;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(String idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    public String getIdGallina() {
        return idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0)
            this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    private void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    public void mostrarEstado(){
        System.out.println("Gallina: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos Puestos: " + huevosPuestos);
    }
    
    public void ponerHuevo(){
        huevosPuestos++;
        System.out.println("La gallina " + idGallina + " puso un huevo! Total: " + huevosPuestos);
    }
    
    public void envejecer(){
        edad++;
        System.out.println("La gallina " + idGallina + " envejeció. Ahora tiene " + edad + " meses.");
    }
    
}
