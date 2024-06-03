package Lista_CircularJugador;


import Lista_CircularJugador.Jugador;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paul2
 */

public class nodoJugador {
    
    // atributos de la clase
    public Jugador dato;
    public Jugador jugador;
    public nodoJugador siguiente;
    nodoJugador anterior;
    
// contructor con los argumentos
    public nodoJugador(Jugador dato) {
        this.dato = dato;
    }
}

