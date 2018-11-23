package wordBreakCode;

public class DoorDash {
    boolean method(int n)  {
        if (n < 2) return false;
        for (int i = 2; i < n; i++)
        {
            if (n%i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        DoorDash doorDash=new DoorDash();
        Boolean a=doorDash.method(5);
        System.out.println(a);
    }
}
