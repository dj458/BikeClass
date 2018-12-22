package hackerRank;
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class SpecialPalindromeAgain {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        int counter = n;
        int consec = 1;
        int midIndex = -1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                counter += consec;
                consec++;
                if (midIndex > 0)
                {
                    if ((midIndex-consec) > 0 && s.charAt(midIndex-consec) == s.charAt(i))
                    {
                        counter++;
                    }
                    else
                    {
                        midIndex = -1;
                    }
                }
            }
            else
            {
                consec = 1;
                if (((i-2) >= 0) && s.charAt(i-2) == s.charAt(i))
                {
                    counter++;
                    midIndex = i-1;
                }
                else
                {
                    midIndex = -1;
                }
            }
        }
        return counter;
    }


    public static void main(String[] args)  {
        substrCount(7,"abcbaba");
    }
}
