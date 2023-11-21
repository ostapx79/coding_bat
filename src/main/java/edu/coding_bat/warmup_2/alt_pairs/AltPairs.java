package edu.coding_bat.warmup_2.alt_pairs;

public class AltPairs {
    public String altPairs(String str) {
        var res = "";
        for (int i = 0; i < str.length() - 1; i += 1) {
            res += str.substring(i, i + 2);
        }
        return res;
    }
}
