import java.io.* ;

class ReverserVersion1
{

  public static void main ( String[] args ) 
  {
    int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    
    // reverse the data
    for ( int j=0; j < data.length / 2; j++)
    {
      int i = data[j];
      data[j] = data[data.length - 1 - j];
      data[data.length - 1 - j] = i;
    }
      
    // write out the new data
    for ( int j=0; j < data.length; j++)
    {
      System.out.println(data[j]);
    }

  }
}          