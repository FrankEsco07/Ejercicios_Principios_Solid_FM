/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_o;

/**
 *
 * @author Carlos Manobanda
 */

public class BoletoInauguracionAzteca implements BoletoMundial {
    @Override 
    public double calcularPrecio(double precioBase) { 
        return precioBase * 3.0; 
    }
}