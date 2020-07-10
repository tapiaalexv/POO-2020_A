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
    private boolean esCuentaInactiva;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isEsCuentaInactiva() {
        return esCuentaInactiva;
    }

    public void setEsCuentaInactiva(boolean esCuentaInactiva) {
        this.esCuentaInactiva = esCuentaInactiva;
    }
    
        
    public Cuenta(double saldoInicial){
        this.balance = saldoInicial;
        this.esCuentaInactiva = false;
    }
    
    public void abonar(double monto){
        this.balance += monto;
    }
    
    public double obtenerSaldo(){
        return balance;
    }
    
    public void fusionarCuenta (Cuenta otraCuenta){
        this.balance += otraCuenta.balance;
        otraCuenta.balance=0;
        otraCuenta.esCuentaInactiva=true;
    }
    
}
