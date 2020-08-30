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

public class TestRaton {
    
    //declarar una variable no estatica y analizar que sucede
    int algo;
    public static void main(String[] args) {
       Perro p1 = new Perro(4, "FIDO", "pastor", "M");
       System.out.println(p1.getNombre() +" "+ p1.genero+" "+p1.comer());
       System.out.print(p1.comer("croquetas", 20));
       System.out.println(p1.comer());
        
   //     Mascota m1 = new Mascota("Lola","F");
        p1.getNombre();
        p1.id = 154; //atributo definido en la clase SerVivo
        p1.id2 = 80; //atributo definido en la clase Animal
        System.out.println(p1.genero+" "+p1.getNombre()+p1.id); 
        
        Mascota m2 = new Perro(4, "FIDO", "pastor", "M");
        System.out.println(m2.comer());
        
    }
    
    
}

