package Pairs;

import java.util.Arrays;

public class Main
{
    static int[] intArray;
    static int[] boolArray;
    static int perechi=0;

    public static void main(String[] args)
    {
        intArray=new int[]{3,2,-3,-2,3,0};
        boolArray=new int[intArray.length];
        Arrays.fill(boolArray,0);

        for(int i=0;i<intArray.length;i++)
        {
            for(int j=i+1;j<intArray.length;j++)
            {
                if((intArray[i]+intArray[j]==0)&&(boolArray[i]==0)&&(boolArray[j]==0))
                {
                    boolArray[i] = 1;
                    boolArray[j] = 1;
                    perechi++;
                }
            }
        }
        System.out.print(perechi);
    }
}
