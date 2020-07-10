/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cap1.ej2;

/**
 *
 * @author tapia
 */
public class Veterinario {
    
    public String diagnosticar (Raton ratonPaciente){
        String mensaje = "El raton ";
        double relacion = ratonPaciente.getEdad() / ratonPaciente.getPeso();
        
        if (relacion < 0.25) {
            mensaje += "debe comer mas";
        }else{
            mensaje += " esta ok";
        }
        return mensaje;
    }
    
}
