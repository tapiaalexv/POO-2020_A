/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cap2.ej1;

/**
 *
 * @author Marcela
 */
public class Perro {
    private String nombre;
    private String sexo;
    private int edad;
    private String raza;

    public Perro(String nombre, String genero, int edad, String raza) {
        this.nombre = nombre;
        this.sexo = genero;
        this.edad = edad;
        this.raza = raza;
    }

    public Perro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return sexo;
    }

    public void setGenero(String genero) {
        this.sexo = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", Sexo=" + sexo + ", Edad=" + edad + ", Raza=" + raza + '\n';
    }
    
    
    
}
