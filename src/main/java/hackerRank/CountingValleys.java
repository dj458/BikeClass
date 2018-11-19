package hackerRank;

public class CountingValleys {

    // Complete the countingValleys function below.

    static int countingValleys(int n, String s) {
        int count=0;
        int record=0;
        for(int i=0;i<s.length();i++)
        if(s.charAt(i)=='U')
        {
            count++;
        }
           else if (s.charAt(i)=='D')
            {
                 if(count==0){
                     record++;
                 }
                 count--;
            }
        return record;
    }

    public static void main(String[] args) {
      // CountingValleys.countingValleys(8,"UDDDUDUU");
        CountingValleys.countingValleys(12,"DDUUDDUDUUUD");
    }
}
