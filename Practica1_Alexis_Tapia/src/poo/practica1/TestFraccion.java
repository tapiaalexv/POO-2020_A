/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.practica1;

import java.util.*;

/**
 *
 * @author tapia
 */
public class TestFraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion, numerador, denominador;
        boolean fin = false;
        Fraccion primeraFraccion = new Fraccion();
        Fraccion segundaFraccion;
        Fraccion terceraFraccion;

        Scanner aux = new Scanner(System.in);

        do {
            System.out.print("**Menu Fraccion:**\n1) Crear Fraccion 9/12"
                    + "\n2) Ingrese solo el numerador, denominador por defecto 5"
                    + "\n3) Ingrese numerador y denominador\n4) Salir\nQue opcion desea: ");
            opcion = aux.nextInt();

            if ((opcion < 1) || (opcion > 4)) {
                System.out.println("\n~~~Esa opcion no existe, intente de nuevo!~~\n");
            } else {
                switch (opcion) {
                    case 1:
                        
                        primeraFraccion.simplificarFraccion();
                        System.out.print("\n" + primeraFraccion.toString() + "\n\n");
                        
                        break;
                    case 2:
                        
                        System.out.print("\nDigite el numerador : ");
                        numerador = aux.nextInt();
                        
                        if (numerador == 0) {
                            segundaFraccion = new Fraccion(0);
                            System.out.print("\n" + segundaFraccion.toString() + "\n\n");
                        } else {
                            segundaFraccion = new Fraccion(numerador);
                            segundaFraccion.simplificarFraccion();
                            System.out.print("\n" + segundaFraccion.toString() + "\n\n");
                        }
                        break;
                    
                    case 3:
                        
                        System.out.print("\nDigite el numerador : ");
                        numerador = aux.nextInt();
                        
                        do {
                            System.out.print("\nDigite el denominador : ");
                            denominador = aux.nextInt();
                            if (denominador == 0) {
                                System.out.print("\n~~Denominador no puede ser 0~~\nIntente de nuevo");
                            }
                        } while (denominador == 0);
                        
                        if (numerador == 0) {
                            terceraFraccion = new Fraccion(numerador, denominador);
                            System.out.print("\n" + terceraFraccion.toString() + "\n\n");
                        } else {
                            terceraFraccion = new Fraccion(numerador, denominador);
                            terceraFraccion.simplificarFraccion();
                            System.out.print("\n" + terceraFraccion.toString() + "\n\n");
                        }
                        
                        break;
                    
                    case 4:
                        
                        System.out.println("\nADIOS\n");
                        fin = true;
                        
                        break;
                }
            }
        } while (fin != true);

    }

}
