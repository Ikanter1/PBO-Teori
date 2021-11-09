/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2;

/**
 *
 * @author LENOVO
 */
public abstract class Elektronik {
    protected int vorltase = 220;
    
    public Elektronik(){
        
    }

    public int getVorltase() {
        System.out.print("Voltase televisi : ");
        return vorltase;
    }
    
    public abstract String getModelInput();
}
