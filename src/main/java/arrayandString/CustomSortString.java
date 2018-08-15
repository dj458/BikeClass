package arrayandString;

public class CustomSortString
{
    public static void main (String[] arg)
    {
        String S="cba";
        String T="abdddec";
        int max=0;
        char[] charArrayS = S.toCharArray();
        char[] charArrayT = T.toCharArray();
        int[] labelArray = new int[9];
        //List resultList = new ArrayList();
        char[] result = new char[charArrayS.length];
        char[] resultExtra = new char[charArrayT.length];

        for (int i=0;i<charArrayS.length;i++)
        {
            int a1= charArrayS[i]-'a';
                if(a1>max)
                {
                    max=a1;
                }
            for(int j=0;j<charArrayT.length;j++)
            {
                int a2 = charArrayT[j]-'a';
                labelArray[a2]++;

                while (labelArray[a2]>0)
                {
                    labelArray[a2]--;
                    if(a1==a2)
                    {
                        result[i]=charArrayT[j];
                    }
                    if(a2>max)
                    {
                        resultExtra[j]=charArrayT[j];

                    }
                }
            }
            if(i==charArrayS.length-1){
                StringBuilder sb = new StringBuilder(64);
                sb.append(result);
                sb.append(resultExtra);
                System.out.println("Final: "+sb);
            }
        }
    }
}
