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

    private static  int numberOfCommandLines; //First Line of the txt File will be stored in here. 
    private static ArrayList<String> commandStrings = new ArrayList<>();
    
    public NumberTester(String fileName) throws FileNotFoundException, IOException
    {
        
        BufferedReader br = new BufferedReader(new FileReader(fileName));
            // fileName would be: "C:\\Users\\user\\Documents\\NetBeansProjects\\asturm_LambdasUebung\\numbertester_input.txt "
        numberOfCommandLines = Integer.parseInt(br.readLine());

       

        for(int i = 0; i<=numberOfCommandLines; i++)
        {

            if(i != 0)
            {

                commandStrings.add(br.readLine().toString()); 

                /*commandsAsStrings[i] = br.readLine();
                System.out.println(commandsAsStrings[i]);*/
            }


        }
        System.out.println(commandStrings);
        
        //String[] splittedCommandString = commandStrings.get(0).split(" ", 2);
        //System.out.println("split: "+ splittedCommandString[0]);
        
        for(int i = 0; i<5; i++)
        {
            String[] splittedCommandString = commandStrings.get(i).split(" ", 2);
            System.out.println("split: "+ splittedCommandString[0]);
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
    
    
    public static void main(String[] args) throws IOException 
    {
        
        //for tests
        NumberTester nt = new NumberTester("C:\\Users\\user\\Documents\\NetBeansProjects\\asturm_LambdasUebung\\numbertester_input.txt ");
    }
}
