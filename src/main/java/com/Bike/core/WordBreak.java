package com.Bike.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {

    public void wordBreakSolution (String s, List<String> wordDict) {
        for (int i = 0; i < wordDict.size(); i++) {
            s = s.replaceAll(wordDict.get(i), "");
        }

        if (s.isEmpty() == true) {
            System.out.println("true");
        }
        else
            System.out.println("false");

    }

    public static void main(String[] args){
        String s = "catsandog";
        String s1= "leetcode";
        String s2= "applepenapple";
        List<String> wordDict = new ArrayList<>(Arrays.asList("cats", "dog", "sand", "and", "cat"));
        List<String> wordDict1 = new ArrayList<>(Arrays.asList("leet", "code"));
        List<String> wordDict2 = new ArrayList<>(Arrays.asList("apple", "pen"));

        WordBreak wordBreak=new WordBreak();
        wordBreak.wordBreakSolution(s,wordDict);
    }
}
