/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

/**
 *
 * @author maily
 * juego varias bottela pa jugar
 */
public class juego {
     private Botella[] botellas;

    public juego(int numBotellas, int capacidadBotella) {
        botellas = new Botella[numBotellas];
        for (int i = 0; i < numBotellas; i++) {
            botellas[i] = new Botella(capacidadBotella);
        }
    }

    public boolean esJuegoGanado() {
        for (Botella tubo : botellas) {
            if (!tubo.coloresiguales() && !tubo.estaLlena()) return false;
        }
        return true;
    }
    
    //Añadan más métodos de lógica 
}
