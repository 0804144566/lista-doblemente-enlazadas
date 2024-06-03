package Lista_CircularJugador;

import Lista_CircularJugador.nodoJugador;
import Lista_CircularJugador.Jugador;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paul2
 */
public class Lista_titular {
    private nodoJugador inicio;
    private int cantidad;
    private final int maxCantidad;

    public Lista_titular(int maxCantidad) {
        this.inicio = null;
        this.cantidad = 0;
        this.maxCantidad = maxCantidad;
    }
    //Reemplaza un nodo existente por uno nuevo
  public void cambio(Jugador jugadorAntiguo, Jugador jugadorNuevo) {
        if (eliminar(jugadorAntiguo)) {
            ingresarAlFinal(jugadorNuevo);
        }
    }

    public void ingresarAlFinal(Jugador jugador) {
        if (cantidad >= maxCantidad) {
            System.out.println("No se puede ingresar más jugadores. La lista está llena.");
            return;
        }
        
        nodoJugador nuevo = new nodoJugador(jugador);
        if (inicio == null) {
            inicio = nuevo;
            inicio.siguiente = inicio;
            inicio.anterior = inicio;
            
        } else {
            nodoJugador ultimo = inicio.anterior;
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            nuevo.siguiente = inicio;
            inicio.anterior = nuevo;
        }
        cantidad++;
    }

    public boolean eliminar(Jugador jugador) {
        if (inicio == null) {
            return false;
        }

        nodoJugador actual = inicio;
        do {
            if (actual.dato.equals(jugador)) {
                if (actual == inicio && actual.siguiente == inicio) {
                    inicio = null;
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                    if (actual == inicio) {
                        inicio = actual.siguiente;
                    }
                }
                cantidad--;
                return true;
            }
            actual = actual.siguiente;
        } while (actual != inicio);
        return false;
    }

    
    //Muestra todos los nodos de la lista
    public void mostrar() {
        if (inicio == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        nodoJugador actual = inicio;
        do {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        } while (actual != inicio);
    }
//Elimina toda la lista
    public void eliminarTodos() {
        inicio = null;
        cantidad = 0;
    }
//Elimina un jugador específico
    public void expulsado(Jugador jugador) {
        eliminar(jugador);
    }
  
}
