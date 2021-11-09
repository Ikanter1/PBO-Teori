/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

/**
 *
 * @author LENOVO
 */
public class Programmer extends Pegawai{
    private int bonus;

    public Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public int getGaji() {
        return gaji;
    }
    
    
}
