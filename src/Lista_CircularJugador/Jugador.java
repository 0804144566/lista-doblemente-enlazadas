package Lista_CircularJugador;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paul2
 */


public class Jugador {
    private final String nombreJugador;
    private final int numeroDorsal;
    private final String posicion;

    public Jugador(String nombreJugador, int numeroDorsal, String posicion) {
        this.nombreJugador = nombreJugador;
        this.numeroDorsal = numeroDorsal;
        this.posicion = posicion;
        
    }

    
  
// Metod toString
    @Override
    public String toString() {
        return "Jugador \n< " +
                "Nombre del Jugador = '" + nombreJugador + '\'' +
                ", Numero Dorsal = " + numeroDorsal +
                ", Posicion en la que Juega = '" + posicion + '\'' +
                '>';
    }
}

