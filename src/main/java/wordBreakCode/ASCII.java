package wordBreakCode;

import java.util.ArrayList;
import java.util.List;

public class ASCII {
    public static void main(String[] args){
        String val1 = "1000000000000000000";
        String val2 = "9000000000000000000";
        List<Integer> ascii = new ArrayList();
        List<Integer> result = new ArrayList();
        for(int i = 0; i < val1.length() ; i++){   // while counting characters if less than the length add one
            int asciiValue = Character.getNumericValue(val1.charAt(i));   //convert the first character
            ascii.add(asciiValue);
        }
        for(int i = 0; i < val2.length() ; i++){   // while counting characters if less than the length add one
            int asciiValue = Character.getNumericValue(val2.charAt(i)); //convert the first character
            int newVal = ascii.get(i)+asciiValue;
            result.add(newVal);
        }
//        List<Character> characterList = new ArrayList<Character>();
        StringBuilder build = new StringBuilder();
        for(Integer intValue: result){
            build.append(intValue);
        }
        System.out.println(build.toString());
    }
}
