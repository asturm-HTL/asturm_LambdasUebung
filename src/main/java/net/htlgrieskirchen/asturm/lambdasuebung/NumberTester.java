package net.htlgrieskirchen.asturm.lambdasuebung;

import java.io.*;

/**
 *
 * @author asturm
 */
public class NumberTester 
{

    int numberOfCommandLines; //First Line of the txt File will be stored in here. 
    
    public NumberTester(String fileName) throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
            //fileName would be: " C:\\Users\\user\\Documents\\NetBeansProjects\\asturm_LambdasUebung\\numbertester_input.txt "
        numberOfCommandLines = Integer.parseInt(br.readLine());
        
        for(int i = 0; i<=numberOfCommandLines; i++)
        {
            
            
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
