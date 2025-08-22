
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicios 6");
        
        /*
        Escribe un programa que pida al usuario ingresar 10 números enteros 
        y cuente cuántos son positivos, negativos y cuántos son ceros.
        */
        int num, positivos, negativos, ceros;
        positivos = 0;
        negativos = 0;
        ceros = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " +  i +": ");
            num = Integer.parseInt(input.nextLine());
            positivos += num > 0 ? 1 : 0;
            negativos += num < 0 ? 1 : 0;
            ceros += num == 0 ? 1 : 0;
        }
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }

}
