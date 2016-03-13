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
 * @author Usuario
 */
public class Ajax extends Rival {
    private int salud,mana,danoFisico,danoMagico;
    String nombre;
    private Random rand = new Random(System.nanoTime());
    
    public Ajax(int salud, int mana, int danoFisico, int danoMagico, String nombre) {
        super(salud, mana, danoFisico, danoMagico, nombre);
        this.salud = 300;
        this.mana = 150;
        this.danoFisico = 10;
        this.danoMagico =0;
        this.nombre = "Ajax";
    }
    //Ataques
    public String getAtaque1(){
        return "Empalar" ;
    }
    public String getAtaque2(){
        return "Golpe Mortal";
    }
    public String getAtaque3(){
        return "Arremetida Enfurecida";
    }
    
    @Override
    public int ataquePropio1() {
        int aleatorio;
        aleatorio=rand.nextInt(50-70);
        mana=mana-30;
            return aleatorio+danoFisico;
      //Ataque propio 1
    }

    @Override
    public int ataquePropio2() {
        int aleatorio;
        aleatorio=rand.nextInt(70-75);
        mana=mana-40;
            return aleatorio+danoFisico; //Ataque propio 2
    }

    @Override
    public int ataquePropio3() {
        int aleatorio;
        aleatorio=rand.nextInt(40-90);
        mana=mana-20;
            return aleatorio+danoFisico; //Ataque propio 3
    }

    @Override
    public int ataqueBasico() {
        int aleatorio;
         aleatorio=rand.nextInt(10-15);
            return aleatorio;
            //Ataque Basico
    }
     public int recibirDaño(){
        salud=salud-aleatorio;
        return salud ;
    }
    
    }
    

