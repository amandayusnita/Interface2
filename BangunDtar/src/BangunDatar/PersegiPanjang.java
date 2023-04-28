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
public class PersegiPanjang extends BangunDatar implements Keliling, Simetri {
    public int panjang;
    public int lebar;
    
    @Override
    public double hitungLuas() {
        return this.panjang * this.lebar;
    }
    
    @Override
    public double hitungKeliling(){
        return 2 * (this.panjang + this.lebar);
    }
    
    @Override
    public double hitungSimPutar(){
        return 2.0;
    }
    
    @Override
    public double hitungSimLipat(){
        return 2.0;
    }
    
    @Override
    public void tampilHasil(){
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("Kelilingnya: " + this.hitungKeliling());
        System.out.println("Sim Lipat: " + this.hitungSimLipat());
        System.out.println("Sim Putar: " + this.hitungSimPutar());
    }
}
