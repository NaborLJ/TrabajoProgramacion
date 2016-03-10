package Personaje;



import Personaje.Personajes;
import Personaje.Rival;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Batalla {
    private Personajes jugador;
    private Rival enemigo;
    
    public void comenzarBatalla(){
        jugador.setClase();
        int op;
        
        op=Integer.parseInt(JOptionPane.showInputDialog("¿ Entrar en la arena ? \n 1.-Adelante 2.-No "));
        switch(op){
            case 1:
                JOptionPane.showMessageDialog(null,"Entras en la aren. \n Tu rival será ");
        }
        
        
        
    }
    public void escogerRival(){
        int aux_eleccion = (int)(Math.random() * 1);
         int op;
        
        op=Integer.parseInt(JOptionPane.showInputDialog("¿ Entrar en la arena ? \n 1.-Adelante 2.-No "));
        switch(op){
            case 1:
                enemigo = new BugEnfurecido();
                
                break;
        }
            
        
        
    }
    
}
