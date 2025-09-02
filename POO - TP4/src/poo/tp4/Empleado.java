
package poo.tp4;


/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    //Atributos de clase
    private static int totalEmpleados = 0;
    private static int contadorId = 1; 

    /**
     * Constructor con 4 argumentos.
     * @param id
     * @param nombre
     * @param puesto
     * @param salario 
     */
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        Empleado.totalEmpleados++;
    }
    
    /**
     * Constructor con solo dos argumentos.
     * @param nombre
     * @param puesto
     */

    public Empleado(String nombre, String puesto) {
        this(Empleado.contadorId++,nombre,puesto,1000000);
    }
    
    /**
     *  Metodo que aumenta el salario de acuerdo al porcentaje enviado por parametro.
     */
    public void actualizarSalario(double porcentaje){
        if(porcentaje > 0){
            setSalario((this.salario * porcentaje / 100) + this.salario);
            System.out.println("Nuevo salario de " + this.nombre + " $"+ getSalario() + ".");
        }else{
            System.out.println("ERROR: El porcentaje debe ser positivo");
        }
    }
    
    /**
     *  Metodo que aumenta el salario de acuerdo al monto enviado.
     */
    public void actualizarSalario(int monto){
        if(monto > 0){
            setSalario(this.salario + monto);
            System.out.println("Nuevo salario de " + this.nombre + " $"+ getSalario() + ".");
        }else{
            System.out.println("ERROR: El monto debe ser positivo");
        }
       
    }
    
    /**
     *  
     * @return Retorna el contenido del objeto en forma legible.
     */
    @Override
    public String toString(){
        return "Empleado [id=" + this.id + ", nombre=" + this.nombre + ", puesto=" + this.puesto + ", salario=" + this.salario + "]";
    }
    
    public static int mostrarTotalEmpleados(){
        return Empleado.totalEmpleados;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    private void setSalario(double salario) {
        if(salario > 0){
           this.salario = salario; 
        }
        
    }
    
    
    
}
