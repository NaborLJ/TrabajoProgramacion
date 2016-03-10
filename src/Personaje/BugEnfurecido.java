/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personaje;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class BugEnfurecido extends Rival {
    private int salud,mana,danoFisico,danoMagico;
    private Random rand = new Random(System.nanoTime());
    public BugEnfurecido(){
        super("Bug Enfurecido");
    }
    //Atributos
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int recibirDaño() {
        return super.recibirDaño(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDanoMagico() {
        return super.getDanoMagico(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDanoFisico() {
        return super.getDanoFisico(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getMana() {
        return super.getMana(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSalud() {
        return super.getSalud(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDanoMagico(int danoMagico) {
        super.setDanoMagico(danoMagico); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDanoFisico(int dañoFisico) {
        super.setDanoFisico(50); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMana(int mana) {
        super.setMana(90); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSalud(int salud) {
        super.setSalud(300); //To change body of generated methods, choose Tools | Templates.
    }
    public void setAtributos(){
      super.setSalud(300);
      super.setMana(150);
      super.setDanoFisico(60);
      super.setDanoMagico(40);
        
    }
    
    //Ataques
    public String getAtaque1(){
        return "Pos doy error" ;
    }
    public String getAtaque2(){
        return "Cabrear programador";
    }
    public String getAtaque3(){
        return "Pos sigo dando error xd";
    }
    
    @Override
    public int ataquePropio1() {
        int aleatorio;
        aleatorio=rand.nextInt(50-70);
            return aleatorio;
      //Ataque propio 1
    }

    @Override
    public int ataquePropio2() {
        int aleatorio;
        aleatorio=rand.nextInt(70-75);
            return aleatorio; //Ataque propio 2
    }

    @Override
    public int ataquePropio3() {
        int aleatorio;
        aleatorio=rand.nextInt(40-90);
            return aleatorio; //Ataque propio 3
    }

    
    }
    

