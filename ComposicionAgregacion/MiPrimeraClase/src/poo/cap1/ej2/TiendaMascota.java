/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cap1.ej2;

import java.util.ArrayList;

/**
 *
 * @author Marcela
 */
public class TiendaMascota {
    private String nombre;
    ArrayList <Raton> ratones = new ArrayList <Raton> (); //Relación de composición 1 a * - una tienda de mascotas tiene * ratones
    private Fecha fechaFundacion; //relación de asociación 1 a 1 - 1 una tienda de mascotas tiene una fecha de fundacion

    public Fecha getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(Fecha fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Raton> getRatones() {
        return ratones;
    }

    public void setRatones(ArrayList<Raton> ratones) {
        this.ratones = ratones;
    }

    public void agregarRaton(Raton r){
        ratones.add(r);
    }
 
    
    
}



