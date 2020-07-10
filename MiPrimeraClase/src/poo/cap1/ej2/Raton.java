/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cap1.ej2;

import java.util.Objects;

/**
 *
 * @author tapia
 */
public class Raton {

    /*
    1 -> variables de instancia
    2 -> constructores
    3 -> get y set
    4 -> demas metodos
     */
    private int edad;
    private int dias;
    private double peso = 1;
    private double tasaCrecimientoPorcentual;
    private String nombre;

    public Raton(String nombre, double tasaCrecimientoPorcentual, double peso) {
        this.nombre = nombre;
        this.tasaCrecimientoPorcentual = tasaCrecimientoPorcentual;
        this.peso = peso;
        this.edad = 0;
    }

    public Raton(int edad, double tasaCrecimientoPorcentual) {
        this.edad = edad;
        this.tasaCrecimientoPorcentual = tasaCrecimientoPorcentual;
    }

    public Raton() {
        System.out.println("Constructor vacio");
    }

    public void setTasaCrecimientoPorcentual(double tasaCrecimientoPorcentual) {
        this.tasaCrecimientoPorcentual = tasaCrecimientoPorcentual;
    }

    /*public void crecer () {
        this.edad++;
       this.peso+=(this.peso*this.tasaCrecimientoPorcentual)/100;
   }*/
    public void crecer(int dias) {
        this.edad += dias;
        this.peso += ((this.peso * this.tasaCrecimientoPorcentual) / 100) * dias;

    }

    public void crecer() {
        this.edad++;
        this.peso += (this.peso * this.tasaCrecimientoPorcentual) / 100;
    }

    public boolean esAdolescente() {
        /*if(this.edad<=100){
            return true;
        }else if(this.edad>100){
            return false;
        }*/
        return this.edad <= 100;
    }

    public void desplegar() {
        System.out.printf("\nEdad : %d \nPeso : %.2f", this.edad, +this.peso);
    }

    public int getEdad() {
        return this.edad;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Raton -> " +nombre + ", Edad=" + edad + ", Peso="
                + "" + String.format("%.2f", peso) + ", Tasa Crecimiento Porcentual=" + tasaCrecimientoPorcentual;
    }

    /*
    public boolean equals (Raton otroRaton){
        return this.edad == otroRaton.edad && this.peso == otroRaton.peso && this.nombre.equals(otroRaton.nombre);
        
    }
     */
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Raton other = (Raton) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    public String diagnosticar() {
        double relacion = this.edad / this.peso;
        String mensaje;
        if (relacion < 0.25) {
            mensaje = "El raton debe comer mas";
        } else {
            mensaje = "El raton esta bien";
        }
        return mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTasaCrecimientoPorcentual() {
        return tasaCrecimientoPorcentual;
    }
             
}
