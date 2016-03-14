package Personaje;



import Inventario.Inventario;
import Inventario.Objetos;
import Inventario.PocionMana;
import Inventario.PocionSalud;
import Rival.Cancerbero;
import Rival.ArchimagoRayx;
import Rival.Ajax;
import Personaje.Personajes;
import Rival.Rival;
import java.util.ArrayList;
import java.util.Random;
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
    private Random rand = new Random(System.nanoTime());
    ArrayList <Objetos> inventario = new ArrayList();
    private Personaje jugador;
    private Rival enemigo;
    private Inventario mochila;
    public void escogerEnMochila(){
        int op;
        do{
        op=Integer.parseInt(JOptionPane.showInputDialog("¿Que accion desea hacer? \n 1.-Comprar \n 2.-Mostrar mochila \n 3.-Cancelar"));
        switch(op){
            case 1 :
                int aux = 0;
                do{
                int res;
                
                 res=Integer.parseInt(JOptionPane.showInputDialog("Que deseas comprar \n 1.-Pocion de salud \n 2.-Pocion de mana \n 3.-Cancelar"));
                switch(res){
                    case 1 :
                        inventario.add(new PocionSalud());
                        JOptionPane.showMessageDialog(null,"Has comprado una pocion de salud");
                        aux++;
                        break;
                    case 2 :
                        inventario.add(new PocionMana());
                        JOptionPane.showMessageDialog(null,"Has comprado una pocion de mana");
                        aux++;
                        break;
                    case 3 :
                        JOptionPane.showMessageDialog(null,"Cancelando compras");
                        break;
                }
                }while(aux<4);
                break;
               
                
            case 2 :
                String acumulador="";
        JOptionPane.showMessageDialog(null,"Tienes: " + inventario.size() + " Pociones");
        
        for (int i = 0; i < inventario.size(); i++) {
            
            acumulador=acumulador+" " +inventario.get(i).toString()+"\n";
           
        } JOptionPane.showMessageDialog(null,acumulador);
    
        
                break;
            case 3 :
                JOptionPane.showMessageDialog(null,"Cancelado");
                break;
       
        } 
        
        }while(op!=3);
        }

    public void comenzarBatalla(){
        
        int op;
        
       /* op=Integer.parseInt(JOptionPane.showInputDialog("¿ Entrar en la arena ? \n 1.-Adelante 2.-Cancelar "));
        switch(op){
            case 1:*/
                JOptionPane.showMessageDialog(null,"Entras en la arena.");
                escogerHeroe();
                escogerRival();
                do{
                    misOpciones();
                    if(enemigo.getSalud()>0){
                opcionesEnemigo();
                JOptionPane.showMessageDialog(null,enemigo.toString());
                    }else{
                    JOptionPane.showMessageDialog(null,"Has vencido a "+enemigo.getNombre());
                        }
                    if(jugador.getSalud()>0){
                        JOptionPane.showMessageDialog(null,jugador.toString());
                    }else{
                        JOptionPane.showMessageDialog(null,enemigo.getNombre()+" Te ha derrotado ");
                        
                    }
                }while(jugador.getSalud()>0 && enemigo.getSalud()>0);
           /* case 2:
                JOptionPane.showMessageDialog(null,"Cancelado programa");
                break; */
        }
        
        
        
    
    public void misOpciones(){
        int op;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("Elige un ataque \n1.-"+jugador.ataqueBasico()+"\n2.-"+jugador.ataquePropio1()+"\n3.-"+jugador.ataquePropio2()+"\n4.-"+jugador.ataquePropio3()+"\n5.-Inventario"));
        }while(op<1 || op>5);
            switch(op){
              case 1 :
                  
                  enemigo.recibirDaño(jugador.ataqueBasico());
                  JOptionPane.showMessageDialog(null,"Has usado "+jugador.ataqueBasico());
                  break;
              case 2 :
                  enemigo.recibirDaño(jugador.ataquePropio1());
                  JOptionPane.showMessageDialog(null,"Has usado "+jugador.ataquePropio1());
                  break;
              case 3 :
                  enemigo.recibirDaño(jugador.ataquePropio2());
                  JOptionPane.showMessageDialog(null,"Has usado "+jugador.ataquePropio2());
                  break;
              case 4 :
                  enemigo.recibirDaño(jugador.ataquePropio3());
                  JOptionPane.showMessageDialog(null,"Has usado "+jugador.ataquePropio3());
                  break;
              case 5 :
                  //Espacio reservado para uso de inventario;
                  break;
          }
    }
    
    public void opcionesEnemigo(){
         int op;
        do{
            op = (int) (Math.random() * 4)+1;
          switch(op){
              case 1 :
                  jugador.recibirDaño(enemigo.ataqueBasico());
                  JOptionPane.showMessageDialog(null,enemigo.getNombre()+" ha usado "+enemigo.ataqueBasico());
                  break;
              case 2 :
                  jugador.recibirDaño(enemigo.ataquePropio1());
                  JOptionPane.showMessageDialog(null,enemigo.getNombre()+" ha usado "+enemigo.ataquePropio1());
                  break;
              case 3 :
                  jugador.recibirDaño(enemigo.ataquePropio2());
                  JOptionPane.showMessageDialog(null,enemigo.getNombre()+" ha usado "+enemigo.ataquePropio2());
                  break;
              case 4 :
                  jugador.recibirDaño(enemigo.ataquePropio3());
                  JOptionPane.showMessageDialog(null,enemigo.getNombre()+" ha usado "+enemigo.ataquePropio3());
                  break;
    }
        }while(op<1 || op>4);
    }
          
    public void escogerHeroe(){
        int op;
        
        op=Integer.parseInt(JOptionPane.showInputDialog("¿ Escoge a tu héroe ? \n 1.-Ranger \n 2.-Caballero \n 3.-Mago \n 4.-Cancelar "));
        switch(op){
            case 1 :
              jugador = new HeroeArquero(500,170,10,8,"Ranger");
              JOptionPane.showMessageDialog(null,"Has escogido  : "+jugador.getNombre());
              JOptionPane.showMessageDialog(null,"Atributos del  "+jugador.toString());
              break;
              
            case 2 :
                jugador= new HeroeGuerrero(550,150,12,0,"Caballero");
                 JOptionPane.showMessageDialog(null,"Has escogido  : "+jugador.getNombre());
                    JOptionPane.showMessageDialog(null,"Atributos del  "+jugador.toString());
                 break;
              
            case 3:
                jugador= new HeroeMago(450,300,5,10,"Mago");
                 JOptionPane.showMessageDialog(null,"Has escogido  : "+jugador.getNombre());
                 JOptionPane.showMessageDialog(null,"Atributos del  "+jugador.toString());
                 break;
            case 4:
                JOptionPane.showMessageDialog(null,"Cancelada la elección de Heroe");
                break;
    }
                
        
        
        
    }
    public void escogerRival(){
        int aux_opcion = (int)(Math.random() * 3)+1;
        
        switch(aux_opcion){
        case 1:
                
                enemigo = new Ajax(300,150,30,0,"Ajax");
                JOptionPane.showMessageDialog(null,"Ha aparecido un rival : "+enemigo.getNombre());
                JOptionPane.showMessageDialog(null,"Atributos del  "+enemigo.toString());
                break;
        
        case 2 :
            enemigo = new ArchimagoRayx(250,350,10,3,"Archimago Rayx");
            JOptionPane.showMessageDialog(null,"Ha aparecido un rival : "+enemigo.getNombre());
            JOptionPane.showMessageDialog(null,"Atributos del "+enemigo.toString());
            break;
            
        case 3 :
            enemigo= new Cancerbero(370,200,5,5,"Cancerbero");
            JOptionPane.showMessageDialog(null,"Ha aparecido un rival : "+enemigo.getNombre());
            JOptionPane.showMessageDialog(null,"Atributos del "+enemigo.toString());
            break;
        
        
    }
    
}
}
