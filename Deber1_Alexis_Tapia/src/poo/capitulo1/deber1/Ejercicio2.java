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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        System.out.println("numero\t\tcuadrado\tcubo");
        for(i=0;i<=10;i++){
            int cuadrado,cubo;
            cuadrado=(int) Math.pow(i,2);
            cubo=(int) Math.pow(i,3);
            System.out.println(i+"\t\t"+cuadrado+"\t\t"+cubo);
        }
    }
    
}
