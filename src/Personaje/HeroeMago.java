/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personaje;

import java.util.Random;

/**
 *
 * @author Sanny
 */
public class HeroeMago extends Personaje {
    int aleatorio;
    private Random rand = new Random(System.nanoTime());
    int salud,mana,danoFisico,danoMagico;
    String nombre;
    public HeroeMago(int salud, int mana, int danoFisico, int danoMagico, String nombre) {
        super(salud, mana, danoFisico, danoMagico, nombre);
        
    }
    public String getAtaque1(){
        return "Pulso arcano" ;
    }
    public String getAtaque2(){
        return "Fragmentos de hielo";
    }
    public String getAtaque3(){
        return "Pyroexplosion";
    }
    public String getAtaqueBasico(){
        return "Conjurar ";
    }
    @Override
    public int ataqueBasico() {
         aleatorio=rand.nextInt(10-15);
            return aleatorio+danoFisico;
    }

    @Override
    public int ataquePropio1() {
        mana=mana-35;
          aleatorio=rand.nextInt(20-35);
            return aleatorio+danoFisico;
    }

    @Override
    public int ataquePropio2() {
        mana=mana-40;
        int fragmentosAlea;
          fragmentosAlea=rand.nextInt(0-3);
          aleatorio=rand.nextInt(10-15);
            return aleatorio+fragmentosAlea+danoMagico;
    }

    @Override
    public int ataquePropio3() {
       mana=mana-60;
          aleatorio=rand.nextInt(70-95);
            return aleatorio+danoMagico;
    }
        public int recibirDaño(){
              salud =salud-aleatorio;
        return salud;
    }
    
}
