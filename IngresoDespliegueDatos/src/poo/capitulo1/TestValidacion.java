/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad2.deber4;

/**
 *
 * @author Usuario
 */
public class TestValidacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String correo = "gabriel.caceres@epn.edu.ec";
        String usuario= "17bas";
        
        if(Validacion.esCorreo(correo)){
            System.out.println("Correo Valido");
        } else System.out.println("Correo No valido");
        
        if(Validacion.esUsuario(usuario)){
            System.out.println("Usuario Valido");
        } else System.out.println("Usuario No valido");
    }
    
}
