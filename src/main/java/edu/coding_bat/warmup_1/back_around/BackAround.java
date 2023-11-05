package edu.coding_bat.warmup_1.back_around;

public class BackAround {
    public String backAround(String str) {
        if (str.isEmpty()) return str;
        var ch = str.substring(str.length()-1);
        return ch + str + ch;
    }
}
