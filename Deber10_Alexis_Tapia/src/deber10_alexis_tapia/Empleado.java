/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber10_alexis_tapia;

/**
 *
 * @author tapia
 */
public abstract class Empleado{
    
    protected String nombre;
    protected String apellido;
    protected double sueldo;

    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public abstract double calcularPago();

    @Override
    public String toString() {
        return "Nombre= " + nombre + ", Apellido= " + apellido + " -> ";
    }
    
    
}
