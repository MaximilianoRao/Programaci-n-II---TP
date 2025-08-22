
package Ejercicios;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicios 13");
        //Modificación de un array de precios y visualización de resultados.
        double[] precios = {199.99, 299.99, 149.75 , 399, 89.99};
        
        System.out.println("Precios originales:");
        mostrarPreciosRecur(precios, 0);
        
        precios[2] = 129.99;
        
        System.out.println("Precios modificados:");
        mostrarPreciosRecur(precios, 0);
        
    }
    
     public static void mostrarPreciosRecur(double[] precios, int indice) {
        //Caso base 
        if (indice >= precios.length) {
            return;
        }
        
        System.out.println("Precio: $" + precios[indice]);
        mostrarPreciosRecur(precios, indice + 1);
        
         
    
    }

}
