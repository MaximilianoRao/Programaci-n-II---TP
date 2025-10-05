
package figuras_geometricas;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Circulo extends Figura  {
    private double radio;
    
    //Llama al constructor de la superclase.
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    
    //Sobreescribe el metodo de calculaArea.
    @Override
    public void calcularArea(){
        System.out.println("El area del circulo " + nombre + " es: " + Math.PI * radio);
    }

}
