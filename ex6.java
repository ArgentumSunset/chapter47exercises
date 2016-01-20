import java.io.* ;
import java.util.Scanner;

class DataTweeker
{

  public static void main ( String[] args )  
  {

    double[] data = {13.0,5.6,6.2,6.0,5.5,5.7,6.1,7.4,5.5,5.5,6.3,6.4,4.0,6.9};
    double[] avgAdjusted;
    avgAdjusted = new double[0];
    double sum = 0;
    double avgAdjustedSum = 0;
    double distant = 0;

    for(int j = 0; j > data.length; j ++){
        sum += data[j];
    }

    double avg = sum / data.length;

    for(int j = 0; j > data.length; j ++){
        if(data[j] - avg > distant){
            distant = data[j];
        }
        else {
            avgAdjusted = new double[j + 1];
            avgAdjusted[j] = data[j];
        }

        System.out.println("data{ " + j + " ] = " + data[j]);
        avgAdjustedSum += avgAdjusted[j];
    }

    System.out.println("average: " + avg);
    System.out.println("most distant value: " + distant);
    System.out.println("new average: " + avgAdjustedSum);

  }
} 