/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.StringTokenizer;

/**
 *
 * @author Marcela
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Primera parte métodos de la clase Character
        char c = '8';

        System.out.println("el caracter "+c+" se puede usar como inicio de un identificador en Java? "+Character.isJavaIdentifierStart(c));
        System.out.println("el caracter "+c+" se puede usar como parte de un identificador en Java? "+Character.isJavaIdentifierPart(c));

        System.out.println(Character.toUpperCase(c));

        //Segunda parte clase StringTokenizer
        String frase = "Programación Orientada a Objetos";
        String frase1 = "Programación\nOrientada\ta\tObjetos";
        String frase2 = "Programación Orientada a Objetos - segundo semestre - tercer semestre";
        String colores = "azul, amarillo, blanco, beige, verde, negro";

        //obteniendo los tokens
        /* A) con el constructor que recibe un string a tokenizar y 
        la cadena delimitadora predeterminada un espacio, un tabulador, un retorno de carro 
        y una nueva línea, para la descomposición en tokens.
         */
        StringTokenizer tokens = new StringTokenizer(frase1);

        System.out.println("\nde la frase: " + frase1 + " se obtuvieron " + tokens.countTokens() + "tokens\nlos tokens son"); // 
        mostrarTokens(tokens);

        //contando los tokens obtenidos, analizar la salida cuando el metodo se utiliza despues del bucle
        //procesando los tokens
        /* B) con el constructor que recibe un string a tokenizar y 
        la cadena delimitadora.
         */
        StringTokenizer tokens2 = new StringTokenizer(frase2, "-"); //como separar en tokens usando el - sin incluir los espacios en el token
        System.out.println("\nmostrando los tokens de: " + frase2+" con - como delimitador");
        mostrarTokens(tokens2);

        /* C) con el constructor que recibe un string a tokenizar y 
        la cadena delimitadora e incluye la cadena delimitadora como tokens
         */
        StringTokenizer tokens3 = new StringTokenizer(colores, ",", true);
        System.out.println("\nmostrando los tokens de " + colores+" con - como delimitador incluido en los tokes");
        mostrarTokens(tokens3);

        //tercera parte usando el método split
        
        String cadena1 = "-Programación orientada a -objetos - 2do ** - 3er semestre **-* FIS";
        System.out.println("\nusando el método split para:\n"+cadena1+"\nel resultado es:");
        String resultado[] = cadena1.split("-\\s"); //toda la regex es el delimitador y no se toma en cuenta para formar la cadena
        for (String s : resultado) {
            System.out.println(s);
        }

        //cuarta parte usando los replace y replaceAll
        System.out.println("La cadena original: " + cadena1);
        //replaceAll
        cadena1 = cadena1.replaceAll("-", "_");
        System.out.println("La cadena luego de sustituir todos los - por _: " + cadena1);
        //replaceFirst
        cadena1 = cadena1.replaceFirst("\\d", "Q");
        System.out.println("La cadena luego de sustituir el primer digito por Q: " + cadena1);

        
    }

    public static void mostrarTokens(StringTokenizer s) {
        while (s.hasMoreTokens()) {
            System.out.println(s.nextToken());
        }
    }

}
