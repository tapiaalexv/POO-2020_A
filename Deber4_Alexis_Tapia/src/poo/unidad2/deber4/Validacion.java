/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad2.deber4;

/**
 *
 * @author tapia
 */
public class Validacion {
    
    public static boolean esCorreoValido(String correo){
        return correo.matches("[a-z]+[.][a-z]+[0-9]*@epn[.]edu[.]ec");
    }
    
    public static boolean esUsuarioValido(String usuario){
        return usuario.matches("[a-z \\_ \\- 0-9]{5,14}");
    }
    
}
