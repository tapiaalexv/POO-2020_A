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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        double dinero;
        boolean fin = false;

        Cuenta cuentaNueva;

        Scanner datos = new Scanner(System.in);

        System.out.print("~~CUENTA~~\nIngrese el saldo inicial: ");
        dinero = datos.nextDouble();
        if (dinero < 0.1) {
            cuentaNueva = new Cuenta(0);
            System.out.print("Se inicializo su saldo con: $0,0\n");
        } else {
            cuentaNueva = new Cuenta(dinero);
            System.out.print("Se inicializo su saldo con: "+String.format("%.2f", cuentaNueva.obtenerSaldo()) +"\n");
        }

        do {
            System.out.print("\n1)Abonar\n2)Conocer Saldo\n3)Salir\n\n"
                    + "Que opcion desea: ");
            opcion = datos.nextInt();

            if (opcion < 1 || opcion > 3) {
                System.out.println("~~~Esa opcion no existe, intente otra vez!~~");
            } else {
                switch (opcion) {
                    case 1:
                        do {
                            System.out.print("\nIngrese el monto a abonar: ");
                            dinero = datos.nextDouble();
                            if (dinero <= 0) {
                                System.out.println("\n**Valor no permitido, intente de nuevo!**");
                            }
                        } while (dinero <=0 );
                        cuentaNueva.abonar(dinero);
                        break;
                    case 2:
                        System.out.print("\nSu saldo es -> " + String.format("%.2f", cuentaNueva.obtenerSaldo()) + "\n");
                        break;
                    case 3:
                        System.out.println("\nADIOS\n");
                        fin = true;
                        break;
                }

            }

        } while (fin != true);
        
        Cuenta aCuenta = new Cuenta(1);
        Cuenta bCuenta = new Cuenta(10);
        
        System.out.print("\nSu saldo es -> " + String.format("%.2f", aCuenta.obtenerSaldo()) + "\n");
        System.out.print("\nSu saldo es -> " + String.format("%.2f", bCuenta.obtenerSaldo()) + "\n");
        System.out.println(aCuenta.isEsCuentaInactiva()+" ~~ "+bCuenta.isEsCuentaInactiva());
        
        aCuenta.fusionarCuenta(bCuenta);
        
        System.out.print("\nSu saldo es -> " + String.format("%.2f", aCuenta.obtenerSaldo()) + "\n");
        System.out.print("\nSu saldo es -> " + String.format("%.2f", bCuenta.obtenerSaldo()) + "\n");
        
        System.out.println(aCuenta.isEsCuentaInactiva()+" ~~ "+bCuenta.isEsCuentaInactiva());

    }

}
