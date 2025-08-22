
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Ejercicio8 {
    private static double precioBase;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicios 8");
        /*
        Crea un método calcularPrecioFinal(double impuesto, double descuento) 
        que calcule el precio final de un producto en un e-commerce. La fórmula es:
        PrecioFinal = PrecioBase + (PrecioBase×Impuesto) ? (PrecioBase×Descuento)
        Desde main(), solicita el precio base del producto, el porcentaje de impuesto 
        y el porcentaje de descuento, llama al método y muestra el precio final.
        */
        
        Scanner input = new Scanner(System.in);
        double impuesto, descuento;
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        impuesto = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        descuento = Double.parseDouble(input.nextLine());
        System.out.println("El precio final del producto es: " + calcularPrecioFinal(impuesto, descuento));
        
    }
    /**
     * Calcula el precio final de un producto aplicando impuesto y descuento
     * Fórmula: PrecioFinal = PrecioBase + (PrecioBase × Impuesto) - (PrecioBase × Descuento)
     * 
     * @param impuesto Porcentaje de impuesto (ejemplo: 10 para 10%)
     * @param descuento Porcentaje de descuento (ejemplo: 5 para 5%)
     * @return El precio final calculado
     */
    public static double calcularPrecioFinal(double impuesto, double descuento){
   
        double montoImpuesto, montoDescuento;
     
        montoImpuesto = precioBase * (impuesto / 100.0);
        montoDescuento = precioBase * (descuento / 100.0);
        
        double precioFinal = precioBase + montoImpuesto - montoDescuento;
        
        return precioFinal;
    }
}
