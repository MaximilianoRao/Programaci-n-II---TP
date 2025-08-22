
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicios 1");
        /*
        Escribe un programa en Java que solicite al usuario un a�o y determine si es bisiesto. 
        Un a�o es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400.
        Ingrese un a�o: 2024
        El a�o 2024 es bisiesto.
        */
        Scanner input = new Scanner(System.in);
        int anio;
        System.out.print("Ingrese un a�o: ");
        anio = Integer.parseInt(input.nextLine());
        
         if (esAnioBisiesto(anio)) {
            System.out.println("El a�o " + anio + " es bisiesto.");
        } else {
            System.out.println("El a�o " + anio + " no es bisiesto.");
        }
               
    }
    
    public static boolean esAnioBisiesto(int anio) {
       
        return (anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0);
    }

}
