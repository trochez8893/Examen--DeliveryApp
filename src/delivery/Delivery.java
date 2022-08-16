
package delivery;
import java.util.Scanner;

public class Delivery {

    
  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        System.out.println("----APP DELIVERY----");
        System.out.println("1. Cliente");
        System.out.println("2. Vendedor");
        System.out.println("3. Repartidor");
        System.out.print("Elija la opcion que le corresponde: ");
        opcion= entrada.nextInt(); 
        
        
        
      if (opcion == 1) {
              Cliente client1 = new Cliente("Jairo","Residencial San Carlos","Hamburguesa y una cocacola", 400);
              System.out.println("-------------------");
                client1.mostrarDatosCliente(); 
                } 
      
      if (opcion ==2) {
               Vendedor vend1 = new Vendedor ("Carlos", 953456);
               System.out.println("---------");
               vend1.mostrarDatosVendedor();
              }
      if (opcion ==3) {
                Repartidor repar1 = new Repartidor ("Juan","1 hora");
                System.out.println("----------");
                repar1.mostrarDatosRepartidor();
      
        
      }}}
