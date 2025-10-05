
package animales;

import java.util.ArrayList;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList(); 
        
        //Creamos los animales
        Perro p1 = new Perro();
        Perro p2 = new Perro();
        Gato g1 = new Gato();
        Gato g2 = new Gato();
        Vaca v1 = new Vaca();
        
        //Agregamos los animales al ArrayList
        animales.add(v1);
        animales.add(g1);
        animales.add(g2);
        animales.add(p1);
        animales.add(p2);
        
        //Recorremos el array y llamamos al metodo hacerSonido.
        for (Animal animal : animales) {
            animal.hacerSonido();
            
        }
                
    }

}
