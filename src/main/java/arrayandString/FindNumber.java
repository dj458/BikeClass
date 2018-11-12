package arrayandString;

//given the array=[1,2,3,4,5], we want to find if 1 is present or not
// if found, then yes, otherwise no

//given two integers, a and b, print all the odd number between them, include a and b
import java.util.ArrayList;
import java.util.List;

public class FindNumber {

    public static void main(String args[]) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
      // System.out.println(findNumber(arr, 1));
     findOddNumber(1,5);
    }

    public static String findNumber(List<Integer> arr, int k) {
        if(arr.contains(k))
            return "yes";
        else
            return "No";
    }

    public static Integer findOddNumber(Integer a, Integer b){
        for (int i=a;i<=b;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        return  0;
    }
}
