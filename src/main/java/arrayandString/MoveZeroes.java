package arrayandString;

import java.util.Arrays;

public class MoveZeroes {
    public void movesOs(int[] nums){
        int j=0;
        int temp=0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] != 0) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String args[]){
        MoveZeroes moveZeroes=new MoveZeroes();
        int[] nbs=new int[]{0,1,0,3,12};
        moveZeroes.movesOs(nbs);
    }
}

