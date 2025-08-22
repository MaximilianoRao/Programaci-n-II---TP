
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicios 7");
        /*
        Escribe un programa que solicite al usuario una nota entre 0 y 10. 
        Si el usuario ingresa un número fuera de este rango, debe seguir 
        pidiéndole la nota hasta que ingrese un valor válido.
        */
        Scanner input = new Scanner(System.in);
        int nota;
        do {            
        System.out.print("Ingrese una nota (0-10): ");
        nota = Integer.parseInt(input.nextLine());
        if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        
        System.out.println("Nota guardada correctamente.");
        
    }

}
