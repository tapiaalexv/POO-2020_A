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
public class EmpleadoComision extends Empleado {
    
    private final int sueldoBase=150;
    private final double porcentajeComision = 0.15;
    private double ventas;

    public EmpleadoComision(String nombre, String apellido, String seguro, double comision) {
        super(nombre, apellido, seguro);
        this.ventas = comision;
    }

    @Override
    public void calcularSueldo() {
        super.sueldo=sueldoBase+(porcentajeComision*ventas);
    }

    @Override
    public String toString() {
        return super.toString()+", Ventas Realizadas: " + ventas + ", Sueldo Semanal $"+String.format("%.2f", super.sueldo)+'\n';
    }  
    
    
}
