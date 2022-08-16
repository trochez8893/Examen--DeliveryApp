
package delivery;

import java.util.Scanner;

public abstract class Usuarios {
    Scanner entrada = new Scanner(System.in);
    String nombre;
   
    public Usuarios (String nombre){
    this.nombre = nombre; 
    }
    
    public String getNombre () {
    return nombre; 
    }
}
    

