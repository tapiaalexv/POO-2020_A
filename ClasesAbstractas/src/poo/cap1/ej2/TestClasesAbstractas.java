package poo.cap1.ej2;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcela
 */
public class TestClasesAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro p = new Perro();
        System.out.println(p.saludar());
        Animal a = new Perro();
        System.out.println(a.comer()); //??
        
        //Animal a1 = new Animal(); //creando una instancia de animal , NO SE PUEDE
        Animal animales[]= new Animal [3]; //
        animales[0]=p;
        animales[1]=new Raton(5, 5);
        animales[2]= new Raton();
        
        for(Animal a1: animales)
            System.out.println(a1.saludar()+" "+a1.sms());
        
        ((Raton)animales[1]).crecer();
        
    }
    
}
