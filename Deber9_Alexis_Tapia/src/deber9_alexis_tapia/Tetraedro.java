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
public class Tetraedro extends FiguraTridimensional {

    private double lado;

    public Tetraedro() {
    }

    public Tetraedro(double lado) {
        this.lado = lado;
    }
    
    @Override
    double obtenerVolumen() {
        return volumen = (Math.pow(lado, 2)*Math.sqrt(3))/12;
    }

    @Override
    double obtenerArea() {
        return area = Math.pow(lado, 2)* Math.sqrt(3);
    }
    
    @Override
    public String toString() {
        return super.toString()+" Tetraedro: Area = " + String.format("%.2f",super.area)+", Volumen = "+String.format("%.2f",super.volumen);
    }

}
