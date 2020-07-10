/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad2.deber3;

/**
 *
 * @author justi
 */
public class Persona {
    private String name, lastName, dNI, province;
    
    public Persona(String nombre, String apellido, String numeroCedula){
        this.name = nombre;
        this.lastName = apellido;
        this.dNI = numeroCedula;
        this.province = province;
    }
    
    public boolean esPalindromo(Persona otraPersona){
        String nombre = this.name;
        StringBuilder builder = new StringBuilder(nombre);
        String cadenaInvertida = builder.reverse().toString();
        return nombre.equalsIgnoreCase(cadenaInvertida);
    }
    
    public boolean validarCedula(Persona otraPersona){
        String numeroCedula = this.dNI;
        int digitoVerificador = Integer.parseInt(numeroCedula.substring(9)); 
        int sumaImpares = 0;
        int sumaPares = 0;
        for(int i = 0; i < 10; i+=2){
            char numeroImpar = this.dNI.charAt(i);
            String numImpar = Character.toString(numeroImpar);
            int numberImpar = Integer.parseInt(numImpar)*2;
            if(numberImpar > 9){
                numberImpar = numberImpar - 9;
            }
            sumaImpares += numberImpar;
        }
        for(int i = 1; i <9; i+=2){
            char numeroPar = this.dNI.charAt(i);
            String numPar = Character.toString(numeroPar);
            int numberPar = Integer.parseInt(numPar);
            sumaPares += numberPar;
        }
        int sumaTotal = sumaPares + sumaImpares;
        int verificadorCalculado = (sumaTotal + 10 - (Integer.parseInt(Character.toString((Integer.toString(sumaTotal).charAt(1)))))) - sumaTotal;
        if(verificadorCalculado == digitoVerificador){
            return true;
        }else{
            return false;
        }
    }
    
    public String determinarProvincia(Persona otraPersona){
        String numeroCedula = this.dNI;
        String provincia = "";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("01"))
            provincia = "Azuay";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("02"))
            provincia = "Bolívar";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("03"))
            provincia = "Cañar";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("04"))
            provincia += "Carchi";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("05"))
            provincia += "Cotopaxi";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("06"))
            provincia += "Chimborazo";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("07"))
            provincia += "El Oro";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("08"))
            provincia += "Esmeraldas";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("09"))
            provincia += "Guayas";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("10"))
            provincia += "Imbabura";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("11"))
            provincia += "Loja";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("12"))
            provincia += "Los Rios";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("13"))
            provincia += "Manabí";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("14"))
            provincia += "Morona Santiago";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("15"))
            provincia += "Napo";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("16"))
            provincia += "Pastaza";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("17"))
            provincia += "Pichincha";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("18"))
            provincia += "Tungurahua";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("19"))
            provincia += "Zamora Chinchipe";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("20"))
            provincia += "Galápagos";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("21"))
            provincia += "Sucumbios";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("22"))
            provincia += "Orellana";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("23"))
            provincia += "Santo Domingo de los Tsáchilas";
        if(numeroCedula.substring(0,2).equalsIgnoreCase("24"))
            provincia += "Santa Elena";
        /*else
            provincia += "Pendiente";*/
        return provincia;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    
    
}
