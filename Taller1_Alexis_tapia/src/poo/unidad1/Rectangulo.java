/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad1;

import java.nio.channels.AsynchronousServerSocketChannel;

/**
 *
 * @author tapia
 */
public class Rectangulo {
    
    private double longitud;
    private double anchura;
    
    public Rectangulo(){
        this.longitud = 0.1+(Math.random()*500);
        this.anchura = 0.1+(Math.random()*500);
    } 
    
    public Rectangulo(double longitud, double anchura){
       this.longitud = longitud;
       this.anchura = anchura;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }
    
    public boolean esCuadrado(){
        return this.anchura==this.longitud;
        
    }
    
}
