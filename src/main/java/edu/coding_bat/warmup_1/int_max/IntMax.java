package edu.coding_bat.warmup_1.int_max;

public class IntMax {
    public int intMax(int a, int b, int c) {
        var max = 0;

        if (a > b && a > c) max = a;
        else if (b > a && b > c) max = b;
        else max = c;

        return max;
    }

    public int intMax1(int a, int b, int c) {
        var max = Math.max(a, b);

        if (c > max)  max = c;

        return max;
    }
}
