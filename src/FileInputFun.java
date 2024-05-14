/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author tomad
 */
public class FileInputFun {
    
    public static void main(String[] args){
        
        Scanner infile;
        String name;
        
        
        try{
            
            infile = new Scanner(new File("input.txt"));  
            
            
            while(infile.hasNext())
            {
                
                name = infile.nextLine();
                System.out.println(name);
                
            }//end while
                
            
            
            
            infile.close(); //Close the file.
        }
        catch(FileNotFoundException ex){
            System.out.println("Error opening file.");
        }//End try catch
        
    }//End Main
    
}
