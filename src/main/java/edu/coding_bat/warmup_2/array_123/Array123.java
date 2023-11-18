package edu.coding_bat.warmup_2.array_123;

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
}
