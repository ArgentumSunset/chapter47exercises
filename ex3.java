import java.io.* ;

class NearlyZero
{

  public static void main ( String[] args )
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    int closest = 100;
    
    // declare and initialize variables
    
    
    // find the element nearest to zero
    for (int i = 0; i < data.length; i++)
    {
      int abs = Math.abs(data[i]);
      if (abs < closest) {
        closest = abs;
      }
    }
      
    // write out the element nearest to zero
    System.out.println("Closest number to zero: " + closest);

  }
}      