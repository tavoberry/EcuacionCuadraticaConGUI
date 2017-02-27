/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavoreyeshdez
 */
public class EcuacionCuadratica {
    private int a;
    private int b;
    private int c;
    private double x1;
    private double x2;
    
    //Constructor de la clase
    public EcuacionCuadratica(){
        a=0;
        b=0;
        c=0;
        x1=0;
        x2=0;
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public int getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(int c) {
        this.c = c;
    }

    /**
     * @return the x1
     */
    public double getX1() {
        return x1;
    }

    /**
     * @param x1 the x1 to set
     */
    public void setX1(double x1) {
        this.x1 = x1;
    }

    /**
     * @return the x2
     */
    public double getX2() {
        return x2;
    }

    /**
     * @param x2 the x2 to set
     */
    public void setX2(double x2) {
        this.x2 = x2;
    }
    
    /**
     * Esta función obtiene la raíz X1 de una ecuación de 2o grado
     * usando la fórmula general
     */
    public void calcularX1(){
        double aux;
        double discriminante;
        
        discriminante = Math.pow(b, 2)-(4*a*c);
        if (discriminante == 0){
            aux = Math.sqrt(discriminante);
            aux = (-b+aux)/(2*a);
            x1=aux;
            x2=x1;
        }
        if (discriminante < 0){
            JOptionPane.showMessageDialog(null, "No existe solución", "Error",JOptionPane.INFORMATION_MESSAGE );
        }
        if (discriminante > 0){
            aux = Math.sqrt(discriminante);
            aux = (-b+aux)/(2*a);
            x1=aux;    
        }
        
    }
    
     /**
     * Esta función obtiene la raíz X2 de una ecuación de 2o grado
     * usando la fórmula general
     */
    public void calcularX2(){
        double aux;
        double discriminante;
                
        discriminante = Math.pow(b, 2)-(4*a*c);
        if (discriminante == 0){
            aux = Math.sqrt(discriminante);
            aux = (-b+aux)/(2*a);
            x1=aux;
            x2=x1;
        }
        if (discriminante < 0){
            JOptionPane.showMessageDialog(null, "No existe solución", "Error",JOptionPane.INFORMATION_MESSAGE );
        }
        if (discriminante > 0){
            aux = Math.sqrt(discriminante);
            aux = (-b-aux)/(2*a);
            x2=aux;    
        }
        
    }
}
