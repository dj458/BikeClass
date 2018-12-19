package arrayandString;


import java.util.HashSet;

public class Test {

    // Complete the isValid function below.
    static Boolean isValid(String s)
    {
        int count=0;
        int secodCount=0;
        int thirdCount=0;
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0;i<s.length()-1;i++)
        {
            count=0;
            for(int j=i+1;j<s.length();j++ )
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
                }
            }
            h.add(count);
        }

        if((h.size()>3))
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static void main(String[] args)  {
        System.out.println(isValid("deffede"));
    }

}
