
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicios 3");
        /*
        Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla:
        Menor de 12 años: "Niño"
        Entre 12 y 17 años: "Adolescente"
        Entre 18 y 59 años: "Adulto"
        60 años o más: "Adulto mayor"
        */
        Scanner input = new Scanner(System.in);
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        if (edad < 0) {
            System.out.println("Edad inválida");
        } else if (edad < 12) {
            System.out.println("Eres un Niño");
        } else if (edad <= 17) {
            System.out.println("Eres un Adolescente");
        } else if (edad <= 59) {
            System.out.println("Eres un Adulto");
        } else {
            System.out.println("Eres un Adulto mayor");
        }
        
    }

}
