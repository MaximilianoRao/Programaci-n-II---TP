
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
        //Creaci�n de estudiante
        Estudiante estudiante1 = new Estudiante("Maximiliano", "Rao", "Programaci�n");
        estudiante1.mostrarInfo();
        System.out.println("\nCarga de calificaci�n");
        estudiante1.setCalificacion(8);
        estudiante1.mostrarInfo();
        System.out.println("\nSe sube calificaci�n al m�ximo");
        estudiante1.subirCalificacion(3);
        System.out.println("\nSe baja calificaci�n");
        estudiante1.bajarCalificacion(5);
        System.out.println("\nInformaci�n final:");
        estudiante1.mostrarInfo();
        
        System.out.println("\n\nEjercicio 2");
        //Creaci�n de mascota
        Mascota miMascota = new Mascota("Floki", "Perro", 3);
        miMascota.mostrarInfo();
        System.out.println("\nSimulando paso del tiempo tiempo...");
        miMascota.cumplirAnios();
        miMascota.cumplirAnios();
        System.out.println("\nInformaci�n final:");
        miMascota.mostrarInfo();
        
        
        System.out.println("\n\nEjercicio 3");
        System.out.println("Creando un nuevo libro...");
        Libro miLibro = new Libro("Cien a�os de soledad", "Gabriel Garc�a M�rquez", 1967);
        miLibro.mostrarInfo();
        System.out.println("\n2. Intentando modificar el a�o con valor inv�lido\n");
         // Valor negativo
        System.out.println("Intento 1: A�o negativo");
        miLibro.setAnioPublicacion(-1500);
        // Valor futuro
        System.out.println("\nIntento 2: A�o futuro");
        miLibro.setAnioPublicacion(2030);
        // Valor v�lido
        System.out.println("\nIntento final: A�o correcto\n");
        miLibro.setAnioPublicacion(1990);
        //Resultado
        System.out.println("\nInformaci�n final:");
        miLibro.mostrarInfo();
        
        
        // Crear dos gallinas
        Gallina gallina1 = new Gallina("Luna", 5);
        Gallina gallina2 = new Gallina("Estrella", 12);
        System.out.println("\nEstado inicial de las gallinas:");
        gallina1.mostrarEstado();
        System.out.println();
        gallina2.mostrarEstado();
        System.out.println("Simulaci�n:");
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
        
        //Intenta avanzar m�s de lo permitido por el combustible cargador. Maximo 25KM con 50 lts
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
