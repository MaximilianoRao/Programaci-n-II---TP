
package poo.tp3;

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
        System.out.println("\nEjercicio 1");
        //Creación de estudiante
        Estudiante estudiante1 = new Estudiante("Maximiliano", "Rao", "Programación");
        estudiante1.mostrarInfo();
        System.out.println("\nCarga de calificación");
        estudiante1.setCalificacion(8);
        estudiante1.mostrarInfo();
        System.out.println("\nSe sube calificación al máximo");
        estudiante1.subirCalificacion(3);
        System.out.println("\nSe baja calificación");
        estudiante1.bajarCalificacion(5);
        System.out.println("\nInformación final:");
        estudiante1.mostrarInfo();
        
        System.out.println("\n\nEjercicio 2");
        //Creación de mascota
        Mascota miMascota = new Mascota("Floki", "Perro", 3);
        miMascota.mostrarInfo();
        System.out.println("\nSimulando paso del tiempo tiempo...");
        miMascota.cumplirAnios();
        miMascota.cumplirAnios();
        System.out.println("\nInformación final:");
        miMascota.mostrarInfo();
        
        
        System.out.println("\n\nEjercicio 3");
        System.out.println("Creando un nuevo libro...");
        Libro miLibro = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        miLibro.mostrarInfo();
        System.out.println("\n2. Intentando modificar el año con valor inválido\n");
         // Valor negativo
        System.out.println("Intento 1: Año negativo");
        miLibro.setAnioPublicacion(-1500);
        // Valor futuro
        System.out.println("\nIntento 2: Año futuro");
        miLibro.setAnioPublicacion(2030);
        // Valor válido
        System.out.println("\nIntento final: Año correcto\n");
        miLibro.setAnioPublicacion(1990);
        //Resultado
        System.out.println("\nInformación final:");
        miLibro.mostrarInfo();
        
        
        // Crear dos gallinas
        Gallina gallina1 = new Gallina("Luna", 5);
        Gallina gallina2 = new Gallina("Estrella", 12);
        System.out.println("\nEstado inicial de las gallinas:");
        gallina1.mostrarEstado();
        System.out.println();
        gallina2.mostrarEstado();
        System.out.println("Simulación:");
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina1.envejecer();
        gallina2.envejecer();
        System.out.println();
        System.out.println("Estado final:");
        gallina1.mostrarEstado();
        System.out.println();
        gallina2.mostrarEstado();
        
        // Crear nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial("Navesita", 50);
        nave.mostrarEstado();
        
        // Despegar
        nave.despegar();
        
        //Intenta avanzar más de lo permitido por el combustible cargador. Maximo 25KM con 50 lts
        nave.avanzar(27);
        
        System.out.println("\nRecargando combustible:");
        nave.recargarCombustible(14);
        
        
        boolean exito = nave.avanzar(27);
         if (exito) {
            System.out.println();
            System.out.println("Estado final:");
            nave.mostrarEstado();
        }
    }
    
    

}
