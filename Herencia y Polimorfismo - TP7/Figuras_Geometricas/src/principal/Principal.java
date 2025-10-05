
package principal;

import figuras_geometricas.Circulo;
import figuras_geometricas.Figura;
import figuras_geometricas.Rectangulo;
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
        
        //Creamos Array de Figuras.
        ArrayList<Figura> figuras = new ArrayList<>();
        
        //Creamos 3 circulos y 3 rectangulos.
        Circulo c1 = new Circulo("Circulo 1", 3.2);
        Circulo c2 = new Circulo("Circulo 2", 8);
        Circulo c3 = new Circulo("Circulo 3", 4.8);
        Rectangulo r1 = new Rectangulo(5, 3, "Rectangulo 1");
        Rectangulo r2 = new Rectangulo(2.0, 1, "Rectangulo 2");
        Rectangulo r3 = new Rectangulo(9.4, 4.6, "Rectangulo 3");
        //Agregamos las figuras creadas al ArrayList.
        figuras.add(c1);
        figuras.add(c2);
        figuras.add(c3);
        figuras.add(r1);
        figuras.add(r2);
        figuras.add(r3);
        
        //Recorremos el ArrayList y llamamos al metodo calcularArea de cada figura.
        for (Figura figura : figuras) {
            figura.calcularArea();
        }
    }

}
