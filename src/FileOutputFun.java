import java.io.FileNotFoundException;
import java.io.PrintWriter;
        
        
/**
 *
 * @author tomad
 */
public class FileOutputFun {
    
    public static void main(String[] args){
        //Variable Capable of Holding Address of a PrintWriter Object
        PrintWriter pw;
        
        try{
             //Creates the printwriter object
             pw = new PrintWriter("output.txt");
             
             pw.println("Hello There!");
             
             pw.print("Tom DeRosies\tTom Desrosiers\tAll oxifree\n");
             pw.println("\n\n");
             pw.println("File done writing");
             
             pw.close();
            
        }
        catch(FileNotFoundException ex){
         System.out.println("Cannot find file!");
        }
        
        System.out.println("Done!");
        
    }
    
}
