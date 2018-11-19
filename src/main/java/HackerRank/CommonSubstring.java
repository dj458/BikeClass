package HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CommonSubstring {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        String result1=null;
        int count =0;
        for (int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j))
                {
                    count++;
                }
                else
                {}
            }
            if(count>0)
            {result1="YES";}
            else
            {result1="NO";}
        }
        return result1;
    }


    public static void main(String[] args) throws IOException {

        CommonSubstring.twoStrings("hello","world");
    }

}