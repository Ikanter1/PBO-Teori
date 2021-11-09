/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

/**
 *
 * @author LENOVO
 */
public class Manajer extends Pegawai{
    private int tunjangan;

    public Manajer(String nama, int tunjangan, int gaji) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }
    
    @Override
    public int getGaji() {
        return gaji;
    }
    
    
    public int getTunjangan() {
        return tunjangan;
    }
}
