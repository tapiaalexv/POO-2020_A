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
public class Cuadrado extends FiguraBidimensional {

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double obtenerArea() {
        return area = Math.pow(lado, 2);
    }

    @Override
    public String toString() {
        return super.toString() + " Cuadrado: Area = " + String.format("%.2f",super.area);
    }
}
