
package poo.tp4;

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
    public static void main(String[] args) {
        // Crear empleados usando el constructor completo
        Empleado emp1 = new Empleado(100, "Maxi Diaz", "Frontend", 5000000);
        Empleado emp2 = new Empleado(101, "Roberto Perez", "Backend", 7000000);
        
        // Crear empleados usando el constructor simplificado (ID automático y salario por defecto)
        Empleado emp3 = new Empleado("Rocio Jain", "Product Owner");
        Empleado emp4 = new Empleado("Francis Natra", "Analista de datos");
        
        System.out.println("--- Empleados creados ---");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        
        System.out.println("\n--- Actualizaciones de salario ---");
        // Aplicar aumento por porcentaje
        System.out.println("Aplicando 10% de aumento a " + emp1.getNombre());
        emp1.actualizarSalario(10.0);
        System.out.println("\nAplicando 15% de aumento a " + emp3.getNombre());
        emp3.actualizarSalario(15.0);
        
        // Aplicar aumento por cantidad fija
        System.out.println("\nAplicando $5000 de aumento a " + emp2.getNombre());
        emp2.actualizarSalario(5000); 
        
        System.out.println("\n--- Estado final de todos los empleados ---");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        
        
        // Mostrar total de empleados usando método estático
        System.out.println("\n------");
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
        
        
    }
    

}
