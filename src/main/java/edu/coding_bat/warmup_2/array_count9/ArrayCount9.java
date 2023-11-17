package edu.coding_bat.warmup_2.array_count9;

public class ArrayCount9 {
    public int arrayCount9(int[] num) {
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 9) count++;
        }
        return count;
    }
}
