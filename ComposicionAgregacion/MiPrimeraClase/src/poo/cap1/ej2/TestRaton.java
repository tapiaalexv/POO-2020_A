/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cap1.ej2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marcela
 */

public class TestRaton {

    public static void main(String[] args) {
        TiendaMascota miTiendita = new TiendaMascota();
        miTiendita.setNombre("ABC");
        //en agregación los objetos NO SON ANÓNIMOS y se pueden compartir
        Fecha f1 = new Fecha(12, 05, 2000);
        Fecha f2 = new Fecha(20, 07, 2020);
        //agregacion dos ratones comparten la misma fecha de nacimiento f1
        /*agregacion dos ratones comparten la misma fecha de nacimiento f2 y esa fecha
        es la misma fecha de fundación de la tienda
        */
        //en composición los objetos son anónimos y exclusivos
        
        miTiendita.agregarRaton(new Raton("Pepito", 7, 7, f1));
        miTiendita.agregarRaton(new Raton("Pepe", 4, 15, f2));
        miTiendita.agregarRaton(new Raton("Lola", 1, 10, f2));
        
        miTiendita.setFechaFundacion(f1);
        miTiendita.agregarRaton(new Raton("Jaq", 2, 20, f1));
        System.out.println("Mi tiendita fue fundada el "+miTiendita.getFechaFundacion());
    
        //Uso del for mejorado para presentar los ratones
        for(Raton r: miTiendita.getRatones())
            System.out.println(r);
        
        
       
    }
}
