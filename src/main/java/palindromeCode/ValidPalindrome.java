package palindromeCode;

import java.util.Arrays;

public class ValidPalindrome {
    public static void main(String[] arg){
        String input="A man, a plan, a canal: Panama";
        String[] inputArray=input.split(",");
        String[] reverseArray=new String[inputArray.length];

        for(int i=inputArray.length-1;i>=0;i--){
            reverseArray[i] =  inputArray[i];
        }
        if(Arrays.toString(inputArray).equals(Arrays.toString(reverseArray))){
            System.out.println("Palindrome string checked");
        }
    }
}
