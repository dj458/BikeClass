package arrayandString;

public class CombinationSumTWo {

    public static void main(String[] args)
    {
        CombinationSumTWo combinationSum =new CombinationSumTWo();
        int [] givenArray={2,4,6,10};
        int result = combinationSum.rec(16, givenArray,3);
        System.out.println(result);
    }

    public int rec(int givenSum,int[] givenArray, int arrayIndex) {
        if(givenSum==0){
            return 1;
        }
        else if(arrayIndex<0) {
           return 0;
        }
        else if ((givenSum-givenArray[arrayIndex])<0) {
            int val = rec(givenSum, givenArray, arrayIndex - 1);
            return val;
        } else {
            int val1=rec((givenSum - givenArray[arrayIndex]), givenArray, arrayIndex - 1);
            int val2=rec(givenSum, givenArray, arrayIndex - 1);
            int val=val1+val2;
            return val;
        }
    }
}
