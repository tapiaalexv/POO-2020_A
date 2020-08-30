/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tapia
 */
public abstract class Deportista {
    protected String nombre;
    protected double gananciasTotales;
    abstract double calcularGanancias();

    @Override
    public String toString() {
        return "Deportista -> "+nombre+ " es un: ";
    }
        
}
