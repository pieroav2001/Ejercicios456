
package ejercicios.pkg123;

import java.util.Scanner;
/*
Desarrolla un programa para una tienda en línea que determine si un cliente
tiene derecho a un envío gratuito basado en el monto total de su compra. 
El envío es gratuito si el monto total es mayor o igual a S/80 
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        
           Scanner leer = new Scanner(System.in);

        
        System.out.print("Ingrese el monto total de la compra: S/");
        double montoTotal = leer.nextDouble();

       
        if (montoTotal >= 80) {
            System.out.println("Envio gratuito ");
        }
       
       
    }
        }

