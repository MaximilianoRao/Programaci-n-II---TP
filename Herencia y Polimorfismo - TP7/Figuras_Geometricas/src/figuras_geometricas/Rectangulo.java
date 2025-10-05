
package figuras_geometricas;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String nombre) {
        //Llama al constructor de la superclase.
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    //Sobreescribe el metodo de calculaArea.
    @Override
    public void calcularArea(){
        System.out.println("El area del rectángulo " + nombre + " es: " + base * altura);
    }
    
}
