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
public class Raton extends Mascota{

    private String nombre;
    private int edad;
    private double peso = 1;
    private double tasaCrecimientoPorcentual;
    private Fecha fechaNacimiento;
    private final double PESO_MINIMO = 0.8; //primera opcion
    final double PESO_MAXIMO; //amigable o default
    private final static int edadRatonAdulto = 15;
    static int contadorRatones = 0;  //amigable
    



    public Raton(String nombre, int edad, double tasaCrecimientoPorcentual, Fecha fechaNacimiento, double peso, double pesoMax) {
        this.nombre = nombre;
        this.edad = edad;
        this.tasaCrecimientoPorcentual = tasaCrecimientoPorcentual;
        this.fechaNacimiento = fechaNacimiento;
        this.PESO_MAXIMO = pesoMax;
        contadorRatones++;

    }


    public Raton() {
        System.out.println("constructor vacío");
        this.PESO_MAXIMO  = 100.98;
        contadorRatones++;
    }

 
    public Raton(double peso, int edad) {
        this.peso = peso;
        this.edad = edad;
        this.PESO_MAXIMO  = 100.98;
        contadorRatones++;
    }


    public Raton clonar() {
        Raton ratonClonado = new Raton(this.peso, this.edad);
        return ratonClonado;
    }

    public void setTasaCrecimientoPorcentual(double tasaCrecimientoPorcentual) {
        this.tasaCrecimientoPorcentual = tasaCrecimientoPorcentual;
    }

    public void crecer() {

        //System.out.println("crecer sin argumentos/vacio");
        this.peso += this.peso * tasaCrecimientoPorcentual / 100.00;
        this.edad++;
    }

    public void crecer(int dias) {
        // System.out.println("crecer con n dias");
        for (int i = 0; i < dias; i++) {
            this.peso += this.peso * tasaCrecimientoPorcentual * 0.01;
        }
        this.edad += dias;
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

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getTasaCrecimientoPorcentual() {
        return tasaCrecimientoPorcentual;
    }

   
   /* public String toString() {
        return "Raton{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", tasaCrecimientoPorcentual=" + tasaCrecimientoPorcentual + ", fechaNacimiento=" + fechaNacimiento + ", pesoMinino=" + pesoMinino + '}';
    }*/

    public double getPESO_MINIMO() {
        return PESO_MINIMO;
    }

/*    public double getPESO_MAXIMO() {
        return PESO_MAXIMO;
    }
   */ 

    public static int getEdadRatonAdulto() {
        return edadRatonAdulto;
    }
    
    public static void enviarMensaje (){
        System.out.println("Hola ");
    }
    
    public void enviarSaludo (){
        System.out.println("Hola "+this.nombre);
    }
    
    public String comer (){
        
        return "ratoncito comiendo";
    }

public String saludar (){
    
    return "Raton dice hola ";
}

    @Override
    void sms2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
   }
