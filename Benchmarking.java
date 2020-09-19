/* 
Tanner Crane 

PA1: Programming Assignment 1 

Git Hub URL: https://github.com/Cybernetic1001/CPTS-233.git

*/

import java.util.*;
import java.io.*; 

class Benchmarking
{
  public static void main (String[] args) 
  {
    try {

      File file = new File("input1.txt");
      
      BufferedReader br = new BufferedReader(new FileReader(file)); // create object of type BufferedReader 
      ArrayList<Integer> arr = new ArrayList<Integer>(); //Declare arr list 
      
      for(int j = 0; j < 1000; j++)
{
      String str = br.readLine(); // read each line 
      arr.add(Integer.parseInt(str)); 

}
  
    Collections.sort(arr); // sort the array in order 
    
    
    LinkedList<Integer> ll = new LinkedList<Integer>();
    
    final long startTime = System.nanoTime();

    for (int i = 0; i < arr.size(); i++)

    {

        ll.add(arr.get(i)); // add arr into linked list 
    }
    final long endTime = System.nanoTime(); 

    final long startTime1 = System.nanoTime();

    
    Integer min = arr.get(0);


    final long endTime1 = System.nanoTime();

    final long startTime2 = System.nanoTime();


    Integer max = arr.get(arr.size() - 1); 

    
    final long endTime2 = System.nanoTime();

    
    Integer med = 0;

    
    final long startTime3 = System.nanoTime();
    
    if (arr.size() % 2 == 1){
        med = arr.get((arr.size() - 1) / 2);
    }

     else
     {
    
        med = (arr.get((arr.size() - 1) / 2) + arr.get((arr.size()) / 2)) / 2;
     }
     
     final long endTime3 = System.nanoTime();


    //outputs 

    System.out.println("\nHere is the sorted LinkedList in ascending order: \n" + ll);

    System.out.println("The minimum value is: " + min);

    System.out.println("The median is: " + med);
 
    System.out.println("The maximum value is: " + max); 

    System.out.println("Total execution time to insert values into the list: " + ((endTime - startTime)/1000) + " ns");
    
    System.out.println("Total time to find min of the list:  " + (endTime1 - startTime1) + " ns");
    
    System.out.println("Total time to find max of the list:  " + (endTime2 - startTime2) + " ns");
    
    System.out.println("Total time to find median of the list:  " + (endTime3 - startTime3) + " ns");

}

catch (Exception e)
{
  
}

 }

}