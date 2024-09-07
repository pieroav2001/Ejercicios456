/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.pkg123;

import java.util.Scanner;
        
public class Ejercicio5 {
/*
    determine si un estudiante aprueba o reprueba un curso basándose en dos criterios: 
    la calificación final y el porcentaje de asistencia.
    Para aprobar, el estudiante debe tener al menos una calificación de 12 y una asistencia de al menos 50%.
    
    */
    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in);
            System.out.print("Ingrese la calificacion final: ");
        double calificacionFinal = leer.nextDouble();
        System.out.print("Ingrese el porcentaje de asistencia: ");
        double porcentajeAsistencia = leer.nextDouble();

        
        if (calificacionFinal >= 12 && porcentajeAsistencia >= 50) {
            System.out.println("El estudiante aprueba el curso.");
        } else {
            System.out.println("El estudiante reprueba el curso.");
       
    }
    }
}
