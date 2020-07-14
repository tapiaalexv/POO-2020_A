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

        System.out.print("¿Cuántas calificaciones va a ingresar? ");
        tamano = datos.nextInt();

        testCalificaciones.definirTamano(tamano);

        for (int i = 0; i < tamano; i++) {
            System.out.print("Ingrese la "+(i+1)+" Nota: ");
            nota = datos.nextInt();
            testCalificaciones.llenarNota(i, nota);
        }
        
        System.out.print("\nEl promedio de notas es: "+testCalificaciones.calcularPromedio());
        
        System.out.print("\nLa nota más baja es: "+testCalificaciones.calcularNotaMasBaja());
        System.out.print("\nLa nota más alta es: "+testCalificaciones.calcularNotaMasAlta());
        
        testCalificaciones.ordenarCalificaciones();
        System.out.print("\nLas notas ordenadas de manera descendentemente son:\n");
        testCalificaciones.imprimirNotas();
        
        testCalificaciones.presentarDistribucionCalificaciones();
        System.out.print("\n");
        

    }

}
