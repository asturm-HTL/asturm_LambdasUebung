/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.asturm.lambdasuebung;

/**
 *
 * @author asturm
 */
public class Number 
{

    private double a;
    private double b;

   //----------------------------Getter-------------------------------
    public double getA() {
        return a;
    }
    
    public double getB() {
            return b;
        }
    //------------------------------Setter------------------------------
    public void setA(double a) {
        this.a = a;
    }
    
    public void setB(double b) {
        this.b = b;
    }
    
    //----------------------Interface--------------------------------
    @FunctionalInterface
    public interface CalculationOperation 
    { 
        Number calc (Number x, Number y); 
    }

    
}
