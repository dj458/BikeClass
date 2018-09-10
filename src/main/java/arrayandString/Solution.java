package arrayandString;
import java.util.*;

public class Solution {
    public static String removeDuplicates(String s) {
        char[] stringChar=s.toCharArray();
        Stack<Character> charStack= new Stack<>();
        char k=stringChar[0];
        charStack.push(k);
        for(int i=1;i<stringChar.length;i++){

            if(charStack.isEmpty()==true){
                charStack.push('A');
            }
           else if(charStack.peek()==stringChar[i])
            {
                charStack.pop();
            }
            else
            {
                charStack.push(stringChar[i]);
            }
        }
        System.out.println(Arrays.toString(charStack.toArray()));
        return s;
    }

    public static void main(String[] args)
    {
        Solution solution=new Solution();
        solution.removeDuplicates("ACCAABBC");
        solution.removeDuplicates("ABCBBCBA");


    }
}
