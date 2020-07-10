/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad1;

import java.util.Scanner;

/**
 *
 * @author tapia
 */
public class Ejercicio1_Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        double longitud, anchura;
        boolean fin = false;

        Rectangulo primerRectangulo;
        Rectangulo segundoRectangulo;

        Scanner datos = new Scanner(System.in);

        do {
            System.out.print("**RECTANGULO**\n1)Crear rectangulo con valores aleatorios"
                    + "\n2)Ingresar longitud y anchura del rectangulo\n3)Salir\n"
                    + "\nQue opcion desea: ");
            opcion = datos.nextInt();

            if (opcion < 1 || opcion > 3) {
                System.out.println("~~~Esa opcion no existe, intente otra vez!~~\n\n");
            } else {
                switch (opcion) {
                    case 1:
                        primerRectangulo = new Rectangulo();
                        System.out.print("\nLas variables del Rectangulo son:\n"
                                + "->Longitud: " + String.format("%.2f", primerRectangulo.getLongitud()) + "\n"
                                + "->Anchura: " + String.format("%.2f", primerRectangulo.getAnchura()) + "\n");
                        System.out.print("\n*El rectangulo es cuadrado? -> " + primerRectangulo.esCuadrado() + "\n\n");
                        break;
                    case 2:
                        do {
                            System.out.print("\nIngrese la longitud: ");
                            longitud = datos.nextDouble();
                            if(longitud<0.1){
                                System.out.print("\n~~Valor no permitido!~~\n"
                                        + "**Intete de nuevo**");
                            }
                        } while (longitud < 0.1);
                        
                        do {
                            System.out.print("\nIngrese la anchura: ");
                            anchura = datos.nextDouble();
                            if(anchura<0.1){
                                System.out.print("\n~~Valor no permitido!~~\n"
                                        + "**Intete de nuevo**");
                            }
                        } while (anchura < 0.1);
                        
                        segundoRectangulo=new Rectangulo(longitud, anchura);
                        
                        System.out.print("\nLas variables del Rectangulo son:\n"
                                + "->Longitud: " + String.format("%.2f", segundoRectangulo.getLongitud()) + "\n"
                                + "->Anchura: " + String.format("%.2f", segundoRectangulo.getAnchura()) + "\n");
                        System.out.print("\n*El rectangulo es cuadrado? -> " + segundoRectangulo.esCuadrado() + "\n\n");
                        break;
                    case 3:
                        System.out.print("\nADIOS\n");
                        fin = true;
                        break;
                }
            }

        } while (fin != true);

    }

}
