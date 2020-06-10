/**
 * This class maintains an arbitrary length list of integers.
 * 
 * In this version 1:
 * 1. The size of the list is fixed after the object is created.
 * 2. The code assumes there is at least one element in the list.
 * 
 * This class introduces the use of loops.
 * 
 * @author Raymond Lister 
 * @version September 2014
 * 
 */
public class ListOfNVersion01PartB
{   
    private int[] list;  // Note: no "= {0, 1, 2, 3}" now

    /**
     * This constructor initializes the list to the same values
     * as in the parameter.
     *
     * @param  element   the initial elements for the list
     */
    public ListOfNVersion01PartB(int [] element)
    {
        // with constant subscripts for ListOf4...
        // list[0] = element[0];
        // list[1] = element[1];
        // list[2] = element[2];
        // list[3] = element[3];

        // with variable subscripts for ListOf4 ... 
        // 1. Initialisation to start the "loop" ...
        // int i = 0; // role: stepper 

        // list[i] = element[i];
        // i = i+1;              // 3. changes to "i" inside the "loop"
        // list[i] = element[i]; //    eventually stops the loop. 
        // i = i+1;
        // list[i] = element[i];
        // i = i+1;
        // list[i] = element[i]; //   2. "loop" terminates at end of array.

        // with a loop for ListOfN ... 

        

        // make "list" be an array the same size as "element"
        list = new int[element.length];  
      for(int i = 0; i < element.length; i++){
            list[i] = element[i];
        }

         

    } // constructor ListOfNVersion01Skeleton(int [] element)

    /**
     * @return     the first element in the list 
     */
    public int getFirst()
    {
        return list[0];

    } // method getFirst

    /**
     * In ListOfN in this test, the toString method
     * should return a String such that:
     * 
     * 1. The String begins with an open brace "{" followed
     *    IMMEDIATELY (i.e. no space) by the first element
     *    of the list.
     * 2. All remaining elements of the list are preceded by
     *    ", " (i.e. a comma folowed by a SINGLE space).
     * 3. The String ends with a closing brace "}".
     *
     * e.g. "{1, 2, 3, 4}"
     * 
     * @return     A summary of the contents of the list.
     */
    public String toString()
    {
        String s = "{" + list[0]; // role: gatherer

        for(int i = 1; i < list.length; i++){
            s += ", "+list[i];
        }
        
        s += "}";

        return s;

    } // method toString

    public void insertFirst(int num)
    {   
        // with variable subscripts ... 
        
        for(int i = list.length - 1; i > 0; i--)
        {            
            //temp = numbers[i];
            list[i] = list[i-1];
            //numbers[i-1] = temp;
        }
        list[0] = num;
    } // method insertFirst
    
    public void reverse()
    {   
       // with variable subscripts ...
       int temp;
       for(int i = 0; i < list.length /2; i++)
       {
           int j = list.length-1 -i;
           temp = list[i];
           list[i] = list[j];
           list[j] = temp;
        }
        
    } // method reverse
    
    /**
     * @return     the sum of the elements of the array
     */
    public int sum()
    {
        int sum = 0;
        for(int i = 0; i < list.length; i++)
        {
            sum += list[i];
        }

        return sum;

    } // method sum 

    /**
     * @return     the number of times the replacement was made (i.e. 0 or 1)
     * 
     * @param  replaceThis   the element to be replaced
     * @param  withThis      the replacement
     */
    public int replaceOnce(int replaceThis, int withThis)
    {        
        for (int i = 0; i < list.length; i++)
        {
            if(list[i] == replaceThis){
                list[i] = withThis;
                return 1;
            }
        }
            

        return 0;

    } // method replaceOnce 

    /**
     * @return     the value of the smallest element in the array
     */
    public int minVal()
    {
        int mostWantedHolder = 0;  // role: Most-wanted holder        
        for(int i = 0; i < list.length; i++){
            if(list[i] < list[mostWantedHolder]){
                mostWantedHolder = i;
            }
        }
 
        return list[mostWantedHolder];
    }
}
// class ListOfNVersion01PartB
