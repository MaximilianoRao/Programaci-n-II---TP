
package empleados;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public abstract class Empleado {
    
    // Calcula el sueldo dependiendo del Empleado que llega por parametro.
    public double calcularSueldo(Empleado e){
       if (e instanceof EmpleadoPlanta)
          return 1300.0;
       else if (e instanceof EmpleadoTemporal)
          return 800.0;
       else
          return 0;
       
        }


}
