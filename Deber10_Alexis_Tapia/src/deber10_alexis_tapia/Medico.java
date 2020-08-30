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
public class Medico extends Empleado{
    
    private String codigo;
    private double tarifa;
    private double horasExtras;

    public Medico(String nombre, String apellido, String codigo, double tarifa, double horasExtras) {
        super(nombre, apellido);
        this.codigo = codigo;
        this.tarifa = tarifa;
        this.horasExtras = horasExtras;
    }
    
    @Override
    public double calcularPago() {
        return sueldo = (40*tarifa) + (horasExtras*((tarifa*0.05)+tarifa));
    }

    @Override
    public String toString() {
        return super.toString() +"Medico ," + "Codigo=" + codigo + ", Tarifa=" + tarifa + ", Horas Extras=" + horasExtras + ", Paga Total= "+super.sueldo+'\n';
    }
    
    
}
