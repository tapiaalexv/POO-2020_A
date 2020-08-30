/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tapia
 */
public class Ciclista extends Deportista{
    private double kmRecorridos;
    private int sponsorMarcas;
    private double bonoCiclista;

    public Ciclista() {
    }

    public Ciclista(String nombre, double kmRecorridos, int nMarcas) {
        this.sponsorMarcas = nMarcas;
        this.kmRecorridos = kmRecorridos;
        super.nombre = nombre;
    }   
    
    public double calcularBonoCiclista(){
        return bonoCiclista = sponsorMarcas * 150;
    }
    
    @Override
    double calcularGanancias() {
        return gananciasTotales = (kmRecorridos * sponsorMarcas) + bonoCiclista;
    }

    @Override
    public String toString() {
        return super.toString()+"Ciclista "+ ", Bono Cilcista = " + bonoCiclista + ", Ganacia Total: " + String.format("%.2f",super.gananciasTotales)+'\n';
    }
    
    
    
}
