/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber9_alexis_tapia;

/**
 *
 * @author tapia
 */
public class Triangulo extends FiguraBidimensional{
    
    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
        
    @Override
    double obtenerArea() {
        return area=(base*altura)/2;
    }
    
    @Override
    public String toString() {
        return super.toString()+" Triángulo: Area = "+ String.format("%.2f",super.area);
    }
    
}
