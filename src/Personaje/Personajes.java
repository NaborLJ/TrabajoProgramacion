/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personaje;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author AAron
 */
public class Personajes {
    private int salud,mana,dañoFisico,dañoMagico;
    private String clase;
    String mago="mago" ,arquero="arquero",guerrero="guerrero" ;
    private Random rand = new Random(System.nanoTime());

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }
     
    public int getSalud() {
        System.out.println("Tu salud es de" +salud);
        return salud;
    }

    public int getDañoFisico() {
        return dañoFisico;
    }

    public int getDañoMagico() {
        return dañoMagico;
    }

    public String getClase() {
        return clase;
    }

    public void setSalud() {
        while(clase.mago){
            salud=450;
        }
        while(clase==arquero){
            salud=500;
        }
        while(clase==guerrero){
            salud=540;
        }
            
    }

    public void setDañoFisico(int dañoFisico) {
        this.dañoFisico = dañoFisico;
    }

    public void setDañoMagico(int dañoMagico) {
        this.dañoMagico = dañoMagico;
    }

    public void setClase() {
        int op;
        
        op=Integer.parseInt(JOptionPane.showInputDialog("Seleccione clase \n 1.-Mago \n 2.-Arquero \n 3.-Guerrero"));
        switch(op){
            case 1 :
              this.clase=mago;
              
              break;
            case 2 :
                this.clase=arquero;
                
                break;
            case 3 :
                this.clase=guerrero;
                break;
            
        }
        JOptionPane.showMessageDialog(null,"Has escogido "+clase);
    }
    
    //ataques
    
    public int ataque_fisicoBasico(){
        int aleatorio;
        if(clase==mago){
            aleatorio=rand.nextInt(20-30);
            return aleatorio;
        }
        else if(clase==arquero){
        aleatorio=rand.nextInt(20-45);
        return aleatorio;
    }
        else if(clase==guerrero){
            aleatorio=rand.nextInt(35-50);
            return aleatorio;
        }
        else
            return 0;
    }
    public int ataque_magicoBasico(){
        //Resta un 5% de mana
        int aleatorioMagico;
       while(clase==mago){
           
        if(mana > 0){
            aleatorioMagico=rand.nextInt(25-70);
            mana=(int) (mana*0.95);
            return aleatorioMagico;
        }else
            return 0;
    
       }
        while(clase==arquero){
            if(mana>0){
                aleatorioMagico=rand.nextInt(20-40);
                mana=(int) (mana*0.95);
                return aleatorioMagico;
            }else
                return 0;  
        }
        while(clase==guerrero){
            if(mana>0){
                aleatorioMagico=rand.nextInt(20-30);
                mana=(int)(mana*0.95);
            }
        }
        return 0;
}
    public void recibirDaño(int salud){
        this.salud -=salud;
    }
}
