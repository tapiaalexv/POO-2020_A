/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad2.deber4;

import java.util.*;

/**
 *
 * @author tapia
 */
public class TestValidacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        boolean fin = false;
        String correo, usuario;

        Scanner datos = new Scanner(System.in);

        do {
            System.out.println("\nIngrese el correo: ");
            correo = datos.next();
            System.out.println("\nIngrese el usuario: ");
            usuario = datos.next();
            System.out.println();
            if (Validacion.esCorreoValido(correo)) {
                System.out.println("Correo Valido");
            } else {
                System.out.println("Correo No valido");
            }

            if (Validacion.esUsuarioValido(usuario)) {
                System.out.println("Usuario Valido");
            } else {
                System.out.println("Usuario No valido");
            }
            
            do {
                System.out.print("\nDesea ingresar otros datos ?\n1) Si\n2) No\n"
                        + "Opcion = ");
                opcion = datos.nextInt();
                if(opcion < 1 || opcion > 2){
                    System.out.print("~~Esa opcion no existe. Intente de nuevo!~~");
                }
            } while (opcion != 1 && opcion != 2);
            if(opcion == 2){
                System.out.println("ADIOS!");
                fin = true;
            }    
            
        } while (fin != true);

    }

}
