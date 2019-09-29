package net.htlgrieskirchen.asturm.lambdasuebung;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author asturm
 */
public class NumberTester implements NumberTest
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
        
        for(int i = 0; i<numberOfCommandLines; i++)
        {
            String[] splittedCommandString = commandStrings.get(i).split(" ", 2);
            System.out.println("split: "+ splittedCommandString[0]);
            
            int commandNumbers = Integer.parseInt(splittedCommandString[0]);
            int testingNumbers = Integer.parseInt(splittedCommandString[1]);
                     
            switch(commandNumbers)
            {              
                case 1: 
                    setOddEvenTester();
                    break;
                case 2:
                    setPrimeTester();
                    break;
                case 3: 
                    setPalindromeTester();
                    break;
            }
        }
        


    
    }
    
    public void setOddEvenTester(/*NumberTest oddTester*/)
    {
        
        System.out.println("Des is da ungerade/grade zoin tester");
               
        
    }
    
    public void setPrimeTester(/*NumberTest primeTester*/)
    {
        
        System.out.println("des is da primzoin tester");
               
        
    }
    
    public void setPalindromeTester(/*NumberTest palindromeTester*/)
    {
        
        System.out.println("palindrom oida");
        
    }
    
    public void testFile()
    {
        
        
        
    }
    
    
    public static void main(String[] args) throws IOException 
    {
        
        //for tests
        NumberTester nt = new NumberTester("C:\\Users\\user\\Documents\\NetBeansProjects\\asturm_LambdasUebung\\numbertester_input.txt ");
    }

    @Override
    public boolean testNumber(int number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
