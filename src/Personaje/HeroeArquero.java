/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personaje;

import java.util.Random;

/**
 *
 * @author Nabor
 */
public class HeroeArquero extends Personaje{
    int aleatorio;
    private Random rand = new Random(System.nanoTime());
    int salud,mana,danoFisico,danoMagico;
    String nombre;
    public HeroeArquero(int salud, int mana, int danoFisico, int danoMagico, String nombre) {
        super(salud, mana, danoFisico, danoMagico, nombre);
        this.salud=500;
        this.mana=180;
        this.danoFisico=10;
        this.danoMagico=8;
        this.nombre="Ranger";
    }
 public String getAtaque1(){
        return "Flecha certera" ;
    }
    public String getAtaque2(){
        return "Flecha venenosa";
    }
    public String getAtaque3(){
        return "Disparo doble";
    }
    public String getAtaqueBasico(){
        return "Disparo doble";
    }
    @Override
    public int ataqueBasico() {
       aleatorio=rand.nextInt(10-17);
            return aleatorio;
    }

    @Override
    public int ataquePropio1() {
        mana=mana-45;
       aleatorio=rand.nextInt(50-60);
            return aleatorio;
    }

    @Override
    public int ataquePropio2() {
        mana=mana-60;
       aleatorio=rand.nextInt(38-42);
            return aleatorio+danoFisico+danoMagico;
    }

    @Override
    public int ataquePropio3() {
        mana=mana-35;
       aleatorio=rand.nextInt(10-17);
            return aleatorio+(danoFisico*2);
    }
    public int recibirDaño(int aleatorio){
       salud-=aleatorio;
        return salud ;
    }
    
}
