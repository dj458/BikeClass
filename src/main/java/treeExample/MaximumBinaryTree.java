package treeExample;

public class MaximumBinaryTree {
    public static void main (String[] arg){
        int [] intArray= {3,2,1,6,0,5};
        MaximumBinaryTree maximumBinaryTree=new MaximumBinaryTree();
        maximumBinaryTree.findLeftRightNode(intArray,0,intArray.length);
    }

    int maxOfArray=0;
    public TreeNode findLeftRightNode(int[] intArray, int leftIndex, int rightIndex){
        if(leftIndex==rightIndex)
            return null;
        int  index=max(intArray,leftIndex,rightIndex);
        TreeNode currentNode=new TreeNode(intArray[index]);
        currentNode.leftNode=findLeftRightNode(intArray,leftIndex,index);
        currentNode.rightNode=findLeftRightNode(intArray,index+1,rightIndex);
        int theNodeValue=currentNode.value;
        System.out.println("Result: "+theNodeValue);
        return  currentNode;
    }

    public int max(int[] intArray, int left, int right)
    {
        int index=left;
        for (int i=left;i<right;i++)
        {
            if(intArray[index]<intArray[i])
            {
                maxOfArray=intArray[i];
                index=i;
            }
        }
        return index;
    }
}