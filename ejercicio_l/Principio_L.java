/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_l;
import java.util.Scanner;
/**
 *
 * @author Carlos Manobanda
 */
public class Principio_L {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AutoridadCancha arbitro = new ArbitroFIFA();
        PersonalComercial vendedor = new VendedorEstadio();
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("\n--- MENÚ LI_SI: PERSONAL SEGREGADO ---");
            System.out.println("1. Acción Árbitro");
            System.out.println("2. Acción Vendedor");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: arbitro.arbitrarPartido(); break;
                case 2: vendedor.venderBebidas(); break;
                case 3: break;
                default: System.out.println("Opción inválida.");
            }
        }
        sc.close();
    }
    
}
