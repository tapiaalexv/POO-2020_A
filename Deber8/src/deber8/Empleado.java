/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber8;

/**
 *
 * @author tapia
 */
public class Empleado {
    
    protected String nombre;
    protected String apellido;
    protected String seguro;
    protected double sueldo;

    public Empleado(String nombre, String apellido, String seguro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.seguro = seguro;
    }
    
    public void calcularSueldo(){
        //hacer Override
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ", N° Seguro: " + seguro;
    }
    
}
