/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cap1.ej2;

/**
 *
 * @author Marcela
 */
public abstract class Animal extends SerVivo {
    protected int id2;
    
    public String sms (){
        return "AB ";
    }
    
    public String comer (){
        
        return "Animal comiendo";
    }
    
    public abstract String saludar ();
    
}
