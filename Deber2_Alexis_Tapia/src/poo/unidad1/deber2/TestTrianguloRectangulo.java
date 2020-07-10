/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad1.deber2;

import java.util.*;

/**
 *
 * @author tapia
 */
public class TestTrianguloRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo();
        
        Scanner datos = new Scanner (System.in);
        
        double cateto1,cateto2;
        
        System.out.print("Ingre el valor del Cateto 1: ");
        cateto1 = datos.nextDouble();
        trianguloRectangulo.setCateto1(cateto1);
        
        System.out.print("\nIngre el valor del Cateto 2: ");
        cateto2 = datos.nextDouble();
        trianguloRectangulo.setCateto2(cateto2);
        
        trianguloRectangulo.calcularHipotenusa();
        trianguloRectangulo.calcularPerimetro();
        trianguloRectangulo.calcularArea();
        
        System.out.print("\n"+trianguloRectangulo.toString()+"\n");        
        
    }
    
}
