
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicios 5");
        /*
        Escribe un programa que solicite n�meros al usuario y sume solo los n�meros pares. 
        El ciclo debe continuar hasta que el usuario ingrese el n�mero 0, momento en el que 
        se debe mostrar la suma total de los pares ingresados.
        */
        
        Scanner input = new Scanner(System.in);
        int num1,suma;
        System.out.print("Ingrese un n�mero (0 para terminar): ");
        num1 = Integer.parseInt(input.nextLine());
        suma = 0;
        while(num1 != 0){
            if (num1 % 2 == 0) {
            suma+=num1;
            }
            System.out.print("Ingrese un n�mero (0 para terminar): ");
            num1 = Integer.parseInt(input.nextLine());
        }
        System.out.println("La suma de los n�meros pares es: " + suma);
        
    }

}
