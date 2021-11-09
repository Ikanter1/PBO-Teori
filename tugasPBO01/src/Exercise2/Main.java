/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[]args){
        Manusia rony = new Manusia();
        TelevisiJadul jadul = new TelevisiJadul();
        TelevisiModern modern = new TelevisiModern();
        
        rony.nyalakanPerangkat(jadul);
        rony.nyalakanPerangkat(modern);
    }
}
