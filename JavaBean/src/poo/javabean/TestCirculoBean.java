/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.javabean;

import javax.swing.JOptionPane;

/**
 *
 * @author tapia
 */
public class TestCirculoBean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //JOptionPane.showMessageDialog(null, "Ingrese el radio: ","INGRESA",JOptionPane.INFORMATION_MESSAGE);
        
        String aux = JOptionPane.showInputDialog("Ingrese el radio 1:");
        double radio1 = Double.parseDouble(aux);
        CirculoBean c1 = new CirculoBean(radio1);
        JOptionPane.showMessageDialog(null,"El circulo tiene un radio de: "+c1.getRadio()+
                ", diametro: "+c1.getDiametro()+" y un area: "+c1.getArea());
        
        double radio2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio 2:"));
        
        //Ejemplos clases wrapper
        System.out.println(Boolean.logicalAnd(true, false));
        System.out.println(Integer.min(5, 0));
        
        System.exit(0);
    }
    
}
