/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.practica1;

/**
 *
 * @author tapia
 */
public class Fraccion {
    
    private int numerador;
    private int denominador;
    
    public Fraccion(){
        this.numerador = 9;
        this.denominador = 12;
    }
    
    public Fraccion(int numerador){
        if(numerador != 0){
            this.numerador = numerador;
            this.denominador = 5;
        }else{
            this.numerador = 0;
            this.denominador = 0;
        }
    }
    
    public Fraccion(int numerador, int denominador){
        if(numerador != 0){
            this.numerador = numerador;
            this.denominador = denominador;
        }else{
            this.numerador = 0;
            this.denominador = 0;
        }
        
    }

    @Override
    public String toString() {
        if(numerador < 0 && denominador < 0){
            return "Fraccion = { " + (-1)*numerador + "/"+ (-1)*denominador + " }";
        }else{
            return "Fraccion = { " + numerador + "/"+denominador + " }";
        }
    }
    
    public void simplificarFraccion(){
        int mcd;//Maximo Comun Divisor
        
        if(Math.abs(this.numerador) > Math.abs(this.denominador)){
            mcd = Math.abs(this.denominador);
        }else{
            mcd = Math.abs(this.numerador);
        }
        
        while((Math.abs(this.numerador)%mcd != 0)||(Math.abs(this.denominador)%mcd != 0)){
            mcd--;
        }
        
        this.numerador = this.numerador/mcd;
        this.denominador = this.denominador/mcd;
    }
    
    
}
