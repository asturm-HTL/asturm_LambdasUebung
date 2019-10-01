/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.asturm.lambdasuebung;

import net.htlgrieskirchen.asturm.lambdasuebung.Number.CalculationOperation;

/**
 *
 * @author user
 */
public abstract class AbstractCalculator 
{

    protected CalculationOperation add; 
    protected CalculationOperation subtract ; 
    protected CalculationOperation multiply ; 
    protected CalculationOperation divide ;
    
    public AbstractCalculator ( CalculationOperation add , CalculationOperation subtract , CalculationOperation multiply , CalculationOperation divide ) 
    {
        this.add = add;
        this.divide =divide;
        this.multiply = multiply;
        this.subtract = subtract;
    }

    public abstract Number add(Number a , Number b); 
    public abstract Number subtract (Number a , Number b); 
    public abstract Number multiply (Number a , Number b); 
    public abstract Number divide (Number a , Number b);

    
}
