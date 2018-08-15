package arrayandString;

public class LabelDuplicatedArray {
    public static void main (String[] arg){
        Integer [] input={4,3,2,7,8,2,3,1};
        int[] labelArray = new int[9];

        for (int i=0;i<input.length;i++){
            int arrayValue=input[i];
            labelArray[arrayValue]++;
            if(labelArray[arrayValue]>1){
               System.out.println(arrayValue);
           }
        }
    }
}
