package arrayandString;


import java.util.Arrays;

public class DuplicatedArray {

    public static void main(String[] args ) throws Exception {

        Integer [] input={4,3,2,7,8,2,3,1};
        for(int i=0;i <=input.length-1;i++){
            for(int j=i+1;j<=input.length-1;j++){
            if (input[i]>input[j]) {
                int temp=input[i];
                input[i]=input[j];
                input[j]=temp;
              }
             }
            }
        System.out.println(Arrays.toString(input));
        for(int k=1;k<input.length;k++){
            if((input[k]==input[k-1])){
                System.out.println(input[k]);
            }
          }
        }
    }


