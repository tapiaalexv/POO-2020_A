package poo.cap1.ej2;

import java.util.*;

/**
 *
 * @author tapia
 */
public class TestRaton {

    public static void main(String[] args) {

        double tasa;
        double tasaTest;
        int dias;
        Raton gus; //Variable de clase Raton
        gus = new Raton(); //inicializacion
        Scanner datosD = new Scanner(System.in);
        Scanner datosI = new Scanner(System.in);

        try {
            System.out.print("Ingrese la tasa de crecimiento: ");
            tasaTest = datosD.nextDouble();
            gus.setTasaCrecimientoPorcentual(tasaTest);
            gus.desplegar();
        } catch (InputMismatchException e) {
            e.getStackTrace();
            System.err.println("Exception provocada por ingreso de datos " + e.toString());
        }

        try {
            System.out.print("\nIngrese los dias de crecimiento: ");
            dias = datosI.nextInt();
            gus.crecer(dias);
            gus.desplegar();
        } catch (Exception e) { //Excepcion General
            System.err.println("Se ha provacado una excepcion " + e.toString());
        }
        
        System.out.println("\n");
        
        Raton pepe = new Raton(); //declaracion e inicializacion
        try {
            pepe.setTasaCrecimientoPorcentual(10);
            pepe.desplegar();
            pepe.crecer(1);
            pepe.desplegar();
        } catch (RuntimeException e) {
            System.err.println("Una execpion por poner valor que no corresponode en set "+
                    e.toString());
        }

        /*
        Raton jaq = new Raton();
        jaq.setTasaCrecimientoPorcentual(30);
        jaq.crecer(4);
        jaq.desplegar();
        System.out.println("\n" + jaq.esAdolescente());

        if (jaq.esAdolescente()) {
            System.out.println("\nJaq es adolescente");
        }
        if (!jaq.esAdolescente()) {
            System.out.println("\nJaq no es adolescente");
        }

        System.out.print("\n" + jaq.toString() + "\n");

        System.out.print("\n");

        Raton jaq2 = new Raton("jaq", 6.0, 4);
        Raton lola = new Raton("Lola", 6, 4);

        //No se compara asi, xq los objetos guardan direcciones de memoria
        //por lo tanto estariamos comparando la direccion mas no los datos
        if (jaq2 == lola) {
            System.out.println("ambos ratones tienen la misma edad y peso");
        } else {
            System.out.println("ambos ratones difieren en edad y peso");
        }

        if (lola.equals(jaq2)) {
            System.out.println("ambos ratones tienen la misma edad y peso");
        } else {
            System.out.println("ambos ratones difieren en edad y peso");
        }

        System.out.println(lola.toString());

        lola.crecer(1);

        System.out.println(lola.toString());

        Veterinario nuevoVeterinario = new Veterinario();

        String m1 = nuevoVeterinario.diagnosticar(lola);

        System.out.println(m1);
         */
    }

}
