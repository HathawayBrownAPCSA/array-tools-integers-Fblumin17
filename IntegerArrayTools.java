/** The class IntegerArrayTools implements a variety of basic array tasks
  * using an array of integers.
  * 
  * The array has a fixed length MAX_NUMS but the actual number of elements
  * that are used can vary.
  */

import java.util.Scanner;

public class IntegerArrayTools
{
  
  private int[] arrayData;
  private int arrayCount;
  public final int MAX_NUMS = 100;
  
  // ------------------ CONSTRUCTOR ----------------------------
  /** The contsructor merely creates the array.
    * It does not fill it with any data.  That is left up to 
    * the fillRandom or fillKeyboard methods.
    */
  public IntegerArrayTools ()
  {
    arrayData = new int[MAX_NUMS];
    arrayCount = 0;
  }
  
  /** Returns the number of objects in the array.
    * @return the count of items in the array. */
  public int getCount ()
  {
    return arrayCount;
  }
  
  // ------------------- METHODS TO FILL THE ARRAY -------------------------
  /** Adds an element to the end of the array. 
    * @param n The element to add
    * @return whether the element was successfully added
    */
  public boolean addItem (int n)
  {
    if (arrayCount < MAX_NUMS)
    {
      arrayData[arrayCount] = n;
      arrayCount++;
      return true;
    }
    else
      return false;
  }
  
    /** Fills the array nums with integers from 1 to n
    * @param n Upper bound for numbers with which to fill the array.
    * @param count the array to fill.  Returns a modified array.
    */
  public void fillRandom (int n, int count)
  {
    if (count > MAX_NUMS)       // check that it's not too many items
      count = MAX_NUMS;
    for (int i = 0; i < count; i++)
      addItem((int)(Math.random() * n) + 1);
  }
  
  /** Fills the array with integers entered by the user
    * @param nums the array to fill.  Returns a modified array.
    */
  public void fillKeyboard ()
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println ("Please enter integers on one line, separated by spaces.");
    System.out.println ("Use -1 to signal the end of the list.");
    
    arrayCount = 0;
    int n = keyboard.nextInt();
    while (n != -1)                 // stop input when user enters -1
    {
      addItem(n);
      n = keyboard.nextInt();
    }
    keyboard.close();
  }
  
  // -------------------- METHODS TO WORK WITH THE ARRAY --------------------------
  /** Prints the array, spaces between numbers.
    */
  public void printArray ()
  {
    for (int i = 0; i < arrayCount; i++)
      System.out.print (arrayData[i] + "  ");
    System.out.println();
  }
  
  /** Find the sum of an integer array
    * @return the sum of the elements in the array
    */
  public int sumArray ()
  {
    int sum = 0;
    for (int i = 0; i < arrayCount; i++)
      sum = sum + arrayData[i];
    return sum;
  }
    /** Find the max integer of an integer array
    * @return the max value of the elements in the array
    */
  public int getMax()
  { 
    int maxValue = arrayData[0]; 
    for(int i=1; i < arrayData.length;i++)
    { 
      if (arrayData[i] > maxValue)
      { 
        maxValue = arrayData[i]; 
      } 
    }
    return maxValue;
  }
  
   /**Find the index of the max integer of an integer array
    * @return the index of the max integer
    */ 
  
  public int getMaxIndex()
  { 
    int maxValue = arrayData[0];
    int index = 0;
    for(int i=1; i < arrayData.length;i++)
    { 
      if (arrayData[i] > maxValue)
      { 
        maxValue = arrayData[i];
        index = i;
      } 
    }
    return index;
  }

  
    /** Find the min integer of an integer array
    * @return the min value of the elements in the array
    */
  public int getMin()
  { 
    int minValue = arrayData[0]; 
    for(int i=1; i < arrayData.length;i++)
    { 
      if (arrayData[i] < minValue)
      { 
        minValue = arrayData[i]; 
      } 
    }
    return minValue;
  }

    
   /**Find the index of the min integer of an integer array
    * @return the index of the min integer
    */ 
  
  public int getMinIndex()
  { 
    int minValue = arrayData[0];
    int index = 0;
    for(int i=1; i < arrayData.length;i++)
    { 
      if (arrayData[i] < minValue)
      { 
        minValue = arrayData[i];
        index = i;
      } 
    }
    return index;
  }


  
  /** Tests the various array tools */
  public static void main (String[] args)
  {
    IntegerArrayTools myArray = new IntegerArrayTools();
    //myArray.fillRandom(100, 12);
    myArray.fillKeyboard ();
    myArray.printArray ();
    System.out.println ("There are " + myArray.getCount() + " integers in the array.");
    System.out.println ("The sum is " + myArray.sumArray());
    System.out.println ("The largest item is " + myArray.getMax() ); 
    System.out.println ("The largest item is at index " + myArray.getMaxIndex());
    System.out.println ("The smallest item is " + myArray.getMin() );
    System.out.println ("The smallest item is at index " + myArray.getMinIndex());
    
  }
}
    
    
  
  
         