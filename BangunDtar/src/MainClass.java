/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import BangunDatar.*;
/**
 *
 * @author hp
 */
public class MainClass {
    public static void main(String[] args) {
        System.out.println("Lingkaran");
        Lingkaran l1 = new Lingkaran();
        l1.jejari = 19;
        l1.tampilHasil();
        
        System.out.println("");
        System.out.println("Persegi");
        Persegi P1 = new Persegi();
        P1.sisi = 5;
        P1.tampilHasil();
        
        System.out.println("");
        System.out.println("Persegi Panjang");
        PersegiPanjang PL = new PersegiPanjang();
        PL.panjang = 2;
        PL.lebar = 3;
        PL.tampilHasil();
        
        System.out.println("");
        System.out.println("Segitiga");
        Segitiga S = new Segitiga();
        S.alas = 5;
        S.tinggi = 2;
        S.tampilHasil();
    }
}
