/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad2;

/**
 *
 * @author alexi
 */
public class Libro {
    
    private String titulo;
    private String edicion;
    private int tipoISBN;
    private String numeroISBN;
    private int numeroPaginas;

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public int getTipoISBN() {
        return tipoISBN;
    }

    public void setTipoISBN(int tipoISBN) {
        this.tipoISBN = tipoISBN;
    }

    public String getNumeroISBN() {
        return numeroISBN;
    }

    public void setNumeroISBN(String numeroISBN) {
        this.numeroISBN = numeroISBN;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    public boolean esISBNValido(){
        switch (tipoISBN) {
            case 10:
                if(numeroISBN.length()==10){
                    return true;
                }   break;
            case 13:
                if(numeroISBN.length()==13){
                    return true;
                }   break;
            default:
                return false;
        }
        return (false);
    }

    @Override
    public String toString() {
        return "Libro{" + "Titulo =" + titulo + ", Edición =" + edicion + ", ISBN-"
                + "" + tipoISBN + " =" + numeroISBN + ", Numero de Paginas =" + numeroPaginas + '}'+'\n';
    }
    
    
    
            
    
}
