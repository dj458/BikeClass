package HackerRank;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int[] labelArray=new int[200];//the array size must bigger than the Max value in the ar Array
        int result=0;
        for(int i=0;i<n;i++){
            labelArray[ar[i]]++;
            if(labelArray[ar[i]]%2==0)
                result++;
        }
        return result;
    }



    public static void main(String[] args)  {
        int [] ar=new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
       SockMerchant.sockMerchant(9,ar );
    }
}

