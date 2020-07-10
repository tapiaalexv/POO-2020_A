/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad2;

import java.util.Scanner;

/**
 *
 * @author tapia
 */
public class TestPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre, apellido, cedula;
        int opcion;
        boolean fin = false;
        
        Scanner datos = new Scanner(System.in);
        
        Persona testPersona;
        
        do {
            
            System.out.print("\nIngrese el nombre: ");
            nombre = datos.next();
            System.out.print("Ingrese el apellido: ");
            apellido = datos.next();
            System.out.print("Ingrese el numero de cedula sin el guion: ");
            cedula = datos.next();
            
            testPersona = new Persona(nombre, apellido, cedula);
            
            System.out.println("\nEl nombre es Palindromo -> "+testPersona.esPalindromo());
            System.out.println("La cedula es valida? ->" + testPersona.esCedulaValida());
            testPersona.determinarProvincia();
            System.out.println(testPersona.toString());
            
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
