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
public class Persegi extends BangunDatar implements Keliling, Simetri {
    public int sisi;
    
    @Override
    public double hitungLuas(){
        return this.sisi * this.sisi;
    }
    
    @Override
    public double hitungKeliling(){
        return 4 * this.sisi;
    }
    
    @Override
    public double hitungSimPutar(){
        return 4.0;
    }
    
    @Override
    public double hitungSimLipat(){
        return 4.0;
    }
    
    @Override
    public void tampilHasil(){
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("Kelilingnya: " + this.hitungKeliling());
        System.out.println("Sim Lipat: " + this.hitungSimLipat());
        System.out.println("Sim Putar: " + this.hitungSimPutar());
    }
}
