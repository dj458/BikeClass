package arrayandString;
/*
 * Determine if 2 strings are different by just one character. Example albuquerque is different from
 * albuqerque (missing u after first q) or alburquerque (extra r after first b) by only one character, so the algorithm should return true.
 */
public class SpellCheckAssignment {

    int count = 0;

    public static void main(String[] args) {
        SpellCheckAssignment spellCheck = new SpellCheckAssignment();
//        boolean recommendFirstStringForSecondString = spellCheck.recommend("albuquerque", "alburrquerque", 0, 0, 0);
//        System.out.println(" Can recommend String1 for String2? " + recommendFirstStringForSecondString);

        System.out.println(" Can recommend String1 for String2? " + spellCheck.recommend("abc", "ac", 0, 0, 0,1));
        //recommendFirstStringForSecondString = spellCheck.recommend("albuquerque", "albuqerque");
        //System.out.println(" Can recommend String1 for String2? " + recommendFirstStringForSecondString);
        //recommendFirstStringForSecondString = spellCheck.recommend("Newark", "NewYork");
        //System.out.println(" Can recommend String1 for String2? " + recommendFirstStringForSecondString);
    }

    public boolean recommend(String first, String second, Integer keyIndex, Integer targetIndex, Integer count,int standardDiviation) {

        if(targetIndex==second.length()){ // example like "abc"  "ab"
            return true;
        }
        if(((Math.abs((first.length()-second.length())))==1)&& count >0){ // example like "ab"   "acc"
            return false;
        }
        if(targetIndex>second.length()){ //???? example like "abb"   "abbc"
            return true;
        }
        if((first.length()==second.length()) &&(count==1)){   //same length, but one char different
            return true;
        }

        if(count>standardDiviation){ //more than one diff char
            return false;
        }

        if((first.length()-second.length())>1){
            return false;
        }

        if(((Math.abs((first.length()-second.length())))+count)>1)
        {
            return false;
        }

        else if (first.charAt(keyIndex) == second.charAt(targetIndex)) {
            keyIndex++;
            targetIndex++;
            return recommend(first, second, keyIndex, targetIndex, count,standardDiviation);
        } else {
            count++;
            targetIndex++;
            return recommend(first, second, keyIndex, targetIndex, count,standardDiviation);
        }
    }
}
