/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tapia
 */
public class Nadador extends Deportista{
    private int numeroCompetencias;
    private double metrosNadados;
    private double bonoNadador;

    public Nadador() {
    }
    
    public Nadador(String nombre, double metrosNadados, int nCompetencias) {
        this.metrosNadados = metrosNadados;
        this.numeroCompetencias = nCompetencias;
        super.nombre = nombre;
    }
       
    
    public double calcularBonoNadador(){
        return bonoNadador = numeroCompetencias * 100;
    }
        
    @Override
    double calcularGanancias() {
        return gananciasTotales = (metrosNadados * numeroCompetencias) + bonoNadador ;
    }
    
    @Override
    public String toString() {
        return super.toString()+"Nadador "+ ", Bono Nadador = " + bonoNadador+ ", Ganacia Total: " + String.format("%.2f",super.gananciasTotales)+'\n';
    }
        
}
