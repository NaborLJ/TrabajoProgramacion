/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoprogramacion;

import Personaje.Batalla;
import Inventario.Inventario;
import Personaje.Personajes;
import Rival.Rival;

/**
 *
 * @author Nabor
 */
public class TrabajoProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Personajes jugador = new Personajes();
       Inventario prueba2 = new Inventario();
       Batalla prueba = new Batalla();
       
      prueba.comenzarBatalla();
       
       
    }
    
}
