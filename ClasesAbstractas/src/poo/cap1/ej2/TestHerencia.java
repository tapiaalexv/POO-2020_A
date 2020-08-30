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
public class TestHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro p1 = new Perro(10, "Lula", "F", "poodle");

        Animal misMascotas[] = new Mascota[4];

        misMascotas[0] = p1;
        misMascotas[1] = new Raton(5, 3);
        misMascotas[2] = new Perro(5, "Jaq", "M", "s/r");
//        misMascotas[3] = new Mascota("Lola", "F");

        Mascota m1 = new Perro(8, "PP", "M", "poodle");
        //Ejecutar el metodo comer(2) ;
     
       // p2.comer(2);
        
        //Ejecutar el metodo comer (croquetas, 3)
     //   System.out.println( p2.comer("croquetas", 3));
        
        for (Animal m : misMascotas) {
            System.out.println(m.comer());
            if ( m instanceof Raton){
               Raton r = (Raton) m;
                r.crecer();
                
               // ((Raton)m).crecer();
        }
           
        }

        
        
        

        /*System.out.println(p1.comer());
        System.out.println(p1.sms());
        System.out.println(p1.sms("Hola"));
        
        SerVivo s1 = new SerVivo();
      System.out.println(s1.sms());
        
        Mascota m1 = new Perro();
        System.out.println(m1.comer());
        
        SerVivo s2 = new Animal ();
        System.out.println(s2.sms());*/
    }
}
