package edu.coding_bat.warmup_2.array_667;

public class Array667 {
    public int array667(int[] num) {
        /*
        Учитывая массив целых чисел, верните количество раз,
        когда две шестерки находятся рядом друг с другом в массиве.
        Также посчитайте случаи, когда вторая цифра «6» на самом
        деле является цифрой 7.
         */
        var count = 0;

        for (int i = 0; i < num.length - 1; i++) {
            if ((num[i] == 6 && num[i + 1] == 6) || (num[i] == 6 && num[i + 1] == 7)) count++;
        }

        return Math.max(count, 0);
    }

    public int array667T(int[] nums) {
        int count = 0;
        // Note: iterate to length-1, so can use i+1 in the loop
        for (int i=0; i < (nums.length-1); i++) {
            if (nums[i] == 6) {
                if (nums[i+1] == 6 || nums[i+1] == 7) {
                    count++;
                }
            }
        }
        return count;
    }
}
