package hackerRank;


import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class JumpingOnClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int count=0;
        int secondCount=0;
        while (true){
            if(count+2<c.length && (c[count+2] == 0)){
                count=count+2;
            }
            else if(count+1<c.length){
                count++;
            }
            else {
                break;
            }

            secondCount++;

        }
        return secondCount;
    }



    public static void main(String[] args)  {
        int[] c=new int[]{0,0,1,0,0,1,0};
        int[] b=new int[]{0,0,0,0,1,0};
        jumpingOnClouds(c);

    }
}
