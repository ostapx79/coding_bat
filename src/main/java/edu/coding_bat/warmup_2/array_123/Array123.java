package edu.coding_bat.warmup_2.array_123;

import java.util.Arrays;

public class Array123 {
    public boolean array123(int[] num) {
        /*
       Учитывая массив целых чисел, верните true,
       если последовательность чисел 1, 2, 3 встречается где-то в массиве.
         */
        //  0  1  2      0  1  2
        // [1, 1, 2] == [1, 2, 3]
        int[] resArr = {1, 2, 3};

        int[] res1 = new int[3];
        int[] res2 = new int[3];
        int[] res3 = new int[3];

        res1[0] = num[0];
        res1[1] = num[1];
        res1[2] = num[2];

        res2[0] = num[1];
        res2[1] = num[2];
        res2[2] = num[3];

        res3[0] = num[2];
        res3[1] = num[3];
        res3[3] = num[4];

        return res1 == resArr || res2 == resArr || res3 == resArr;
    }
    public static int[] getCycle(int[] array)
    {
        for (int i=1; i<array.length-1; i++){
            if (array.length%i!=0)
                break;
            int[] sub = Arrays.copyOfRange(array, 0, i);
            if (check(array, sub))
                return sub;
        }
        return array;
    }
    private static boolean check(int[] array, int[] sub)
    {
        if (array.length%sub.length!=0)
            return false;
        for (int k=1; k<array.length/sub.length; k++)
            if (!isSimilar(sub, Arrays.copyOfRange(array, k*sub.length, (k+1)*sub.length)))
                return false;
        return true;
    }
    private static boolean isSimilar(int[] x, int[] y)
    {
        for (int i=0; i<x.length; i++)
            if (x != y)
                return false;
        return true;
    }
}
