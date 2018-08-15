package WordBreakCode;

import java.util.*;

public class WordBreakDynamic {
    int i=0;

    public void wordBreakSolution1 (String s, List<String> wordDict)
    {
        List<Character> createdWord = new ArrayList<>();
        char[] charArray = s.toCharArray();
        for (int j = i; j<charArray.length; j++)
        {
            createdWord.add(charArray[j]);
            StringBuilder b = new StringBuilder();
            createdWord.forEach(b::append);
            String bs = b.toString();

            for (int k = 0;k<wordDict.size();k++)
            {

                if(bs.equals(wordDict.get(k)))
                {
                    i=j+1;
                    createdWord.clear();
                }
            }
        }
        if(createdWord.isEmpty()==true){
            System.out.println("Word break Succeed");
        }
        else
            System.out.println("Word break Failed");
    }


    public static void main(String[] args){
        String s = "catsandog";
        String s1= "leetcode";
        String s2= "applepenapple";
        List<String> wordDict = new ArrayList<>(Arrays.asList("cats", "dog", "sand", "and", "cat"));
        List<String> wordDict1 = new ArrayList<>(Arrays.asList("leet", "code"));
        List<String> wordDict2 = new ArrayList<>(Arrays.asList("apple", "pen"));
        String s3="andog";
        List<String> wordDict3 = new ArrayList<>(Arrays.asList("and", "an","dog"));

        WordBreakDynamic wordBreakDynamic=new WordBreakDynamic();
        wordBreakDynamic.wordBreakSolution1(s3,wordDict3);
    }
}
