
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Ejercicio11 {
    private static final double descuentoEspecial = 0.10;;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicios 11");
        //Cálculo de descuento especial usando variable global.
        Scanner input = new Scanner(System.in);
        double precioProducto;
        
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        
        calcularDescuentoEspecial(precioProducto);
    }

     /**
     * Calcula el descuento especial usando la variable global DESCUENTO_ESPECIAL
     * 
     * @param precio Precio original del producto
     */
    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado, precioFinal;
        descuentoAplicado = precio * descuentoEspecial;
        precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}
