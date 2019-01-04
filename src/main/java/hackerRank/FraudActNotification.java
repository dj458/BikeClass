package hackerRank;


import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class FraudActNotification {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        int med =0;
        int k=0;
        int b=0;
        int a=0;
        int notifi=0;
        int[] arr=new int[d];
       // for(int k=0;k<expenditure.length-d;k++) {
         while ( k !=expenditure.length-d){
            for (int i = k; i < d + k; i++) {
                arr[b] = expenditure[i];
                b++;
            }
            Arrays.sort(arr);
            if (d % 2 != 0) {
                med = arr[d / 2];
            }
            if (d % 2 == 0) {
                med = (arr[(d / 2) + 1] + arr[(d / 2) - 1]) / 2;
            }
            if (expenditure[d] >= 2 * med) {
                notifi++;
            }
            b=0;
            k++;
        }
        System.out.println(notifi);
        return notifi;
    }

    public static void main(String[] args) {
        int [] newArr=new int[]{2, 3, 4, 2, 3, 6, 8, 4, 5};
       activityNotifications(newArr,5);
    }
}
