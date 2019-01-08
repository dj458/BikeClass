package hackerRank;

import java.util.Arrays;
import java.util.HashMap;

public class SherlockandAnagrams {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {


        HashMap<String, Integer> map =new HashMap<String,Integer>();
        int totalCount=0;

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
            String    currentSubString=s.substring(i,j);
                char[] chars=currentSubString.toCharArray();
                Arrays.sort(chars);
                currentSubString=String.valueOf(chars);
                if(map.containsKey(currentSubString)){
                    int value=map.get(currentSubString);
                    totalCount=value+totalCount;
                    map.put(currentSubString,value+1);
                }
                else{
                    map.put(currentSubString,1);
                }
            }
        }
        return totalCount;
    }

    public static void main(String[] args) {
       System.out.println(sherlockAndAnagrams("abba"));
    }
}
