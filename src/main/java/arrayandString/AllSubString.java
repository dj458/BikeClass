package arrayandString;

public class AllSubString
{
    public static void main(String[] args)
    {
    //allSubString("abc");
        recsub("abc", 0, 1);
    }

    public static void allSubString(String a){
    String result=null;
        for(int i=0;i<a.length();i++){
            for(int j=i+1;j<=a.length();j++){
              System.out.println(a.substring(i,j));
            }
        }
    }

        public static void recsub(String str, int start_pos, int size){
            if (size > str.length()) {

                System.out.println();
                recsub(str, ++start_pos, start_pos+1);
            }
            else {
                System.out.print(str.substring(start_pos, size)+" ");
                if (start_pos+1 < str.length())
                {
                    recsub(str, start_pos, size+1);
                }
            }
    }
}
