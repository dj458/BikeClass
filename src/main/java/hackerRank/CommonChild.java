package hackerRank;

import java.io.IOException;

public  class CommonChild {

    // Complete the commonChild function below.
    static int commonChild(String s1, String s2)
    {
        int[][] memo=new int[s1.length()+1][s2.length()+1];
        return s1.length() + s2.length() -(2 * lcs(s1,s2,s1.length(),s2.length(),memo) );
    }

    public static int lcs(String sA, String sB, int m, int n,int [][] memo){
        if((m==0) ||(n==0)) {
            return 0;
        }
        if(memo[m][n]>0){
            return memo[m][n];
        }
        else if(sA.charAt(m-1)==sB.charAt(n-1)){
            memo[m][n]= 1+ lcs(sA,sB,m-1,n-1,memo)   ;
        }
        else
        {
            memo[m][n]=Math.max(lcs(sA,sB,m-1,n,memo), lcs(sA,sB,m,n-1,memo));
        }
        return memo[m][n];
    }




    public static void main(String[] args)  {
      System.out.println(commonChild("HARRY","SALLY"));

    }
}
