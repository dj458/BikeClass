package arrayandString;

import java.util.Stack;

public class BalancedBrackets {

    static boolean matchOrNot(char a, char b){
        if((a=='{')&&(b=='}')){ return true; }
        else if((a=='[')&&(b==']')){ return true; }
        else if((a=='(')&&(b==')')){ return true; }
        else
            return false;
    }

    static boolean isBalanced(String s) {

        Stack<Character> myStack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)=='{') || (s.charAt(i)=='[')||(s.charAt(i)=='(')){
                myStack.push(s.charAt(i));
            }
            if((s.charAt(i)=='}') || (s.charAt(i)==']')||(s.charAt(i)==')')){
                if(myStack.isEmpty()==true){
                    return false;
                }
                else if(!matchOrNot(myStack.pop(),s.charAt(i)))
                {
                    return false;
                }
            }
        }
        if(myStack.isEmpty()==true){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args)  {
        String s="{[()]}";
        System.out.println(isBalanced(s) ? "YES":"NO");
    }
}
