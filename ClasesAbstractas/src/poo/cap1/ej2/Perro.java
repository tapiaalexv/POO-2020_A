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
public class Perro extends Mascota{
    private int edad;
    private String raza;
    
    public Perro (){
        //System.out.println("Entrando al constructor vacío de la SUBCLASE");
    }

    public Perro(int edad, String nombre, String genero, String raza) {
        super(nombre, genero);
        this.edad = edad;
        this.raza = raza;
       // System.out.println("Entrando al constructor con edad de la SUBCLASE");
    }

     //sobrecarga
    public String comer (String tipo, int cantidad ){
        return super.comer()+" "+cantidad+" "+tipo;
    }
    
    @Override
    public String comer (){
        return "perrito comiendo";
    }
    
    //sobrecarga
    private String comer (int a){
        return " cantidad "+a;
    }

    @Override
    public String saludar(){
        return "guau guau guau";
    }
    
    public void sms2(int a){
        
    }
    
    protected void sms2(){ 
        
    }

}



