
package ejercicios.pkg123;
/*
una tienda de ropa en línea que determine el tipo de descuento aplicable a 
un cliente basado en el monto total de su compra 
y el tipo de cliente. Los descuentos son los siguientes:

Si el monto total es mayor a $100 y el cliente es "premiun", se aplica un 50% de descuento.
Si el monto total es mayor a $75 y el cliente es "regular", se aplica un 15% de descuento.
En cualquier otro caso, no se aplica descuento.
*/
import java.util.Scanner;
public class Ejercicio6 {
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);


        System.out.print("Ingrese el monto total de la compra: $");
        double montoTotal = leer.nextDouble();
        leer.nextLine(); 


        System.out.print("Ingrese el tipo de cliente (premiun/regular): ");
        String tipoCliente = leer.nextLine().trim().toLowerCase();

       
        if (montoTotal > 100 && tipoCliente.equals("premiun")) {
            System.out.println("Descuento del 50% aplicado.");
        } else if (montoTotal > 75 && tipoCliente.equals("regular")) {
            System.out.println("Descuento del 15% aplicado.");
        } else {
            System.out.println("No se aplica descuento.");
        }

     
     }
}
