/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cap1.ej2;

import java.util.Objects;

/**
 *
 * @author Marcela
 */
public class Raton {

    private int edad;
    private double peso = 1;
    private double tasaCrecimientoPorcentual;
    private String nombre;

    public Raton(int edad) {
        this.edad = edad;
    }

    public Raton() {
        System.out.println("constructor vacío");
    }

    public Raton(double peso, int edad, String nombre) {
        this.peso = peso;
        this.edad = edad;
        this.nombre = nombre;
    }

    public Raton(double peso, int edad) {
        this.peso = peso;
        this.edad = edad;
        this.nombre = nombre;
    }

    public Raton clonar() {
        Raton ratonClonado = new Raton(this.peso, this.edad);
        return ratonClonado;
    }

    public void setTasaCrecimientoPorcentual(double tasaCrecimientoPorcentual) {
        this.tasaCrecimientoPorcentual = tasaCrecimientoPorcentual;
    }

    public void crecer() {
        System.out.println("crecer sin argumentos/vacio");
        this.peso += this.peso * tasaCrecimientoPorcentual / 100.00;
        this.edad++;
    }

    public void crecer(int dias) {
        // System.out.println("crecer con n dias");
        for (int i = 0; i < dias; i++) {
            this.peso += this.peso * tasaCrecimientoPorcentual * 0.01;
        }
        this.edad = this.edad + dias;
    }

    public void desplegar() {
        System.out.printf("Edad %d peso %.2f\n", this.edad, this.peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean esAdolescente() {
//        boolean respuesta;
//        if(this.edad<=100)

//            respuesta = true;
//        else
//            respuesta = false;
        return this.edad <= 100;
    }

    @Override
    public String toString() {

        return "Raton{ nombre: " + nombre + ", edad=" + edad + ", tasaCrecimientoPorcentual=" + tasaCrecimientoPorcentual + ", peso=" + peso +'}';
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean equals(Raton otroRaton) {

        return this.edad == otroRaton.edad && this.peso == otroRaton.peso && this.nombre.equals(otroRaton.nombre);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
