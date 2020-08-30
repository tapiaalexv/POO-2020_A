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
public class Proveedor implements Pago{
    
    private String razonSocial;
    private String ruc;
    private String tipo;
    private double pago;

    public Proveedor(String razonSocial, String ruc, String tipo) {
        this.razonSocial = razonSocial;
        this.ruc = ruc;
        this.tipo = tipo;
    }

    @Override
    public double pagar() {
        if(this.tipo.equals("A")){
            this.pago = 5000;
        }
        if(this.tipo.equals("B")){
            this.pago = 2200;
        }
        return this.pago;
    }

    @Override
    public String toString() {
        return "Proveedor ->" + "Razón Social= " + razonSocial + ", RUC=" + ruc + ", Tipo=" + tipo + ", Pago Total = " + pago + '\n';
    }
    
    
}
