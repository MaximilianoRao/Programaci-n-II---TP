
package animales;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Perro extends Animal{
    
    //Sobreescribe el metodo de la superclase.
    @Override
    public void hacerSonido(){
        System.out.println("Guau");
    }
}
