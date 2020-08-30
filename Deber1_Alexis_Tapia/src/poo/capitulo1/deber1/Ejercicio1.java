/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.capitulo1.deber1;

import java.util.*;

/**
 *
 * @author tapia
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner numero = new Scanner(System.in);
        int cincoDigitos;
        boolean exito = false;
        
        int x = 2;
        int y = -2;
        x +=1;
        y = ++x;
        System.out.println("~~"+x+"\t"+y);
        
        

        do {

            System.out.print("Ingrese un numero de 5 digitos: ");
            cincoDigitos = numero.nextInt();
            
            /*
            int cont = 0;
            do{
                cincoDigitos=cincoDigitos/10;
                cont++;
            }while(cincoDigitos != 0);
            */ /*Otra forma para tener el total de digitos*/
            
            if (Integer.toString(cincoDigitos).length() == 5) {
                String separaciones;
                separaciones=Integer.toString(cincoDigitos);
                System.out.println(separaciones.charAt(0)+"   "+separaciones.charAt(1)+"   "+separaciones.charAt(2)+"   "+
                        separaciones.charAt(3)+"   "+separaciones.charAt(4));
                exito=true;
            } else {
                System.out.print("\nIncorrecto! *Debe ser un numero de cinco digitos*\n\n");
            }
            
        } while (exito != true);

    }

}
