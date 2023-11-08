package edu.coding_bat.warmup_1.close_10;

public class Close10 {
    public int close10(int a, int b) {
        final int TEN_10 = 10;
        var firstN = a - TEN_10;
        var secondN = b - TEN_10;
        var res = 0;
        if (Math.abs(firstN) > Math.abs(secondN)) res = b;
        else if (Math.abs(firstN) < Math.abs(secondN)) res = a;
        return res;
    }

    public int close10T(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) return a;
        if (aDiff > bDiff) return b;

        return 0;
    }
}
