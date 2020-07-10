/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.unidad2;

/**
 *
 * @author tapia
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String cedula;
    private String provinciaNatal;
    private String estadoCivil;
    private String pasaTiempoFavorito;
    private String ciudadesQueConoce = "";

    public Persona(){
    
    }
    
    public Persona(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public String getCiudadesQueConoce() {
        return ciudadesQueConoce;
    }

    public void setCiudadesQueConoce(String ciudadesQueConoce) {
        this.ciudadesQueConoce = ciudadesQueConoce;
    }
    
    

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setProvinciaNatal(String provinciaNatal) {
        this.provinciaNatal = provinciaNatal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getPasaTiempoFavorito() {
        return pasaTiempoFavorito;
    }

    public void setPasaTiempoFavorito(String pasaTiempoFavorito) {
        this.pasaTiempoFavorito = pasaTiempoFavorito;
    }

    public void anadirCiudades(String ciudad){
        ciudadesQueConoce += "  "+ciudad;
    }

    public boolean esPalindromo() {
        StringBuilder auxiliar = new StringBuilder(nombre);
        String nombreInvertido = auxiliar.reverse().toString();

        return nombre.equalsIgnoreCase(nombreInvertido);
    }

    public boolean esCedulaValida() {
        int i, aux, posicionesImpares = 0, posicionesPares = 0, numeroComparador;
        String valorDefault = null;
        int cedulaComprobacion[] = new int[10];
        char cedulaAuxiliar[] = cedula.toCharArray();

        if (cedula.length() == 10) {
            for (i = 0; i <= 9; i++) {
                cedulaComprobacion[i] = (cedulaAuxiliar[i] - '0');
            }
            for (i = 0; i <= 8; i += 2) { //Suma de posiciones impares
                aux = cedulaComprobacion[i] * 2;
                if (aux > 9) {
                    aux -= 9;
                }
                posicionesImpares += aux;
            }
            for (i = 1; i <= 8; i += 2) { //Suma de posiciones pares
                aux = cedulaComprobacion[i];
                posicionesPares += aux;
            }
            numeroComparador = posicionesImpares + posicionesPares;
            if (numeroComparador % 10 == 0) {
                numeroComparador = 0;
            } else {
                numeroComparador = 10 - (numeroComparador % 10);
            }

            if (numeroComparador == cedulaComprobacion[9]) {
                return true;
            } else {
                setCedula(valorDefault);
                return false;
            }
        } else {
            setCedula(valorDefault);
            return false;
        }
    }

    public void determinarProvincia() {
        String provincia = null;

        if (cedula == null) {
            provincia = "Pendiente";
            setProvinciaNatal(provincia);
        } else {
            switch (cedula.substring(0, 2)) {
                case "01":
                    provincia = "Azuay";
                    break;
                case "02":
                    provincia = "Bolivar";
                    break;
                case "03":
                    provincia = "Cañar";
                    break;
                case "04":
                    provincia = "Carchi";
                    break;
                case "05":
                    provincia = "Cotopaxi";
                    break;
                case "06":
                    provincia = "Chimborazo";
                    break;
                case "07":
                    provincia = "El Oro";
                    break;
                case "08":
                    provincia = "Esmeraldas";
                    break;
                case "09":
                    provincia = "Guayas";
                    break;
                case "10":
                    provincia = "Imbabura";
                    break;
                case "11":
                    provincia = "Loja";
                    break;
                case "12":
                    provincia = "Los Rios";
                    break;
                case "13":
                    provincia = "Manabi";
                    break;
                case "14":
                    provincia = "Morona Santiago";
                    break;
                case "15":
                    provincia = "Napo";
                    break;
                case "16":
                    provincia = "Pastaza";
                    break;
                case "17":
                    provincia = "Pichincha";
                    break;
                case "18":
                    provincia = "Tungurahua";
                    break;
                case "19":
                    provincia = "Zamora Chinchipe";
                    break;
                case "20":
                    provincia = "Galapagos";
                    break;
                case "21":
                    provincia = "Sucumbios";
                    break;
                case "22":
                    provincia = "Orellana";
                    break;
                case "23":
                    provincia = "Santo Domingo de los Tsachilas";
                    break;
                case "24":
                    provincia = "Santa Elena";
                    break;
            }
            setProvinciaNatal(provincia);
        }

    }

    @Override
    public String toString() {
        return "Nombre = " + nombre +'\n'+"Apellido = " + apellido + '\n'+"Cedula = " + cedula +""
                +'\n'+"Provincia Natal = "+provinciaNatal+'\n'+"Pasa Tiempo = "+pasaTiempoFavorito+'\n'+""
                + "Estado Civil = "+estadoCivil+'\n'+"Ciudades que conoce = "+ciudadesQueConoce;
    }

}
