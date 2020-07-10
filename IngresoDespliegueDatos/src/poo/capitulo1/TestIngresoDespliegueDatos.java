package poo.capitulo1;

import java.util.*;

/**
 *
 * @author tapia
 */
public class TestIngresoDespliegueDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double valorInicial= 28.37845;
        int edad = 24;
        float valorFinal = 140.845f;
        char inicial = 'a';
        String nombre;
        /*System.out.print("Valor inicial "+valorInicial+"\n");
        System.out.println("Edad "+edad);
        System.out.println("Valor Final "+valorFinal);
        System.out.printf("Valor Inicial %.2f \nInicial %c \n",valorInicial,inicial);*/
        
        Scanner input = new Scanner (System.in);
        System.out.print("Ingrese una edad :");
        edad = input.nextInt();
        System.out.println("Edad :"+edad);  
        input.nextLine();
        System.out.print("Ingrese un nombre: ");
        nombre = input.nextLine();
        System.out.println(nombre);
    }

}
