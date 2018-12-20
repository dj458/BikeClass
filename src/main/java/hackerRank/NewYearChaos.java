package hackerRank;

public class NewYearChaos {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int bribe = 0;
        int n=q.length;
        boolean chaotic = false;
        for(int i = 0; i < n; i++)
        {
            if(q[i]-(i+1) > 2)
            {
                chaotic = true;
                break;
            }
            for (int j = Math.max(0, q[i]-2); j < i; j++)
                if (q[j] > q[i])
                    bribe++;
        }
        if(chaotic)
            System.out.println("Too chaotic");
        else
            System.out.println(bribe);
    }

    public static void main(String[] args) {
        int[] a=new int[]{2, 1, 5, 3, 4};
        int[] b=new int[]{2, 5, 1, 3, 4};
        int[] d=new int[]{1, 2, 5, 3, 7, 8, 6, 4};
        minimumBribes(a);
    }
}
