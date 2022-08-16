
package delivery;




 public class Repartidor extends Usuarios{
     protected  String tiempoEntrega;
    
    
    public Repartidor(String nombre, String tiempoEntrega ){
    super(nombre);
    this.tiempoEntrega=tiempoEntrega;
    }
   public void mostrarDatosRepartidor(){
   
   System.out.println("Nombre: "+getNombre()+"\nTiempo de Entrega: "+tiempoEntrega);
   } 
}


        


    