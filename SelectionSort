import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.ToLongFunction;
import java.lang.Object;


public class SelectionSort {

    private static int r;

    public static void main(String[] args) {
        int data[]= {11, 8, 10, 1, 20, 88, 2, 99, 35, 22, 5, 13, 80, 19, 34, 18, 25, 3, 9, 27, 12, 16, 7, 94, 75, 70, 4, 82, 51, 58, 53, 66, 44, 98, 45, 50, 90, 84, 55, 6, 64, 97, 55, 77, 79, 39, 15, 60, 68, 71, 40};
        int min = data[0];
        int index = 0;
        long waktu = 0;
                
        for(int r=0; r<data.length-1; r++){
            for(int g=r; g<data.length; g++){
                if(data[g]<min){
                   min = data[g];
                   index = g;
                }
            }
        
            if(min < data[r]){
               data[index] = data[r];
               data[r] = min;
            }
        min = data[r+1];
        
        long startTime = System.currentTimeMillis();
        System.out.println("Swap ke - " + (r+1) +" "+ Arrays.toString(data));
        long stopTime = System.currentTimeMillis();

        waktu = stopTime - startTime;
        System.out.println("waktu eksekusi = " + waktu + " milisecond");
 
        }    
    }       
}
