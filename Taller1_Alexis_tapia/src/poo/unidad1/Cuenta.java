/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad1;

/**
 *
 * @author tapia
 */
public class Cuenta {
    
    private double balance;
    
    public Cuenta(double saldoInicial){
        this.balance = saldoInicial;
    }
    
    public void abonar(double monto){
        this.balance += monto;
    }
    
    public double obtenerSaldo(){
        return balance;
    }
    
}
