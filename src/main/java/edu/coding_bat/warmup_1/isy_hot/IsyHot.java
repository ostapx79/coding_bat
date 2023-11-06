package edu.coding_bat.warmup_1.isy_hot;

public class IsyHot {
    public boolean isyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }
}
