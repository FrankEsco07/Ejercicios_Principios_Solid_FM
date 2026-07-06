/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_o;
import java.util.Scanner;

/**
 *
 * @author Carlos Manobanda
 */
public class Principio_O {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        CalculadoraBoletos calculadora = new CalculadoraBoletos();
        double precioBase = 100.0;
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("\n--- MENÚ O_SI: BOLETOS POLIMÓRFICOS ---");
            System.out.println("1. Boleto General");
            System.out.println("2. Boleto Inauguración");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: System.out.println("Total: $" + calculadora.calcularTotal(new BoletoGeneral(), precioBase)); break;
                case 2: System.out.println("Total: $" + calculadora.calcularTotal(new BoletoInauguracionAzteca(), precioBase)); break;
                case 3: break;
                default: System.out.println("Opción inválida.");
            }
        }
        sc.close();
    }
    
}
