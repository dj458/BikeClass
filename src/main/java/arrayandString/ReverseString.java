package arrayandString;

import java.util.Stack;

public class ReverseString {
    public static void main(String args[]){
        ReverseString reverseString=new ReverseString();
           reverseString.reverseString("abc");
    }

    public String reverseString(String a){
        char[] stringtoChar=a.toCharArray();
        Stack result=new Stack();
        for (int i=stringtoChar.length-1;i>=0;i--)
        {
           result.push(stringtoChar[i]);
        }

        System.out.println(result.toString());
        return result.toString();
    }
}
