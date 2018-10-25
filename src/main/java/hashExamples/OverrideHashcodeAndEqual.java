package hashExamples;


public class OverrideHashcodeAndEqual {


    public  static void main(String[] args)
    {
        User user1=new User(){
            String name="xu";
            int age=2;
            String passport="wrqwe";};
        User user2=new User(){
            String name="xu";
            int age=2;
            String passport="wrqwe";
        };
        System.out.println(user1.equals(user2));
    }
}

