package HackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long k=0,d=0;
        while (k<n){
            outerloop:
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='a'){d++;}
                k++;
                if(k==n){break outerloop;}
            }
        }
        return d;
    }

    public static void main(String[] args) {
        RepeatedString.repeatedString("aba",10);
    }
}
