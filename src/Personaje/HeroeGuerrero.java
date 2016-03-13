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
public class HeroeGuerrero extends Personaje {
    int aleatorio;
    private Random rand = new Random(System.nanoTime());
    int salud,mana,danoFisico,danoMagico;
    String nombre;
    public HeroeGuerrero(int salud, int mana, int danoFisico, int danoMagico, String nombre) {
        super(salud, mana, danoFisico, danoMagico, nombre);
    }
    public String getAtaque1(){
        return "Embestir" ;
    }
    public String getAtaque2(){
        return "Golpe con escudo";
    }
    public String getAtaque3(){
        return "Ejecutar";
    }
    public String getAtaqueBasico(){
        return "Espadazo";
    }
    @Override
    public int ataqueBasico() {
         aleatorio=rand.nextInt(10-18);
            return aleatorio;
    }

    @Override
    public int ataquePropio1() {
          mana=mana-45;
          aleatorio=rand.nextInt(30-45);
            return aleatorio+danoFisico;
    }

    @Override
    public int ataquePropio2() {
       mana=mana-25;
          aleatorio=rand.nextInt(30-35);
            return aleatorio+danoFisico;
    }

    @Override
    public int ataquePropio3() {
        mana=mana-75;
          aleatorio=rand.nextInt(70-90);
            return aleatorio+danoFisico;
    }
     public int recibirDaño(){
              salud=salud-aleatorio;
        return salud;
    }
    }
    

