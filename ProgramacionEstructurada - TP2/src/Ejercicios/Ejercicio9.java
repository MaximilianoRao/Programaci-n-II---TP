
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicios 9");
        //Composición de funciones para calcular costo de envío y total de compra.
        Scanner input = new Scanner(System.in);
        double peso, precioProducto, costoEnvio;
        String zonaEnvio;
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        zonaEnvio = input.nextLine().toUpperCase().trim();
        
        costoEnvio = calcularCostoEnvio(peso, zonaEnvio);
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + calcularTotalCompra(precioProducto, costoEnvio));
        
    }
    
    /**
     * Calcula el costo de envío basado en el peso y la zona
     * 
     * @param peso Peso del paquete en kilogramos
     * @param zona Zona de envío ("Nacional" o "Internacional")
     * @return El costo de envío calculado
     */
    
    public static double calcularCostoEnvio(double peso, String zona){
        double costoEnvio;
        
        if (zona.equals("NACIONAL")){
            costoEnvio = peso * 5;
        }else{
            costoEnvio = peso * 10;
        }
        return costoEnvio;
        
    }
    
    /**
     * Calcula el total de compra sumando el precio del producto y el costo de envío
     * 
     * @param precioProducto Precio del producto
     * @param costoEnvio Costo de envío (calculado con calcularCostoEnvio)
     * @return El total de la compra
     */
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double precioTotal;
        
        precioTotal = precioProducto + costoEnvio;
                
        return precioTotal;
    }


}
