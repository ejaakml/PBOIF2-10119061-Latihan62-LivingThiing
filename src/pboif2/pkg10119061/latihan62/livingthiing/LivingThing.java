/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan62.livingthiing;

/**
 *
 * @author Rheiza
 
 * NAMA : Rheiza Akmal R
 * KELAS : IF 2
 * NIM : 10119061
 * DESKRIPSI : Living Thing
 */
public abstract class LivingThing {
    public abstract void walk(String nama);
    
    public void breath(String nama) {
        System.out.println(nama + " Bernafas");
    }    
    
    public void eat(String nama) {
        System.out.println(nama + " Makan");
    }    
}
