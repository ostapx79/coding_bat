package edu.coding_bat.warmup_1.mix_start;

public class MixStart {
    public boolean mixStart(String str) {
        if (str.length() < 3) return false;
        return ("ix".equals(str.substring(1, 3)));
    }
}
