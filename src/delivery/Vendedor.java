
package delivery;





public class Vendedor extends Usuarios{
    protected  int codigo;
    private final int carnet;
    
    
    public Vendedor(String nombre, int carnet){
    super(nombre);
    this.carnet=carnet;
    }
   public void mostrarDatosVendedor(){
   
   System.out.println("Nombre: " + getNombre()+ " \nCarnet: " + carnet);
   } 
}
