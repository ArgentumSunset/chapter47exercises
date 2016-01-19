import java.io.* ;

class TwoLargest
{

  public static void main ( String[] args )  
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    // declare and initialize variables for the two largest
    int first = 0;
    int second = 0;
    
    
    // compute the two largest
    for ( int index= 0; index < data.length; index++)
    {
      if (data[index] > first) {
        second = first;
        first = data[index];
      }
      else if (data[index] > second) {
        second = data[index];
      }
    }
      
    // write out the two largest
    System.out.println("Largest: " + first + " Second largest: " + second );

  }
}      