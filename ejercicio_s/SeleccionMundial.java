    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_s;

import java.util.ArrayList;

/**
 *
 * @author Carlos Manobanda
 */
public class SeleccionMundial {
    private String pais;
    private ArrayList<String> jugadores = new ArrayList<>();
    
    public SeleccionMundial(String pais)
    { 
        this.pais = pais; 
    }
    
    public void convocarJugador(String jugador) 
    { 
        jugadores.add(jugador); 
    }
    public String getPais() 
    { 
        return pais; 
    }
    public ArrayList<String> getJugadores() 
    {
        return jugadores; 
    }

}
    