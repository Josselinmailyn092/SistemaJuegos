/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import java.util.Stack;

/**
 *
 * @author maily
 * Cda botella del juego 
 * 
 */
public class Botella {
    private Stack<String> colores;//Pila que contendra los colores en la botella 
    private final int capacidad ; //cantidad de colores que tendra una botella
    
    public Botella (int capacidad){//capacidad de colores que tendra cada tubo
        this.capacidad = capacidad;
        colores = new Stack <>();
    }
    
    //Reglas de vaciar botella actual
    public boolean sePuedeVaciarEn( Botella otra){
        if (this.colores.isEmpty()) return false;//verificar si está vacio
        if (otra.colores.size() == otra.capacidad) return false; //verificar si el tubo destino esta lleno
        if (otra.colores.isEmpty()) return true; //verificar si el tubo destino esta vacio 
        return this.colores.peek().equals(otra.colores.peek());//si no se cumplen condiciones anteriores, si es igual al color de la parte superior de destino agrupa por color 
    }
    
    //vaciar una botella a otra segun las reglas
    public void vaciaEn (Botella otra){
        if(sePuedeVaciarEn(otra)){
            otra.colores.push(this.colores.pop());//quitar el color de la botella actual para agregarlo a la botella destino.
        }
    }
    
    //colores iguales en una botella
    public boolean coloresiguales(){
        if(colores.isEmpty()) return true; //ver si esta vacio 
        String colorSuperior = colores.peek(); //color de laparte superior 
        for(String color : colores ){ //ver colores en la botella 
            if(!color.equals(colorSuperior)) return false;
        }
        return true;
    }
    
    //ver si esta llena la botella
    public boolean estaLlena(){
        return colores.size() == capacidad;
    }
    
    //agregar color si es que no está lleno
    public void agregarColor(String color){
        if(colores.size() < capacidad){
            colores.push(color);
        }
    }
}
