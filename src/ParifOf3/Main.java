package ParifOf3;

import java.util.Arrays;

public class Main {

    static int perechi=0;

    public static void main(String[] args) {
        int[] intArray = new int[]{-1, -1, -1, 2};
        boolean[] boolArray = new boolean[intArray.length];
        Arrays.fill(boolArray, false);

        for (int i = 0; i < intArray.length; i++)
        {
            for (int j = i + 1; j < intArray.length; j++)
            {
                for (int k = j + 1; k < intArray.length; k++)
                {
                    if ((intArray[i] + intArray[j] + intArray[k] == 0) && (boolArray[i] == false) && (boolArray[j] == false) && (boolArray[k] == false))
                    {
                        boolArray[i] = true;
                        boolArray[j] = true;
                        boolArray[k] = true;
                        perechi++;
                    }
                }
            }
        }
        System.out.print(perechi);
    }
}
