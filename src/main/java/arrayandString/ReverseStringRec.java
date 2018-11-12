package arrayandString;

//Here the 'reverse' method takes the first character of the String str.charAt(0)
//        puts it at the end and then calls itself,  on the remainder str.substring(1),
//        and adding those things together to get the result reverse(str.substring(1)) + str.charAt(0)
//
//        When the passed in String is one character or less and so there will be no remainder left
//        i.e str.length() <= 1), it stops calling itself recursively and just returns the String passed in.
//        This is the base case.
//
//        And also, check whether the string passed is null before checking the length(),
//        inorder to avoid NullPointerException when the passed string is a null string.
//
//        So it runs as follows:
//
//        reverse("Quora")
//        (reverse("uora")) + "Q"
//        ((reverse("ora")) + "u") + "Q"
//        (((reverse("ra")) + "o") + "u") + "Q"
//        ((((reverse("a")) + "r") + "o") + "u") + "Q"
//        (((("a") + "r") + "o") + "u") + "Q"
//        "arouQ"

public class ReverseStringRec {
    public static void main(String args[]){
        System.out.println(reverseStringRev("abc"));
    }

    public static String reverseStringRev(String s){
        if(s.isEmpty())
            return s;
        return reverseStringRev(s.substring(1))+s.charAt(0);
    }
}
