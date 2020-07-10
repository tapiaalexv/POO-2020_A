/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad1;

/**
 *
 * @author tapia
 */
public class EcuacionSegundoGrado {

    private int coeficienteA;
    private int coeficienteB;
    private int coeficienteC;
    private String tipoSolucion;

    public EcuacionSegundoGrado(int coeficienteA, int coeficienteB, int coeficienteC) {
        this.coeficienteA = coeficienteA;
        this.coeficienteB = coeficienteB;
        this.coeficienteC = coeficienteC;
    }

    public String getTipoSolucion() {
        return tipoSolucion;
    }
          
    public void analizarTipoDeSolucion() {

        double discriminante;

        discriminante = (Math.pow(coeficienteB, 2) - (4 * coeficienteA * coeficienteC));

        if (discriminante > 0) {
            tipoSolucion = "Dos raíces reales y diferente";
        } else if (discriminante == 0) {
            tipoSolucion = "Dos raíces reales e iguales";
        } else if (discriminante < 0) {
            tipoSolucion = "Dos raíces complejas y diferentes";
        }

    }   
    
    @Override
    public String toString() {
        if(coeficienteB < 0 && coeficienteC < 0){
            return coeficienteA + "X2 " + coeficienteB + "X " + coeficienteC + " = 0";
        }else if(coeficienteB < 0){
            return coeficienteA + "X2 " + coeficienteB + "X + " + coeficienteC + " = 0";
        }else if(coeficienteC < 0){
            return coeficienteA + "X2 + " + coeficienteB + "X " + coeficienteC + " = 0";
        }else{
            return coeficienteA + "X2 + " + coeficienteB + "X + " + coeficienteC + " = 0";
        }
    }
    
    public String presentarSolucion(){
        String solucion = "Solucion ->";
        double primeraRaiz;
        double segundaRaiz;
        double discriminante;
        
        discriminante = (int) (Math.pow(coeficienteB, 2) - (4 * coeficienteA * coeficienteC));  
        
        if(discriminante == 0){
            primeraRaiz = ((Math.negateExact(coeficienteB) + Math.sqrt(discriminante))/(2*coeficienteA));
            return solucion += " Primera Raiz = Segunda Raiz : "+String.format("%.2f",primeraRaiz);
        }else if (discriminante >0){
            primeraRaiz = ((Math.negateExact(coeficienteB) + Math.sqrt(discriminante))/(2*coeficienteA));
            segundaRaiz = ((Math.negateExact(coeficienteB) - Math.sqrt(discriminante))/(2*coeficienteA));
            return solucion += " Primera Raiz : "+String.format("%.2f",primeraRaiz)+" , Segunda Raiz: "+String.format("%.2f",segundaRaiz);
        }else{
            return solucion += " No se puede encontrar la solucion";
        }
    }
       

}
