
package excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
         Scanner scanner = new Scanner(System.in);
         
         //Ejercicio 1
         
         System.out.println("Ejercicio 1");
          
      
         try{
            System.out.print("Ingrese el dividendo: ");
            int dividendo = scanner.nextInt();
            System.out.print("Ingrese el divisor: ");
            int divisor = scanner.nextInt();
            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + dividendo + " / " + divisor + " = " + resultado);
            }
         //Capturo error por divisor por cero.
         catch (ArithmeticException ae){
                    System.out.println("ERROR: No se puede dividir por cero.");
                    System.out.println("Detalles técnicos: " + ae.getMessage());
                 }
         //Capturo cualquier otro error. Ingreso de cualquier valor que no sea Integer.
         catch(Exception e){
             System.out.println("ERROR: Entrada inválida. Debe ingresar números enteros.");
         }
         
         
         
         //Ejercicio 2
         
         System.out.println("\nEjercicio 2");
         
         System.out.print("Ingrese un número: ");
         try {
            int numero = Integer.parseInt(scanner.nextLine());
            System.out.println("Conversión exitosa: " + numero);
            //Capturo la excepción cuando no puede convertirse a entero.
        } catch (NumberFormatException e) {
            System.out.println("ERROR: '" + scanner.nextLine() + "' no es un número válido.");
            System.out.println("Detalles: " + e.getMessage());
        }
         
         
         //Ejercicio 1
         
        System.out.println("\nEjercicio 3");
         
         String ruta = "C:\\path.txt";
         File elarchivo = new File(ruta);
         BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(elarchivo));
            System.out.println(br.readLine());
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR: El archivo no existe.");
        } finally {
            // Cerrar el reader en el bloque finally
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo: " + e.getMessage());
                }
           }
        }    
          
        //Ejercicio 4
        System.out.println("\nEjercicio 4");
        
        System.out.print("Ingrese su edad: ");
        try {
            int edad = scanner.nextInt();
            validarEdad(edad);
         } catch (EdadInvalidaException e) {
             System.out.println("ERROR: " + e.getMessage());
         } catch (Exception e) {
             System.out.println("ERROR: Debe ingresar un número válido.");
         }
        
        
        
        //Ejercicio 5
        System.out.println("\nEjercicio 3");
         
        String ruta2 = "C:\\path.txt";
        File elarchivo2 = new File(ruta2);
         
        try(BufferedReader br2 = new BufferedReader(new FileReader(elarchivo2))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("ERROR de E/S " + e.getMessage());
            throw new RuntimeException("Error inesperado en el catch");
        } 
        
        
    }
        
 public static void validarEdad(int edad) throws EdadInvalidaException {
        if(edad < 0 || edad > 120){
            throw new EdadInvalidaException("Edad invalida");
        }
        
        System.out.println("Edad válida: " + edad + " años");
    }        

}

