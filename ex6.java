import java.io.* ;

class DataTweeker
{

  public static void main ( String[] args )  
  {

    double[] data = {13.0,5.6,6.2,6.0,5.5,5.7,6.1,7.4,5.5,5.5,6.3,6.4,4.0,6.9};
    double sum = 0.0;
    double avgAdjustedSum = 0.0;
    double distant = 0.0;
    int index = 0;

    for(int j = 0; j < data.length; j ++){
        sum += data[j];
    }

    System.out.println(sum);

    double avg = sum / data.length;

    for(int j = 0; j < data.length; j ++){
        if((data[j] - avg) > distant){
            distant = data[j];
            index = j;
        }

        System.out.println("data{ " + j + " ] = " + data[j]);
    }

    for(int j = 0; j < data.length - 1; j++) {
        if(j != index){
            avgAdjustedSum += data[j];
        }
    }


    double newAvg = avgAdjustedSum / (data.length - 1);

    System.out.println("average: " + avg);
    System.out.println("most distant value: " + distant);
    System.out.println("new average: " + newAvg);

  }
} 