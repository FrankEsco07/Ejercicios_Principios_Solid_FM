/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_d;
import java.util.Scanner;
/**
 *
 * @author Carlos Manobanda
 */
public class Principio_D {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("\n--- MENÚ D_SI: TRANSMISIÓN DESACOPLADA ---");
            System.out.println("1. Transmitir por TV");
            System.out.println("2. Transmitir por Streaming");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            TransmisionFIFA transmision;
            switch (opcion) {
                case 1: 
                    transmision = new TransmisionFIFA(new CanalTelevisionTradicional());
                    transmision.iniciarTransmision(); 
                    break;
                case 2: 
                    transmision = new TransmisionFIFA(new PlataformaStreaming());
                    transmision.iniciarTransmision(); 
                    break;
                case 3: break;
                default: System.out.println("Opción inválida.");
            }
        }
        sc.close();
    }
}
