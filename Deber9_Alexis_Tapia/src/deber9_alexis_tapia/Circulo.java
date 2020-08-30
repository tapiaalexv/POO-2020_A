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
public class Circulo extends FiguraBidimensional {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double obtenerArea() {
        return area = Math.pow(radio, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() + " Círculo: Area = " + String.format("%.2f",super.area);
    }

}
