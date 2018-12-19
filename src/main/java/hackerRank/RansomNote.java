package hackerRank;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String,Integer> magazineMap=new HashMap<String, Integer>();
        HashMap<String,Integer> noteMap    =new HashMap<String, Integer>();
        for(String word:magazine){
            if(!magazineMap.containsKey(word)){
                magazineMap.put(word,0);
            }
            magazineMap.put(word,magazineMap.get(word)+1);
        }

        for(String word:note){
            if(!noteMap.containsKey(word)){
                noteMap.put(word,0);
            }
            noteMap.put(word,noteMap.get(word)+1);
        }

String result="Yes";

        for(Map.Entry<String,Integer> entry: noteMap.entrySet()){
            if((!magazineMap.containsKey(entry.getKey())) || (magazineMap.get(entry.getKey())<entry.getValue()) ) {
                result = "No";
            }
        }

        System.out.println(result);
    }



    public static void main(String[] args) {
       String [] a=new String[]{"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
       String [] b=new String[]{"ive", "got", "some", "coconuts"};


       checkMagazine(a,b);
    }
}

