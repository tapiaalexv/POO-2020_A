/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad2.prueba2;

/**
 *
 * @author alexi
 */
public class Cuenta {
    private String nombreTitular;
    private String tipoCuenta;
    private double saldo;

    public Cuenta() {
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
       
    public void retirar(double montoRetiro){
        saldo -= montoRetiro;
    }
    
    public void depositar(double montoDeposito){
        saldo += montoDeposito;
    }     
    
}

