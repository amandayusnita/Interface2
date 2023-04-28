/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunDatar;

import Interfaces.*;
/**
 *
 * @author hp
 */
public class Lingkaran extends BangunDatar implements Keliling, Simetri{
    public int jejari;
    
    @Override
    public double hitungLuas(){
        return Math.PI * this.jejari * this.jejari;
    }
    
    @Override
    public double hitungKeliling(){
        return 2 * Math.PI * this.jejari;
    }
    @Override
    public double hitungSimLipat(){
        return  Double.POSITIVE_INFINITY;
    }
    
    @Override 
    public double hitungSimPutar(){
        return Double.POSITIVE_INFINITY;
    }
    
    @Override
    public void tampilHasil(){
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("Kelilingnya: " + this.hitungKeliling());
        System.out.println("Sim. Lipat: " + this.hitungSimLipat());
        System.out.println("Sim. Putar: " + this.hitungSimPutar());
    }
}
