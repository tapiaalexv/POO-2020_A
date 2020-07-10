/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.javabean;

/**
 *
 * @author tapia
 */
public class CirculoBean implements java.io.Serializable{
    
    private double radio;
    private double diametro;
    private double area;

    public CirculoBean() {
    }

    public CirculoBean(double radio) {
        //setRadio(radio);
        //setDiametro(radio*2);
        //setArea(Math.PI*Math.pow(radio,2));
        this.radio = radio;
        this.diametro = radio*2;
        this.area = Math.PI*Math.pow(radio,2);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
    
    
}
