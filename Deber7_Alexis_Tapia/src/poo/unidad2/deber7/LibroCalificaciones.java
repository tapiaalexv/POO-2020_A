/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad2.deber7;

/**
 *
 * @author tapia
 */
public class LibroCalificaciones {
    
    private String materia;
    private int[] calificaciones;

    public LibroCalificaciones() {
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public void definirTamano(int tamano){
        calificaciones = new int[tamano];
    }
    
    public void llenarNota(int indice,int nota){
        calificaciones[indice] = nota;
    }
    
    public void calcularPromedio(){
    }
    
    public int calcularNotaMasBaja(){
        int notaMasBaja;
        int notaAux;
        
        notaMasBaja = 20;
                
        for(int i = 0; i < calificaciones.length; i++){
            notaAux = calificaciones[i];
            if(notaAux<notaMasBaja){
                notaMasBaja = notaAux;
            }
        }

        return notaMasBaja;
    }
    
    public int calcularNotaMasAlta(){
        int notaMasAlta;
        int notaAux;
        
        notaMasAlta = 0;
                
        for(int i = 0; i < calificaciones.length; i++){
            notaAux = calificaciones[i];
            if(notaAux>notaMasAlta){
                notaMasAlta = notaAux;
            }
        }

        return notaMasAlta;
    }
    
    public void ordenarCalificaciones(){       
        int notaAux = 0;
        //Metodo Burbuja
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 1; j < (calificaciones.length - i); j++) {
                if (calificaciones[j - 1] > calificaciones[j]) {
                    notaAux = calificaciones[j - 1];
                    calificaciones[j - 1] = calificaciones[j];
                    calificaciones[j] = notaAux;
                }
            }
        }
        
    }
    
    public void presentarDistribucionCalificaciones(){
        int deficiente = 0;
        int regular = 0;
        int bueno = 0;
        int muyBueno = 0;
        int excelente = 0;
        
        for(int i = 0; i < calificaciones.length ; i++){
            if(calificaciones[i]>18 && calificaciones[i]<21){
                excelente++;
            }else if(calificaciones[i]>16 && calificaciones[i]<19){
                muyBueno++;
            }else if(calificaciones[i]>13 && calificaciones[i]<17){
                bueno++;
            }else if(calificaciones[i]>8 && calificaciones[i]<14){
                regular++;
            }else if(calificaciones[i]>=0 && calificaciones[i]<9){
                deficiente++;
            }
        }
 
    }
    
        
    
}
