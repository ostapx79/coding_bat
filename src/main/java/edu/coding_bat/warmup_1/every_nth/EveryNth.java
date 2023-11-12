package edu.coding_bat.warmup_1.every_nth;

public class EveryNth {
    public String everyNth(String str, int count) {
        var res = "";
        for (int i = 0; i < str.length(); i += count) {
            res += str.charAt(i);
        }
        return res;
    }
}
