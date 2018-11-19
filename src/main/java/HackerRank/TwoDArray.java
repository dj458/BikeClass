package HackerRank;



import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class TwoDArray {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int sum=0;
        int max=-1000;
         for(int i=0;i<4;i++)
         {
             for(int j=0;j<4;j++)
             {
              sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]
                          +arr[i+1][j+1]
                   +arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                 if(sum>max)
                     max=sum;
             }
         }
return max;
    }
    public static void main(String[] args)  {

        int[][] arr = new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        int[][] secondArray=new int[][]{
                {0, -4, -6, 0, -7, -6},
                {-1, -2, -6, -8, -3, -1},
                {-8, -4, -2, -8, -8, -6},
                {-3, -1, -2, -5, -7, -4},
                {-3, -5, -3, -6, -6, -6},
                {-3, -6, 0, -8, -6, -7}
        };
        TwoDArray.hourglassSum(secondArray);
    }
}

