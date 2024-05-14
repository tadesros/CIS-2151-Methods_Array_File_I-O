/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tomad
 */
public class MethodJoy {
    
    public static void main(String[] args)
    {
        //5 is the argument
        int myNum = square(5);
        
        int[] someArr = new int[2];
        
        someArr[0] = square(22);
        someArr[1] = square(10);
        
        
        printArray(someArr);
        
        
        
        //myNum is the argument
        int myOtherNum = square(myNum);
        
        //
        int anotherNum = square(square(2));
        
        System.out.println("myNum = " + myNum);
        System.out.println("myOtherNumber = " + myOtherNum);
        System.out.println("anotherNum = " + anotherNum);
        
        
    }//End Main    
       
    //Parameterized
    //Value-Returning parameter n
    public static int square(int n){
        
        return n * n;
    }//End Square
  
    //Void parameterized method
    //Pass by value everything is pass by value
    //Effectively pass by reference refers to same object 
    public static void printArray(int[] arr){
        
        for(int num : arr){
            System.out.println(num); 
        }
        
    }//end printArray
}
