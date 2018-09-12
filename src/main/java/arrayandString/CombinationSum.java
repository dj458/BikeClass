package arrayandString;

public class CombinationSum {

    public static void main(String[] args)
    {
        CombinationSum combinationSum =new CombinationSum();
        int [] givenArray={2,4,6,10,14};
        combinationSum.rec(16, givenArray,0);

    }
    int k=0;

    public int rec(int givenSum,int[] givenArray, int start)
    {
        for(int i=start;i<givenArray.length;i++) {

            if(givenArray[i]==givenSum){
                k++;
                System.out.println(k);
            }

            else if(givenArray[i]<givenSum){
                rec(givenSum-givenArray[i],givenArray,i+1);
            }
    }
       return k;
    }
}
