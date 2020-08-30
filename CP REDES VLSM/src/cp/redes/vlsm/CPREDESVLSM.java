/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.redes.vlsm;

import java.util.*;

/**
 *
 * @author tapia
 */
public class CPREDESVLSM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] hosts = new int [20];
        Scanner input = new Scanner (System.in);
        int sumaHost=0;
        int hostDisponibles=0;
        System.out.println("Ingrese el numero de redes que necesita");
        int numeroRedes = input.nextInt();
        System.out.println("Ingrese el numero de enlaces que necesita");
        int numeroEnlaces= input.nextInt();
        System.out.println("Ingrese cual es la mascara de la red a utilizar");
        int mascaraGeneral = input.nextInt();
        for(int i=1; i<=numeroRedes; i++){
            System.out.println("Ingrese el numero de host de "+i+" red");
            hosts[i-1]=input.nextInt();
        }
        int j=0;
        while(hosts[j]!=0){
            if (hosts[j]<=2){
                sumaHost=sumaHost+4;
                System.out.println("Necesitas /30");
            } else if (hosts[j]<=6){
                sumaHost=sumaHost+8;
                System.out.println("Necesitas /29");
            } else if (hosts[j]<=14){
                sumaHost=sumaHost+16;
                System.out.println("Necesitas /28");
            } else if (hosts[j]<=30){
                sumaHost=sumaHost+32;
                System.out.println("Necesitas /27");
            } else if (hosts[j]<=62){
                sumaHost=sumaHost+64;
                System.out.println("Necesitas /26");
            } else if (hosts[j]<=126){
                sumaHost=sumaHost+128;
                System.out.println("Necesitas /25");
            } else if (hosts[j]<=254){
                sumaHost=sumaHost+256;
                System.out.println("Necesitas /24");
            } else if (hosts[j]<=510){
                sumaHost=sumaHost+512;
                System.out.println("Necesitas /23");
            } else if (hosts[j]<=1022){
                sumaHost=sumaHost+1024;
                System.out.println("Necesitas /22");
            } else if (hosts[j]<=2046){
                sumaHost=sumaHost+2048;
                System.out.println("Necesitas /21");
            } else if (hosts[j]<=4094){
                sumaHost=sumaHost+4096;
                System.out.println("Necesitas /20");
            } 
            j++;
        }
        System.out.println("Ademas necesitas "+numeroEnlaces+" /30 para los enlaces");
        sumaHost=sumaHost+(numeroEnlaces*4);
        switch (mascaraGeneral){
            case 20:
                hostDisponibles=4096;
                break;
            case 21:
                hostDisponibles=2048;
                break;
            case 22:
                hostDisponibles=1024;
                break;
            case 23:
                hostDisponibles=512;
                break;
            case 24:
                hostDisponibles=256;
                break;
            default:
                System.out.println("Mascara no considerada, contacte con el dev");
    }
        System.out.println(hostDisponibles);
        System.out.println(sumaHost);
        if (sumaHost>hostDisponibles){
            System.out.println("Mascara de Red muy Pequeña!");
            System.exit(0);
        } else hostDisponibles=hostDisponibles-sumaHost;
        while(hostDisponibles>0){
            if (hostDisponibles>=4096){
                hostDisponibles=hostDisponibles-4096;
                System.out.println("Necesitas reserva de /20");
            } else if (hostDisponibles>=2048){
                hostDisponibles=hostDisponibles-2048;
                System.out.println("Necesitas reserva de /21");
            } else if (hostDisponibles>=1024){
                hostDisponibles=hostDisponibles-1024;
                System.out.println("Necesitas reserva de /22");
            } else if (hostDisponibles>=512){
                hostDisponibles=hostDisponibles-512;
                System.out.println("Necesitas reserva de /23");
            } else if (hostDisponibles>=256){
                hostDisponibles=hostDisponibles-256;
                System.out.println("Necesitas reserva de /24");
            } else if (hostDisponibles>=128){
                hostDisponibles=hostDisponibles-128;
                System.out.println("Necesitas reserva de /25");
            } else if (hostDisponibles>=64){
                hostDisponibles=hostDisponibles-64;
                System.out.println("Necesitas reserva de /26");
            } else if (hostDisponibles>=32){
                hostDisponibles=hostDisponibles-32;
                System.out.println("Necesitas reserva de /27");
            } else if (hostDisponibles>=16){
                hostDisponibles=hostDisponibles-16;
                System.out.println("Necesitas reserva de /28");
            } else if (hostDisponibles>=8){
                hostDisponibles=hostDisponibles-8;
                System.out.println("Necesitas reserva de /29");
            } else if (hostDisponibles>=4){
                hostDisponibles=-4;
                System.out.println("Necesitas reserva de /30");
            } 
        }
        System.out.println("Adios");
    }
    
}
