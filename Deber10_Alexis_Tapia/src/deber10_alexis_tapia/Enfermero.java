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
public class Enfermero extends Empleado{
    
    private String jornada;
    private String nivel;

    public Enfermero(String nombre, String apellido, String jornada, String nivel) {
        super(nombre, apellido);
        this.jornada = jornada;
        this.nivel = nivel;
    }

    @Override
    public double calcularPago() {
        if(this.jornada.equals("Matutina")){
            if(this.nivel.equals("1")){
                super.sueldo = 450;
            }
            if(this.nivel.equals("2")){
                super.sueldo = 450 + 0.1*450;
            }
        }
        if(this.jornada.equals("Vespertina")){
            if(this.nivel.equals("1")){
                super.sueldo = 560;
            }
            if(this.nivel.equals("2")){
                super.sueldo = 560 + 0.1*560;
            }
        }
        return super.sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+"Enfermero ," + "Jornada= " + jornada + ", Nivel=" + nivel + ", Paga Total = "+super.sueldo+'\n';
    }
    
    
    
}
