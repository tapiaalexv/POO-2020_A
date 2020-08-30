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
public class Cubo extends FiguraTridimensional {

    private double lado;

    public Cubo() {
    }

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    double obtenerVolumen() {
        return volumen = Math.pow(lado, 3);
    }

    @Override
    double obtenerArea() {
        return area = 6 * Math.pow(lado, 2);
    }   

    @Override
    public String toString() {
        return super.toString()+" Cubo: Area = " + String.format("%.2f",super.area)+", Volumen = "+String.format("%.2f",super.volumen);
    }
    
    

}
