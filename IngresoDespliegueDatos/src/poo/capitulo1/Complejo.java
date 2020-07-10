/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.capitulo1;

/**
 *
 * @author Marcela
 */
public class Complejo {
    
    //JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", "Mensaje en la barra de titulo", JOptionPane.WARNING_MESSAGE);

    //variables de instancia
    private double parteReal;
    private double parteImaginaria;

    //constructor
    public Complejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public Complejo() {
    }

    //getters y setter
    public double getParteReal() {
        return parteReal;
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }

    //metodo para sumar
    public Complejo sumar(Complejo otroNumeroComplejo) {
        //creacion del complejo que almacena el resultado
        Complejo resultado = new Complejo();
        resultado.parteReal = this.parteReal + otroNumeroComplejo.parteReal;
        resultado.parteImaginaria = this.parteImaginaria + otroNumeroComplejo.parteImaginaria;
        return resultado;
    }

    public Complejo restar(Complejo otroNumeroComplejo) {
        Complejo resultado = new Complejo();
        resultado.parteReal = this.parteReal - otroNumeroComplejo.parteReal;
        resultado.parteImaginaria = this.parteImaginaria - otroNumeroComplejo.parteImaginaria;
        return resultado;
    }

    public Complejo multiplicar(Complejo otroNumeroComplejo) {
        Complejo resultado = new Complejo();
        resultado.parteReal = (this.parteReal * otroNumeroComplejo.parteReal)
                - (this.parteImaginaria * otroNumeroComplejo.parteImaginaria);
        resultado.parteImaginaria = (this.parteReal * otroNumeroComplejo.parteImaginaria)
                + (this.parteImaginaria * otroNumeroComplejo.parteReal);
        return resultado;
    }

    public Complejo dividir(Complejo otroNumeroComplejo) {
        Complejo resultado = new Complejo();
        double divisor = Math.pow(otroNumeroComplejo.parteReal, 2) + Math.pow(otroNumeroComplejo.parteImaginaria, 2);

        resultado.parteReal = ((this.parteReal * otroNumeroComplejo.parteReal)
                + (this.parteImaginaria * otroNumeroComplejo.parteImaginaria)) / divisor;

        resultado.parteImaginaria = ((this.parteImaginaria * otroNumeroComplejo.parteReal)
                - (this.parteReal * otroNumeroComplejo.parteImaginaria)) / divisor;

        return resultado;
    }

    @Override
    public String toString() {
        String mensaje = "Numero Complejo: ";
        if (this.parteImaginaria < 0) 
            mensaje += "( "+this.parteReal+""+this.parteImaginaria+" i )";
        
        else 
            mensaje += "( "+this.parteReal+"+"+this.parteImaginaria+" i )";
        return mensaje;
    }

}
