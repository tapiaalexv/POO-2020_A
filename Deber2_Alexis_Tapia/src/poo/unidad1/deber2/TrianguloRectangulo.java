/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad1.deber2;

/**
 *
 * @author tapia
 */
public class TrianguloRectangulo {
    
    private double cateto1;
    private double cateto2;
    private double hipotenusa;
    private double area;
    private double perimetro;

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }
    
    public void calcularHipotenusa(){
        this.hipotenusa = Math.sqrt(Math.pow(this.cateto1,2)+Math.pow(this.cateto2,2));
    }
    
    public void calcularPerimetro(){
        this.perimetro = this.cateto1+this.cateto2+this.hipotenusa;
    }
    
    public void calcularArea(){
        this.area = (this.cateto1 * this.cateto2)/2;
    }
    
    
 
    @Override
    public String toString() {
        return "TrianguloRectangulo{" + "Cateto1 = " + cateto1 + ", Cateto2 = " + cateto2 + ", Hipotenusa = " + String.format("%.2f", hipotenusa) + ", Area = " + String.format("%.2f",area) + ", Perimetro = " + String.format("%.2f",perimetro) + '}';
    }
    
    
    
}
