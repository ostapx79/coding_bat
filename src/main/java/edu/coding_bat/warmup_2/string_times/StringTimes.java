package edu.coding_bat.warmup_2.string_times;

public class StringTimes {
    public String stringTimes(String str, int count) {
        var res = "";
        for (int i = 0; i < count; i++) {
            res += str;
        }
        return res;
    }
}
