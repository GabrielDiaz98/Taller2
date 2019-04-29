/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio2;

/**
 *
 * @author Gabriel
 */
public class Entrenador {

    public String nombre, tipo;

    public Entrenador() {
        this.nombre = "Francisco";
        this.tipo = "Tenis";

    }

    public Entrenador(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void IndicarEntrenmiento() {
        System.out.println("Mi nombre es " + nombre + " y soy entrenador de " + tipo);
    }
}
