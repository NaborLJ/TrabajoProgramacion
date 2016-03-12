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
    private Personaje jugador;
    private Rival enemigo;
    
    public void comenzarBatalla(){
        
        int op;
        
        op=Integer.parseInt(JOptionPane.showInputDialog("¿ Entrar en la arena ? \n 1.-Adelante 2.-No "));
        switch(op){
            case 1:
                JOptionPane.showMessageDialog(null,"Entras en la aren. \n Tu rival será ");
        }
        
        
        
    }
    public void escogerHeroe(){
        int op;
        
        op=Integer.parseInt(JOptionPane.showInputDialog("¿ Escoge a tu héroe ? \n 1.-Ranger 2.-No "));
        switch(op){
            case 1 :
              jugador = new HeroeArquero(500,170,10,8,"Ranger");
              JOptionPane.showMessageDialog(null,"Has escogido  : "+jugador.getNombre());
              JOptionPane.showMessageDialog(null,"Atributos del  "+jugador.toString());
              
    }
                
        
        
        
    }
    public void escogerRival(){
        int aux_eleccion = (int)(Math.random() * 1);
         int op;
        
        op=Integer.parseInt(JOptionPane.showInputDialog("¿ Entrar en la arena ? \n 1.-Adelante 2.-No "));
        switch(op){
        case 1:
                
                enemigo = new Ajax(300,150,30,0,"Ajax");
                JOptionPane.showMessageDialog(null,"Ha aparecido un rival : "+enemigo.getNombre());
                JOptionPane.showMessageDialog(null,"Atributos del  "+enemigo.toString());
                break;
        
        case 2 :
            enemigo = new ArchimagoRayx(250,350,10,3,"Archimago Rayx");
            JOptionPane.showMessageDialog(null,"Ha aparecido un rival : "+enemigo.getNombre());
            JOptionPane.showMessageDialog(null,"Atributos del "+enemigo.toString());
            
            
        
        
    }
    
}
}
