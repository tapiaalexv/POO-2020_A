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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i; //Variable auxiliar para recorrer for()
        int contPositivos = 0;
        int contNegativos = 0;
        int contCeros = 0;
        double[] cincoEnteros = new double[5];
        Scanner enteros = new Scanner(System.in);
        
        for(i=0;i<5;i++){
            System.out.printf("Ingrese el %d numero: ",i+1);
            cincoEnteros[i] = enteros.nextDouble();
            if(cincoEnteros[i]<0){
                contNegativos++;
            }else if(cincoEnteros[i]>0){
                contPositivos++;
            }else if(cincoEnteros[i]==0){
                contCeros++;
            }
        }           
                
        System.out.println("\nTotal Numeros Positivos: "+contPositivos+"\n");
                        
        System.out.println("\nTotal Numeros Negativos: "+contNegativos+"\n");
        
        System.out.println("\nTotal Ceros: "+contCeros+"\n");
        
    }

}
