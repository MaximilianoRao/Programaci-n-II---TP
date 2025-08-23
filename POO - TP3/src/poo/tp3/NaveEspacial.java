
package poo.tp3;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class NaveEspacial {
    // Constantes para la simulación
    private static final int combustibleMaximo = 100;
    private static final double consumo = 2; 
    private static final int consumoDesquegue = 10;
    
    private String nombre;
    private boolean enVuelo;
    private double combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
        setCombustible(combustible);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        if (combustible < 0) {
            System.out.println("Combustible no puede ser negativo. Se establecerá en 0.");
            this.combustible = 0;
        } else if (combustible > combustibleMaximo) {
            System.out.println("Combustible excede el máximo (" + combustibleMaximo + "). Se establecerá al máximo.");
            this.combustible = combustibleMaximo;
        } else {
            this.combustible = combustible;
        }
    }
    
    
    // Método para despegar
    public boolean despegar() {
        System.out.println("\nEn proceso de despuegue");
        
        if (enVuelo) {
            System.out.println("Error: La nave ya está en vuelo!");
            return false;
        }
        
        if (combustible < consumoDesquegue) {
            System.out.println("Error: Combustible insuficiente para despegar.");
            System.out.println("Se requiere: " + consumoDesquegue + " unidades");
            System.out.println("Disponible: " + combustible + " unidades");
            return false;
        }
        
        // Consumir combustible del despegue
        combustible -= consumoDesquegue;
        enVuelo = true;
        System.out.println("¡Despegue exitoso!");
        System.out.println("La nave '" + nombre + "' despego. Combustible restante: "+ combustible + " unidades");
        return true;
    }
    
    
    // Método para avanzar una distancia
    public boolean avanzar(double distancia) {
        System.out.println("\nIntentando avanzar " + distancia + " km");
        
        if (!enVuelo) {
            System.out.println("Error: La nave debe despegar para avanzar.");
            return false;
        }
        
        if (distancia <= 0) {
            System.out.println("Error: La distancia debe ser mayor a 0.");
            return false;
        }
        
        double combustibleNecesario = distancia * consumo;
        
        if (combustible < combustibleNecesario) {
            System.out.println("Error: Combustible insuficiente para avanzar " + distancia + " km");
            System.out.println("Faltante: " + (combustibleNecesario - combustible) + " unidades");
            return false;
        }
        
        // Realizar el viaje
        combustible -= combustibleNecesario;
        
        System.out.println("¡Viaje exitoso!");
        System.out.println("Avanzaste " + distancia + " km");
        System.out.println("Combustible restante: " + combustible + " unidades");
        return true;
    }
    
    // Método para recargar combustible
    public boolean recargarCombustible(double cantidad) {
        
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a recargar debe ser mayor a 0.");
            return false;
        }
        
        double nuevoTotal = combustible + cantidad;
        
        if (nuevoTotal > combustibleMaximo) {
            System.out.println("Error: La cantidad a recargar supera el combustible maximo " + combustibleMaximo + " unidades." );
        } else {
            combustible = nuevoTotal;
            System.out.println("Recarga exitosa!");
        }
        return true;
    }
    
    // Método para mostrar estado
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible + " unidades.");
        System.out.println("Estado: " + (enVuelo ? "En vuelo" : "En tierra"));
    }
    
}
