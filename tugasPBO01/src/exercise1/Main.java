/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[]args){
        Manajer m = new Manajer("Rony", 800, 50);
        Programmer pro = new Programmer("Dul", 600, 30);
        Bayaran b = new Bayaran();
        
        System.out.println("Bayaran Manajer : "+ b.hitungBayaran(m));
        System.out.println("Bayaran Programmer : "+ b.hitungBayaran(pro));
    }
}
