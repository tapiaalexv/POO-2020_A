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
public class Esfera extends FiguraTridimensional {
    private double radio;

    public Esfera() {
    }

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    double obtenerVolumen() {
        return volumen = (4/3) * Math.PI * Math.pow(radio, 3);
    }

    @Override
    double obtenerArea() {
        return area = 4 * Math.PI * Math.pow(radio, 2);
    }
    
    @Override
    public String toString() {
        return super.toString()+" Esfera: Area = " + String.format("%.2f",super.area)+", Volumen = "+String.format("%.2f",super.volumen);
    }
    
}
