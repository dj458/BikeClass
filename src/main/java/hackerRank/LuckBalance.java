package hackerRank;



import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class LuckBalance {

    // Complete the luckBalance function below.
    static long luckBalance(int k, int[][] contests) {

        ArrayList <Integer> arraylist=new ArrayList<Integer>();
        long result=0;
        for(int i=0;i<contests.length;i++){
            if(contests[i][1]==0){
                result=result+contests[i][0];
            }
            else if(contests[i][1]==1){
                result=result+contests[i][0];
                arraylist.add(contests[i][0]);
            }
        }

        Collections.sort(arraylist);
        for(int i=0;i<arraylist.size()-k;i++){
            result=result-arraylist.get(i)*2;
        }
        return result;
    }

    public static void main(String[] args) {
        int [][] a=new int[][]{
                {5, 1},
                {2, 1},
                {1, 1},
                {8, 1},
                {10, 0},
                {5, 0},
        };
       System.out.println(luckBalance(3,a));
    }
}
