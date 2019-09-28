package net.htlgrieskirchen.asturm.lambdasuebung;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author asturm
 */
public class NumberTester 
{

    public static  int numberOfCommandLines; //First Line of the txt File will be stored in here. 
    //public static String[] commandsAsStrings; //The Following lines will be stored in here before they get split.
    
    
    public NumberTester(String fileName) throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
            //fileName would be: 
        numberOfCommandLines = Integer.parseInt(br.readLine());
        
        ArrayList<String> result = new ArrayList<>();
        
        for(int i = 0; i<=numberOfCommandLines; i++)
        {
            
            if(i != 0)
            {
                
                result.add(br.readLine().toString());
                
                /*commandsAsStrings[i] = br.readLine();
                System.out.println(commandsAsStrings[i]);*/
            }
            
        }
        
    }
    
    public void setOddEvenTester(NumberTest oddTester)
    {
        
        
        
    }
    
    public void setPrimeTester(NumberTest primeTester)
    {
        
        
        
    }
    
    public void setPalindromeTester(NumberTest palidromeTester)
    {
        
        
        
    }
    
    public void testFile()
    {
        
        
        
    }
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        
        //for tests
        
 
    }
}
