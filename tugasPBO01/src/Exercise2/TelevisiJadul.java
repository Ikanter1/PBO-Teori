/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2;

/**
 *
 * @author LENOVO
 */
public class TelevisiJadul extends Elektronik{
    private String modelInput = "DVI";

    public TelevisiJadul() {
        
    }

    public String getModelInput() {
        System.out.println("Nyalakan televisi jadul dengan input : "+modelInput);
        System.out.println(super.getVorltase());
        return null;
    }
}
