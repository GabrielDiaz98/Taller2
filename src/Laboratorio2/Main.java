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
public class Main {

    public static void main(String[] args) {

        Entrenador entrenador1 = new Entrenador();
        entrenador1.IndicarEntrenmiento();
        Entrenador entrenador2 = new Entrenador("Gabriel", "Futbol");
        entrenador2.IndicarEntrenmiento();
    }
}
