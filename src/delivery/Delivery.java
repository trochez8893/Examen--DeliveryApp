
package delivery;
import java.util.Scanner;

public class Delivery {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
         String menu;
         String venta;
         String reparto;
         
        int precio= 300;
        
     
   int usuario;
        do {
            System.out.println("----------------------------------------");
            System.out.println("BIENVENIDO DELIVERY CEUTEC");
            System.out.println("Indique su tipo de usuario");
            System.out.println("----------------------------------------");

            System.out.println("    1. CLIENTE");
            System.out.println("    2. VENDEDOR");
            System.out.println("    3. REPARTIDOR");
            System.out.println("    4. SALIR");

            usuario = entrada.nextInt();
            switch (usuario) {

                case 1:

                    System.out.println("Su menu se esta procesando");
                    menu = entrada.nextLine();
                    
                   
                   System.out.println("Su menu es 1 hamburguesa y 1 cocacola" + "su total a pagar es " + precio);
                   
                    break;

                case 2:
                    System.out.println("La venta del cliente es:");
                    venta = entrada.nextLine();
                   System.out.println("El pedido ha sido tomado");
                   
                    
                    break;

                case 3:
                    System.out.println("----------------------------------------");
                    System.out.println("Indique la direccion de la entrega:");
                    reparto = entrada.nextLine();
                    
                    System.out.println("La entrega sera en"+reparto);
                    

                case 4:
                    break;
                default:
                    System.out.println("Opcion incorrecta, ingrese opcion nuevamente");
            
        } while (usuario < 4);
        System.out.println("SESION FINALIZADA");
        System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");      
        
    
}
