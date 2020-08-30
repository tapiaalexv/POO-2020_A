/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber9_alexis_tapia;

import java.util.*;

/**
 *
 * @author tapia
 */
public class Deber9_Alexis_Tapia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Figura> f1 = new ArrayList<Figura>();
        f1.add(new Tetraedro(15));
        System.out.println("~~" + ((Tetraedro) f1.get(0)).obtenerVolumen());

        int numeroFiguras;
        int opcion;
        int indice = 0;
        double auxFiguras, auxFiguras1;
        Scanner datos = new Scanner(System.in);

        System.out.print("Ingrese el numero de figuras que desea: ");
        numeroFiguras = datos.nextInt();
        Figura figuras[] = new Figura[numeroFiguras];

        for (int i = 1; i <= numeroFiguras; i++) {
            System.out.print("\nSeleccione la Figura que desea:\n\t1) Círculo\n\t2) Triángulo"
                    + "\n\t3) Cuadrado\n\t4) Cubo\n\t5) Tetraedro\n\t6) Esfera\n");
            do {
                System.out.print("\nOpcion = ");
                opcion = datos.nextInt();
                if (opcion < 1 || opcion > 6) {
                    System.out.print("~~Esa opcion no existe. Intente de nuevo!~~");
                }
            } while (opcion < 1 || opcion > 6);

            switch (opcion) {
                case 1:
                    System.out.println("\nFigura N°" + i + " Circulo");
                    do {
                        System.out.print("\nIngrese el radio: ");
                        auxFiguras = datos.nextDouble();
                        if (auxFiguras <= 0) {
                            System.out.print("~~El valor ingresado no puede ser <= a 0. Intente de nuevo!~~");
                        }
                    } while (auxFiguras <= 0);

                    figuras[i - 1] = new Circulo(auxFiguras);
                    figuras[i - 1].obtenerArea();
                    break;
                case 2:
                    System.out.println("\nFigura N°" + i + " Triangulo");
                    do {
                        System.out.print("\nIngrese la base: ");
                        auxFiguras = datos.nextDouble();
                        if (auxFiguras <= 0) {
                            System.out.print("~~El valor ingresado no puede ser <= a 0. Intente de nuevo!~~");
                        }
                    } while (auxFiguras <= 0);

                    do {
                        System.out.print("\nIngrese la altura: ");
                        auxFiguras1 = datos.nextDouble();
                        if (auxFiguras1 <= 0) {
                            System.out.print("~~El valor ingresado no puede ser <= a 0. Intente de nuevo!~~");
                        }
                    } while (auxFiguras1 <= 0);

                    figuras[i - 1] = new Triangulo(auxFiguras, auxFiguras1);
                    figuras[i - 1].obtenerArea();
                    break;
                case 3:
                    System.out.println("\nFigura N°" + i + " Cuadrado");
                    do {
                        System.out.print("\nIngrese el lado: ");
                        auxFiguras = datos.nextDouble();
                        if (auxFiguras <= 0) {
                            System.out.print("~~El valor ingresado no puede ser <= a 0. Intente de nuevo!~~");
                        }
                    } while (auxFiguras <= 0);

                    figuras[i - 1] = new Cuadrado(auxFiguras);
                    figuras[i - 1].obtenerArea();
                    break;
                case 4:
                    System.out.println("\nFigura N°" + i + " Cubo");
                    do {
                        System.out.print("\nIngrese el lado: ");
                        auxFiguras = datos.nextDouble();
                        if (auxFiguras <= 0) {
                            System.out.print("~~El valor ingresado no puede ser <= a 0. Intente de nuevo!~~");
                        }
                    } while (auxFiguras <= 0);

                    figuras[i - 1] = new Cubo(auxFiguras);
                    figuras[i - 1].obtenerArea();
                    ((Cubo) figuras[i - 1]).obtenerVolumen();
                    break;
                case 5:
                    System.out.println("\nFigura N°" + i + " Tetraedro");
                    do {
                        System.out.print("\nIngrese el lado: ");
                        auxFiguras = datos.nextDouble();
                        if (auxFiguras <= 0) {
                            System.out.print("~~El valor ingresado no puede ser <= a 0. Intente de nuevo!~~");
                        }
                    } while (auxFiguras <= 0);

                    figuras[i - 1] = new Tetraedro(auxFiguras);
                    figuras[i - 1].obtenerArea();
                    ((Tetraedro) figuras[i - 1]).obtenerVolumen();
                    break;
                case 6:
                    System.out.println("\nFigura N°" + i + " Esfera");
                    do {
                        System.out.print("\nIngrese el radio: ");
                        auxFiguras = datos.nextDouble();
                        if (auxFiguras <= 0) {
                            System.out.print("~~El valor ingresado no puede ser <= a 0. Intente de nuevo!~~");
                        }
                    } while (auxFiguras <= 0);

                    figuras[i - 1] = new Esfera(auxFiguras);
                    figuras[i - 1].obtenerArea();
                    ((Esfera) figuras[i - 1]).obtenerVolumen();
                    break;
                default:
                    throw new AssertionError();
            }

        }

        System.out.println("\n~~Resumen de las Figuras Creadas:\n");
        for (Figura f : figuras) {
            System.out.println(f.toString());
        }

    }

}
