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
public abstract class Mascota extends Animal{
    private String nombre;
    protected String genero;   
    
    public Mascota (){
        //System.out.println("Entrando al constructor vacío de la SUPERCLASE");
    }

    public Mascota(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
       // System.out.println("Entrando al constructor con datos de la SUPERCLASE");
    }
    
    public String comer() {
        return "Mascota comiendo ";
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String sms (String a){
        
        return "123";
    }
    
    abstract void sms2(); //default 
    
}







