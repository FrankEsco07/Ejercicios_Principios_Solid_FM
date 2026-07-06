/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_d;

/**
 *
 * @author Carlos Manobanda
 */
public class PlataformaStreaming implements PlataformaTransmision {
    @Override 
    public void emitirSenhal() { 
        System.out.println("Transmitiendo por Streaming (Twitch/YouTube)..."); 
    }
}
