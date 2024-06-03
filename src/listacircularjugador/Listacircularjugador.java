/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listacircularjugador;

import Lista_CircularJugador.ListaNomina;
import Lista_CircularJugador.Jugador;

/**
 *
 * @author paul2
 */
public class Listacircularjugador {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ListaNomina listaNomina = new ListaNomina();
      //Definimos los nombre de jugadores.
      listaNomina.ingresarAlFinal(new Jugador("Messi", 10, "Delantero"));
      listaNomina.ingresarAlFinal(new Jugador("Ronaldo", 7, "Banda derecha"));
      listaNomina.ingresarAlFinal(new Jugador("Neymar", 11, "Delantero"));

      // muestra la lista.
        listaNomina.mostrar();
        
    }
}



