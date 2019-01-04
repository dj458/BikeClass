package hackerRank;

import java.util.Arrays;

public class HackerHardArrayManuplation {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long [] arr=new long[n];
        for(int i=0;i<queries.length;i++){
            int value=queries[i][2];
            int start=queries[i][0]-1;
            int end =queries[i][1];
            arr[start]=arr[start]+value;
            if(end<n){
                arr[end]=arr[end]-value;
            }
        }
        for(int x=1;x<n;x++){
            arr[x]=arr[x]+arr[x-1];
        }
        Arrays.sort(arr);
      return arr[n-1];


//        //Brutal force
//        long result=0;
//        long [] testArray=new long[n];
//        for(int i=0;i<queries.length;i++){
//            for(int j=queries[i][0];j<=queries[i][1];j++){
//                testArray[j-1]=testArray[j-1]+queries[i][2];
//            }
//        }
//        Arrays.sort(testArray);
//        return testArray[n-1];
    }

    public static void main(String[] args) {
      int[][] twoDArray=new int[][]{
              {1, 2, 100},
              {2, 5, 100},
              {3, 4, 100}
      };

      arrayManipulation(5,twoDArray);
    }
}
