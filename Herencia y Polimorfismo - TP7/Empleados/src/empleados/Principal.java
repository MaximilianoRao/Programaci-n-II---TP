
package empleados;

import java.util.ArrayList;

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
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        //Creamos los empleados
        EmpleadoPlanta ep1 = new EmpleadoPlanta();
        EmpleadoPlanta ep2 = new EmpleadoPlanta();
        EmpleadoTemporal et1 = new EmpleadoTemporal();
        EmpleadoTemporal et2 = new EmpleadoTemporal();
        EmpleadoTemporal et3 = new EmpleadoTemporal();
        
        //Agregamos empleados al ArrayList.
        empleados.add(ep1);
        empleados.add(ep2);
        empleados.add(et1);
        empleados.add(et2);
        empleados.add(et3);
        
         for (Empleado empleado : empleados) {
             System.out.println("El empleado tipo "+ empleado.getClass().getSimpleName() + " cobra $" + empleado.calcularSueldo(empleado));
            
        }
    }

}
