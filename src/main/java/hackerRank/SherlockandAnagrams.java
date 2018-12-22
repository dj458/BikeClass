package hackerRank;

import java.util.Arrays;
import java.util.HashMap;

public class SherlockandAnagrams {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        int count=0;
        int result=0;
        Boolean isAnagram=false;
        HashMap<Integer, String> saveForSubstring=new HashMap<Integer, String>();

      for(int i=0;i<s.length();i++){
          for(int j=i+1;j<=s.length();j++){
              String a=s.substring(i,j);
              saveForSubstring.put(count++,a);
          }
      }

      for(int i=0;i<count-1;i++){
          for(int j=i+1;j<count;j++){
              String a=saveForSubstring.get(i);
              String b=saveForSubstring.get(j);
              if (a.length()==b.length()){
                  char[] aChar=a.toCharArray();
                  char[] bChar=b.toCharArray();
                  Arrays.sort(aChar);
                  Arrays.sort(bChar);
                  isAnagram=Arrays.equals(aChar,bChar);
                  if(isAnagram==true){
                      result++;
                  }
              }

          }
      }

        return result;
    }

    public static void main(String[] args) {
       System.out.println(sherlockAndAnagrams("kkkk"));
    }
}
