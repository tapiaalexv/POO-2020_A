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
public class TestEcuacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int coeficienteA;
        int coeficienteB;
        int coeficienteC;
        int opcion;
        boolean fin = false;

        EcuacionSegundoGrado testEcuacion;

        Scanner datos = new Scanner(System.in);

        do {
            System.out.println("\nIngrese los coeficiente para la ecuacion");
            do {
                System.out.print("Coeficiente A: ");
                coeficienteA = datos.nextInt();
                if(coeficienteA == 0){
                    System.out.print("~~Coeficiente A no puede ser 0. Intente de nuevo!~~\n");
                }
            } while (coeficienteA == 0);
            System.out.print("\nCoeficiente B: ");
            coeficienteB = datos.nextInt();
            System.out.print("\nCoeficiente C: ");
            coeficienteC = datos.nextInt();
            
            testEcuacion = new EcuacionSegundoGrado(coeficienteA, coeficienteB, coeficienteC);
            
            System.out.print("\n\n"+testEcuacion.toString()+"\n\n");
            
            testEcuacion.analizarTipoDeSolucion();
            
            System.out.print("\n"+testEcuacion.getTipoSolucion()+"\n");
            
            System.out.print("\n"+testEcuacion.presentarSolucion()+"\n");
            
            do {
                System.out.print("\nDesea realizar otra ecuacion ?\n1) Si\n2) No\n"
                        + "Opcion = ");
                opcion = datos.nextInt();
                if(opcion < 1 || opcion > 2){
                    System.out.print("~~Esa opcion no existe. Intente de nuevo!~~");
                }
            } while (opcion != 1 && opcion != 2);
            if(opcion == 2){
                fin = true;
            }
         
        } while (fin != true);

    }

}
