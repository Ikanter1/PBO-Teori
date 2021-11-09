/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

/**
 *
 * @author LENOVO
 */
public class Bayaran {
    public int hitungBayaran(Pegawai pg){
        int uang = pg.getGaji();
        
        if(pg instanceof Manajer){
            uang += ((Manajer)pg).getTunjangan();
        }
        else if(pg instanceof Manajer){
            uang +=((Programmer)pg).getBonus();
        }
        return uang;
    }
}
