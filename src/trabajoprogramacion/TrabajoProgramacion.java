/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoprogramacion;

import Personaje.Personajes;

/**
 *
 * @author AAron
 */
public class TrabajoProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Personajes jugador = new Personajes();
       Personajes enemigo = new Personajes();
       
       jugador.setClase();
       jugador.setSalud();
        System.out.println(jugador.getSalud());
    }
    
}
