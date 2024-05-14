import java.util.ArrayList;



/**
 *
 * @author tomad
 */
public class ArrayListFun {
    
    public static void main(String[] args)
    {
        

        ArrayList<String> myAL = new ArrayList<String>();
        
        //What if you need int? 
        //Cannot handle prmitives
        ArrayList<Integer> myIntAL = new ArrayList<>();
        
        myIntAL.add(15);     //Auto Boxing   
        
        int myFavInt = myIntAL.get(0); //Auto unboxing
        
        System.out.println("My favorite int: " + myFavInt);
        
        myAL.add("John");
        myAL.add("Bob");
        myAL.add("Ksenia");
        myAL.add("Sally");
        
 /*       for(int i=0; i<myAL.size(); i++)
        {
            System.out.println(myAL.get(i));
        }
 */
         //ENHANCED for Loop
         //Variaton on the for loop
         for(String name : myAL)
         {
             System.out.println(name);
         }
 
 
    }//End of main
   
    
}  //End of Class definition
