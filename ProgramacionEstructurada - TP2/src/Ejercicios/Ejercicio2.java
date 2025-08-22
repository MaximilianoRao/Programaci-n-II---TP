
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicios 2");
        /*
        Escribe un programa en Java que pida al usuario tres n�meros enteros y determine cu�l es el mayor.
        */
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Ingrese el primer n�mero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el segundo n�mero: ");
        num2 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el tercer n�mero: ");
        num3 = Integer.parseInt(input.nextLine());
        
        System.out.println("El mayor es: " + numeroMayor(num1,num2,num3)); 
        
    }
    
    public static int numeroMayor(int num1, int num2, int num3){
        int mayor = num1;
        
        if (num2 > mayor) {
            mayor = num2;
        }
        
        if (num3 > mayor) {
            mayor = num3;
        }
        
        return mayor;
    }
    


}
