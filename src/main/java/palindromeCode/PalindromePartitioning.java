package palindromeCode;

import java.util.Arrays;

public class PalindromePartitioning {
    public static void main(String[] arg) {
        String s = "aabcewec";
        String[] sCharArray = s.split("(?!^)");
        String[] finalArray= new String [s.length()];
        String[] reverseArray=new String[finalArray.length];

        for (int chunk = 1; chunk <=sCharArray.length; chunk++)
        {
            for (int i = 0; i < sCharArray.length; i += chunk)
            {
                String chunkedArray=(Arrays.toString(Arrays.copyOfRange(sCharArray, i, Math.min(sCharArray.length, i + chunk))));
                chunkedArray = chunkedArray.replaceAll("\\p{P}","");
                 String reverse = new StringBuffer(chunkedArray).reverse().toString();
                if(reverse.equals(chunkedArray))
                {
                    System.out.println(chunkedArray);
                }
            }
        }
    }
}