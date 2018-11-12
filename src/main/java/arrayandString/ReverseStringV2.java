package arrayandString;

public class ReverseStringV2 {

    public static void main(String args[]){
        System.out.println(reverseStringV2("abcdefg"));
    }

    public static String reverseStringV2(String s){
        char[] in = s.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while (begin<end){
            temp=in[begin];
            in[begin]=in[end];
            in[end]=temp;
            end--;
            begin++;
        }
        return new String(in);
    }
}
