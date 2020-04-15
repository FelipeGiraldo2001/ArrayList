
package cine;

/**
 *
 * @author Felipe Giraldo
 */
public class Pelicula
{
    private final String nombre;
    private final String director;
    private final int año;
 
 public Pelicula(String n, String d, int a)
 {
     nombre=n;
     director=d;
     año=a;
    
 }
 @Override
    public String toString(){ 
        return ("Nombre: "+nombre+" Director: "+ director+" Año: "+año); 
    } 

    public String getNombre() {
        return this.nombre;
    }

    public String getDirector() {
        return this.director;
    }


    public int getAño() {
        return año;
    }
    
}
