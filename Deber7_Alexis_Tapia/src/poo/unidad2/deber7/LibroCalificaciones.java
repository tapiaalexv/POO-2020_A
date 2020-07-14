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

    public void definirTamano(int tamano) {
        calificaciones = new int[tamano];
    }

    public void llenarNota(int indice, int nota) {
        calificaciones[indice] = nota;
    }

    public void imprimirNotas() {
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Nota " + (i + 1) + ": " + calificaciones[i] + '\n');
        }
    }

    public int calcularPromedio() {
        int promedio = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            promedio += calificaciones[i];
        }
        promedio = promedio / calificaciones.length;

        return promedio;
    }

    public int calcularNotaMasBaja() {
        int notaMasBaja;
        int notaAux;

        notaMasBaja = 20;

        for (int i = 0; i < calificaciones.length; i++) {
            notaAux = calificaciones[i];
            if (notaAux < notaMasBaja) {
                notaMasBaja = notaAux;
            }
        }

        return notaMasBaja;
    }

    public int calcularNotaMasAlta() {
        int notaMasAlta;
        int notaAux;

        notaMasAlta = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            notaAux = calificaciones[i];
            if (notaAux > notaMasAlta) {
                notaMasAlta = notaAux;
            }
        }

        return notaMasAlta;
    }

    public void ordenarCalificaciones() {
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

    public void presentarDistribucionCalificaciones() {
        int deficiente = 0;
        int regular = 0;
        int buena = 0;
        int muyBuena = 0;
        int excelente = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] > 18 && calificaciones[i] < 21) {
                excelente++;
            } else if (calificaciones[i] > 16 && calificaciones[i] < 19) {
                muyBuena++;
            } else if (calificaciones[i] > 13 && calificaciones[i] < 17) {
                buena++;
            } else if (calificaciones[i] > 8 && calificaciones[i] < 14) {
                regular++;
            } else if (calificaciones[i] >= 0 && calificaciones[i] < 9) {
                deficiente++;
            }
        }

        System.out.print("Excelente:\t");
        if (excelente > 0) {
            for (int i = 1; i <= excelente; i++) {
                System.out.print("*");
            }
        }
        System.out.print("\nMuy Buena:\t");
        if (muyBuena > 0) {
            for (int i = 1; i <= muyBuena; i++) {
                System.out.print("*");
            }
        }
        System.out.print("\nBuena:\t");
        if (buena > 0) {
            for (int i = 1; i <= buena; i++) {
                System.out.print("*");
            }
        }
        System.out.print("\nRegular:\t");
        if (regular > 0) {
            for (int i = 1; i <= regular; i++) {
                System.out.print("*");
            }
        }
        System.out.print("\nDeficiente:\t");
        if (deficiente > 0) {
            for (int i = 1; i <= deficiente; i++) {
                System.out.print("*");
            }
        }

    }

}
