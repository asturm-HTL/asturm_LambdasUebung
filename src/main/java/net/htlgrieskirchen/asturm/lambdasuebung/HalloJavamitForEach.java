/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.asturm.lambdasuebung;

import java.util.*;

/**
 *
 * @author asturm
 */
public class HalloJavamitForEach 
{

    public static void main(String[] args) 
    {
    
        List<String> stringList = new ArrayList<String>();
        
        stringList.add("Veganer");
        stringList.add("David");

             System.out.println("---------------------for-each loop-------------------------------");
             System.out.println(" ");
        
        for(String s : stringList) System.out.println(s);
        
             System.out.println("---------------------forEach method-------------------------------");
             System.out.println(" ");
        
         stringList.forEach((String s) -> System.out.println(s));
        
             System.out.println("---------------------forEach method-reference---------------------");
             System.out.println(" ");
             stringList.forEach(System. out :: println );


        
    }
    
}
