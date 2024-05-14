

/**
 *
 * @author tomad
 */
public class ArrayFun {
    
    public static void main(String[] args)
    {
        int[] myArr = new int[5]; //Called cells in array living in cell element
       
        int[] yourArr;
        
        
        myArr[0] = 150;
        myArr[1] = 22;
        myArr[2] = 37;
        myArr[3] = 44;
        myArr[4] = 400;
        
        
        yourArr = myArr; //This copies references to yourArr. 
                         //Same array
                         
        yourArr[2] = -1000;  //YourArr modifies myArr point to SAME OBJECT!!!
                             //Distinguish between reference and the object itself
                             
                             //In Reality it's a reference.
                             //It is an address not an object. 
                             
        
        for(int i=0; i < myArr.length;i++)
        {
            System.out.println(myArr[i]);
        }
        
        
        
    }//End Main
    
}// End Class Definition
