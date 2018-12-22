package hackerRank;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class SherlockandValidString {

    // Complete the isValid function below.
    static String isValid(String s) {
        int[] count1=new int[26];
        int count2=0;
        String result=null;
        for(int i=0;i<s.length();i++){
            count1[s.charAt(i)-'a']++;
        }
        for(int j=0;j<count1.length;j++){
            if((count1[0] != count1[j]) && (count1[j]!=0)){
                count2++;
            }
        }
        if(count2>1){
            result= "NO";
        }
        else{
            result= "YES";
        }

        return result;
    }

    public static void main(String[] args)  {
        String s="abcdefghhgfedecba";
        isValid(s);

    }
}
