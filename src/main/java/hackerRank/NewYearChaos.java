package hackerRank;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class NewYearChaos {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int temp=0;
        int count=0;
        int result=0;
        int[] countTemp=new int[100];
        for(int i=0;i<q.length-1;i++){
           for(int j=0;j<q.length-i-1;j++){
               if(q[j]>q[j+1]){
                   temp=q[j];
                   q[j]=q[j+1];
                   q[j+1]=temp;
                   count++;
                   countTemp[temp]++;
               }

           }
        }

        for(int j=0;j<countTemp.length;j++){
            if(countTemp[j]>2){
                result=2;
            }
        }
        if(q[q.length-1]-q[0]==(q.length-1) && result==0 ){
            System.out.println(count);
        }
        else if(result==2)
            System.out.println("Too chaotic");

    }


    public static void main(String[] args) {
        int[] a=new int[]{2, 1, 5, 3, 4};
        int[] b=new int[]{2, 5, 1, 3, 4};
        int[] d=new int[]{1, 2, 5, 3, 7, 8, 6, 4};
        minimumBribes(b);
    }
}
