package edu.coding_bat.warmup_2.array_123;

import java.util.Arrays;

public class Array123 {
    public boolean array123(int[] num) {
        /*
       Учитывая массив целых чисел, верните true,
       если последовательность чисел 1, 2, 3 встречается где-то в массиве.
         */
        String strNum = "";

        for (int i = 0; i < num.length; i++) {
            strNum += num[i];
        }
        int count = 0;
        for (int i = 0; i < strNum.length(); i++) {
            if (strNum.startsWith("123", i)) {
                count++;
            }
        }

        if (count > 0) return true;
        return false;
    }

    public boolean array123T(int[] nums) {
        for (int i = 0; i < (nums.length - 2); i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) return true;
        }
        return false;
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
