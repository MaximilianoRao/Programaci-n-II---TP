
package poo.tp3;

import java.time.Year;

/**
 *
 * @author Maximiliano Rao
 * 
 * 
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public boolean setAnioPublicacion(int anioPublicacion) {
        int anioActual = Year.now().getValue();
        if(anioPublicacion <= anioActual && anioPublicacion > 1000){
           this.anioPublicacion = anioPublicacion;
           return true;
        }else{
            System.out.println("Año inválido");
            return false;
        }
            
    }
    
    
    
    /*
        Metodo para imprimir en pantalla la información del objeto.
    */
    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
        
    }

}
    