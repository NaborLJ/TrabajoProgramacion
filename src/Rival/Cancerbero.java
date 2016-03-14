/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rival;

import Rival.Rival;
import java.util.Random;

/**
 *
 * @author Sanny
 */
public class Cancerbero extends Rival {
    int aleatorio;
    private Random rand = new Random(System.nanoTime());
    int salud,mana,danoFisico,danoMagico;
    String nombre;
    public Cancerbero(int salud, int mana, int danoFisico, int danoMagico, String nombre) {
        super(salud, mana, danoFisico, danoMagico, nombre);
        this.salud=370;
        this.mana=200;
        this.danoFisico=5;
        this.danoMagico=5;
        this.nombre="Cancerbero";
        
    }
    public String getAtaque1(){
        return "Desgarrar" ;
    }
    public String getAtaque2(){
        return "Escupir lava";
    }
    public String getAtaque3(){
        return "Mordisco";
    }
    public String getAtaqueBasico(){
        return "Zarpa";
    }

    @Override
    public int ataqueBasico() {
        aleatorio=rand.nextInt(10-17);
            return aleatorio;
    }

    @Override
    public int ataquePropio1() {
         mana=mana-50;
        aleatorio=rand.nextInt(50-60);
            return aleatorio+danoFisico;
    }

    @Override
    public int ataquePropio2() {
         mana=mana-45;
        aleatorio=rand.nextInt(40-75);
            return aleatorio+danoMagico;
    }

    @Override
    public int ataquePropio3() {
         mana=mana-30;
        aleatorio=rand.nextInt(25-40);
            return aleatorio+danoMagico;
    }
     public int recibirDaño(int aleatorio){
        salud-=aleatorio;
        return salud ;
    }
    
}
