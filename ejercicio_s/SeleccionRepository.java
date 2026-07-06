/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_s;

/**
 *
 * @author Carlos Manobanda
 */
public class SeleccionRepository {
    public void guardarEnBaseDeDatos(SeleccionMundial seleccion) 
    {
        System.out.println("Guardando " + seleccion.getPais() + " en BD (Desde Repository).");
    }
}
