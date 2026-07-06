/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_d;

/**
 *
 * @author Carlos Manobanda
 */
public class TransmisionFIFA {
    private PlataformaTransmision plataforma;
    
    public TransmisionFIFA(PlataformaTransmision plataforma) { 
        this.plataforma = plataforma; 
    }
    
    public void iniciarTransmision() { 
        plataforma.emitirSenhal(); 
    }
}
