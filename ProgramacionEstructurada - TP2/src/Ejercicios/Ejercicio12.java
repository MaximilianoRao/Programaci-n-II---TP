
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicios 12");
        //Modificación de un array de precios y visualización de resultados.
        double[] precios = {199.99, 299.99, 149.75 , 399, 89.99};
        
        System.out.println("Precios originales:");
        mostrarPrecios(precios);
        
        precios[2] = 129.99;
        
        System.out.println("Precios modificados:");
        mostrarPrecios(precios);
        
    }
    
     public static void mostrarPrecios(double[] precios) {
         for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
         
    }
}
