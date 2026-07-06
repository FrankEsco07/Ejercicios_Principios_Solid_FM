/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_s;
import java.util.Scanner;

/**
 *
 * @author Carlos Manobanda
 */
public class Principio_S {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        SeleccionMundial seleccion = new SeleccionMundial("Ecuador");
        SeleccionRepository repository = new SeleccionRepository();
        ReportePrensa reporte = new ReportePrensa();
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n--- MENÚ S_SI: SELECCIÓN " + seleccion.getPais() + " ---");
            System.out.println("1. Convocar jugador");
            System.out.println("2. Guardar en Base de Datos");
            System.out.println("3. Generar Reporte");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del jugador: ");
                    seleccion.convocarJugador(sc.nextLine());
                    break;
                case 2: repository.guardarEnBaseDeDatos(seleccion); break;
                case 3: reporte.imprimirReporte(seleccion); break;
                case 4: break;
                default: System.out.println("Opción inválida.");
            }
        }
        sc.close();
    }
}
    

