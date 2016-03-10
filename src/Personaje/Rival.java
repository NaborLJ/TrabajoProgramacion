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
public abstract class Rival {
    private int salud,mana,danoFisico,danoMagico;
    String nombre;
    private Random rand = new Random(System.nanoTime());

    public Rival(String nombre) {
       
        this.nombre = nombre;
    }
    
    
    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setDanoFisico(int dañoFisico) {
        this.danoFisico = dañoFisico;
    }

    public void setDanoMagico(int danoMagico) {
        this.danoMagico = danoMagico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public int getMana() {
        return mana;
    }

    public int getDanoFisico() {
        return danoFisico;
    }

    public int getDanoMagico() {
        return danoMagico;
    }

    public String getNombre() {
        return nombre;
    }
        //Ataques
     public abstract int ataquePropio1();
    public abstract int ataquePropio2();
    public abstract int ataquePropio3();
    
    public int NavajasoWey(){
        int aleatorio;
        aleatorio=rand.nextInt(20-30);
            return aleatorio;
    
    }
    public int recibirDaño(){
        this.salud -=salud;
        return salud;
    }

    @Override
    public String toString() {
        return "Rival{" + "salud=" + salud + ", mana=" + mana + ", danoFisico=" + danoFisico + ", danoMagico=" + danoMagico + ", nombre=" + nombre + '}';
    }

  
   
    
    
    

    
}
