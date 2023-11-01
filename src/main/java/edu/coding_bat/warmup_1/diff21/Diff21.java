package edu.coding_bat.warmup_1.diff21;

public class Diff21 {
    public int diff21(int n) {
        final int NUM_21 = 21;
        if (n <= NUM_21) return NUM_21 - n;
        else return (n - NUM_21) * 2;
    }
}
