package edu.coding_bat.warmup_1.pos_neg;

public class PosNeg {
    public boolean postNeg(int a, int b, boolean negative) {
        if (a < 0 && b > 0 && !negative) return true;
        else if (a > 0 && b < 0 && !negative) return true;
        else if (a < 0 && b < 0 && negative) return true;
        else return false;
    }
}
