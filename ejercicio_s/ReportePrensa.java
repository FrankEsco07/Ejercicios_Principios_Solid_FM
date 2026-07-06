/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_s;

/**
 *
 * @author Carlos Manobanda
 */
public class ReportePrensa {
    
    public void imprimirReporte(SeleccionMundial seleccion) 
    {
        System.out.println("--- Lista oficial de " + seleccion.getPais() + " ---");
        seleccion.getJugadores().forEach(j -> System.out.println("- " + j));
    }
}
