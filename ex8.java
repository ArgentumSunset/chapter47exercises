import java.io.* ;

class DataTweeker3
{

  public static void main ( String[] args )  
  {
    double[] data = {13.0,5.6,6.2,6.0,5.5,5.7,6.1,7.4,5.5,5.5,6.3,6.4,4.0,6.9};
    double a1sum = 0.0;
    double a2sum = 0.0;
    double a3sum = 0.0;
    double a4sum = 0.0;
    double distant1 = 0.0;
    double distant2 = 0.0;
    double distant3 = 0.0;
    int index1 = 0;
    int index2 = 0;
    int index3 = 0;

    for(int j = 0; j < data.length - 1; j++) {
        a1sum += data[j];
        System.out.println("data{ " + j + " ] = " + data[j]);
    }

    double a1 = a1sum / data.length;

    for(int j = 0; j < data.length; j++){
        if((data[j] - a1) > distant1){
            distant1 = data[j];
            index1 = j;
        }
    }

    for(int j = 0; j < data.length - 1; j++) {
        if(j != index1){
            a2sum += data[j];
        }
    }

    double a2 = a2sum / (data.length - 1);
    distant1 = 0.0;

    for(int j = 0; j < data.length; j++){
        if((data[j] - a2) > distant1){
            distant1 = data[j];
            index1 = j;
        }
        if((data[j] - a2) > distant2 && (data[j] - a2) < distant1){
            distant2 = data[j];
            index2 = j;
        }
    }

    for(int j = 0; j < data.length - 2; j++) {
        if(j != index1 && j != index2){
            a3sum += data[j];
        }
    }

    double a3 = a3sum / (data.length - 2);
    distant1 = 0.0;
    distant2 = 0.0;

    for(int j = 0; j < data.length; j++){
        if((data[j] - a3) > distant1){
            distant1 = data[j];
            index1 = j;
        }
        if((data[j] - a3) > distant2 && (data[j] - a3) < distant1){
            distant2 = data[j];
            index2 = j;
        }
        if((data[j] - a3) < distant2 && (data[j] - a3) > distant3){
            distant3 = data[j];
            index3 = j;
        }
    }

    for(int j = 0; j < data.length - 3; j++) {
        if(j != index1 && j != index2 && j != index3){
            a4sum += data[j];
        }
    }

    double a4 = a4sum / (data.length - 3);

    System.out.println("a1: " + a1);
    System.out.println("a2: " + a2);
    System.out.println("a3: " + a3);
    System.out.println("a4: " + a4);

  }

  public static double nAverage(int[] a, int b) {
    double distant = 0.0;
    int index = 0;
    double sum = 0.0;
    double sum2 = 0.0;

    for(int j = 0; j < a.length - 1; j++) {
        sum += a[j];
    }

    double avg = sum / a.length;

    for(int j = 0; j < a.length; j++){
        if((a[j] - avg) > distant){
            distant = a[j];
            index = j;
        }
    }

    for(int j = 0; j < a.length - 2; j++) {
        if(j != index){
            sum2 += a[j];
        }
    }

    return sum2 / (a.length - 1);

  }
} 