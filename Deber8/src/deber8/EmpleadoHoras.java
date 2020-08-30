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
public class EmpleadoHoras extends Empleado{
    
    private int horasTrabajadas;
    private final double precioHora = 4.5;
    
    public EmpleadoHoras(String nombre, String apellido, String seguro, int horas) {
        super(nombre, apellido, seguro);
        this.horasTrabajadas = horas;
    }
    
    @Override
    public void calcularSueldo() {
        super.sueldo=horasTrabajadas*precioHora;
    }

    @Override
    public String toString() {
        return super.toString()+", Horas Trabajadas: " + horasTrabajadas + ", Sueldo Semanal $"+super.sueldo+'\n';
    }  
    
    
}
