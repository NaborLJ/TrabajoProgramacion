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
 * @author Nabor
 */
public class ArchimagoRayx extends Rival{
    int aleatorio;
    private Random rand = new Random(System.nanoTime());
    int salud,mana,danoFisico,danoMagico;
    String nombre;
    public ArchimagoRayx(int salud, int mana, int danoFisico, int danoMagico, String nombre) {
        super(salud, mana, danoFisico, danoMagico, nombre);
        this.salud=250;
        this.mana=300;
        this.danoMagico=10;
        this.danoFisico=3;
        this.nombre="Archimago Rayx";
    }
    
     //Ataques
    public String getAtaque1(){
        return "Lanzada electrica" ;
    }
    public String getAtaque2(){
        return "Ventisca";
    }
    public String getAtaque3(){
        return "Pirofrío";
    }
    public String getAtaqueBasico(){
        return "Golpe de bastón";
    }
            
    @Override
    public int ataquePropio1() {
         
         mana=mana-50;
        aleatorio=rand.nextInt(50-70);
            return aleatorio+danoMagico;
      
    }

    @Override
    public int ataquePropio2() {
        
         mana=mana-70;
        aleatorio=rand.nextInt(30-85);
            return aleatorio+danoMagico;
     
    }

    @Override
    public int ataquePropio3() {
      
         mana=mana-20;
        aleatorio=rand.nextInt(25-35);
            return aleatorio+danoMagico;
     
    }

    @Override
    public int ataqueBasico() {
        //Se le suma el ataque Fisico al ataque basico de los tipo mago
        //debido al cosumo de mana
        
         aleatorio=rand.nextInt(10-15);
            return aleatorio+danoFisico;
            
    }
    public int recibirDaño(){
        salud=salud-aleatorio;
        return salud ;
    }
    
}
