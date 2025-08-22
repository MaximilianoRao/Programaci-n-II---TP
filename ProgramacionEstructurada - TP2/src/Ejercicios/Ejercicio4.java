package Ejercicios;


import java.util.Scanner;


/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicios 4");
        /*
        Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
        */
        Scanner input = new Scanner(System.in);
        double precio;
        String categoria;
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        categoria = input.nextLine().toUpperCase().trim();
        CalculoDescuento(categoria, precio);
        
         
    }
    
    public static void CalculoDescuento (String categoria, double precio){
        double montoDescuento;
        double precioFinal;
        double descuento;
        switch (categoria) {
            case "A":
                montoDescuento = precio * (10.0 / 100);
                descuento = 10;
                break;
            case "B":
                montoDescuento = precio * (15.0 / 100);
                descuento = 15;
                break;
            case "C":
                montoDescuento = precio * (20.0 / 100);
                descuento = 20;
                break;
            default:
                montoDescuento = 0.0;
                descuento = 0.0;
        }
        precioFinal = precio - montoDescuento;
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Precio final: " + precioFinal);
        
    }
}
