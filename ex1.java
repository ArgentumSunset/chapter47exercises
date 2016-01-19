import java.io.* ;

class ThreeSums
{

  public static void main ( String[] args ) 
  {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    int all = 0;
    int evens = 0;
    int odds = 0;
    
    // declare and initialize three sums
    
    
    // compute the sums
    for ( int index=0; index < data.length; index++)
    {
      all += data[index];
      if (data[index] % 2 == 1){odds += data[index];}
      else{evens += data[index];}
    }
      
    // write out the three sums
    System.out.println("Total: " + all + " Evens: " + evens + " Odds: " + odds);

  }
}   