/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad2.deber7;

import java.util.*;

/**
 *
 * @author tapia
 */
public class TestLibroCalificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String materia;
        int nota, tamano;

        LibroCalificaciones testCalificaciones = new LibroCalificaciones();

        Scanner datos = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la materia: ");
        materia = datos.next();
        testCalificaciones.setMateria(materia);
        System.out.println("");

        System.out.print("¿Cuántas calificaciones va a ingresar? ");
        tamano = datos.nextInt();
        System.out.println("");
        
        testCalificaciones.definirTamano(tamano);

        for (int i = 0; i < tamano; i++) {
            System.out.print("Estudiante "+(i+1)+": ");
            nota = datos.nextInt();
            testCalificaciones.llenarNota(i, nota);
        }
        
        System.out.print("\nEl promedio de notas es: "+testCalificaciones.calcularPromedio());
        System.out.println("\n");
        
        System.out.print("\nLa nota más baja es: "+testCalificaciones.calcularNotaMasBaja());
        System.out.print("\nLa nota más alta es: "+testCalificaciones.calcularNotaMasAlta());
        System.out.println("\n");
        
        testCalificaciones.ordenarCalificaciones();
        System.out.print("\nLas notas ordenadas de manera descendentemente son:\n");
        testCalificaciones.imprimirNotas();
        
        System.out.println("\n");
        testCalificaciones.presentarDistribucionCalificaciones();
        System.out.print("\n");
        

    }

}
