
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicios 10");
        //Actualización de stock a partir de venta y recepción de productos.
        
        Scanner input = new Scanner(System.in);
        int stockActual, cantidadVendida, cantidadRecibida, stockActualizado;
        
        System.out.print("Ingrese el stock actual del producto: ");
        stockActual = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad vendida: ");
        cantidadVendida = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad recibida: ");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        
        stockActualizado = actualizarStock(stockActual,cantidadVendida,cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + stockActualizado);
    }
    
    public static int actualizarStock(int stockActual, int cantidadVendida,int cantidadRecibida){
        int nuevoStock;
        nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
}
