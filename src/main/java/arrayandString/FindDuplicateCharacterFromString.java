package arrayandString;

import java.util.Stack;

public class FindDuplicateCharacterFromString {
    public static void main(String args[]){
        FindDuplicateCharacterFromString findDuplicateCharacterFromString=new FindDuplicateCharacterFromString();
        findDuplicateCharacterFromString.findDuplicateChar("aaccdde");
    }
    public String findDuplicateChar(String s){
        char[] stringToChar=s.toCharArray();
        Stack<Character> stack=new Stack();

        stack.push(stringToChar[0]);
        for (int i=1;i<stringToChar.length;i++){
            if(stack.peek()==stringToChar[i]){
                System.out.println(stack.peek());
            }
            else
                stack.push(stringToChar[i]);
        }
        return null;
    }
}
